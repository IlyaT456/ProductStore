package steps;

import io.qameta.allure.Step;
import pages.Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    private String NAME = "User123user123";
    private String AUTHORIZATION = "sign-";
    private String LOGIN = "login";


    Pages page = new Pages();

    @Step("Открываем главую страницу")
    public BaseSteps openMainPage() {
        open("https://www.demoblaze.com/");
        return this;
    }

    @Step("Кликаем на кнопку регистрации")
    public BaseSteps clickButtonSignUp() {
        page.buttonSignUp().click();
        return this;
    }

    @Step("Кликаем на кнопку авторизации")
    public BaseSteps clickButtonLogin() {
        page.buttonLogIn().click();
        return this;
    }

    @Step("Регистрация нового пользователя")
    public BaseSteps userLogIn() {
        page.userName(LOGIN).setValue(NAME);
        page.password(LOGIN).setValue(NAME);
        page.buttonLog().click();
        return this;
    }

    @Step("Переключаемся на окно регистрации")
    public BaseSteps switchOpenForm() {
        return this;
    }

    @Step("Регистрация нового пользователя")
    public BaseSteps registerNewUser() {
        page.userName(AUTHORIZATION).setValue(NAME);
        page.password(AUTHORIZATION).setValue(NAME);
        page.buttonSignUp().click();
        return this;
    }

    @Step("Проверка авторизации")
    public BaseSteps chekingAutorizeshion() {
        page.hederMainUser().shouldHave(text(NAME));
        return this;
    }


}
