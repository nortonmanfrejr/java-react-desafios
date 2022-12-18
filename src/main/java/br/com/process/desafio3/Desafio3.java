package br.com.process.desafio3;

import br.com.process.DesafioInterface;

public class Desafio3 {

    static DesafioInterface run = new Desafio3Impl();
    public static void main(String[] args) {
        run.startChallenge();
    }
}

