package pregunta3;

/*
 * Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
    liquidado (sueldo) depende la una tarifa o precio por hora establecida y de un
    condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
    40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
    recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
    instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
    cargar los valores en las variables HORASTRABAJADAS y TARIFA.
 */
public class Pregunta3 {

    private static int leerHorasTrabajadas() {
        System.out.println("Introduce las horas trabajadas: "); 
        
        return Integer.parseInt(System.console().readLine());
    } 

    private static double leerTarifa() {
        System.out.println("Introduce la tarifa: ");

        return Double.parseDouble(System.console().readLine());
    } 

    private static double calcularSueldo(int horasTrabajadas, double tarifa) {
        if(horasTrabajadas > 40){
            int horasExtras = horasTrabajadas - 40;
            double tarifaExtra = tarifa * 1.5;
            return (40 * tarifa) + (horasExtras * tarifaExtra);
        }else{
            return horasTrabajadas * tarifa;
        }
    }
    public static void main(String[] args){
        int horasTrabajadas = leerHorasTrabajadas();
        double tarifa = leerTarifa();

        double sueldo = calcularSueldo(horasTrabajadas, tarifa);

        System.out.println("El trabajador va a cobrar: " + sueldo );

    }
}
