package TesteEstrutural.Ex13;

public class UsuarioValidator {

    private UsuarioDAO usuarioDao;
    private SenhaValidator senhaValidator;

    public UsuarioValidator(UsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public void setSenhaValidator(SenhaValidator senhaValidator) {
        this.senhaValidator = senhaValidator;
    }

    public boolean ehUsuarioValido(Usuario u) throws Exception {
        if /*1*/(u.getNome().length() <= 3) {
            /*2*/throw new Exception("nome do usuario precisa de pelo menos 3 caracteres");
        }
        if /*3*/(!u.getSenha().equals(u.getSenhaConfirmada())) {
            /*4*/throw new Exception("senhas diferentes");
        }
        if /*5*/(usuarioDao.existe(u.getNome())) {
            /*6*/throw new Exception("usuario ja existe");
        }
        if /*7*/(senhaValidator.verificar(u.getSenha())) {
            /*8*/throw new Exception("senha invalida");
        }
        /*9*/String nome = u.getNome();
        /*9*/boolean isValid = true;
        for (/*9*/int i = 0; /*10*/i < nome.length(); /*11*/i++) {
            /*12*/char atual = nome.charAt(i);
            if (/*13*/!Character.isAlphabetic(atual) && /*14*/!Character.isDigit(atual)) {
                /*15*/isValid = false;
            }
        }
        /*16*/return isValid;
    }

}
