/*
 * Fecha: 30/11/23
 * Programa Codo a codo.
 * Comisión: 23597
 * Autores: GRUPO 07
 * **/
import java.util.Scanner;
import java.util.HashMap;

public class CajeroAutomatico {
    private HashMap<String, String> usuarios = new HashMap<>();
    private double saldo = 1000.0;
    private String usuarioActual = null;
    public boolean bandera = false;
    public CajeroAutomatico() {
        // Agrega algunos usuarios de ejemplo con usuario y clave
        usuarios.put("usuario1", "clave1");
        usuarios.put("usuario2", "clave2");
    }

    public void mostrarPantallaBienvenida() {
        System.out.println("Bienvenido al Cajero Automático (Home Banking)");
        System.out.print("Ingrese su usuario: ");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su clave: ");
        String clave = scanner.nextLine();

        if (autenticarUsuario(usuario, clave)) {
            usuarioActual = usuario;
            System.out.println("---------------------------------");
            mostrarMenuPrincipal();
        } else {
            System.out.println("Usuario o clave incorrectos. Por favor, inténtelo de nuevo.");
            System.out.println("---------------------------------");
        }
    }

    private boolean autenticarUsuario(String usuario, String clave) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(clave);
    }

    public void mostrarMenuPrincipal() {
        
	do {
	    System.out.println("");
	    System.out.println("----------------------------------");
            System.out.println("----------MENÚ PRINCIPAL:---------");
	    System.out.println("----------------------------------");
            System.out.println("");
            System.out.println("1. Ver datos del usuario");
            System.out.println("2. Ver saldo");
            System.out.println("3. Realizar transferencia");
            System.out.println("4. Realizar pago online");
            System.out.println("5. Cerrar sesión");
            System.out.println("---------------------------------");
            System.out.print("Elija una opción: ");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarDatosUsuario();
                    break;
                case 2:
                    mostrarSaldo();
                    break;
                case 3:
                    realizarTransferencia();
                    break;
                case 4:
                    realizarPagoOnline();
                    break;
                case 5:
                    System.out.println("Por favor, extraiga su tarjeta.");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }while (bandera);
    }

    public void mostrarDatosUsuario() {
        Scanner scanner = new Scanner(System.in);
	String tecla = "";
        System.out.println("");
        System.out.println("Usuario actual: " + usuarioActual);
	System.out.println("Presione *Enter* para continuar...");
	tecla = scanner.nextLine();
        bandera = true;
        
        
        // Aquí podrías mostrar más información del usuario si lo desearas.
    }

    public void mostrarSaldo() {
        Scanner scanner = new Scanner(System.in);
	String tecla = "";
        System.out.println("");
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("Presione *Enter* para continuar...");
	tecla = scanner.nextLine();
        bandera = true;
    }

    public void realizarTransferencia() {
        String tecla = "";
        System.out.print("Ingrese el CBU o Alias de destino: ");
        Scanner scanner = new Scanner(System.in);
        String destino = scanner.nextLine();
        System.out.print("Ingrese el monto a transferir: ");
        double monto = scanner.nextDouble();
				tecla = scanner.nextLine();

        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Transferencia a " + destino + " por $" + monto + " realizada con éxito.");
        
        } else {
            System.out.println("La operación no puede realizarse por falta de fondos."); 
        }
        
          System.out.println("Presione *Enter* para continuar...");
					tecla = scanner.nextLine();
					bandera = true;  
    }

    public void realizarPagoOnline() {
        String tecla = "";
        System.out.print("Ingrese el nombre de la empresa o servicio a pagar: ");
        Scanner scanner = new Scanner(System.in);
        String servicio = scanner.nextLine();
        System.out.print("Ingrese el monto a pagar: ");
        double monto = scanner.nextDouble();
        tecla = scanner.nextLine();
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Pago a " + servicio + " por $" + monto + " realizado con éxito.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Presione *Enter* para continuar...");
					tecla = scanner.nextLine();
					bandera = true;
    }

      public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        cajero.mostrarPantallaBienvenida();
    }
}
