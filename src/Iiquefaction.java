public class Iiquefaction extends Family implements PaymentAble {

    public Iiquefaction() {
    }

    public Iiquefaction(String[] parents, String[] children, String adress) {
        super(parents, children, adress);
    }

    @Override
    public void summa() {
        System.out.println("500");
    }

    @Override
    public String toString() {
        return "Iiquefaction{}";
    }
}