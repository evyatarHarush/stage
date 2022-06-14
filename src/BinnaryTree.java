public class BinnaryTree {
    private int data;
    private BinnaryTree Left;
    private BinnaryTree Right;

    public BinnaryTree(int data) {
        this.data = data;
        this.Left = null;
        this.Right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinnaryTree getLeft() {
        return Left;
    }

    public void setLeft(BinnaryTree left) {
        Left = left;
    }

    public BinnaryTree getRight() {
        return Right;
    }

    public void setRight(BinnaryTree right) {
        Right = right;
    }

    @Override
    public String toString() {
        return "BinnaryTree{" +
                "data=" + data +
                ", Left=" + Left +
                ", Right=" + Right +
                '}';
    }

    public static void main(String[] args) {
        BinnaryTree a1 = new BinnaryTree(1);
        BinnaryTree a2 = new BinnaryTree(2);
        BinnaryTree a3 = new BinnaryTree(3);
        BinnaryTree a4 = new BinnaryTree(4);
        BinnaryTree a5 = new BinnaryTree(5);
        BinnaryTree a6 = new BinnaryTree(6);
        BinnaryTree a7 = new BinnaryTree(7);

        BinnaryTree b1 = new BinnaryTree(1);
        BinnaryTree b2 = new BinnaryTree(2);
        BinnaryTree b3 = new BinnaryTree(3);
        BinnaryTree b4 = new BinnaryTree(4);
        BinnaryTree b5 = new BinnaryTree(5);
        BinnaryTree b6 = new BinnaryTree(6);
        BinnaryTree b7 = new BinnaryTree(7);

        a1.setLeft(a2);
        a1.setRight(a3);

        a2.setLeft(a4);
        a2.setRight(a5);

        a3.setLeft(a6);
        a3.setRight(a7);

        b1.setLeft(b2);
        b1.setRight(b3);

        b2.setLeft(b4);
        b2.setRight(b5);

        b3.setLeft(b6);
        b3.setRight(b7);

        System.out.println(isEqual(a1,b1));
        //System.out.println(numLeaves(a));
        //System.out.println(a);
        //inOrder(a);
        //preeOrder(a);
        //postOrder(a);
    }

    public static int numLeaves(BinnaryTree tree) {

        if (tree == null) {
            return 0;
        }
        return 1 + numLeaves(tree.getRight()) + numLeaves(tree.getLeft());
    }

    public static void inOrder(BinnaryTree tree) {

        if (tree == null) {
            return;
        }
        inOrder(tree.getLeft());
        System.out.print(tree.getData() + "->");
        inOrder(tree.getRight());

    }

    public static void preeOrder(BinnaryTree tree) {

        if (tree == null) {
            return;
        }
        System.out.print(tree.getData() + "->");
        preeOrder(tree.getLeft());
        preeOrder(tree.getRight());
    }

    public static void postOrder(BinnaryTree tree) {

        if (tree == null) {
            return;
        }

        postOrder(tree.getLeft());
        postOrder(tree.getRight());
        System.out.print(tree.getData() + "->");

    }
    public static boolean isEqual(BinnaryTree a ,BinnaryTree b){
        if(a.getData() != b.getData() ){
            return false;
        }
        if(a.getRight() == null && b.getRight()!= null){
            return false;
        }
        if(a.getRight() != null && b.getRight()== null){
            return false;
        }
        if(a.getLeft() == null && b.getLeft()!= null) {
            return false;
        }
        if(a.getLeft() != null && b.getLeft()== null) {
            return false;
        }
        isEqual(a.getLeft(), b.getLeft());
        isEqual(a.getRight(),b.getRight());
       // isEqual(a.getLeft() , b.getLeft());

        return true;
    }

}
