package Mutante.Ex15;

import org.junit.Test;
import static org.junit.Assert.*;

public class MutacaoTest {
    
    @Test
    public void Test01(){
        Original o = new Original();
        Mutante1 m1 = new Mutante1();
        
        int[] bi = {4};
        
        assertEquals(o.calcularAnosBissexto(bi), m1.calcularAnosBissexto(bi));
    }
    
    @Test
    public void Test02(){
        Original o = new Original();
        Mutante2 m2 = new Mutante2();
        
        int[] bi = {2017};
        
        assertEquals(o.calcularAnosBissexto(bi), m2.calcularAnosBissexto(bi));
        
    }
    
    @Test
    public void Test03(){
        Original o = new Original();
        Mutante3 m3 = new Mutante3();
        
        int[] bi = {200};
        
        assertEquals(o.calcularAnosBissexto(bi), m3.calcularAnosBissexto(bi));
        
    }
}
