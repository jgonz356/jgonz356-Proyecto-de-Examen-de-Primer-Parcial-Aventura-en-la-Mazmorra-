package aventura_en_la_mazmorra;

/**
 * Clase que representa la salida en el mapa de la mazmorra.
 */
public class Salida {
    private int x, y;

    /**
     * Constructor para inicializar la posición de la salida.
     * @param x Coordenada x de la salida.
     * @param y Coordenada y de la salida.
     */
    public Salida(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtener la coordenada x de la salida.
     * @return Coordenada x.
     */
    public int getX() {
        return x;
    }

    /**
     * Obtener la coordenada y de la salida.
     * @return Coordenada y.
     */
    public int getY() {
        return y;
    }
}
