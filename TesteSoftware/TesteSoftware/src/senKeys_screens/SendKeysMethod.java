package senKeys_screens;

import xpath_screens.CallXpath;

public class SendKeysMethod {
    CallXpath xPath = new CallXpath();
    
    public String SendkeysCep(String cep) throws Exception{
        
        xPath.xPathVerificaCep().sendKeys(cep);
        
        return cep;
    }
    
    public String Sendkeyscpf(String cpf) throws Exception{
        
        xPath.xPathInputCPF().sendKeys(cpf);
        
        return cpf;
    }
    
    public String SendkeysCepCadastro(String cep) throws Exception{
        
        xPath.xPathInputCEP().sendKeys(cep);
        
        return cep;
    }
}
