<div style="font-family: Arial, sans-serif; color: #333;">
  <p><b>Projeto</b>: Sistema gerador de QR Codes desenvolvido em <span style="color: #007396;">Java</span>, com front-end em <span style="color: #d17b0f;">Thymeleaf</span> e estilização usando <span style="color: #563d7c;">Bootstrap</span>.</p>

<h2 style="color: #007396;">Tecnologias Utilizadas</h2>
  <ul>
    <li><span style="color: #007396;">Java</span></li>
    <li><span style="color: #d17b0f;">Thymeleaf</span></li>
    <li><span style="color: #563d7c;">Bootstrap</span></li>
    <li><span style="color: #bc0024;">ZXing</span></li>
  </ul>

<h2 style="color: #007396;">Como Executar</h2>
  <ol>
    <li><b>Clone o repositório</b>:
      <pre style="background-color: #f5f5f5; padding: 10px;">git clone https://github.com/seu-usuario/qrcode-generator.git</pre>
    </li>
    <li><b>Navegue até o diretório do projeto</b>:
      <pre style="background-color: #f5f5f5; padding: 10px;">cd qrcode-generator</pre>
    </li>
    <li><b>Instale as dependências</b>:
      <pre style="background-color: #f5f5f5; padding: 10px;">mvn clean install</pre>
    </li>
    <li><b>Execute a aplicação</b>:
      <pre style="background-color: #f5f5f5; padding: 10px;">mvn spring-boot:run</pre>
    </li>
    <li><b>Acesse no navegador</b>:
      <a href="http://localhost:8080" style="color: #007396;">http://localhost:8080</a>
    </li>
  </ol>

<h2 style="color: #007396;">Estrutura do Projeto</h2>
  <pre style="background-color: #f5f5f5; padding: 10px;">
qrcode-generator/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── seu-usuario/
│   │   │           └── qrcodegenerator/
│   │   │               ├── controller/          # Contém os controladores para tratar as requisições
│   │   │               ├── service/             # Contém a lógica de negócio
│   │   │               └── QrCodeGeneratorApplication.java  # Classe principal para rodar a aplicação
│   ├── resources/
│   │   ├── templates/                             # Diretório com os arquivos HTML do Thymeleaf
│   │   │   └── index.html                        # Página principal do gerador de QR Codes
│   │   ├── static/                               # Arquivos estáticos (CSS, JS, etc.)
│   │   │   ├── css/
│   │   │   └── js/
│   │   └── application.properties                # Configurações da aplicação Spring Boot
├── .gitignore                                    # Arquivo para ignorar arquivos desnecessários no git
├── README.md                                     # Este arquivo de README
└── pom.xml                                        # Arquivo de configuração do Maven (dependências e plugins)
  </pre>

<h2 style="color: #007396;">Contato</h2>
  <ul>
    <li><b>Nome</b>: Clibanez Caldas Maranhão</li>
    <li><b>Email</b>: <a href="mailto:clibanezzcaldas@gmail.com" style="color: #007396;">clibanezzcaldas@gmail.com</a></li>
    <li><b>GitHub</b>: <a href="https://github.com/clibanez" style="color: #007396;">Clibanez</a></li>
  </ul>
</div>
