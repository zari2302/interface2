public class Apartment extends Family implements PaymentAble {
    @Override
    public void summa() {
        System.out.println("комунальные услуги:  2500 сом  за месяц");
    }
}
