package tests.api;

import io.restassured.specification.RequestSpecification;

import static filters.CustomLogFilter.customLogFilter;
import static io.restassured.RestAssured.with;

public class Spec {
    public static RequestSpecification request = with()
            .baseUri("https://ymscanner.com")
            .filter(customLogFilter().withCustomTemplates())
            .basePath("/api")
            .log().all()
            .contentType("multipart/form-data")
            .multiPart("key", "351366461d15ae60ea7010254367cac2");
}