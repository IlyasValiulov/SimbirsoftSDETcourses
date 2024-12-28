package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(xpath = "//a[@class='gh-nav-link state-arrow ']")
    private SelenideElement servicesLink;

    @FindBy(xpath = "//div[@class='is-box-express sfx-line-200']")
    private SelenideElement consultationDiv;

    @FindBy(xpath = "//div[@class='is-button-a']")
    private SelenideElement consultationButton;

    @Step("Проверить, что открывается страница с услугами")
    public ServicesPage showServicesPage() {
        servicesLink
                .shouldBe(visible)
                .click();
        return page(ServicesPage.class);
    }

    @Step
    public ModalFeedbackExpress showConsultation() {
        consultationDiv
                .scrollTo();
        consultationButton
                .shouldBe(visible)
                .click();
        return page(ModalFeedbackExpress.class);
    }
}
