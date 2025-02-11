document.getElementById('qr-form').addEventListener('submit', function(event) {
    event.preventDefault();
    var texto = document.getElementById('texto').value;
    fetch('/gerarQRCode?texto=' + encodeURIComponent(texto))
        .then(response => response.json())
        .then(data => {
        var qrCodeImage = document.createElement('img');
        qrCodeImage.src = data.qrcode;
        document.getElementById('qr-code-image').innerHTML = '';
        document.getElementById('qr-code-image').appendChild(qrCodeImage);
    });
});