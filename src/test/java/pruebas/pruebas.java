package pruebas;

import bebidas.*;
import decoradores.*;

/**
 * Clase de pruebas para verificar el funcionamiento de las bebidas y sus condimentos.
 * Esta clase contiene el método main para ejecutar ejemplos que demuestran cómo
 * se crean y modifican bebidas con diferentes condimentos.
 * 
 * @author alex_
 */
public class pruebas {

    /**
     * Método principal que ejecuta las pruebas de las bebidas y sus condimentos.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        
        System.out.println("Prueba 1");
        // prueba con una bebida simple
        Beverage expresso = new Expresso();
        
        // se imprime la descripcion y precio de la bebida
        System.out.println(expresso.getDescription());
        System.out.println(expresso.getCost());
        
        System.out.println("Prueba 2");
        // Ahora se hace la prueba de una bebida con un solo ingrediente extra:
        Beverage darkRoast = new DarkRoast();
        // descripcion y precio basico
        System.out.println("Precio y descripcion de la bebida");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.getCost());
        
        darkRoast = new Milk(darkRoast);
        // descripcion y precio con el extra:
        System.out.println("Precio y descripcion de la bebida con el extra");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.getCost());
        
        System.out.println("Prueba 3");
        // Ahora se hace la prueba con una bebida y tres ingredientes extras
        Beverage houseBlend = new HouseBlend();
        // descripcion y precio basico
        System.out.println("Precio y descripcion de la bebida");
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.getCost());
        
        houseBlend = new Milk(houseBlend);
        houseBlend = new Chocolate(houseBlend);
        houseBlend = new WhippedCream(houseBlend);
        
        // descripcion y precio Actualizados
        System.out.println("Precio y descripcion de la bebida con el extra");
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.getCost());
    }
    
}
