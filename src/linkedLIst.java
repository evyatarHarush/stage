import java.util.LinkedList;

public class linkedLIst {
    public static void main(String[] args) {
        int a = 4;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(55);
        linkedList.add(71);
        linkedList.add(44);
        linkedList.add(31);
        linkedList.add(22);

        System.out.println(numberN(linkedList, a));
        System.out.println(numberMeans(linkedList));
    }

    public static int numberN(LinkedList<Integer> linkedList, int a) {
        int temp = 0;
        while (linkedList.size() >= a) {
            temp = linkedList.pop();
        }
        return temp;
    }

    public static LinkedList<Integer> numberMeans(LinkedList<Integer> linkedList) {
        int temp1 = 0;
        int temp2 = 0;
        if (linkedList.size() % 2 != 0) {
            linkedList.remove(linkedList.size() / 2);

        } else {
            linkedList.remove(linkedList.size() / 2);
            linkedList.remove(linkedList.size() / 2);
        }
        return linkedList;
    }
}
