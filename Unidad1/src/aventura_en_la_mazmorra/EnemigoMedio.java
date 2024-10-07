package aventura_en_la_mazmorra;

public class EnemigoMedio extends Enemigo {
    public EnemigoMedio(int x, int y) {
        super("EnemigoMedio", 75, 45, x, y); // LLAMA A LA CLASE PADRE
    }

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("El enemigo medio ataca al jugador con " + getAtaque() + " de daño.");
        jugador.recibirDaño(getAtaque());
    }

    @Override
    public void recibirAtaque(int ataque) {
        System.out.println("El jugador ataca al enemigo medio con " + ataque + " de daño.");
        setVida(getVida() - ataque);
    }
}
