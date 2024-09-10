package bebidas;

/**
 * Clase que representa una bebida Dark Roast (tueste oscuro).
 * Esta clase extiende la clase abstracta Beverage, proporcionando
 * una descripción específica y un costo para el Dark Roast.
 * 
 * @author alex_
 */
public class DarkRoast extends Beverage{

    /**
     * Constructor de la clase DarkRoast.
     * Inicializa la descripción de la bebida como "Dark Roast".
     */
    public DarkRoast() {
        this.description = "Dark Roast";
    }

    /**
     * Devuelve el costo de la bebida Dark Roast.
     * 
     * @return el costo de la bebida como un float
     */
    @Override
    public float getCost() {
        return 30.00f;
    }
    
}
