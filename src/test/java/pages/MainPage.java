package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver givenDriver)
    {
        driver = givenDriver;
    }

    public void clickOnLoginLink()
    {
        By loginLink = By.xpath("//*[@data-test='section-desktopLayout']//a[@data-test='anchor-login']");
        driver.findElement(loginLink).click();
    }
}
