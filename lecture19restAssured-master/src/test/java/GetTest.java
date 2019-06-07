import org.junit.jupiter.api.Test;

public class GetTest extends BaseTest{
    public static String USER = "AlexReynil";
    public static String PASSWORD = "Vjcc[fhn80";
    @Test
    void baseUrlShouldReturn200(){
        prepareRequest()
                .get()
                .then().statusCode(200);
    }

    @Test
    void getUserShouldReturn200(){
        prepareRequest()
                .get("/users/"+USER)
                .then().statusCode(200);
    }

    @Test
    void getUserReposShouldReturn200(){
        prepareRequest()
                .get("/users")
                .then().statusCode(200);
    }
}
