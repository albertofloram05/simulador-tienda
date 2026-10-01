/*
*@author Alberto Florido Ramos
*este programa pide por teclado nombre, seccion, unidades y precio del cliente. Luego, calcula el subtotal y el importe total con IVA. Luego imprime los resultados
*/


import java.util.Scanner; // IMPORTAMOS LA LIBRERÍA PARA EL SCANNER
public class SimuladorTienda {
    
    public static void main(String[] args) {
        
        // DECLARAMOS VARIABLES Y CONSTANTES
        
        final double IVA = 0.21; // Constante IVA
        String nombreCliente = " "; // Variable string (nombre)
        char letraSeccion = 'A'; // Vatiable char (seccion)
        int numeroUnidades = 0; // Variable numerica int (unidades)
        double precioUnidad = 0; // Varaible numerica double (precio)
        double subtotal = 0; // variable numerica double (subtotal)
        double importeTotal = 0; // variable numerica double (importe con IVA)
        boolean descuento = false; // Variable lógica boolean (descuento)
        
        // ENTRADA DE DATOS
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del cliente: ");
        nombreCliente = sc.nextLine();
        
        System.out.print("Seccion: ");
        letraSeccion = sc.next().charAt(0);
        
        System.out.print("Numero de articulos: ");
        numeroUnidades = sc.nextInt();
        
        System.out.print("Precio por articulo: ");
        precioUnidad = sc.nextDouble();
        
    
        
        
        // REALIZAMOS LOS CÁLCULOS 
        subtotal = numeroUnidades * precioUnidad;
        importeTotal = subtotal * (1 + IVA);
        descuento = numeroUnidades > 5 && importeTotal > 50.0; // la expresión lógica determina si se aplica el descuento en función de si cumple con ambas condiciones (numero de artículos es mayor que 5 y el importe total supera los 50€
       
        
        
        
        
        
        // SALIDA DE DATOS
        System.out.printf("\nCliente: %s | Seccion: %s", nombreCliente, letraSeccion);
        System.out.printf("\nSubtotal: %.2f", subtotal);
        System.out.printf("\nTotal con IVA: %.2f", importeTotal);
        System.out.printf("\nDescuento aplicable: %b", descuento);
        System.out.println("\nPuntos acumulados: " + (int) importeTotal); // Conversión para convertir valor double a int (los puntos acumulados son equivalentes al redondeo del importe total con IVA)
        
    }
    
}
