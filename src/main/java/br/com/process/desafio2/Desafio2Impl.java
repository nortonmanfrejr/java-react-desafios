package br.com.process.desafio2;

import br.com.process.DesafioInterface;

import java.text.DecimalFormat;
import java.util.*;

public class Desafio2Impl implements DesafioInterface {

    private int quantity;
    private List<Float> notas = new ArrayList<>(), moedas = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private final DecimalFormat decimalFormat = new DecimalFormat("#0.00"); // necessario para a formatação dos floats

    @Override
    public void startChallenge() {

        addArrayList(notas, 100.00F,50.00F,20.00F,10.00F,5.00F,2.00F);
        addArrayList(moedas,1.00F,0.50F,0.25F,0.10F,0.05F,0.01F);

        calculate(sc.nextFloat()); // valor a ser calculado acompanho do print
    }

    /**
     * @param arrayList a ser inserido os valores
     * @param value a ser inserido
     * */
    private void addArrayList(List<Float> arrayList, Float... value) {
        for (int i = 0; i < value.length; i++) {
            arrayList.add(value[i]);
        }
    }

    /**
     * recebe um valor e vai divindo até 0, separando quantas vezes pode ser dividos pelos valores
     * das listas notas e moedas, ja efetua o print de saida
     * @param value que sera separado em notas
     * */
    private void calculate(Float value) {

        System.out.println("NOTAS : -----------------");
        for (int i = 0; i < notas.size(); i++) {
            quantity = (int) (value / notas.get(i));
            value = value % notas.get(i);

            print(quantity,"NOTA",notas.get(i));
        }

        System.out.println("MOEDAS : -----------------");
        for (int i = 0; i < moedas.size(); i++) {
            quantity = (int) (value / moedas.get(i));
            value = value % moedas.get(i);

            print(quantity,"MOEDA",moedas.get(i));
        }
    }


    private void print(int quantity,String type,Float value) {
        System.out.printf("%d %s(s) DE R$ %s%n",quantity,type,
                decimalFormat.
                format(value). // formata o valor flutuante para 2 casas decimais
                        replace(",",".") // transforma a , em .
        );
    }



}
