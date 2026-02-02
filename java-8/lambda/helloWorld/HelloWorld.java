
class HelloWorld{


    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello world...");
        hello.sayHello();
    }
}