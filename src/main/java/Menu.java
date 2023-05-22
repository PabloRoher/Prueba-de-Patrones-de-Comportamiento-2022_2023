import CoountingStrategy.Countdown;
import CoountingStrategy.Estrategia;
import CoountingStrategy.countUp;
import Programas.Haltchecker;
import Programas.InterfazFuncion;

import java.util.function.Function;

public class Menu {
    public void ejmploCountdown() {
        Haltchecker haltchecker = new Haltchecker();

        // Crea una estrategia que cuente hacia abajo
        Estrategia estrategiaHaciaAbajo = new Estrategia(new Countdown());

        InterfazFuncion funcion = (input) -> {
            estrategiaHaciaAbajo.contar();
            return true;
        };
        System.out.println(haltchecker.reverse(funcion));
    }

    public void ejemploCountUp(){
        Haltchecker haltchecker = new Haltchecker();

        // Crea una estrategia que cuente hacia arriba
        Estrategia estrategiaHaciaArriba = new Estrategia(new countUp());

        InterfazFuncion funcion = (input) -> {
            estrategiaHaciaArriba.contar();
            return true;
        };
        System.out.println(haltchecker.reverse(funcion));
    }

    public void ejemploReverse() {
        Haltchecker haltchecker = new Haltchecker();

        InterfazFuncion funcion = new InterfazFuncion() {
            @Override
            public boolean ejecutar(Function func) {
                if (haltchecker.halt(this, func)) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        System.out.println(haltchecker.reverse(funcion));
    }
}
