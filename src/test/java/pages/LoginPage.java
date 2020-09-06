package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    String url = "https://login.pracuj.pl/";

    public LoginPage(WebDriver givenDriver)
    {
        driver = givenDriver;
    }

    public void login()
    {

    }
}
