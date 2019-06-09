import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import ru.cft.focus.model.Issue;
import ru.cft.focus.model.IssueContains;

import static org.junit.jupiter.api.Assertions.*;

class LockIssueTest extends BaseTest {

    @Test
    void createIssue( ) {
        Issue newIssue = new Issue("LockIssue", "lockIssue", 1);
        IssueContains unlockedIssue =
        prepareRequest()
                .contentType(ContentType.JSON)
                .body(newIssue)
                .post("/repos/throwaway-alex/newRepo3/issues")
                .body().as(IssueContains.class);
        String path = "/repos/throwaway-alex/newRepo3/issues/"+unlockedIssue.number+"/lock";

        prepareRequest()
                .put(path)
                .then().statusCode(204);

        prepareRequestOtherAuth()
                .delete(path)
                .then().statusCode(403);


    }

}