package TesteEstrutural.Ex13;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UsuarioValidoTest {
    
   //1,2
   @Test(expected = Exception.class)
   public void Test01() throws Exception{
       UsuarioDAO userMock = mock(UsuarioDAO.class);
       SenhaValidator senhaMock = mock(SenhaValidator.class);
       
       UsuarioValidator userv = new UsuarioValidator(userMock);
       userv.setSenhaValidator(senhaMock);
       
       Usuario user = new Usuario();
       user.setNome("an");
       userv.ehUsuarioValido(user);
   }
   
   //1,3,4
   @Test(expected = Exception.class)
   public void Test02() throws Exception{
       UsuarioDAO userMock = mock(UsuarioDAO.class);
       SenhaValidator senhaMock = mock(SenhaValidator.class);
       
       UsuarioValidator userv = new UsuarioValidator(userMock);
       userv.setSenhaValidator(senhaMock);
       
       Usuario user = new Usuario();
       user.setNome("mayara");
       
       user.setSenha("aaa");
       user.setSenhaConfirmada("bbb");
       
       userv.ehUsuarioValido(user);
   }
   
   //1,3,5,6
   @Test(expected = Exception.class)
   public void Test03() throws Exception{
       UsuarioDAO userMock = mock(UsuarioDAO.class);
       SenhaValidator senhaMock = mock(SenhaValidator.class);
       
       UsuarioValidator userv = new UsuarioValidator(userMock);
       userv.setSenhaValidator(senhaMock);
       
       Usuario user = new Usuario();
       
       user.setNome("andre");
       user.setSenha("aaa");
       user.setSenhaConfirmada("aaa");
       
       when(userMock.existe("andre"))
               .thenReturn(Boolean.TRUE);
       
       userv.ehUsuarioValido(user);
   }
   
   //1,3,5,7,8
   @Test(expected = Exception.class)
   public void Test04() throws Exception{
       UsuarioDAO userMock = mock(UsuarioDAO.class);
       SenhaValidator senhaMock = mock(SenhaValidator.class);
       
       UsuarioValidator userv = new UsuarioValidator(userMock);
       userv.setSenhaValidator(senhaMock);
       
       Usuario user = new Usuario();
       
       user.setNome("andre");
       user.setSenha("aaaa");
       user.setSenhaConfirmada("aaaa");
       
       when(userMock.existe("andre"))
               .thenReturn(Boolean.FALSE);

       when(senhaMock.verificar("aaaa"))
               .thenReturn(Boolean.TRUE);
       
       userv.ehUsuarioValido(user);
   }
   
   //1,3,5,7,9,10,12,13,14,11,10,12,13,14,15,11,10,12,13,11,10,12,13,11,10,16
   @Test
   public void Test05() throws Exception{
       UsuarioDAO userMock = mock(UsuarioDAO.class);
       SenhaValidator senhaMock = mock(SenhaValidator.class);
       
       UsuarioValidator userv = new UsuarioValidator(userMock);
       userv.setSenhaValidator(senhaMock);
       
       Usuario user = new Usuario();
       
       user.setNome("1$aa");
       user.setSenha("aaaa");
       user.setSenhaConfirmada("aaaa");
       
       when(userMock.existe("1$aa"))
               .thenReturn(Boolean.FALSE);

       when(senhaMock.verificar("aaaa"))
               .thenReturn(Boolean.FALSE);
       
       assertFalse(userv.ehUsuarioValido(user));
   }
}
