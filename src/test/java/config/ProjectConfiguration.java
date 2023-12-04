package config;


import com.codeborne.selenide.Configuration;


public class ProjectConfiguration {
    public void config() {
        Configuration.browser = "CHROME";
        Configuration.browserVersion = "116.0";
        Configuration.browserSize = "1920x1080";
    }
}
