package Mutante.Ex08;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class MutacaoTest {
    
    @Test
    public void Test01(){
        Original o = new Original();
        Mutante1 m1 = new Mutante1();
        
        int[] vet = {2,1};
        
        assertEquals(2, o.getMaior(vet));
        assertEquals(2, m1.getMaior(vet));
       
    }

    @Test
    public void Test02(){
        Original o = new Original();
        Mutante2 m2 = new Mutante2();
        
        int[] vet = {1,3,2};
        
        assertEquals(3, o.getMaior(vet)); 
        assertEquals(3, m2.getMaior(vet));
        
    }
    
    @Test
    public void Test03(){
        Original o = new Original();
        Mutante3 m3 = new Mutante3();
        
        int[] vet = {1,2,3};
        int[] res = vet;
        
        assertEquals(3, o.getMaior(vet));
        assertEquals(3, m3.getMaior(vet));
        
        //mutante equivalente pois no mutante o laço começa na posição 0 e no original começa na 1 poisição mas no laço eles
        //entram na posição 0
                
    }
}
