import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    void initBeforeClass() {
        Configuration.baseUrl = "https://www.simbirsoft.com";
        Configuration.browserSize = "1080x1020";
        Configuration.timeout = 5000;
    }
}
