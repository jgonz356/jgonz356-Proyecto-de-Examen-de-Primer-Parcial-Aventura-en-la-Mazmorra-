package aventura_en_la_mazmorra;

public class EnemigoFinal extends Enemigo {
    public EnemigoFinal(int x, int y) {
        super("EnemigoFinal", 100, 75, x, y); // LLAMA A LA CLASE PADRE
    }

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("El enemigo final ataca al jugador con " + getAtaque() + " de daño.");
        jugador.recibirDaño(getAtaque());
    }

    @Override
    public void recibirAtaque(int ataque) {
        System.out.println("El jugador ataca al enemigo final con " + ataque + " de daño.");
        setVida(getVida() - ataque);
    }
}
