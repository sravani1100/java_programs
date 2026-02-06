
public class TreeType implements Tree{

    private String name;
    private String color;

    public TreeType(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public void display(int x, int y){
        System.out.println(name + " tree of color " + color +
                " at (" + x + "," + y + ")");
    }
}