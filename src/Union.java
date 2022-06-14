import java.util.LinkedList;

public class Union {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(10);

        l2.add(5);
        l2.add(7);
        l2.add(10);

        //System.out.println(Union1(l1, l2));
        //System.out.println(Inter(l1, l2));
        //System.out.println(Inter2(l1, l2));
        System.out.println(Inter3(l1, l2));
    }


    public static LinkedList<Integer> Union1(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> returnList = new LinkedList<>();

        int temp1 = 0;
        int temp2 = 0;

        while (l1.size() > temp1 && l2.size() > temp2) {

            if (l1.get(temp1) < l2.get(temp2)) {
                returnList.add(l1.get(temp1));
                temp1++;
            } else if (l2.get(temp2) < l1.get(temp1)) {
                returnList.add(l2.get(temp2));
                temp2++;
            } else if (l1.get(temp1).equals(l2.get(temp2))) {
                returnList.add(l1.get(temp1));
                temp2++;
                temp1++;
            }
        }
        while (l1.size() > temp1) {
            returnList.add(l1.get(temp1));
            temp1++;
        }
        while (l2.size() > temp2) {
            returnList.add(l2.get(temp2));
            temp2++;
        }


        return returnList;
    }

    public static LinkedList<Integer> Inter(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> returnList = new LinkedList<>();
        int temp1 = 0;
        int temp2 = 0;

        while (l1.size() > temp1 && l2.size() > temp2) {


            if (l1.get(temp1) < l2.get(temp2)) {

                temp1++;
            } else if (l2.get(temp2) < l1.get(temp1)) {

                temp2++;
            } else if (l1.get(temp1).equals(l2.get(temp2))) {
                returnList.add(l1.get(temp1));
                temp1++;
                temp2++;
            }

        }
        return returnList;
    }

    public static LinkedList<Integer> Inter2(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> returnList = new LinkedList<>();
        int temp1 = 0;
        int temp2 = 0;

        while (l1.size() > temp1 && l2.size() > temp2) {


            if (l1.get(temp1) < l2.get(temp2)) {
                returnList.add(l1.get(temp1));
                temp1++;

            } else if (l2.get(temp2) < l1.get(temp1)) {
                returnList.add(l1.get(temp1));
                temp1++;
                temp2++;
            } else if (l1.get(temp1).equals(l2.get(temp2))) {

                temp1++;
                temp2++;
            }


        }
        return returnList;
    }

    public static LinkedList<Integer> Inter3(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> returnList = new LinkedList<>();
        int temp1 = 0;
        int temp2 = 0;

        while (l1.size() > temp1 && l2.size() > temp2) {


            if (l1.get(temp1) < l2.get(temp2)) {
                returnList.add(l1.get(temp1));
                temp1++;

            } else if (l2.get(temp2) < l1.get(temp1)) {
                returnList.add(l2.get(temp2));

                temp2++;
            } else if (l1.get(temp1).equals(l2.get(temp2))) {

                temp1++;
                temp2++;
            }
        }
        return returnList;
    }
}