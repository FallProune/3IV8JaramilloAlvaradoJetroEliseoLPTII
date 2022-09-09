//eto es un comentario

/**
 * Todo programa en java debe tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradaTexto {
    // los limites de la clase

    // toda la clase debe tener un metodo principal
    /**
     * vamos a realizar un programa mediante el cual
     * podemos introducir texto a nuestra conveniencia
     */
    // tipo de dato
    String nombre;
    // el ; e el fin de la linea

    // metodo principal
    public static void main(String[] args) {
        // tipo de dato
        String nombre;
        // el; es el fin de la linea
        int edad;
        // instancia
        System.out.println("Por favor introuce tu nombre asi bien a lo desgraciado");

        // vamos a obtener el nombre del usurario

        nombre = System.console().readLine();

        System.out.println("Por favor introuce tu edad asi bien a lo desgraciado");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido a tu programita :D, tienes " + edad + " anos");

    }

}