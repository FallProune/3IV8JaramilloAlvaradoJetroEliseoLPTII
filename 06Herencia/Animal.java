
public class Animal {

    private String nombre, raza, tipo_alimento;
    private int edad;

    /*
     * Definimos el constructor
     * este nos sirve paa poder decclarar la existencia de una clase, inicialisar
     * las variables y poder crear instancias de objetos
     */

    public Animal() {

    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipo_alimento, int edad) {
        // para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;

    }
    // para poder enviar y objetner los valores getter y setter
    // get -> obtener -> reicibir
    // set -> asignar -> enviar

    // get
    public String getNombre() {
        return nombre;
    }

    // set
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    // get
    public String getRaza() {
        return raza;
    }

    // set
    public void SetRaza(String raza) {
        this.raza = raza;
    }

    // get
    public String getTipo_alimento() {
        return tipo_alimento;
    }

    // set
    public void SetTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

    // get
    public int getEdad() {
        return edad;
    }

    // set
    public void SetEdad(int edad) {
        this.edad = edad;
    }

}