package aritmetica;

import excepciones.OperacionException;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionException {
        if(denominador == 0){
            throw new OperacionException("Division entre cero");
        }

        return numerador/denominador;
    }

    public static int multiplicacion(int x, int y)throws OperacionException{
        if(y == -1){
            throw new OperacionException("multiplciacion por -1");
        }
        return x * y;
    }
}
