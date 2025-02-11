package com.clibanez.geradorqrcode.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;

@Controller
public class QRCodeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/gerarQRCode")
    @ResponseBody
    public ResponseEntity<?> gerarQRCode(@RequestParam("texto") String texto) {
        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(texto, BarcodeFormat.QR_CODE, 200, 200);
            BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(qrImage, "PNG", outputStream);
            String qrCodeBase64 = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            String qrCodeDataURL = "data:image/png;base64," + qrCodeBase64;
            return ResponseEntity.ok().body(Map.of("qrcode", qrCodeDataURL));
        } catch (WriterException | IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
