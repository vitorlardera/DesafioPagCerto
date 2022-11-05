package modulos.contaTitular;

import Pojo.*;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.parsing   .Parser;

import java.util.ArrayList;
import java.util.List;


@DisplayName("Teste de cadastro de Usuários PagCerto")
public class CadastroTest {

    private String token;

    @BeforeEach
    public void beforeEach(){
        //configurando os dados da API REST
        baseURI = "http://account.homol.pagcerto.com.br/api/v2";
        basePath = "/NQze";

        UsuarioPojo usuario = new UsuarioPojo();
        usuario.setLogin("analista.teste@email.com");
        usuario.setPassword("Analista@2021");


        //obter token
        this.token = given()
                    .contentType(ContentType.JSON)
                    .body(usuario)
                .when()
                    .post("/signin")
                .then()
                    .extract()
                        .path("token");
    }

    @Test
    @DisplayName("Cadastro PF com CPF Igual")
    public void testCadastrarPessoaFisicaComCPFDuplicado(){


        //Tentando Cadastrar com CPF Já Cadastrado


//        RequestPojo request = new RequestPojo();
//        CompanyPojo company = new CompanyPojo();
//        ContactPojo contact = new ContactPojo();
//        HolderPojo holder = new HolderPojo();
//        AddressPojo address = new AddressPojo();
//        BankAccountPojo bankAccount = new BankAccountPojo();
//        UserPojo user = new UserPojo();
//        TransferPlanPojo transferPlan = new TransferPlanPojo();

//        company.setTradeName("Esportes ME");
//        company.setFullName("Mariana e Emanuelly Esportes ME");
//        company.setTaxDocument("28.267.121/0001-13");
//        company.setBusinessTypeId("vL");
//        company.setCnaeCode(6613400);
//        company.setFoundationDate("2015-10-05");

//        contact.setAddress("Avenida Mario Jorge, 150, Aracaju-SE");
//        contact.setMobile("(79) 99872-1427");
//        contact.setPhone("(79) 3227-8993");
//        contact.setPhoneExtension("8795");
//        contact.setEmail("esporte@email.com");
//        contact.setSite("www.esporte.com.br");

//        holder.setFullName("Vitor Lardera");
//        holder.setMothersName("Marcia Lardera");
//        holder.setBirthDate("1993-11-11");
//        holder.setGender("M");
//        holder.setTaxDocument("461.755.569-25");
//        holder.setPhone("");
//        holder.setMobile("(19) 99833-1331");
//        holder.setJobTitle("Analista de Testes");
//        holder.setCompany(company);
//        holder.setContact(contact);

//        address.setCityCode("2800308");
//        address.setDistrict("Inacio Barbosa");
//        address.setLine1("R Manoel De Oliveira Martins");
//        address.setLine2("Ap 001, Cleveland House");
//        address.setStreetNumber("229");
//        address.setZipCode("49040-830");

//        bankAccount.setIsJuristic(true);
//        bankAccount.setBankNumber("001");
//        bankAccount.setAccountNumber("123456-78");
//        bankAccount.setBankBranchNumber("1234-5");
//        bankAccount.setVariation(null);
//        bankAccount.setType("corrente");

//        user.setEmail("rodolforoc97@gmail.com");
//        user.setPassword("12345678");

//        transferPlan.setDays(32);
//        transferPlan.setAnticipated(false);
//        transferPlan.setDaysOnlineSplit(32);
//        transferPlan.setMigrate(false);

//        request.setHolder(holder);
//        request.setAddress((address));
//        request.setBankAccount(bankAccount);
//        request.setUser(user);
//        request.setBusinessActivityId("vL");
//        request.setMarketingMediaId("b9");
//        request.setTransferPlan(transferPlan);
//        request.setCommercialName("Esporte e CIA");
//        request.setAppUrl("");

         given()
                .contentType(ContentType.JSON)
                .header( "Authorization", "Bearer " + this.token)
                .body("{\n" +
                        "  \"holder\": {\n" +
                        "    \"fullName\": \"Vitor Lardera\",\n" +
                        "    \"mothersName\": \"Marcia Lardera\",\n" +
                        "    \"birthDate\": \"1993-11-11\",\n" +
                        "    \"gender\": \"M\",\n" +
                        "    \"taxDocument\": \"461.755.569-25\",\n" +  //Buscar novos CPFs para novos testes
                        "    \"phone\": \"\",\n" +
                        "    \"mobile\": \"(19) 99833-1331\",\n" +
                        "    \"jobTitle\": \"Analista de Testes\",\n" +
                        "    \"company\": {\n" +
                        "      \"tradeName\": \"Esportes ME\",\n" +
                        "      \"fullName\": \"Mariana e Emanuelly Esportes ME\",\n" +
                        "      \"taxDocument\": \"28.267.121/0001-13\",\n" +
                        "      \"businessTypeId\": \"vL\",\n" +
                        "      \"cnaeCode\": 6613400,\n" +
                        "      \"foundationDate\": \"2015-10-05\"\n" +
                        "    },\n" +
                        "    \"contact\": {\n" +
                        "      \"address\": \"Avenida Mario Jorge, 150, Aracaju-SE\",\n" +
                        "      \"mobile\": \"(79) 99872-1427\",\n" +
                        "      \"phone\": \"(79) 3227-8993\",\n" +
                        "      \"phoneExtension\": \"8795\",\n" +
                        "      \"email\": \"esporte@email.com\",\n" +
                        "      \"site\": \"www.esporte.com.br\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"address\": {\n" +
                        "    \"cityCode\": \"2800308\",\n" +
                        "    \"district\": \"Inacio Barbosa\",\n" +
                        "    \"line1\": \"R Manoel De Oliveira Martins\",\n" +
                        "    \"line2\": \"Ap 001, Cleveland House\",\n" +
                        "    \"streetNumber\": \"229\",\n" +
                        "    \"zipCode\": \"49040-830\"\n" +
                        "  },\n" +
                        "  \"bankAccount\": {\n" +
                        "    \"isJuristic\": false,\n" +
                        "    \"bankNumber\": \"001\",\n" +
                        "    \"accountNumber\": \"123456-78\",\n" +
                        "    \"bankBranchNumber\": \"1234-5\",\n" +
                        "    \"variation\": null,\n" +
                        "    \"type\": \"corrente\"\n" +
                        "  },\n" +
                        "  \"user\": {\n" +
                        "    \"email\": \"rodolforoc97@gmail.com\",\n" +
                        "    \"password\": \"12345678\"\n" +
                        "  },\n" +
                        "  \"businessActivityId\": \"vL\",\n" +
                        "  \"marketingMediaId\": \"b9\",\n" +
                        "  \"transferPlan\": {\n" +
                        "    \"days\": 32,\n" +
                        "    \"anticipated\": false,\n" +
                        "    \"daysOnlineSplit\": 32,\n" +
                        "    \"migrate\": false\n" +
                        "  },\n" +
                        "  \"commercialName\": \"Esporte e CIA\",\n" +
                        "  \"appUrl\": \"\"\n" +
                        "}").log().all()
        .when()
                .post("/signup/seller")
        .then()
              .assertThat()
                    .body("error", equalTo( "DUPLICATE_TAX_DOCUMENT"))
                    .statusCode(422)
                    .log().body();
    }
    @Test
    @DisplayName("Cadastro PF com CPF Igual")
    public void testCadastrarPessoaFisicaComCPFDuplicadoComOutroCNPJ(){

        given()
                .contentType(ContentType.JSON)
                .header( "Authorization", "Bearer " + this.token)
                .body("{\n" +
                        "  \"holder\": {\n" +
                        "    \"fullName\": \"Vitor Lardera\",\n" +
                        "    \"mothersName\": \"Marcia Lardera\",\n" +
                        "    \"birthDate\": \"1993-11-11\",\n" +
                        "    \"gender\": \"M\",\n" +
                        "    \"taxDocument\": \"461.755.569-25\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"mobile\": \"(19) 99833-1331\",\n" +
                        "    \"jobTitle\": \"Analista de Testes\",\n" +
                        "    \"company\": {\n" +
                        "      \"tradeName\": \"Esportes ME\",\n" +
                        "      \"fullName\": \"Mariana e Emanuelly Esportes ME\",\n" +
                        "      \"taxDocument\": \"84.287.351/0001-15\",\n" + //buscar novos cnpj se o teste passar
                        "      \"businessTypeId\": \"vL\",\n" +
                        "      \"cnaeCode\": 6613400,\n" +
                        "      \"foundationDate\": \"2015-10-05\"\n" +
                        "    },\n" +
                        "    \"contact\": {\n" +
                        "      \"address\": \"Avenida Mario Jorge, 150, Aracaju-SE\",\n" +
                        "      \"mobile\": \"(79) 99872-1427\",\n" +
                        "      \"phone\": \"(79) 3227-8993\",\n" +
                        "      \"phoneExtension\": \"8795\",\n" +
                        "      \"email\": \"esporte@email.com\",\n" +
                        "      \"site\": \"www.esporte.com.br\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"address\": {\n" +
                        "    \"cityCode\": \"2800308\",\n" +
                        "    \"district\": \"Inacio Barbosa\",\n" +
                        "    \"line1\": \"R Manoel De Oliveira Martins\",\n" +
                        "    \"line2\": \"Ap 001, Cleveland House\",\n" +
                        "    \"streetNumber\": \"229\",\n" +
                        "    \"zipCode\": \"49040-830\"\n" +
                        "  },\n" +
                        "  \"bankAccount\": {\n" +
                        "    \"isJuristic\": false,\n" +
                        "    \"bankNumber\": \"001\",\n" +
                        "    \"accountNumber\": \"123456-78\",\n" +
                        "    \"bankBranchNumber\": \"1234-5\",\n" +
                        "    \"variation\": null,\n" +
                        "    \"type\": \"corrente\"\n" +
                        "  },\n" +
                        "  \"user\": {\n" +
                        "    \"email\": \"rodolforoc97@gmail.com\",\n" +
                        "    \"password\": \"12345678\"\n" +
                        "  },\n" +
                        "  \"businessActivityId\": \"vL\",\n" +
                        "  \"marketingMediaId\": \"b9\",\n" +
                        "  \"transferPlan\": {\n" +
                        "    \"days\": 32,\n" +
                        "    \"anticipated\": false,\n" +
                        "    \"daysOnlineSplit\": 32,\n" +
                        "    \"migrate\": false\n" +
                        "  },\n" +
                        "  \"commercialName\": \"Esporte e CIA\",\n" +
                        "  \"appUrl\": \"\"\n" +
                        "}").log().all()
                .when()
                .post("/signup/seller")
                .then()
                .assertThat()
                .body("error", equalTo( "DUPLICATE_TAX_DOCUMENT"))
                .statusCode(422)
                .log().body();
    }

    @Test
    @DisplayName("Cadastro PF com CPF Igual")
    public void testCadastrarPessoaJuridicaComCPFeCNPJDuplicado(){

        given()
                .contentType(ContentType.JSON)
                .header( "Authorization", "Bearer " + this.token)
                .body("{\n" +
                        "  \"holder\": {\n" +
                        "    \"fullName\": \"Vitor Lardera\",\n" +
                        "    \"mothersName\": \"Marcia Lardera\",\n" +
                        "    \"birthDate\": \"1993-11-11\",\n" +
                        "    \"gender\": \"M\",\n" +
                        "    \"taxDocument\": \"461.755.569-25\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"mobile\": \"(19) 99833-1331\",\n" +
                        "    \"jobTitle\": \"Analista de Testes\",\n" +
                        "    \"company\": {\n" +
                        "      \"tradeName\": \"Esportes ME\",\n" +
                        "      \"fullName\": \"Mariana e Emanuelly Esportes ME\",\n" +
                        "      \"taxDocument\": \"66.734.359/0001-09\",\n" + //buscar novos cnpj se o teste passar
                        "      \"businessTypeId\": \"vL\",\n" +
                        "      \"cnaeCode\": 6613400,\n" +
                        "      \"foundationDate\": \"2015-10-05\"\n" +
                        "    },\n" +
                        "    \"contact\": {\n" +
                        "      \"address\": \"Avenida Mario Jorge, 150, Aracaju-SE\",\n" +
                        "      \"mobile\": \"(79) 99872-1427\",\n" +
                        "      \"phone\": \"(79) 3227-8993\",\n" +
                        "      \"phoneExtension\": \"8795\",\n" +
                        "      \"email\": \"esporte@email.com\",\n" +
                        "      \"site\": \"www.esporte.com.br\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"address\": {\n" +
                        "    \"cityCode\": \"2800308\",\n" +
                        "    \"district\": \"Inacio Barbosa\",\n" +
                        "    \"line1\": \"R Manoel De Oliveira Martins\",\n" +
                        "    \"line2\": \"Ap 001, Cleveland House\",\n" +
                        "    \"streetNumber\": \"229\",\n" +
                        "    \"zipCode\": \"49040-830\"\n" +
                        "  },\n" +
                        "  \"bankAccount\": {\n" +
                        "    \"isJuristic\": true,\n" +
                        "    \"bankNumber\": \"001\",\n" +
                        "    \"accountNumber\": \"123456-78\",\n" +
                        "    \"bankBranchNumber\": \"1234-5\",\n" +
                        "    \"variation\": null,\n" +
                        "    \"type\": \"corrente\"\n" +
                        "  },\n" +
                        "  \"user\": {\n" +
                        "    \"email\": \"rodolforoc97@gmail.com\",\n" +
                        "    \"password\": \"12345678\"\n" +
                        "  },\n" +
                        "  \"businessActivityId\": \"vL\",\n" +
                        "  \"marketingMediaId\": \"b9\",\n" +
                        "  \"transferPlan\": {\n" +
                        "    \"days\": 32,\n" +
                        "    \"anticipated\": false,\n" +
                        "    \"daysOnlineSplit\": 32,\n" +
                        "    \"migrate\": false\n" +
                        "  },\n" +
                        "  \"commercialName\": \"Esporte e CIA\",\n" +
                        "  \"appUrl\": \"\"\n" +
                        "}").log().all()
                .when()
                .post("/signup/seller")
                .then()
                .assertThat()
                .body("error", equalTo( "DUPLICATE_TAX_DOCUMENT"))
                .statusCode(422)
                .log().body();
    }

    @Test
    @DisplayName("Cadastro PF com CPF Igual")
    public void testCadastrarPessoaJuridicaComCPFDuplicadoECNPJNovo(){

        given()
                .contentType(ContentType.JSON)
                .header( "Authorization", "Bearer " + this.token)
                .body("{\n" +
                        "  \"holder\": {\n" +
                        "    \"fullName\": \"Vitor Lardera\",\n" +
                        "    \"mothersName\": \"Marcia Lardera\",\n" +
                        "    \"birthDate\": \"1993-11-11\",\n" +
                        "    \"gender\": \"M\",\n" +
                        "    \"taxDocument\": \"461.755.569-25\",\n" +
                        "    \"phone\": \"\",\n" +
                        "    \"mobile\": \"(19) 99833-1331\",\n" +
                        "    \"jobTitle\": \"Analista de Testes\",\n" +
                        "    \"company\": {\n" +
                        "      \"tradeName\": \"Esportes ME\",\n" +
                        "      \"fullName\": \"Mariana e Emanuelly Esportes ME\",\n" +
                        "      \"taxDocument\": \"28.267.121/0001-13\",\n" + //buscar novos cnpj se o teste passar
                        "      \"businessTypeId\": \"vL\",\n" +
                        "      \"cnaeCode\": 6613400,\n" +
                        "      \"foundationDate\": \"2015-10-05\"\n" +
                        "    },\n" +
                        "    \"contact\": {\n" +
                        "      \"address\": \"Avenida Mario Jorge, 150, Aracaju-SE\",\n" +
                        "      \"mobile\": \"(79) 99872-1427\",\n" +
                        "      \"phone\": \"(79) 3227-8993\",\n" +
                        "      \"phoneExtension\": \"8795\",\n" +
                        "      \"email\": \"esporte@email.com\",\n" +
                        "      \"site\": \"www.esporte.com.br\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"address\": {\n" +
                        "    \"cityCode\": \"2800308\",\n" +
                        "    \"district\": \"Inacio Barbosa\",\n" +
                        "    \"line1\": \"R Manoel De Oliveira Martins\",\n" +
                        "    \"line2\": \"Ap 001, Cleveland House\",\n" +
                        "    \"streetNumber\": \"229\",\n" +
                        "    \"zipCode\": \"49040-830\"\n" +
                        "  },\n" +
                        "  \"bankAccount\": {\n" +
                        "    \"isJuristic\": true,\n" +
                        "    \"bankNumber\": \"001\",\n" +
                        "    \"accountNumber\": \"123456-78\",\n" +
                        "    \"bankBranchNumber\": \"1234-5\",\n" +
                        "    \"variation\": null,\n" +
                        "    \"type\": \"corrente\"\n" +
                        "  },\n" +
                        "  \"user\": {\n" +
                        "    \"email\": \"rodolforoc97@gmail.com\",\n" +
                        "    \"password\": \"12345678\"\n" +
                        "  },\n" +
                        "  \"businessActivityId\": \"vL\",\n" +
                        "  \"marketingMediaId\": \"b9\",\n" +
                        "  \"transferPlan\": {\n" +
                        "    \"days\": 32,\n" +
                        "    \"anticipated\": false,\n" +
                        "    \"daysOnlineSplit\": 32,\n" +
                        "    \"migrate\": false\n" +
                        "  },\n" +
                        "  \"commercialName\": \"Esporte e CIA\",\n" +
                        "  \"appUrl\": \"\"\n" +
                        "}").log().all()
                .when()
                .post("/signup/seller")
                .then()
                .assertThat()
                .body("error", equalTo( "DUPLICATE_TAX_DOCUMENT"))
                .statusCode(422)
                .log().body();
    }
}
