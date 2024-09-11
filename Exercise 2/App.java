
/* 
2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 
*/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner stringReader = new Scanner(System.in);
        
        System.out.println("Insira uma string qualquer: ");
        String target = stringReader.nextLine();
        stringReader.close();

        System.out.println("Número de vezes que a letra `a` apareceu: " + getNumberOfLetterAppearence(target, 'a'));
    }

    private static int getNumberOfLetterAppearence(String word, char targetLetter) {
        int wordLengthBefore = word.length();
        
        word = word.toLowerCase().replaceAll(Character.toString(targetLetter), "");        
        return wordLengthBefore - word.length();
    }
}