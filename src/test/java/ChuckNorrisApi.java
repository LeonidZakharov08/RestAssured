import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ChuckNorrisApi {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }

        @Test
        @DisplayName("Get random joke/Получение рандомной шутки из API про Чака нориса")
        @Tag("Blocker")
        public void testChuckNorrisApi() {

        Response response = given()
                .get("https://api.chucknorris.io/jokes/random")
                .andReturn();

        }
    }
