package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.AttachmentsHelper;
import helpers.DriverSettings;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import tests.ui.steps.MainPageSteps;
import tests.ui.steps.ProductCardSteps;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.AttachmentsHelper.*;

public class TestBase {
    public MainPageSteps mainSteps = new MainPageSteps();
    public ProductCardSteps productCardSteps = new ProductCardSteps();

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://reqres.in";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = AttachmentsHelper.getSessionId();

        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        if (System.getProperty("video.storage") != null)
            attachVideo();
        closeWebDriver();
    }
}
