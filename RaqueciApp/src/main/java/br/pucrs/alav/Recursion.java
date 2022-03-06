package br.pucrs.alav;

public class Recursion {

    // Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int somaSucessiva(int fator1, int fator2 ){
    int produto = 0;
        if(fator1 == 0)
            return produto;
        return produto = fator2 + somaSucessiva(fator1-1, fator2);   
    }

	public static void main(String[] args) {
        int fator1 = 6;
        int fator2 = 4;

        System.out.println(somaSucessiva(fator1, fator2));
    }
}
