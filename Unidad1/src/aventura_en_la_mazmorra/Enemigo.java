package aventura_en_la_mazmorra;

public abstract class Enemigo {
    //Atributos
	protected String nombre;
    protected int vida;
    protected int ataque;
    protected int x;
    protected int y;

    // Constructor
    public Enemigo(String nombre, int vida, int ataque, int x, int y) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.x = x;
        this.y = y;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

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

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    // Método para atacar al jugador
    public void atacar(Jugador jugador) {
        jugador.recibirDaño(ataque);
    }

    // Método para recibir el ataque del jugador
    public void recibirAtaque(int ataque) {
        vida -= ataque;
    }

    // Método para verificar si el enemigo está vivo
    public boolean isVivo() {
        return vida > 0;
    }
}
