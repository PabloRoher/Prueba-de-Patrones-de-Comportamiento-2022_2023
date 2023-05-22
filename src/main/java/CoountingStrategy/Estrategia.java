package CoountingStrategy;

import CoountingStrategy.InterfazEstrategia;

public class Estrategia {
    private InterfazEstrategia estrategia;

    public Estrategia(InterfazEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void contar() {
        if (estrategia != null) {
            estrategia.contar();
        } else {
            System.out.println("No se ha establecido ninguna estrategia para contar.");
        }
    }
}
