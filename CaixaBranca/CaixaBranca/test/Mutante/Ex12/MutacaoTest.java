package Mutante.Ex12;

import org.junit.Test;
import static org.junit.Assert.*;

public class MutacaoTest {
    
    @Test
    public void Test01(){
        Original o = new Original();
        Mutante1 m1 = new Mutante1();
        
        String word = "MAssallys";
        
        assertEquals(o.contarA(word), m1.contarA(word));
    }
    
    @Test
    public void Test02(){
        Original o = new Original();
        Mutante2 m2 = new Mutante2();
        
        String word = "Allan";
        
        assertEquals(o.contarA(word), m2.contarA(word));
        
        /*mutante equivalente pois o contador está apenas de maneira diferente.*/ 
        
    }
    
    @Test
    public void Test03(){
        Original o = new Original();
        Mutante3 m3 = new Mutante3();
        
        String word = "Ana";
        
        assertEquals(o.contarA(word), m3.contarA(word));
    }
    
    /*no mutante 3 porém faz a mesma função do original
        ou seja ele verifica o nome tanto com 'a' || "A"*/ 
}
