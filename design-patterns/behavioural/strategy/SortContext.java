
public class SortContext{

    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
    public void execute(int[] arr){
        sortStrategy.sort(arr);
    }
}