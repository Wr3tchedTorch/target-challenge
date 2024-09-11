
/*
1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 
*/

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner readInt = new Scanner(System.in);
        
        System.out.print("\nInsira um número inteiro positivo:");
        int target = readInt.nextInt();
        readInt.close();
        
        System.out.println("O número `" + target + "`" + (IsFibonnaci(target) ? " pertence" : " não pertence") + " a sequencia fibonnaci");
    }

    private static boolean IsFibonnaci(int target) {
        if (target == 0)
            return true;
        if (target < 0)
            throw new IllegalArgumentException("Os números da sequencia fibonnaci são positivos.");
        
        int b = 0, c = 0;
        System.out.print("Sequencia fibonnaci gerada: \n\t[ ");
        for (int a = 1; a <= target;) {            
            if (a == target) {
                System.out.print(", " + a + " ]\n");
                return true;
            }
            
            System.out.print((c != 0 ? ", " : "") + a);
            b = c;
            c = a;
            a += b;
        }

        System.out.print(" ]\n");
        return false;
    }
}
