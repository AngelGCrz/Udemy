
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;

        try {
            resultado = 10 / 0;
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            //imprime la pila de exepciones
            e.printStackTrace(System.out);
            
        }
        System.out.println(resultado);        
    }
}
