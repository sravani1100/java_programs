
 class Main{
     public static void main(String[] args) {

         Payment phonePe = new PhonePeAdaptor(new PhonePe());
         Payment gPay = new GPayAdaptor(new GPay());

         phonePe.makePayment(1000.00);
         gPay.makePayment(200.00);

     }
 }