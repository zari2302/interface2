import java.util.Arrays;

public class Dormitory extends Family implements PaymentAble{

    public Dormitory() {

    }

    public Dormitory(String[] parents, String[] children, String adress) {
        super(parents, children, adress);
    }

    @Override
    public void summa() {
        System.out.println("5000");

    }

    @Override
    public String toString() {
        return "Dormitory: " + "\n"+
                "parents: " + Arrays.toString(parents) +"\n"+
                "children: " + Arrays.toString(children) +"\n"+
                "adress: " + adress ;
    }
}
