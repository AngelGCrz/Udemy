package test;
import static aritmetica.Aritmetica.*;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        int resultadoM = 0;
        try {
            resultado = division(10, 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            //imprime la pila de exepciones
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        System.out.println("Resultado: " + resultado);
         

        try {
            resultadoM =  multiplicacion(2, -1);
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
            System.out.println(e.getMessage());
        }
        System.out.println("Resultado *: " + resultadoM);
    }
}
