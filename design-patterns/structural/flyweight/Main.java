
public class Main{
    public static void main(String[] args) {

        Tree tree1 = TreeFactory.getTree("Oak", "Green");
        tree1.display(10, 20);
        System.out.println("tree1 - " +tree1.hashCode());

        Tree tree2 = TreeFactory.getTree("Pine", "Pink");
        tree2.display(20, 40);
        System.out.println("tree2 - " +tree2.hashCode());

        Tree tree3 = TreeFactory.getTree("Oak", "Green");
        tree3.display(20, 30);
        System.out.println("tree3 - " +tree3.hashCode());


    }
}