package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    private static ArrayList<String> lista;
    private static Scanner teclado = new Scanner(System.in);

    public void criarLista(){
        lista = new ArrayList<>();
    }

    public void inserirNomeLista(String nome){
        lista.add(nome);
    }

    public void exibirLista(){
        System.out.println("\n" + lista);
    }

    public int verificarLista(){
        if (lista.size() == 0) {
            return 0;
        }
        return 1;
    }

    public void pesquisarNomeLista(String nome){

        String valor = null;

        for (String aLista : lista) {
            if (aLista.equals(nome)) {
                valor = aLista;
            }
        }

        if (valor != null){
            System.out.println("\nNOME ENCONTADO: " + nome.toUpperCase());
        } else {
            System.out.println("\nNOME NÂO ENCONTRADO");
        }

    }

    public void removerNomeLista(String nome){

        String valor = null;

        for (String aLista : lista) {
            if (aLista.equals(nome)) {
                valor = aLista;
            }
        }

        if (valor != null){
            lista.remove(nome);
            System.out.println("\nNOME REMOVIDO COM SUCESSO");
            System.out.println("\n" + lista);
        } else {
            System.out.println("\nNOME DIGITADO INVÁLIDO");
        }
    }

    public void limparLista(String escolha){
        if (escolha.equalsIgnoreCase("S")){
            lista.clear();
            System.out.println("\nA LISTA FOI COMPLETAMENTE LIMPA");
            System.out.println("\n" + lista);
        } else if (escolha.equalsIgnoreCase("N")){
            System.out.println("\nAÇÃO CANCELADA COM SUCESSO");
        }
    }
}
