package pregunta2;

public class Persona {
    String sexo;
    int edad;

    public Persona(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
