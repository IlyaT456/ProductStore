package steps;

import io.qameta.allure.Step;
import pages.Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    public String NAME = "User123user1235";

    Pages page = new Pages();

    @Step("Открываем главую страницу")
    public BaseSteps openMainPage() {
        open("https://www.demoblaze.com/");
        return this;
    }

    @Step("Регигастрация нового пользователя")
    public BaseSteps registrNewUser() {
        page.signUp().click();
        return this;
    }

    @Step("Переключаемся на окно регистрации")
    public BaseSteps switchOpenForm() {
        return this;
    }

    @Step("Регистрация нового пользователя")
    public BaseSteps registerNewUser() {
        page.userName().setValue(NAME);
        page.password().setValue(NAME);
        page.button().click();
        return this;
    }

    @Step("Проверка авторизации")
    public BaseSteps chekingAutorizeshion() {
        page.hederMainUser().shouldHave(text(NAME));
        return this;
    }
}
