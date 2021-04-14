package test_screens;

import click_screens.ClickMethod;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalizacaoCompraTest {
    ClickMethod click = new ClickMethod();
    
    @Test
    public void Test01() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
            click.FinalizaCompra();
            
        }catch(Exception error){
            System.out.println("Não foi possível finalizar compra do produto.");
        } 
    }
}
