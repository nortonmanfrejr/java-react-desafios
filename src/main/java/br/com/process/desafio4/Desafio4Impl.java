package br.com.process.desafio4;

import br.com.process.DesafioInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4Impl implements DesafioInterface {

    private final List<String> frases = new ArrayList<>();
    private int n;
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void startChallenge() {
        n = sc.nextInt(); // quantidade de testes

        for (int i = 0; i < n; i++) {
            read(); // insere frases dentro da array
        }

        for (String frase : frases) {
            System.out.printf("%s%s%n",
                    dividerAndRevert(frase, 0, frase.length() / 2), // primeira metade
                    dividerAndRevert(frase, frase.length() / 2, frase.length()) // segunda metade
            ); // saida de resultado
        }
    }

    /**
     * @return stringbuilder com reverse
     * */
    private StringBuilder dividerAndRevert(String s,int init,int lastIndex) {
        StringBuilder piece = new StringBuilder(
                s.substring(init,lastIndex));

        piece.reverse(); // inverte a string
        return piece;
    }
    private void read() {
        String frase = sc.nextLine(); // ler frase

        while (frase.isEmpty()) // caso a frase esteja vazia
            frase = sc.nextLine(); // pede uma nova

        frases.add(frase); // adicionar na lista
    }

}
