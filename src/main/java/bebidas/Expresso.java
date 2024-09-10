package bebidas;

/**
 * Clase que representa una bebida Expresso.
 * Esta clase extiende la clase abstracta Beverage, proporcionando
 * una descripción específica y un costo para la bebida Expresso.
 * 
 * @author alex_
 */
public class Expresso extends Beverage{

    /**
     * Constructor de la clase Expresso.
     * Inicializa la descripción de la bebida como "Expresso".
     */
    public Expresso() {
        this.description = "Expresso";
    }
    
    /**
     * Devuelve el costo de la bebida Expresso.
     * 
     * @return el costo de la bebida como un float
     */
    @Override
    public float getCost() {
        return 31.00f;
    }
    
}
