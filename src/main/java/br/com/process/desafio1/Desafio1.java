package br.com.process.desafio1;

import br.com.process.DesafioInterface;

public class Desafio1 {

    static DesafioInterface run = new Desafio1Impl();
    public static void main(String[] args){
        run.startChallenge();
    }
}
