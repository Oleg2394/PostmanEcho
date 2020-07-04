package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class PostmanechoTestV1 {

    @Test
    void Postmanecho() {
        given()
            .baseUri("https://postman-echo.com")
            .body("some data")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("postman.schema.json"));
    }
}
