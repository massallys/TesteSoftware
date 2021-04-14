package test_screens;

import click_screens.ClickMethod;
import hover_screens.HoverMethod;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicializacaoWebsiteTest {
    HoverMethod hoverOver = new HoverMethod();
    ClickMethod clickOver = new ClickMethod();
    
    @Test
    public void Test01() throws Exception{
        WebDriver driver = new ChromeDriver();
        
        hoverOver.HoverButton1();
        hoverOver.HoverButton2();
        clickOver.ClickFarol();
        
    }
}
