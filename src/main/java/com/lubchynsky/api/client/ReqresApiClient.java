package com.lubchynsky.api.client;


import com.lubchynsky.api.dto.reqres.User;
import com.lubchynsky.configuration.spring.PropertiesReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static io.restassured.RestAssured.given;

@Component
public class ReqresApiClient {
    @Autowired
    private PropertiesReader propertiesReader;

    private RequestSpecification getCommonSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(propertiesReader.getApiHostUrl())
                .setAccept(ContentType.JSON)
                .addFilter(new AllureRestAssured())
                .build();
    }

    public ValidatableResponse getRawUserResponseById(int id) {
        return given()
                .spec(getCommonSpecification())
                .pathParams("id", id)
                .when()
                .get("/api/users/{id}")
                .then();
    }

    public User getUserWithId(int id) {
        return getRawUserResponseById(id)
                .statusCode(200)
                .extract()
                .jsonPath()
                .getObject("data", User.class);
    }

    public List<User> getListOfUsers() {
        return given()
                .spec(getCommonSpecification())
                .when()
                .get("/api/users")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getList("data", User.class);
    }
}
