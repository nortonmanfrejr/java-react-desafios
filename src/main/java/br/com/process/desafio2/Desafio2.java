package br.com.process.desafio2;

import br.com.process.DesafioInterface;

public class Desafio2 {

    static DesafioInterface run = new Desafio2Impl();
    public static void main(String[] args) {
        run.startChallenge();
    }
}
