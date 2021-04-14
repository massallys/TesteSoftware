package test_screens;

import click_screens.ClickMethod;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import senKeys_screens.SendKeysMethod;

public class CadastroTest {
    SendKeysMethod keys = new SendKeysMethod();
    ClickMethod click = new ClickMethod();
    
   
    
    @Test
    public void Test01() throws Exception{
        WebDriver driver = new ChromeDriver();

         try{
            keys.Sendkeyscpf("44512024859");
            
        }catch(Exception error){
            System.out.println("CPF não é válido.");
        }
        
    }
    
    @Test
    public void Test02() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
            keys.SendkeysCepCadastro("86010180");
            
        }catch(Exception error){
            System.out.println("CEP não é válido.");
        }
        
    }
    
    @Test
    public void Test03() throws Exception{
        WebDriver driver = new ChromeDriver();

        try{
            click.FinalizaCadastro();
            
        }catch(Exception error){
            System.out.println("Não foi possível finalizar cadastro.");
        }
        
    }
}
