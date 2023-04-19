class Calculadora {
    interface Callback {
        void resuelve();
        void error();
    }
    static void divide(int a, int b, Callback callback) {
        if (b == 0){
            callback.error();
        } else {
            callback.resuelve();

        }                               // ¿ y si b es 0 ?
    }
}

class Resultado implements Calculadora.Callback{

    @Override
    public void resuelve() {
        System.out.println("SI HAY UN RESULTADO");
    }

    @Override
    public void error() {
        System.out.println("NO SE PUEDE HACER");
    }
}

public class Main {
    public static void main(String[] args) {
        Resultado resultado = new Resultado();

        Calculadora.divide(13, 2, resultado);

    }
}