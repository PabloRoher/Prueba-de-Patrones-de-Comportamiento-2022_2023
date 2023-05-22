package CoountingStrategy;

public class countUp implements InterfazEstrategia {
    @Override
    public void contar() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
