import java.util.List;
import java.util.ArrayList;

class Print{
    public void printElements(List<Integer> list){
        list.stream().forEach(System.out :: println);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(3);
        list.add(9);
        new Print().printElements(list);
    }
}