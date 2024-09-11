// 3) Observe o trecho de código abaixo: 
// int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); 

// Ao final do processamento, qual será o valor da variável SOMA? 
// RESPOSTA: 77

public class App {

    public static void main(String[] args) {

        int i = 12, sum = 0, k = 1;

        while (k < i) {
            k += 1;
            sum += k;
        }

        System.out.println(sum);
    }
}