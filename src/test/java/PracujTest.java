import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class PracujTest {

    WebDriver driver;

    @Test
    public void checkPracujTitle()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://pracuj.pl");
        String title = driver.getTitle();

        assertThat(title).isEqualTo("Praca- Pracuj.pl");
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
