package pregunta2;

/*
 * 2. Escriba un algoritmo que visualice una clasificación de 50 personas según edad y sexo.
    Deberá mostrar los siguientes resultados:
    a. Cantidad de personas mayores de edad (18 años o más).
    b. Cantidad de personas menores de edad.
    c. Cantidad de personas masculinas mayores de edad.
    d. Cantidad de personas femeninas menores de edad.
    e. Porcentaje que representan las personas mayores de edad respecto al total de
    personas.
    f. Porcentaje que representan las mujeres respecto al total de personas.
    Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
    50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
    Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos:
    SEXO y EDAD.
 */
public class Pregunta2 {

    private static final String MASCULINO = "masculino"; 
    private static final String FEMENINO = "femenino"; 

    private static Persona[] leerPersonas(){
        Persona[] personas = new Persona[50];
        for (int i = 0; i < personas.length; i++){
            
            personas[i] = new Persona(generarSexo(),generarEdad());
        }
        return personas;
    }

    private static String generarSexo(){
        int valor = (int)(Math.random() * 2);
        if (valor == 0) {
            return MASCULINO;
        } else if (valor == 1) {
            return FEMENINO;
        } else {
            System.err.println("error generando el sexo");
            return "error";
        }
    }

    private static int generarEdad(){
        return (int)(Math.random() * (101));
    }


    private static void clasificacion(Persona[] personas) {
        int mayorEdad = clasificarPorEdad(personas)[0];
        int menorEdad = clasificarPorEdad(personas)[1];
        int masculinoMayorEdad = clasificarPorSexoEdad(personas)[0];
        int femeninoMenorEdad = clasificarPorSexoEdad(personas)[3];
        int numeroMujeres = clasificarPorSexo(personas)[1];

        // Cantidad de personas mayores de edad (18 años o más).
        System.out.println("Mayores de edad: " + mayorEdad);
        // Cantidad de personas menores de edad.
        System.out.println("Menores de edad: " + menorEdad);
        // Cantidad de personas masculinas mayores de edad.
        System.out.println("Masculino mayor de edad: " + masculinoMayorEdad);
        // Cantidad de personas femeninas menores de edad.
        System.out.println("Femenino menor de edad: " + femeninoMenorEdad);
        // Porcentaje que representan las personas mayores de edad respecto al total de personas.
        System.out.println("Porcentaje mayores de edad: " + (mayorEdad * 100) / 50);
        // Porcentaje que representan las mujeres respecto al total de personas. 
        System.out.println("Porcentaje de mujeres: " + (numeroMujeres * 100) / 50);

    }

    private static int[] clasificarPorEdad(Persona[] personas) {
        int[] clasificacion = new int[2];
        for (Persona persona : personas) {
            if (persona.edad >= 18) {
                clasificacion[0] ++;
            } else {
                clasificacion[1] ++;
            }
        }

        return clasificacion;
    } 

    private static int[] clasificarPorSexo(Persona[] personas) {
        int[] clasificacion = new int[2];
        for (Persona persona : personas) {
            if (persona.sexo.equals(MASCULINO)) {
                clasificacion[0] ++;
            } else if (persona.sexo.equals(FEMENINO)) {
                clasificacion[1] ++;
            } else {
                System.err.println("error al clasificar el sexo");
            }
        }

        return clasificacion;
    } 

    private static int[] clasificarPorSexoEdad(Persona[] personas) {
        int[] clasificacion = new int[4];
        for (Persona persona : personas) {
            if (persona.sexo.equals(MASCULINO) && persona.edad >= 18) {
                clasificacion[0] ++;
            } else if (persona.sexo.equals(FEMENINO) && persona.edad >= 18) {
                clasificacion[1] ++;
            } if (persona.sexo.equals(MASCULINO) && persona.edad < 18) {
                clasificacion[2] ++;
            } else if (persona.sexo.equals(FEMENINO) && persona.edad < 18) {
                clasificacion[3] ++;
            }
        }

        return clasificacion;
    } 

    public static void main(String[] args){
        Persona[] personas = leerPersonas();

        clasificacion(personas);
    }
}
