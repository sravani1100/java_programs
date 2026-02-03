

class User{
    private int id;
    private String name;
    private String email;
    private String phone;

    public User(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class Builder{

        private int id;
        private String name;
        private String email;
        private String phone;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    public void display(){
        System.out.println("id = " +id +"\n" +"name = "+name +"\n" +"email = " +email +"\n" +"phone = "+phone);
    }
}