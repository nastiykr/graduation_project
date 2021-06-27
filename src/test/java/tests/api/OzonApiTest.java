package tests.api;

import annotations.Layer;
import annotations.Microservice;
import domain.Product;
import helpers.JsonHelper;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Layer("rest")
@Owner("c05-ebogdanovaa")
@Feature("Получение инфомрации о продукте")
public class OzonApiTest {
    JsonHelper jsonHelper = new JsonHelper();

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о принтере")
    void successPrintTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "460216077")
                .when()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/print.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о беговой дорожке")
    void successTreadmillTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "2693907")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/treadmill.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о броши")
    void successBroochTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "674329171")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/brooch.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о водке")
    void successVodkaTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "532935104")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/vodka.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о гвоздях")
    void successNailTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "648632062")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/nail.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о пылесосах")
    void successCleanerTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "111259346")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/cleaner.json");
        assertEquals(expected, actual, "something wrong");
    }

    @Test
    @Microservice("АПИ")
    @Feature("Получение информации о продукте")
    @Tag("api")
    @DisplayName("Проверка получения информации о программе")
    void successProgramTest() throws IOException {
        Product actual = Spec.request
                .multiPart("id", "662682550")
                .when()
                .log().all()
                .post("/info")
                .then()
                .statusCode(200)
                .extract().as(Product.class);
        Product expected = jsonHelper.readProductFromResources("products/program.json");
        assertEquals(expected, actual, "something wrong");
    }
}
