package decoradores;

import bebidas.Beverage;

/**
 * Clase que representa un condimento de Chocolate para una bebida.
 * Esta clase extiende la clase abstracta Condiment y añade un
 * costo adicional por el chocolate a la bebida original.
 * 
 * @author alex_
 */
public class Chocolate extends Condiment{

    /**
     * Constructor de la clase Chocolate.
     * Inicializa el condimento de chocolate para la bebida especificada.
     * 
     * @param beverage la bebida a la que se le añadirá el chocolate
     */
    public Chocolate(Beverage beverage) {
        super(beverage);
        this.description = "Chocolate";
    }
    
    /**
     * Devuelve el costo de la bebida con el chocolate añadido.
     * 
     * @return el costo total de la bebida con el chocolate como un float
     */
    @Override
    public float getCost() {
        return beverage.getCost() + 8.00f;
    }
    
}
