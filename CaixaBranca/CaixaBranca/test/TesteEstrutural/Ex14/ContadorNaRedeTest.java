package TesteEstrutural.Ex14;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ContadorNaRedeTest {

    //1,2,3,5,6,4,6,5,3,9,10,11,13,14
    @Test
    public void Test01() {
        RedeMovel redeMock = mock(RedeMovel.class);
        ContadorNaRede contadorede = new ContadorNaRede(redeMock);

        int[] v = {8,6,2,4,-3,-5,8,-1};
        String msg = "Enviado. pares: 5; negativos: 3";
        String telefone = "8624-3-28-1";
        
        when(redeMock.estaConectado())
                .thenReturn(Boolean.TRUE);
        
        when(redeMock.enviarSMS(telefone, msg))
                .thenReturn(Boolean.TRUE);
        
        String res = contadorede.enviarNumeros(telefone, v);
        
        assertEquals(res, msg);
       
    }
    
    //1,2,3,5,6,4,6,5,3,9,10,11,13,15
    @Test
    public void Test02() {
        RedeMovel redeMock = mock(RedeMovel.class);
        ContadorNaRede contadorede = new ContadorNaRede(redeMock);

        int[] v = {862466488};
        String msg = "Enviado. pares: " + v;
        String telefone = "87282784728";
        
        when(redeMock.estaConectado())
                .thenReturn(Boolean.TRUE);
        
        when(redeMock.enviarSMS(telefone, msg))
                .thenReturn(Boolean.TRUE);
        
        String res = contadorede.enviarNumeros(telefone, v);
        
        assertEquals(res, "Erro no envio. Verifique.");
       
    }

    //1,2,3,5,7,8,4,8,7,3,9
    @Test
    public void Test03() {
        RedeMovel redeMock = mock(RedeMovel.class);
        ContadorNaRede contadorede = new ContadorNaRede(redeMock);

        int[] v = {-1,-2,-3,-4,-5};
        
        when(redeMock.estaConectado())
                .thenReturn(Boolean.TRUE);
                
        String msg = "Enviado. pares: 0; negativos: 5";

        String res = contadorede.enviarNumeros(msg, v);

    }

    //1,2,3,5,6,4,6,5,3,9,10,12
    @Test
    public void Test04() throws Exception {

        try {
            RedeMovel redeMock = null;
            ContadorNaRede contadorede = new ContadorNaRede(redeMock);

            int[] v = {862466488};
            String telefone = "Enviado. pares: " + v;

            String res = contadorede.enviarNumeros(telefone, v);
        } catch (RuntimeException runtime) {
            assertEquals(runtime.getMessage(), "Sem internet");
        }

    }

    //1,2,3,5,6,4,6,5,3,9,10,11,12
    @Test
    public void Test05() throws Exception {
        try {
            RedeMovel redeMock = mock(RedeMovel.class);
            ContadorNaRede contadorede = new ContadorNaRede(redeMock);

            when(redeMock.estaConectado())
                    .thenReturn(Boolean.FALSE);

            int[] v = {862466488};
            String telefone = "Enviado. pares: " + v;

            String res = contadorede.enviarNumeros(telefone, v);
        } catch (RuntimeException runtime) {
            assertEquals(runtime.getMessage(), "Sem internet");
        }

    }
}
