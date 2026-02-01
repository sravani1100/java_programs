

class Main{

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Obj1 reference = "+obj1.hashCode());
        System.out.println("obj2 reference = "+obj2.hashCode());

        if(obj1 == obj2){
            System.out.println("Both objects refer to same memory.");
        }else{
            System.out.println("Both objects refer to different memory.");
        }
    }
}