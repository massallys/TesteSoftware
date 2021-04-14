package TesteEstrutural.Ex09;

import java.util.ArrayList;

public class Emissario {

    private UsuarioDAO usuarioDAO;
    private ServidorDeEmail servidorEmail;
    private Criptografia criptografia;

    public Emissario(UsuarioDAO usuarioDAO, ServidorDeEmail servidorEmail) {
        this.usuarioDAO = usuarioDAO;
        this.servidorEmail = servidorEmail;
    }

    public void setCriptografia(Criptografia criptografia) {
        this.criptografia = criptografia;
    }
    //continua
    //continuacao

    public String enviarPara(ArrayList<String> nomes) {
        if (nomes == null)/*1*/ {
            return "nomes nao informados";/*2*/
        }

        ArrayList<Usuario> usuarios = usuarioDAO.getAllUsuarios(); /*3*/
        
        if (usuarios == null /*4*/ || usuarios.size() == 0) /*5*/ {
            return "nao ha usuarios"; /*6*/
        }

        boolean msgsEnviadas = false; /*7*/
        
        for (String nome : nomes) /*8*/ {
            for (Usuario usuario : usuarios) /*9*/ {
                if (usuario.getNome().equals(nome)) /*10*/ {
                    String mensagem = criptografia.criptografar("mensagem secreta");/*11*/
                    
                    boolean foiEnviado = servidorEmail.enviar("TO: " + usuario.getEmail()+ " " + mensagem); /*12*/
                    
                    if (foiEnviado) /*13*/ {
                        msgsEnviadas = true; /*14*/
                        break;
                    } else {
                        return "servidor de email offline"; /*15*/
                    }
                }
            }
        }

        if (msgsEnviadas) /*16*/ {
            return "mensagens enviadas"; /*17*/
        } else {
            return "usuarios nao encontrados"; /*18*/
        }
    }

}
