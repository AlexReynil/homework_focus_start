import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import ru.cft.focus.model.Issue;
import ru.cft.focus.model.IssueContains;
import ru.cft.focus.model.User;

import static org.junit.jupiter.api.Assertions.*;
import static ru.cft.focus.constants.Credentials.USER;

class IssueTest extends BaseTest {
 //   int id=1;
    Issue newIssue = new Issue("1", "1", 1);
    @Test
    void createIssue( ) {

        IssueContains createdIssue =
                prepareRequest()

                .contentType(ContentType.JSON)
                .body(newIssue)
                .post("/repos/throwaway-alex/newRepo2/issues")
                .body().as(IssueContains.class);

     IssueContains[] exisitingIssues =
                prepareRequest()
                        .get("/repos/throwaway-alex/newRepo2/issues")
                        .body().as(IssueContains[].class);
     boolean issueFound = false;
     for (int i=0; i<exisitingIssues.length;i++) {
         if (exisitingIssues[i].id==createdIssue.id) {
                issueFound = true;
         }
     }

        assertTrue(issueFound);
    }


}