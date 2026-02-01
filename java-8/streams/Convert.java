import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Convert{

    public Map<Integer, Integer> convertListToMap(List<Integer> list){
        return list.stream().collect(Collectors.toMap(
                                        num -> num, num -> 1, Integer :: sum
        ));
    }

    public void listToMap(List<Shop> shopList){
        Map<Integer, Shop> shops = shopList
                .stream()
                .collect(Collectors.toMap(
                       Shop :: getId,
                        shop -> shop
                ));

        shops.forEach((key, value) -> System.out.println("key : "+key + " " +"value : " +value.toString()));
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(3);
        list.add(1);

        Map<Integer, Integer> map = new Convert().convertListToMap(list);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" " +entry.getValue());
        }


        List<Shop> shopList = List.of(
                new Shop(1, "Fresh Mart"),
                new Shop(2, "Smart Store"),
                new Shop(3, "Daily Needs")
        );
        new Convert().listToMap(shopList);
    }
}