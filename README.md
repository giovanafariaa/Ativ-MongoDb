# Como usar este código

1. Gere o projeto base no https://start.spring.io (Maven, Java 17, Spring Boot 3.2.x,
   com as dependências Spring Web, Thymeleaf e Spring Data MongoDB) e extraia o zip.
   Isso garante que você tenha o Maven Wrapper (mvnw/mvnw.cmd), que não está incluído
   aqui.
2. Copie as pastas `src` deste pacote para dentro do projeto gerado, substituindo os
   arquivos equivalentes (ou o `pom.xml`, se preferir usar o daqui).
3. Abra `src/main/resources/application.properties` e troque `<username>`, `<password>`
   e `<cluster>` pela sua Connection String real do MongoDB Atlas.
4. Rode a aplicação:
   ./mvnw spring-boot:run
5. Teste:
   - http://localhost:8080  -> view Thymeleaf
   - http://localhost:8080/message/Ola -> view com parâmetro
   - GET/POST/PUT/DELETE em http://localhost:8080/api/produtos -> API REST completa
