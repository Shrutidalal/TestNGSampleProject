import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SampleTest1 {
    @Test
    public void sampleTest(){
        System.out.println("This is a sample test");

        System.out.println("added my first branch");
    }

    @Test
    public void TestRequest(){
        given().
                when().get("http://zippopotam.us/us/90210").then().assertThat().statusCode(200);

        given().
                when().log().all().get("http://zippopotam.us/us/37122").then().log().body().assertThat().contentType(ContentType.JSON);
    }


}
