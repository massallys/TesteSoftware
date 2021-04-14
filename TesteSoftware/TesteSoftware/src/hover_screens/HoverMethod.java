package hover_screens;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import xpath_screens.CallXpath;

public class HoverMethod {
    CallXpath xPath = new CallXpath();
    
    public void HoverButton1() throws Exception{
        WebDriver driver = new ChromeDriver();

        //ação adicional para passar o mouse em cima
        Actions hover = new Actions(driver);
        
        //Hover over the BMW button
        hover.moveToElement(xPath.XpathBmw()).build().perform();
    }
    
    public void HoverButton2() throws Exception{
        WebDriver driver = new ChromeDriver();
        
        //ação adicional para passar o mouse em cima
        Actions hover = new Actions(driver);
        
        //Hover Over Serie 3 Button
        hover.moveToElement(xPath.XpathSerie3()).build().perform();
    }
}
