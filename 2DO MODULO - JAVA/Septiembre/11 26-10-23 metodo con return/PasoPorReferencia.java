/*En este práctico daremos un ejemplo de una aproximación de paso por referencia
* El paso por referencia indica que el valor original de una
* variable SI se modifica al ingresarla a un método */

public class PasoPorReferencia {
    // utilizamos variables de clase
    public static double saldo = 100000;

    // metodo para transferir y actualizar la variable
    public static void transferir(double valor){
        saldo -= valor; // saldo = saldo - valor;
    }
    
    public static void main(String[] args) {
        System.out.println("El saldo inicial es: "+saldo);

        // Transferencia 1
        System.out.println("transferimos $5000");
        transferir(5000);

        System.out.println("Su saldo actual es: "+saldo);

        // Transferencia 2
        System.out.println("transferimos $15000");
        transferir(15000);

        System.out.println("Su saldo actual es: "+saldo);
    }
}
