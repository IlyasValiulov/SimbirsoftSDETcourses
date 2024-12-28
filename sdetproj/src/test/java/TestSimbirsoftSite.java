import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestSimbirsoftSite extends BaseTest {
    String link = "https://www.simbirsoft.com/";
    static Logger logger = LoggerFactory.getLogger(TestSimbirsoftSite.class);

    @BeforeClass
    public void setUp() {
        open("/");
        logger.info("Запуск теста");
    }

    @Test()
    public void test1() {
        open(link);
        $(By.xpath("//*[contains(@class, 'gh-nav')]"))
                .shouldHave(
                        text("Проекты"), text("Услуги"), text("Решения"),
                        text("Вакансии"), text("Блог"), text("Карьера"), text("О нас"));
    }

    @Test
    public void test2() {
        open(link);
        $(By.cssSelector("a.chat-bot"))
                .shouldBe(visible)
                .click();
    }

    @Test(description = "Открыть страницу с услугами")
    public void openContactsPageTest() {
        page(MainPage.class)
                .showServicesPage()
                .checkHeading();
        sleep(7000);
    }

    @Test(description = "Открыть страницу ")
    public void openConsultation() {
        page(MainPage.class)
                .showConsultation();
        sleep(7000);
    }

    @AfterTest
    public void setDown() {
        logger.info("Тест завершен");
    }
}
