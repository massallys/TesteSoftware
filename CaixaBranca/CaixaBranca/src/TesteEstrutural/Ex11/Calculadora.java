package TesteEstrutural.Ex11;

public class Calculadora {

    /**
     * @param n - inteiro
     * @param valorMaximo - valor maximo que pode ter o somatorio
     * @return - o somatorio de 0 ate |n|, caso somatorio seja <= valorMaximo
     * @throws Ex
     * ception - caso o somatorio seja > valorMaximo
     */
    
    public int somatoriaLimitada(int n, int valorMaximo) throws Exception {
        /*1*/int resultado = 0, i = 0;
        if (n < 0) /*2*/{
            n = -n;/*3*/
        }

        while (i <= n /*4*/ && resultado <= valorMaximo /*5*/) {
            resultado = resultado + i; /*6*/
            i++; /*6*/
        }

        if (resultado > valorMaximo) /*7*/ {
            throw new Exception("valor maximo foi ultrapassado"); /*8*/
        } else {
            return resultado; /*9*/
        }
    }

}
