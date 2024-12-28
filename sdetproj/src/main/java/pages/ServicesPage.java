package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class ServicesPage {

    @FindBy(xpath = "//h1")
    private SelenideElement heading;

    public ServicesPage checkHeading() {
        heading
                .shouldHave(text("Услуги"));
        return this;
    }
}
