package test;
import static aritmetica.Aritmetica.*;

import excepciones.OperacionException;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        }catch(OperacionException e){
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception: ");
            //imprime la pila de exepciones
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("Resultado: " + resultado);
    }
}
