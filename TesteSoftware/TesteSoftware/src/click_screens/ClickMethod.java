package click_screens;

import xpath_screens.CallXpath;

public class ClickMethod {
    CallXpath xPath = new CallXpath();
    
    public void ClickFarol() throws Exception{      
        xPath.XpathFarol().click();
    }
    
    public void ClickselecionarProduto() throws Exception{      
        xPath.xPathSelecionarProduto().click();
    }
    
    public void okButtonCep() throws Exception{      
        xPath.xPathOkButtonCep().click();
    }
    
    public void ComprarProduto() throws Exception{      
        xPath.xPathComprarProduto().click();
    }
    
    public void FinalizaCompra() throws Exception{      
        xPath.xPathFinalizaCompra().click();
    }
    
    public void FinalizaCadastro() throws Exception{      
        xPath.xPathCadastroButton();
    }
}
