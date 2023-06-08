package pregunta1;

/*
    * 1. Escriba un algoritmo que lea un número entero y determine si es par o impar. Si es par,
    * que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero. Si
    * es impar, que escriba todos los impares de manera descendiente desde si sí mismo
    * hasta el uno. Utilice la instrucción LEER NUMERO al inicio del programa para cargar un
    * número en la variable NUMERO.
    */
public class Pregunta1 {

    public static int leerNumero(){
        System.out.println("Escribe un numero");
        return Integer.parseInt(System.console().readLine());
    }

    private static void escribirPares(int numeroPar) {
        System.out.println("Pares descendientes: ");
        for (int i = numeroPar; i >= 0; i--) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    private static void escribirImpares(int numeroImpar) {
        System.out.println("Impares descendientes: ");
        for (int i = numeroImpar; i >= 1; i--) {
            if (i % 2 == 1) System.out.println(i);
        }
    }
    
    public static void main(String[] args){
        try {
         
            int numero = leerNumero();
            
            if (numero % 2 == 0){
                escribirPares(numero);
            }
            if (numero % 2 == 1){
                escribirImpares(numero);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes introducir un número!");
        }
      
    }


}