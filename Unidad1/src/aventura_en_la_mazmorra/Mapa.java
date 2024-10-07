package aventura_en_la_mazmorra;

public class Mapa {
    private static final int FILAS = 15;
    private static final int COLUMNAS = 20;
    private static char[][] mazmorra;

    // Inicializar mapa
    public Mapa() {
        mazmorra = new char[FILAS][COLUMNAS];
        inicializarMazmorra();
    }

    // Inicializar matriz con puntos (.) para representar espacios vacíos
    private void inicializarMazmorra() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                mazmorra[i][j] = '.';
            }
        }
    }

    // Crear una pared en una posición específica
    public void crearPared(int x, int y) {
        if (x >= 0 && x < FILAS && y >= 0 && y < COLUMNAS) {
            mazmorra[x][y] = '#';
        }
    }

    // Colocar un elemento en una posición específica
    public void colocarElemento(int x, int y, char elemento) {
        if (x >= 0 && x < FILAS && y >= 0 && y < COLUMNAS) {
            mazmorra[x][y] = elemento;
        }
    }

    // Obtener el elemento en una posición específica
    public char obtenerElemento(int x, int y) {
        if (x >= 0 && x < FILAS && y >= 0 && y < COLUMNAS) {
            return mazmorra[x][y];
        }
        return ' ';
    }

    // Mostrar el mapa en consola
    public void mostrarMazmorra() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(mazmorra[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verificar si una posición es una pared
    public static boolean esPared(int x, int y) {
        if (x >= 0 && x < FILAS && y >= 0 && y < COLUMNAS) {
            return mazmorra[x][y] == '#';
        }
        return false;
    }
}
