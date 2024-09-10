package decoradores;

import bebidas.Beverage;

/**
 * Clase abstracta que representa un condimento para una bebida.
 * Esta clase extiende la clase Beverage y sirve como base para
 * añadir condimentos a una bebida. Contiene una referencia a una
 * bebida y proporciona un método para obtener la descripción y el costo
 * de la bebida con el condimento añadido.
 * 
 * @author alex_
 */
public abstract class Condiment extends Beverage {
    
    /**
     * La bebida a la que se le añadirá el condimento.
     */
    protected Beverage beverage;

    /**
     * Constructor de la clase Condiment.
     * Inicializa la referencia a la bebida que se le añadirá el condimento.
     * 
     * @param beverage la bebida a la que se le añadirá el condimento
     */
    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Obtiene la descripción de la bebida con el condimento añadido.
     * 
     * @return la descripción de la bebida con el condimento
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }
    
    /**
     * Método abstracto para obtener el costo de la bebida con el condimento añadido.
     * Las subclases deben implementar este método para proporcionar el costo específico.
     * 
     * @return el costo de la bebida con el condimento como un float
     */
    @Override
    public abstract float getCost();
    
}
