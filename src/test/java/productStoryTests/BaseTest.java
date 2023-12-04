package productStoryTests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.ProjectConfiguration;
import helpers.Attachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest extends Attachments {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        ProjectConfiguration projectConfiguration = new ProjectConfiguration();
        projectConfiguration.config();
    }

    @AfterEach
    void addAttachments() {
        takeScreenshot();
        pageSource();
        browserConsoleLogs();
    }
}
