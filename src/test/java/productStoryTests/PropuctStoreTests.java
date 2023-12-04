package productStoryTests;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;

public class PropuctStoreTests extends BaseTest {

    BaseSteps selectors = new BaseSteps();

    @Test
    @DisplayName("Открытие страници")
    public void openMain() {
        selectors.openMainPage()
                .registrNewUser()
                .registerNewUser()
                .chekingAutorizeshion();
    }
}
