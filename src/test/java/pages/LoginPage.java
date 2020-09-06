package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    String url = "https://login.pracuj.pl/";

    public LoginPage(WebDriver givenDriver)
    {
        driver = givenDriver;
    }

    public void login(String email, String password)
    {
        By emailInput = By.xpath("//input[@data-test='input-email']");
        driver.findElement(emailInput).sendKeys(email);

        By passwordInput = By.xpath("//*[@data-test='input-password']");
        driver.findElement(passwordInput).sendKeys(password);

        By loginButton = By.xpath("//*[@data-test='button-login']");
        driver.findElement(loginButton).click();
    }
}
