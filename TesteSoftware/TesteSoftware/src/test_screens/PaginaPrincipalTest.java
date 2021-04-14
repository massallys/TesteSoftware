package test_screens;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaPrincipalTest {
    
    public void Standard(){

        System.setProperty("webdriver.chrome.driver", "C://Users/Massallys/Desktop/Teste de Software/Bibliotecas/chromedriver_win32.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://teste.leancommerce.com.br/");
    }
}
