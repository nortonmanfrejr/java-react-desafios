package br.com.process.desafio3;

import br.com.process.DesafioInterface;

import java.util.Scanner;

public class Desafio3Impl implements DesafioInterface {

    private int quantity,target;
    private int[] numArray;
    private final Scanner sc = new Scanner(System.in);

    /**
     * O critério de resolução deste desafio é que seja impresso o numero total de pares que sua diferença corresponda
     * ao valor alvo.
     * */
    @Override
    public void startChallenge() {
        setNumArray(); // cria, define tamanho e insere dados

        setTarget(); // define alvo

        System.out.println(calculate());
    }


    /**
     * calcula o numero inteiro de pares que satisfazem o critério
     * */
    private int calculate() {
        for (int n : numArray)
            for (int k : numArray)
                if (n - k == target) quantity++; // adiciona ao total de pares correspondentes

        return quantity;
    }

    /**
     * Inicia um novo array,solicita o tamanho final dele e insere os dados
     * */
    private void setNumArray() {
        System.out.println("Insira o tamanho do array: ");
        numArray = new int[sc.nextInt()]; // insere o tamanho do array

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = sc.nextInt(); // adiciona valor no array
        }
    }

    /**
     * define o valor alvo do desafio
     * */
    private void setTarget() {
        System.out.println("Insira o valor alvo: ");
        this.target = sc.nextInt(); // define o target
    }
}
