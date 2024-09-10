package decoradores;

import bebidas.Beverage;

/**
 * Clase que representa un condimento de Soja para una bebida.
 * Esta clase extiende la clase abstracta Condiment y añade un
 * costo adicional por la soja a la bebida original.
 * 
 * @author alex_
 */
public class Soy extends Condiment{

    /**
     * Constructor de la clase Soy.
     * Inicializa el condimento de soja para la bebida especificada.
     * 
     * @param beverage la bebida a la que se le añadirá la soja
     */
    public Soy(Beverage beverage) {
        super(beverage);
        this.description = "Soy";
    }
    
    /**
     * Devuelve el costo de la bebida con la soja añadida.
     * 
     * @return el costo total de la bebida con la soja como un float
     */
    @Override
    public float getCost() {
        return beverage.getCost() + 4.00f;
    }
    
}
