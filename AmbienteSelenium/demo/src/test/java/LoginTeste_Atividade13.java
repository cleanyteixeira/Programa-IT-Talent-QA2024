//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTeste_Atividade13 {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.tagName("button")).click();

        WebElement successMessage = driver.findElement(By.id("flash"));

        if (successMessage.isDisplayed()) {
            String messageText = successMessage.getText();
            if (messageText.equals("You logged into a secure area!")) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Falha no login! Mensagem incorreta: " + messageText);
            }
        } else {
            System.out.println("Falha no login! Mensagem de sucesso não encontrada.");
        }
    }

    // @After
    public void tearDown() {
        driver.quit();
    }
}
