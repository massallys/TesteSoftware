import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test//1,2,3,[4,5,6]4vezes,9
    public void test01() throws Exception{
        Calculadora cal = new Calculadora();
        
        int res = cal.somatoriaLimitada(-3, 7);
        assertEquals(6, res);
    }
    
    @Test(expected = Exception.class)//1,2[4,5,6]3vezes,4,5,7,8
    public void test02() throws Exception{
        Calculadora cal = new Calculadora();
        
        int res = cal.somatoriaLimitada(3, 1);
    }
    
}
