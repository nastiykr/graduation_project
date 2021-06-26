package tests.api;

import org.junit.jupiter.api.Test;

public class OzonApiTest {

    @Test
    void successfulSingleUserTest() {
        Spec.request
                .when()
                .get("/users/50")
                .then()
                .log().body()
                .statusCode(404);
    }
}
