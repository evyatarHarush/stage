import java.util.Stack;

public class test {

    public static Stack flip(Stack s1) {

        Stack s2 = new Stack();
        Stack s3 = new Stack();

        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s3.push(s1.pop());
        }
        while (!s3.isEmpty()) {
            s1.push(s3.pop());
        }
        return s2;

    }

    public static boolean checkPolyndrom(Stack s1) {
        boolean bool = true;
        Stack s2 = new Stack();
        Stack s3 = new Stack();


        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s3.push(s1.pop());
            //s4.push(s1.pop());
        }
        while (!s3.isEmpty()) {
            s1.push(s3.pop());
        }
        while (!s1.isEmpty() && !s2.isEmpty()) {

            if (s1.pop() != s2.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
            Stack s2 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        s2.push(1);
        s2.push(2);
        s2.push(2);
        s2.push(1);
        System.out.println(flip(s1));

        System.out.println(checkPolyndrom(s2));
    }


}
