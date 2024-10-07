package aventura_en_la_mazmorra;

public class EnemigoBasico extends Enemigo {
    public EnemigoBasico(int x, int y) {
        super("EnemigoBasico", 50, 30, x, y); // LLAMA A LA CLASE PADRE
    }

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("El enemigo básico ataca al jugador con " + getAtaque() + " de daño.");
        jugador.recibirDaño(getAtaque());
    }

    @Override
    public void recibirAtaque(int ataque) {
        System.out.println("El jugador ataca al enemigo básico con " + ataque + " de daño.");
        setVida(getVida() - ataque);
    }
}
