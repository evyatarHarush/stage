import java.util.Stack;

public class node {
    public int value;
    public node next;

    public node(int value) {
        this.value = value;
        this.next = null;
    }

    public node(int value, node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        int a =2;
        node n = new node(1);
        node n1 = new node(2);
        node n2 = new node(3);
        node n3 = new node(4);
        node n4 = new node(5);

        n.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        n4.setNext(n2);


        System.out.println(ReturnNumberN(n));


    }
    public static boolean ReturnNumberN(node m ){
        int keep = m.getValue();
        while ( m.value != keep ){


           if(m.getValue() < 0 ){
               return  true;
           }
           if(m.next == null){
               return false;
           }

            m = m.next;
            m.setValue(-1);

        }

       return false;
    }

}
