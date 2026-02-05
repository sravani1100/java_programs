
public class PhonePeAdaptor implements Payment{

    private PhonePe phonePe;

    public PhonePeAdaptor(PhonePe phonePe){
        this.phonePe = phonePe;
    }

    @Override
    public void makePayment(double amount){
        phonePe.pay(amount);
    }
}