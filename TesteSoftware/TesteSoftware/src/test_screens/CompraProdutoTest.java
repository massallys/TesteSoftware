package test_screens;

import click_screens.ClickMethod;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import senKeys_screens.SendKeysMethod;

public class CompraProdutoTest {
    SendKeysMethod sendKeys = new SendKeysMethod();
    ClickMethod click = new ClickMethod();
    
    @Test
    public void Test01() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
            sendKeys.SendkeysCep("86010180");
            
        }catch(Exception error){
            System.out.println("Error ao digitar o CEP. Tente novamente");
        }
        
    }
    
    @Test
    public void Test02() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
             click.okButtonCep();
        }catch(Exception error){
            System.out.println("Error ao clicar em OK para confirmar o CEP.");
        }
        
    }
    
    @Test
    public void Test03() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
            click.ComprarProduto();
            
        }catch(Exception error){
            System.out.println("Não foi possível clicar no produto a ser comprado");
        }
        
    }
}
