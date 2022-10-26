import javax.swing.JOptionPane;

public class Datos {

    // NECESITAMOS PODER ALMACENAR UNA LISTA DE ESTUDIANTES
    // Arreglo de objetos xdxmsañlmjkdcnjasdñjawñlodkjaLKFJH
    // ÑLWEOFH{Lasefjhas{lefjhasqpoi}}
    Estudiante obj[] = new Estudiante[10];

    int x = 0;

    // menu

    void menu() {
        // crear dos opciones, 1. registrar nuevo estudiante, 2. mostrar lista de
        // estudiantes

        String var = "si";
        while (var.equalsIgnoreCase("si")) {

            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n " + "Ingresa la opcion deseada: \n "
                    + "1. Registrar nuevo estudiante. \n " + "2. Mostrar la lista de estudiantes\n "));

            switch (op) {
                case 1:
                    pedirEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            var = JOptionPane.showInputDialog("¿Desea registrar un nuevo estudiante?");

        }

    }

    public void pedirEstudiante() {
        /** Debemos declarar primero los datos */

        String nom = JOptionPane.showInputDialog("Ingresa nombre del estudiante");
        int edad = Integer.parseInt((JOptionPane.showInputDialog("Ingresa la edad del estudiante")));
        char gen = JOptionPane.showInputDialog("Ingresa nombre del estudiante").charAt(0);
        int numBoleta = Integer.parseInt((JOptionPane.showInputDialog("Ingresa el numero de boleta del estudiante")));

        obj[x] = new Estudiante(numBoleta, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante() {
        for (int i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null,
                    "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n" +
                            "El nombre del estudiante es: " + obj[i].getNombre() + "\n" +
                            "La edad del estudiante es: " + obj[i].getEdad() + "\n" +
                            "El genero del estudiante es: " + obj[i].getGenero() + "\n");
        }
    }

}
