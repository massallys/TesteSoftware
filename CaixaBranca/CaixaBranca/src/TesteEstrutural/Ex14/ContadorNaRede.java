package TesteEstrutural.Ex14;

public class ContadorNaRede {

    RedeMovel rede;

    public ContadorNaRede(RedeMovel rede) {
        this.rede = rede;
    }

    public String enviarNumeros(String telefone, int v[]) {
        int npar = 0, nNegativo = 0;/*1
        */
        for (int i = 0 /*2*/; i < v.length /*3*/; i++ /*4*/) {
            if (v[i] % 2 == 0) /*5*/ {
                npar++; /*6*/
            }

            if (v[i] < 0) /*7*/ {
                nNegativo++; /*8*/
            }
        }
        
        String msg = "Enviado. pares: " + npar + "; negativos: " + nNegativo; /*9*/

        if (rede == null /*10*/ || !rede.estaConectado() /*11*/) {
            throw new RuntimeException("Sem internet"); /*12*/
        }

        if (rede.enviarSMS(telefone, msg) /*13*/) {
            return msg; /*14*/
        } else {
            return "Erro no envio. Verifique."; /*15*/
        }
    }
}
