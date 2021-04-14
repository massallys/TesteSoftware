public class Calculadora {
    /**
    * @param n - inteiro
    * @param valorMaximo - valor maximo que pode ter o somatorio
    * @return - o somatorio de 0 ate |n|, caso somatorio seja <= valorMaximo
    * @throws Exception - caso o somatorio seja > valorMaximo
    */
    public int somatoriaLimitada(int n, int valorMaximo) throws Exception {
        int resultado = 0, i = 0;/*1*/
 
        if(n < 0) {/*2*/
            n = -n;/*3*/
        }

        while(/*4*/i<=n && 
             /*5*/resultado <= valorMaximo) {
            resultado = resultado + i;/*6*/
            i++;/*6*/
        }

        if(resultado > valorMaximo)/*7*/
            /*8*/throw new Exception("valor maximo foi ultrapassado");
 
        else
            /*9*/return resultado;
    }
}
