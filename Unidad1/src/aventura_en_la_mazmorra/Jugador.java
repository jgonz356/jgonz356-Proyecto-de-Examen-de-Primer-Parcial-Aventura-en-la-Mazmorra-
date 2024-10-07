package aventura_en_la_mazmorra;

public class Jugador {
    //Atributos
	private int vida;
    private int ataque;
    private int x;
    private int y;
    private Inventario inventario;

    // Constructor
    public Jugador(int x, int y) {
        this.vida = 100;
        this.ataque = 50;
        this.inventario = new Inventario();
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Inventario getInventario() {
        return inventario;
    }

    // Setters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para mover al jugador
    public void mover(char direccion) {
        int nuevoX = x;
        int nuevoY = y;
        switch(direccion) {
            case 'a': nuevoY--; break;
            case 'd': nuevoY++; break;
            case 'w': nuevoX--; break;
            case 's': nuevoX++; break;
        }
        if (!Mapa.esPared(nuevoX, nuevoY)) {
            x = nuevoX;
            y = nuevoY;
        }
    }

    // Método para atacar a un enemigo
    public void atacar(Enemigo enemigo) {
        enemigo.recibirAtaque(ataque);
    }

    // Método para recibir daño
    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println("El jugador recibió " + daño + " de daño. Vida restante: " + vida);
        if (vida == 0) {
            System.out.println("El jugador ha muerto");
        }
    }

    // Método para usar un objeto del inventario
    public void usarObjeto(Objeto objeto) {
        vida += objeto.getEfectoVida();
        ataque += objeto.getEfectoAtaque();
        inventario.eliminarObjeto(objeto);
    }

    // Método para mostrar información del jugador
    public void mostrarInformacion() {
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Posición: (" + x + ", " + y + ")");
        System.out.println("Inventario:");
        inventario.mostrarInventario();
    }
}
