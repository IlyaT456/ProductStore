package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Pages {

    public SelenideElement buttonSignUp() {
        return $x("//a[@id='signin2']");
    }

    public SelenideElement userName(String text) {
        return $x("//input[@id='"+text+"username']");
    }


    public SelenideElement password(String text) {
        return $x("//input[@id='"+text+"password']");
    }

    public SelenideElement buttonSign() {
        return $x("//button[normalize-space()='Sign up']");
    }

    public SelenideElement buttonLog() {
        return $x("//button[normalize-space()='Log in']");
    }

    public SelenideElement hederMainUser() {
        return $x("//a[@id='nameofuser']");
    }

    public SelenideElement buttonLogIn() {
        return $x("//a[text()='Log in']");
    }



}
