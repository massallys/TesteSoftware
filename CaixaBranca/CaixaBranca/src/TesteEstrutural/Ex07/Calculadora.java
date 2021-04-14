package TesteEstrutural.Ex07;

public class Calculadora {

    /**
     * @param vetor
     * @param inicioInterv deve ser >= 0 e menor que fimInterv
     * @param fimInterv deve ser >= 0 e maior que inicioInterv
     * @return (i) media dos inteiros do vetor que estão no intervalo
     * [inicioInterv, fimInterv] (ii) -1 se os parametros forem invalidos
     */
    
    public float calcularMedia(int vetor[], int inicioInterv, int fimInterv) {
        if (inicioInterv < 0 /*1*/ || fimInterv < 0 /*2*/) {
            return -1; /*3*/
        }

        if (inicioInterv >= fimInterv) /*4*/ {
            return -1; /*5*/
        }

        float soma = 0, n = 0; /*6*/
        
        for (int i = 0 /*7*/; i < vetor.length /*8*/; i++ /*9*/) {
            if (vetor[i] >= inicioInterv /*10*/ && vetor[i] <= fimInterv /*11*/) {
                soma = soma + vetor[i]; /*12*/
                n++; /*13*/
            }
        }
        return soma / n; /*14*/
    }
}
