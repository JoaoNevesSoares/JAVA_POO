package thisList;

import java.util.Scanner;

import thisList.Lista.Fila;
//import thisList.Lista;
//import thisList.Node;
import thisList.Lista.Pilha;

public class EstruturasDeDadosLineares {

    public static void main(String[] args) {

        //Instancia os objetos do tipo Pilha e Fila
        Pilha p = new Pilha();
        Fila y = new Fila();


        Scanner input = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        int i; //switch case var

        // * INICIO DO PROGRAMA *

        System.out.printf(
        "Digite:\n1 - adicionar na FILA\n2-Remover da FILA\n3-Empilhar na STACK\n4-Desempilhar\n5-qualquer caractere para sair\n");
        while (x.hasNextInt()) { 
            i = x.nextInt();
            switch (i) { //switch menu
                case 1:
                    System.out.println("Entre um numero na fila");
                    Node source = new Node(input.nextInt());
                    y.enqueue(source);

                    break;
                case 2:
                    y.dequeue();
                    break;
                case 3:
                    System.out.println("Entre um numero na pilha");
                    source = new Node(input.nextInt());
                    p.push(source);
                    break;
                case 4:
                    p.pop();
                    break;

                default:
                    break;
            }
            System.out.printf(
                    "Digite:\n1 - adicionar na FILA\n2-Remover da FILA\n3-Empilhar na STACK\n4-Desempilhar\n5-qualquer caractere para sair\n");
        }
        //Escreve os elementos da fila e pilha respectivamente
        System.out.println("Queue Elements");
        y.show();
        System.out.println("--------------------------------------");
        System.out.println("Stack Elements");
        p.show();
        input.close();
        x.close();
        
    }
}
