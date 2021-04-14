import org.junit.Test;
import static org.junit.Assert.*;

public class MutanteTest {
    
    public MutanteTest() {
    }
    
    Original o = new Original();
    
    @Test
    public void testM1(){
        int ano [] = {2004};
        assertEquals(1, o.calcularAnosBissexto(ano));
        
        Mutante1 m1 = new Mutante1();
        assertEquals(1, m1.calcularAnosBissexto(ano));
    }
    
    @Test
    public void testM2(){
        int ano [] = {300};
        assertEquals(0, o.calcularAnosBissexto(ano));
        
        Mutante2 m2 = new Mutante2();
        assertEquals(0, m2.calcularAnosBissexto(ano)); 
    }
    
    @Test
    public void testM3(){
        int ano [] = {200};
        assertEquals(0, o.calcularAnosBissexto(ano));
        
        Mutante3 m3 = new Mutante3();
        assertEquals(0, m3.calcularAnosBissexto(ano));
    }
}
