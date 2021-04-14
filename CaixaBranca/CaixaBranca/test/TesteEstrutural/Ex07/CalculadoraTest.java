package TesteEstrutural.Ex07;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    //1,3  
    @Test
    public void Test01() {
        Calculadora calc = new Calculadora();

        int vet[] = {};

        float result = calc.calcularMedia(vet, -3, 3);
        assertEquals(-1, result, 0.01);
    }

    //1,2,3
    @Test
    public void Test02() {
        Calculadora calc = new Calculadora();

        int vet[] = {};

        float result = calc.calcularMedia(vet, 5, -7);
        assertEquals(-1, result, 0.01);
    }

    //1,2,4,5
    @Test
    public void Test03() {
        Calculadora calc = new Calculadora();

        int vet[] = {};

        float result = calc.calcularMedia(vet, 5, 5);
        assertEquals(-1, result, 0.01);
    }

    //1,2,4,6,7,8,10,11,12,13,[1];12,11,10,9,8,10,11,12,13[4];12,11,10,9,8,10,11,12,13[3];12,11,10,9,8,10,11,12,13[2];12,11,10,9,8,10,11,12,13[5];12,11,10,9,8,14
    @Test
    public void Test04() {
        Calculadora calc = new Calculadora();

        int vet[] = {1, 4, 3, 2, 5};

        float result = calc.calcularMedia(vet, 1, 5);
        assertEquals(3, result, 0.01);
    }

    //1,2,4,6,7,8,10,9,8,14
    @Test
    public void Test05() {
        Calculadora calc = new Calculadora();

        int vet[] = {4,1,3};

        float result = calc.calcularMedia(vet, 3,5);
        assertEquals(3.5, result, 0.01);
    }
    
    //1,2,4,6,7,8,10,11,9,8,14
    @Test
    public void Test06() {
       Calculadora calc = new Calculadora();

        int vet[] = {7,8,9,10};

        float result = calc.calcularMedia(vet, 8,9);
        assertEquals(8.5, result, 0.01);
    }

}
