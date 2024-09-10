package decoradores;

import bebidas.Beverage;

/**
 * Clase que representa un condimento de Leche para una bebida.
 * Esta clase extiende la clase abstracta Condiment y añade un
 * costo adicional por la leche a la bebida original.
 * 
 * @author alex_
 */
public class Milk extends Condiment{

    /**
     * Constructor de la clase Milk.
     * Inicializa el condimento de leche para la bebida especificada.
     * 
     * @param beverage la bebida a la que se le añadirá la leche
     */
    public Milk(Beverage beverage) {
        super(beverage);
        this.description = "Milk";
    }

    /**
     * Devuelve el costo de la bebida con la leche añadida.
     * 
     * @return el costo total de la bebida con la leche como un float
     */
    @Override
    public float getCost() {
        return beverage.getCost() + 5.00f;
    }
    
}
