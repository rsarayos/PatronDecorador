package bebidas;

/**
 * Clase que representa una bebida Decaf (descafeinada).
 * Esta clase extiende la clase abstracta Beverage, proporcionando
 * una descripción específica y un costo para la bebida Decaf.
 * 
 * @author alex_
 */
public class Decaf extends Beverage{

    /**
     * Constructor de la clase Decaf.
     * Inicializa la descripción de la bebida como "Decaf".
     */
    public Decaf() {
        this.description = "Decaf";
    }
    
    /**
     * Devuelve el costo de la bebida Decaf.
     * 
     * @return el costo de la bebida como un float
     */
    @Override
    public float getCost() {
        return 28.00f;
    }
    
}
