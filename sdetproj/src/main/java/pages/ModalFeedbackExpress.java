package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class ModalFeedbackExpress {

    @FindBy(xpath = "//h1")
    private SelenideElement heading;

    public ModalFeedbackExpress checkHeading() {
        heading
                .shouldHave(text("Экспресс-консультация"));
        return this;
    }
}
