package ru.netology.domain;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;


public class PostmanechoTestV2 {
    @Test
    void Postmanecho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=Windows-1251")
                .contentType(ContentType.JSON);
    }
}
