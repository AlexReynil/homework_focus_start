import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import ru.cft.focus.model.Issue;
import ru.cft.focus.model.User;

import static org.junit.jupiter.api.Assertions.*;
import static ru.cft.focus.constants.Credentials.USER;

class IssueTest extends BaseTest {
    @Test
            void createIssue( ) {
        Issue newIssue = new Issue("1", "1", 1);

        prepareRequest()
                .contentType(ContentType.JSON)
                .body(newIssue)
                .post("/repos/AlexReynil/homework_focus_start/issues/new")
                .then().statusCode(201);
    }

}