package Programas;

    public class Haltchecker {
        public <T> boolean halt(InterfazFuncion funcion, T input) {
            //Aqui iria la logica de la funcion halt pero utilizamos true o false como ejemplo, ya que no se puede
            //implementar una funcion halt en java
            return false;
        }

        public String reverse(InterfazFuncion funcion) {
            if (halt(funcion, funcion)) {
                return "Para";
            } else {
                    return reverse(funcion);
            }
        }

    }
