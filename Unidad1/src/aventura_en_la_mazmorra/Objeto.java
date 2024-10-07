package aventura_en_la_mazmorra;

public class Objeto {
    //Atributos
	private String nombre;
    private int efectoVida;
    private int efectoAtaque;
    private int x;
    private int y;
    private char simbolo;

    // Constructor
    public Objeto(String nombre, int efectoVida, int efectoAtaque, int x, int y, char simbolo) {
        this.nombre = nombre;
        this.efectoVida = efectoVida;
        this.efectoAtaque = efectoAtaque;
        this.x = x;
        this.y = y;
        this.simbolo = simbolo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEfectoVida() {
        return efectoVida;
    }

    public int getEfectoAtaque() {
        return efectoAtaque;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getSimbolo() {
        return simbolo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEfectoVida(int efectoVida) {
        this.efectoVida = efectoVida;
    }

    public void setEfectoAtaque(int efectoAtaque) {
        this.efectoAtaque = efectoAtaque;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
