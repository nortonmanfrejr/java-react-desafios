package br.com.process.desafio1;

import br.com.process.DesafioInterface;

import java.util.*;

public class Desafio1Impl implements DesafioInterface {

    private int qntdNum;
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> arrayImpar = new ArrayList<>(), arrayPar = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);


    @Override
    public void startChallenge() {
        System.out.println("----------- Desafio 1 -----------");

        qntdNum = validaNumero(sc.nextInt()); // sera solicitado um novo numero caso seja < 0

        for (int i = 0; i < qntdNum; i++) {
            addArrayList(sc.nextInt()); // adiciona um novo valor na lista caso seja >= 0
        }

        breakArrayList(arrayList); // Separa os numeros impares e pares
        orderArrayList(); // ordena as duas listas em suas respectivas ordens

        arrayList.clear(); // limpando a arrayList

        unionArrayList(arrayPar,arrayImpar); // limpa e junta as ArrayList

        print(); // saida da lista
    }

    /**
     * Sera solicitado um novo N até que ele seja >= 0
     * @param n a ser validado
     * @return n >= 0
     * */
    private int validaNumero(int n) {
        while (n < 0) {
            n = sc.nextInt();
        }

        return n;
    }

    /**
     * @param n a ser adicionado na lista
     * @return ArrayList contendo valores N
     * */
    private List<Integer> addArrayList(int n) {
        arrayList.add(validaNumero(n));
        return arrayList;
    }

    /**
     * @param arrayList a ser separada
     * */
    private void breakArrayList(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0)
                arrayPar.add(arrayList.get(i));
            else
                arrayImpar.add(arrayList.get(i));
        }
    }

    /**
     * Ordena os valores Pares do < para o >, e Impares do > para o <
     * */
    private void orderArrayList() {
        Collections.sort(arrayPar);
        arrayImpar.sort(Collections.reverseOrder());
    }
    
    /**
     * @return ArrayList unidas e organizadas
     * */
    private List<Integer> unionArrayList(List<Integer> array1, List<Integer> array2) {
        arrayList.clear(); // limpa a lista

        arrayList.addAll(array1); // adiciona a array1
        arrayList.addAll(array2); // adiciona a array2

        return arrayList;
    }
    
    private void print() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    
}
