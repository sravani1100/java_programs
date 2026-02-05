
public class GPayAdaptor implements Payment{


    private GPay gPay;

    public GPayAdaptor(GPay gPay){
        this.gPay = gPay;
    }

    @Override
    public void makePayment(double amount){
        gPay.pay(amount);
    }
}