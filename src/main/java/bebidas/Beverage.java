package bebidas;

/**
 * Clase abstracta que representa una bebida.
 * Esta clase proporciona una estructura para las bebidas con una descripción
 * y un método para obtener el costo de la bebida.
 * 
 * @author alex_
 */
public abstract class Beverage {
    
    /**
     * La descripción de la bebida.
     */
    protected String description;

    /**
     * Obtiene la descripción de la bebida.
     * 
     * @return la descripción de la bebida
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Método abstracto para obtener el costo de la bebida.
     * Las subclases deben implementar este método para proporcionar el costo específico.
     * 
     * @return el costo de la bebida como un float
     */
    public abstract float getCost();
    
}
