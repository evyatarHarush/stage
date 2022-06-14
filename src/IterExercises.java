import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterExercises {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            int x = it.next();

            // System.out.println(x);

            // it.remove();//ליסט בג'אווה לא תומך ברמוב
        }
        LinkedList<Integer> lst = new LinkedList<Integer>();
        lst.add(4);
        lst.add(45);
        lst.add(50);
        lst.add(80);
        for (Iterator<Integer> it2 = lst.iterator(); it2.hasNext(); ) {

            it2.next();
            it2.remove();
            it2.next();
            it2.remove();// בג'אווה  תומך ברמוב
            System.out.println(lst);
        }

    }
}
