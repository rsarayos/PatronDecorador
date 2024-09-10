package decoradores;

import bebidas.Beverage;

/**
 * Clase que representa un condimento de Crema Batida para una bebida.
 * Esta clase extiende la clase abstracta Condiment y añade un
 * costo adicional por la crema batida a la bebida original.
 * 
 * @author alex_
 */
public class WhippedCream extends Condiment{

    /**
     * Constructor de la clase WhippedCream.
     * Inicializa el condimento de crema batida para la bebida especificada.
     * 
     * @param beverage la bebida a la que se le añadirá la crema batida
     */
    public WhippedCream(Beverage beverage) {
        super(beverage);
        this.description = "Whipped cream";
    }
    
    /**
     * Devuelve el costo de la bebida con la crema batida añadida.
     * 
     * @return el costo total de la bebida con la crema batida como un float
     */
    @Override
    public float getCost() {
        return beverage.getCost() + 7.50f;
    }
    
}
