

class Add{
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        Calculate calculate = (x, y) -> {return x + y;};
        int sum = calculate.addTwoNumbers(a, b);
        System.out.println(a +" + " +b +" = " +sum);
    }
}