package bebidas;

/**
 * Clase que representa una bebida House Blend (mezcla de la casa).
 * Esta clase extiende la clase abstracta Beverage, proporcionando
 * una descripción específica y un costo para la bebida House Blend.
 * 
 * @author alex_
 */
public class HouseBlend extends Beverage{

    /**
     * Constructor de la clase HouseBlend.
     * Inicializa la descripción de la bebida como "House blend".
     */
    public HouseBlend() {
        this.description = "House blend";
    }
    
    /**
     * Devuelve el costo de la bebida House Blend.
     * 
     * @return el costo de la bebida como un float
     */
    @Override
    public float getCost() {
        return 35.00f;
    }
    
}
