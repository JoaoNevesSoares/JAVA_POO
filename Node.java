package thisList;

//classe nodo
public class Node {

    private Integer data;

    public Node(int data) { //Construtor Node

        this.setData(data);
    }

    void setData(int data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }
}
