package TesteEstrutural.Ex09;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class EmissarioTest {

    //1,2
    @Test
    public void Test01() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = null;

        String res = emi.enviarPara(nomes);

        assertEquals("nomes nao informados", res);
    }

    //1,3,4,6
    @Test
    public void Test02() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Barbara");

        ArrayList<Usuario> usuarios = null;

        when(userMock.getAllUsuarios())
                .thenReturn(usuarios);

        String res = emi.enviarPara(nomes);

        assertEquals("nao ha usuarios", res);
    }

    //1,3,4,5,6
    @Test
    public void Test03() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joana");

        ArrayList<Usuario> usuarios = new ArrayList<>();

        when(userMock.getAllUsuarios())
                .thenReturn(usuarios);

        String res = emi.enviarPara(nomes);

        assertEquals("nao ha usuarios", res);
    }

    //1,3,4,5,7,8,9,10,11,12,13,14,10,9,8,16,17
    @Test
    public void Test04() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Barbara");
        nomes.add("Jonas");

        Usuario user = new Usuario();
        user.setEmail("barbara@hotmail.com");
        user.setNome("Barbara");
        user.setEmail("jonas@hotmail.com");
        user.setNome("Jonas");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user);

        when(userMock.getAllUsuarios())
                .thenReturn(usuarios);

        when(criptoMock.criptografar("mensagem secreta"))
                .thenReturn("mensagem criptografada");
        
        when(servMock.enviar("TO: jonas@hotmail.com mensagem criptografada"))
                .thenReturn(Boolean.TRUE);
        
        String res = emi.enviarPara(nomes);

        assertEquals("mensagens enviadas", res);
    }
    
    //1,3,4,5,7,8,9,10,11,12,13,15
    @Test
    public void Test05() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Barbara");
        nomes.add("Jonas");

        Usuario user = new Usuario();
        user.setEmail("barbara@hotmail.com");
        user.setNome("Barbara");
        user.setEmail("jonas@hotmail.com");
        user.setNome("Jonas");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user);

        when(userMock.getAllUsuarios())
                .thenReturn(usuarios);

        when(criptoMock.criptografar("mensagem secreta"))
                .thenReturn("mensagem criptografada");
        
        when(servMock.enviar("TO: jonas@hotmail.com mensagem criptografada"))
                .thenReturn(Boolean.FALSE);
        
        String res = emi.enviarPara(nomes);

        assertEquals("servidor de email offline", res);
    }
    
    //1,3,4,5,7,8,9,10,11,12,13,14,10,9,8,16,18
    @Test
    public void Test06() {
        UsuarioDAO userMock = mock(UsuarioDAO.class);
        ServidorDeEmail servMock = mock(ServidorDeEmail.class);
        Criptografia criptoMock = mock(Criptografia.class);

        Emissario emi = new Emissario(userMock, servMock);

        emi.setCriptografia(criptoMock);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");

        Usuario user = new Usuario();
        user.setEmail("barbara@hotmail.com");
        user.setNome("Barbara");
        user.setEmail("jonas@hotmail.com");
        user.setNome("Jonas");

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user);

        when(userMock.getAllUsuarios())
                .thenReturn(usuarios);

        when(criptoMock.criptografar("mensagem secreta"))
                .thenReturn("mensagem criptografada");
        
        when(servMock.enviar("FROM: jonas@hotmail.com mensagem criptografada"))
                .thenReturn(Boolean.TRUE);
        
        String res = emi.enviarPara(nomes);

        assertEquals("usuarios nao encontrados", res);
    }
}
