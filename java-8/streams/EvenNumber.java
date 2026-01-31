import java.util.List;
import java.util.ArrayList;

class EvenNumber{
    public List<Integer> findEvenNumber(List<Integer> list){
        List<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);

        List<Integer> ans = new EvenNumber().findEvenNumber(list);
        for(int val : ans){
            System.out.print(val +" ");
        }
    }
}