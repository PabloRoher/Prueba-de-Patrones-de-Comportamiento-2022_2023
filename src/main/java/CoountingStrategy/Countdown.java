package CoountingStrategy;

public class Countdown implements InterfazEstrategia {
    @Override
    public void contar() {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
