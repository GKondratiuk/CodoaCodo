/*
Codificamos una funcion que pida como parámetros
dos numeros tipo int y devuelva la suma de ambos
*/

public class FuncionSuma.java {
//Zona de los métodos o funciones
// public: hace referencia a que cualquier otro archivo puede utilizar
//          esta función.
// static: hace referencia que utilizará una sola porcion en la memoria
//          por otro lado nos facilita pode llamar al método

public static int sumar(int num1, int num2){
    //Cuerpo del metodo o función
    // Declaracion e inicializacion de una variable local
    int resultado = num1 + num2;
    // Valor de retorno
    return resultado;
    // Otra forma es no inicializando variable local y pasando la operacion directa
    // return (num1+num2);
}

public static void suma(int num1, int num2){
System.out.println(num1+num2);    
}



    public static void main(String[] args) {
        // Llamamos al método sumar
        // sumar(10,15);
        
        //Diferencia entre Void y Return
        
        //Con Return
        int resultado = sumar(10,15);
        System.out.println(resultado);
        
        //Con void
        int resultadoVoid = suma(2,2);
        //suma(2, 2);
        System.out.println(resultadoVoid);
    }    
}
