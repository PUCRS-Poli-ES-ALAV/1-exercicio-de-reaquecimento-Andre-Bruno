package br.pucrs.alav;

public class Recursion {

    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int somaSucessiva(int fator1, int fator2 ){
        if(fator1 <= 1)
            return fator2;
        return fator2 + somaSucessiva(fator1-1, fator2);   
    }

    public static int incrementoSucessivo(int valor1, int valor2){
        int soma = 0;
        if(valor1 == 0 && valor2 == 0)
            return soma;
        else if(valor1 == 0)
            return soma += 1 + incrementoSucessivo(valor1, valor2-1);
        else if(valor2 == 0)
            return soma += 1 + incrementoSucessivo(valor1-1, valor2);   
        return soma += 1 + incrementoSucessivo(valor1, valor2-1);
    }

	public static void main(String[] args) {
        int fator1 = 3;
        int fator2 = 2;

        System.out.println(somaSucessiva(fator1, fator2));
        System.out.println(incrementoSucessivo(fator1, fator2));
    }
}
