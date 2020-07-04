package ru.netology.domain;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanechoTestV3 {
    @Test
    void Postmanecho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(404)
                .contentType(ContentType.JSON)
                .body("data", equalTo("some data"));
    }
}
