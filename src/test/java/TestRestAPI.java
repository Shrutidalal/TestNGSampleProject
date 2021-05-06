import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestRestAPI {

    @Test
    public void testInvalidParkingSpot(){
        given().
                when().
                get("http://zippopotam.us/us/37122")
                .then().statusCode(200);


    }

    @Test
    public void testRequestBody(){
        given().log().all()
                .when().get("http://zippopotam.us/us/90210")
                .then()
                .assertThat().body("places[0].'place name' ", equalTo("Beverly Hills"))
        .body("'places[3]'.  'state abbreviation'", equalTo("CA"));
    }

    @Test
    public void testAPIData(){
        given().log().all()
                .when().get("http://zippopotam.us/us/90210")
                .then().log().body();
    }
}
