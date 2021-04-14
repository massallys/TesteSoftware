package TesteEstrutural.Ex11;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    //1,2,3,4,5,6,4,5,6,4,7,9
    @Test
    public void Test01() throws Exception{
        Calculadora calc = new Calculadora();
        
        int result = calc.somatoriaLimitada(-1, 10);
        assertEquals(1, result);
    }
    
    //1,2,4,5,7,8
    @Test
    public void Test02() throws Exception{
        Calculadora calc = new Calculadora();
        
        try{
            int result = calc.somatoriaLimitada(1, -1);
            
        }catch(Exception e){
            assertTrue(e instanceof Exception);
        }
    }
}
