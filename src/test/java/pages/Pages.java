package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Pages {

    public SelenideElement signUp() {
        return $x("//a[@id=\"signin2\"]");
    }

    public SelenideElement userName() {
        return $x("//input[@id=\"sign-username\"]");
    }

    public SelenideElement password() {
        return $x("//input[@id=\"sign-password\"]");
    }

    public SelenideElement button() {
        return $x("//button[normalize-space()='Sign up']");
    }

    public SelenideElement hederMainUser() {
        return $x("//a[@id=\"nameofuser\"]");
    }


}
