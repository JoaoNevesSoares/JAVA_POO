package thisList;

import java.util.ArrayList;

//import mylist.Node;
public class Lista {
    private int tamanho;
    private ArrayList<Node> myArray = new ArrayList<Node>();

    /* Funções da classe Mãe */
    protected int insert(int posicao, Node n) {

        myArray.add(posicao, n);
        return 1;
    }

    protected Node get(int posicao) {
        return myArray.get(posicao);
    }

    protected int delete(int posicao) {
        myArray.remove(posicao);
        return 1;
    }

    protected void add_length() {
        this.tamanho = myArray.size();
    }

    protected int lenght() {
        return this.tamanho;
    }

    protected boolean check() {
        return myArray.isEmpty();
    }

    protected void show_list(Lista n) {
        for (Node mx : n.myArray) {
            System.out.println(mx.getData());
        }
    }

    // Subclasse Lista
    static class Fila extends Lista {
        private Lista list = new Lista();

        // Adiciona um novo elemento no topo da Fila
        public int enqueue(Node n) {

            int pos = list.lenght();
            list.insert(pos, n);
            list.add_length();
            return 1;
        }

        /*
         * Remove um elemento do inicio da Fila e se vazia retorna uma mensagem de erro
         */
        public int dequeue() {
            if (!list.check()) {
                list.delete(0);
                list.add_length();
                return 1;
            } else {
                System.out.println("This Queue has no elements");
                return 0;
            }
        }

        // Escreve na tela os elementos da Fila
        public void show() {
            show_list(list);
        }
    }

    // Subclasse Pilha
    static class Pilha extends Lista {
        private Lista list = new Lista();

        // Adiciona um elemento no topo da Pilha
        int push(Node n) {
            int pos = list.lenght();
            list.insert(pos, n);
            list.add_length();
            return 1;
        }

        /*
         * Remove um elemento do topo da Pilha e se vazia retorna uma mensagem de erro
         */
        int pop() {
            int pos = list.lenght();
            if (!list.check()) {
                list.delete(pos - 1);
                list.add_length();
                return 1;
            } else {
                System.out.println("This Stack has no elements");
                return 0;
            }

        }

        // Escreve na tela os elementos da Pilha
        public void show() {
            show_list(list);
        }

    }

}
