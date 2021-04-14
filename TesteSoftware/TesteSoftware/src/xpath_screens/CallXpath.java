package xpath_screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallXpath {
    
    public WebElement XpathBmw(){
        WebDriver driver = new ChromeDriver();
        
        WebElement bmw = driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[6]/div/div/ul/li[4]/a"));
        
        return bmw;
    }
    
    public WebElement XpathSerie3(){
        WebDriver driver = new ChromeDriver();
        
        WebElement serie3 = driver.findElement(By.xpath("//*[@id=\"toggle-departamentos\"]/div/ul/li[4]/div/div[1]/h4/a[1]"));
        
        return serie3;
    }
    
    public WebElement XpathFarol(){
        WebDriver driver = new ChromeDriver();

        WebElement farol = driver.findElement(By.xpath("//*[@id=\"categorias-33\"]/div/ul/li[3]/a"));
        
        return farol;
    }
    
    public WebElement xPathSelecionarProduto(){
        WebDriver driver = new ChromeDriver();
        
        WebElement produto = driver.findElement(By.xpath("//*[@id=\"produtos-placeholder\"]/div/div/div/div[3]/div/div/a"));
        
        return produto;
    }
    
    public WebElement xPathVerificaCep(){
        WebDriver driver = new ChromeDriver();
        
         WebElement cep = driver.findElement(By.xpath("//*[@id=\"inputCalcularFreteCep\"]"));
        
        return cep;
    }
    
    public WebElement xPathOkButtonCep(){
        WebDriver driver = new ChromeDriver();
        
         WebElement okElement = driver.findElement(By.xpath("//*[@id=\"buttonCalcularFrete\"]"));
        
        return okElement;
    }
    
    public WebElement xPathComprarProduto(){
        WebDriver driver = new ChromeDriver();
        
         WebElement comprarElement = driver.findElement(By.xpath("//*[@id=\"container\"]/section[1]/div/div/div[2]/div/div[2]/form/button"));
        
        return comprarElement;
    }
    
    public WebElement xPathFinalizaCompra(){
        WebDriver driver = new ChromeDriver();
        
        WebElement finalizarCompraElement = driver.findElement(By.xpath("//*[@id=\"buttonFinalizarCompra\"]"));
        
        return finalizarCompraElement;
    }
    
    public WebElement xPathInputCPF(){
        WebDriver driver = new ChromeDriver();
        
        WebElement inputCPFelement = driver.findElement(By.xpath("//*[@id=\"cpfCnpj\"]"));
        
        return inputCPFelement;
    }
    public WebElement xPathInputCEP(){
        WebDriver driver = new ChromeDriver();
        
       WebElement inputCEPelement = driver.findElement(By.xpath("//*[@id=\"inputCalcularFreteCep\"]"));
        
        return inputCEPelement;
    }
    
    public WebElement xPathCadastroButton(){
        WebDriver driver = new ChromeDriver();
        
        WebElement criarCadastroButton = driver.findElement(By.xpath("//*[@id=\"form-pre-cadastro\"]/div/button"));
        
        return criarCadastroButton;
    }
    
    
    
}
