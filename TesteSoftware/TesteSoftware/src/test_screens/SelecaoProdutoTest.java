package test_screens;

import click_screens.ClickMethod;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelecaoProdutoTest {
    ClickMethod clickOver = new ClickMethod();
    
    @Test
    public void Test01() throws Exception{
        WebDriver driver = new ChromeDriver();

        clickOver.ClickselecionarProduto(); 
    }
}
