
class Main{
    public static void main(String[] args) {
        User user = new User.Builder().
                id(101)
                .name("Sravani")
                .email("sravani@email.com")
                .phone("9123456709")
                .build();

        user.display();
    }
}