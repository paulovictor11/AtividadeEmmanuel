package view;

import controller.Lista;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Lista lista = new Lista();

        lista.criarLista();
        System.out.println("\nSUA LISTA FOI CRIADA COM SUCESSO");

        int escolha1;
        do {
            System.out.println("\nESCOLHA UMA DAS OPÇÕES A SEGUIR:\n\n1 - INSERIR NOMES NA LISTA\n2 - EXIBIR LISTA\n3 - VERIFICAR SE A LISTA ESTÁ VAZIA\n4 - PESQUISAR NOME NA LISTA\n5 - REMOVER UM NOME DA LISTA\n6 - ESVAZIAR LISTA POR INTEIRO\n7 - SAIR\n\n");
            System.out.print("ESCOLHA: ");
            escolha1 = teclado1.nextInt();

            switch (escolha1){
                case 1:
                    System.out.print("DIGITE O NOME A SER INSERIDO: ");
                    String nomeInserir = teclado2.nextLine();
                    lista.inserirNomeLista(nomeInserir);
                    break;

                case 2:
                    lista.exibirLista();
                    break;

                case 3:
                    if (lista.verificarLista() == 0){
                        System.out.println("\nA LISTA ESTÁ VAZIA");
                    } else {
                        System.out.println("\nA LISTA NÃO ESTÁ VAZIA");
                    }
                    break;

                case 4:
                    System.out.print("DIGITE O NOME QUE DESEJA PESQUISAR: ");
                    String nomePesquisar = teclado2.nextLine();
                    lista.pesquisarNomeLista(nomePesquisar);
                    break;

                case 5:
                    System.out.print("DIGITE O NOME QUE DESEJA REMOVER DA LISTA: ");
                    String nomeRemover = teclado2.nextLine();
                    lista.removerNomeLista(nomeRemover);
                    break;

                case 6:
                    System.out.print("TEM CERTEZA QUE DESEJA LIMPAR A LISTA?? [S/N] ");
                    String escolha2 = teclado2.nextLine();

                    lista.limparLista(escolha2);
                    break;
            }
        } while (escolha1 != 7);
        System.out.println("ATÉ MAIS!!!");
    }
}
