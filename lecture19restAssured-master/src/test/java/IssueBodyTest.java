import io.restassured.http.ContentType;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import ru.cft.focus.model.Issue;
import ru.cft.focus.model.IssueContains;

import static org.junit.jupiter.api.Assertions.*;

class IssueBodyTest extends BaseTest {
    Issue newIssue = new Issue("ChangeBody", "ChangeBody", 1);
    int number;
    @Test
    void createIssue( ) {
    IssueContains  regularIssue =
        prepareRequest()
                .contentType(ContentType.JSON)
                .body(newIssue)
                .post("/repos/throwaway-alex/newRepo1/issues")
                .body().as(IssueContains.class);
        newIssue.body="Body changed";
        String path = "/repos/throwaway-alex/newRepo1/issues/"+regularIssue.number;
        IssueContains changedIssue =
        prepareRequest()
                .contentType(ContentType.JSON)
                .body(newIssue)
                .patch(path)
                .body().as(IssueContains.class);

               prepareRequest()
                        .get(path)
                        .then().statusCode(200);
                assertNotEquals(regularIssue.body, changedIssue.body);
    }

}