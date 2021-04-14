package base_screens;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test_screens.CadastroTest;
import test_screens.CompraProdutoTest;
import test_screens.FinalizacaoCompraTest;
import test_screens.InicializacaoWebsiteTest;
import test_screens.PaginaPrincipalTest;
import test_screens.SelecaoProdutoTest;

public class Main {
    public static void main(String[] args) throws Exception {
        PaginaPrincipalTest pagMainTest = new PaginaPrincipalTest();
        InicializacaoWebsiteTest pagInicioTest = new InicializacaoWebsiteTest();
        SelecaoProdutoTest selecionarProdutoTest = new SelecaoProdutoTest();
        CompraProdutoTest compraProdutoTest = new CompraProdutoTest();
        FinalizacaoCompraTest finalCompraTest = new FinalizacaoCompraTest();
        CadastroTest cadTest = new CadastroTest();
        
        pagMainTest.Standard();
        pagInicioTest.Test01();
        selecionarProdutoTest.Test01();

        compraProdutoTest.Test01();
        compraProdutoTest.Test02();
        compraProdutoTest.Test03();
        
        finalCompraTest.Test01();
        
        cadTest.Test01();
        cadTest.Test02();
        cadTest.Test03();
    }
}
