package br.com.process.desafio4;

import br.com.process.DesafioInterface;

public class Desafio4 {

    static DesafioInterface run = new Desafio4Impl();
    public static void main(String[] args) {
        run.startChallenge();
    }
}