public class Hotel extends Family implements PaymentAble{

    @Override
    public void summa() {
        System.out.println("Аренда на гастницу: 5,000 сом");
    }
}
