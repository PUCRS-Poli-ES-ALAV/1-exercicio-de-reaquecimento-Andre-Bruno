package br.pucrs.alav;

public class Recursion {

    //1.i. Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int sucessiveSum(int value1, int value2 ){
        if(value1 <= 1)
            return value2;
        return value2 + sucessiveSum(value1-1, value2);   
    }

    //1.ii. Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
    public static int sucessiveIncrement(int value1, int value2){
        int result = 0;
        if(value1 == 0 && value2 == 0)
            return result;
        else if(value1 == 0)
            return result += 1 + sucessiveIncrement(value1, value2-1);
        else if(value2 == 0)
            return result += 1 + sucessiveIncrement(value1-1, value2);   
        return result += 1 + sucessiveIncrement(value1, value2-1);
    }

    //1.iii. Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public static double sumTerms(int value){
        if(value == 0)
            return 0;
        return 1.0/value + sumTerms(value-1);
    }

    //1.iv. Inversão de uma string.

    //1.v. Gerador da sequência dada por: F(1) = 1 F(2) = 2 F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2). */
    public static int sequence(int value){
        if(value == 1 || value == 2)
            return value;
        return 2 * sequence(value-1) + 3 * sequence(value-2);
    }
    
    //1.vi. Gerador de Sequência de Ackerman: A(m, n) = n + 1, se m = 0 A(m, n) = A(m − 1, 1), se m != 0 e n = 0 A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
    public static int ackerman(int value1, int value2){
        if(value1 == 0)
            return value2 + 1;
        else if(value1 != 0 && value2 == 0)
            return ackerman(value1-1, 1);
        else
            return ackerman(value1-1, ackerman(value1, value2-1));
    }

    //1.vii. A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.

    //1.viii. Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx).
    public static boolean isPalindrome(String word){  
        if(word.length() == 0 || word.length() == 1)
            return true;
        if(word.charAt(0) == word.charAt(word.length()-1))      
            return isPalindrome(word.substring(1, word.length()-1));                    
        return false;
    }

    //1.ix. Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.

    /*1.x. Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
       fibg(f0, f1, 0) = f0   fibg(f0, f1, 1) = f1  fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1.*/
    public static int fibonacci(int value){
        if(value < 0){
            System.out.println("Invalid value!");
            System.exit(0);
         }
        if(value == 0 || value == 1)
            return value;
        return fibonacci(value-1) + fibonacci(value-2);
    }


    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 1;

        System.out.println(sucessiveSum(value1, value2));
    }
}
