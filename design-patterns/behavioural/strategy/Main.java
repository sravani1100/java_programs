class Main{
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 6, 4};
        SortContext sortContext = new SortContext(new QuickSort());
        sortContext.execute(arr);
    }
}