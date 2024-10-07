package aventura_en_la_mazmorra;

import java.util.Scanner;

public class Mazmorra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mapa mapa = new Mapa();
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
        
     // Mostrar título y menú
        System.out.println("Aventura en la mazmorra");
        System.out.println("Menú:");
        System.out.println("1. Instrucciones de juego");
        System.out.println("2. Jugar");
        System.out.println("3. Salir del juego");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                mostrarInstrucciones();
                break;
            case 2:
                jugar(scanner, mapa);
                break;
            case 3:
                System.out.println("¡Gracias por jugar! Hasta la próxima.");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Saliendo del juego.");
                System.exit(0);
                break;
    }
        System.out.print("¿Quieres volver a jugar? (s/n): ");
        char respuesta = scanner.next().charAt(0);
        if (respuesta != 's' && respuesta != 'S') {
            jugarDeNuevo = false;
            System.out.println("¡Gracias por jugar! Hasta la próxima.");
        }
    }

    scanner.close();
}


    private static void mostrarInstrucciones() {
        System.out.println("Instrucciones de juego:");
        System.out.println("1. Usa las teclas 'w' (arriba), 'a' (izquierda), 's' (abajo) , 'd' (derecha) para mover al jugador.");
        System.out.println("2. Vas a encontrar una barra con (posición en x, posición en y, vida, ataque)");
        System.out.println("3. Encuentra y usa objetos para mejorar tus habilidades.");
        System.out.println("4. Derrota a los enemigos que encuentres en tu camino.");
        System.out.println("5. Encuentra la salida para ganar el juego.");
        System.out.println("6. Evita morir a manos de los enemigos.");
        System.out.println();
        System.out.println("Presiona cualquier tecla para volver al menú.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        main(null); // Volver al menú principal
    }

    private static void jugar(Scanner scanner, Mapa mapa) {

        // Crear paredes en la mazmorra
        for (int i = 0; i < 19; i++) {
            mapa.crearPared(i, 0);
            mapa.crearPared(i, 19);
        }
        for (int j = 0; j < 20; j++) {
            mapa.crearPared(0, j);
            mapa.crearPared(14, j);
        }
        mapa.crearPared(1, 5);
        mapa.crearPared(2, 5);
        mapa.crearPared(3, 5);
        mapa.crearPared(4, 5);
        mapa.crearPared(5, 5);
        mapa.crearPared(6, 5);
        mapa.crearPared(7, 5);
        mapa.crearPared(8, 5);
        mapa.crearPared(9, 5);
        mapa.crearPared(10, 5);
        mapa.crearPared(11, 5);
        mapa.crearPared(2, 1);
        mapa.crearPared(2, 2);
        mapa.crearPared(2, 3);
        mapa.crearPared(8, 2);
        mapa.crearPared(8, 3);
        mapa.crearPared(8, 4);
        mapa.crearPared(8, 5);
        mapa.crearPared(6, 9);
        mapa.crearPared(6, 10);
        mapa.crearPared(6, 11);
        mapa.crearPared(6, 12);
        mapa.crearPared(7, 9);
        mapa.crearPared(8, 9);
        mapa.crearPared(9, 9);
        mapa.crearPared(10, 9);
        mapa.crearPared(11, 9);
        mapa.crearPared(12, 9);
        mapa.crearPared(13, 9);
        mapa.crearPared(1, 14);
        mapa.crearPared(2, 14);
        mapa.crearPared(3, 14);
        mapa.crearPared(4, 14);
        mapa.crearPared(5, 14);
        mapa.crearPared(6, 14);
        mapa.crearPared(7, 14);
        mapa.crearPared(8, 14);
        mapa.crearPared(9, 14);
        mapa.crearPared(10, 14);
        mapa.crearPared(11, 14);
        mapa.crearPared(5, 16);
        mapa.crearPared(6, 16);
        mapa.crearPared(7, 16);
        mapa.crearPared(8, 16);
        mapa.crearPared(9, 16);
        mapa.crearPared(10, 16);
        mapa.crearPared(11, 16);
        mapa.crearPared(12, 16);
        mapa.crearPared(13, 16);

     // Crear jugador y salida en posiciones fijas
        Jugador jugador = new Jugador(1, 1); // Posición fija para el jugador
        Salida salida = new Salida(13, 18); // Posición fija para la salida
        
        // Crear enemigos y objetos en posiciones fijas
        
        Enemigo[] enemigos = {
            new EnemigoBasico(8,1),
            new EnemigoMedio(6,13),
            new EnemigoFinal(4,15)
        };
        
        Objeto pocion = new Objeto("Poción de vida baja", 35, 0, 5, 2, 'P');
        Objeto pocionVidaAlta = new Objeto("Poción de vida alta", 70, 0, 6, 7, 'H'); 
        Objeto arma = new Objeto("Espada básica", 0, 30, 13, 15, 'A');

        // Colocar elementos en la mazmorra
        mapa.colocarElemento(jugador.getX(), jugador.getY(), 'J');
        for (Enemigo enemigo : enemigos) {
            mapa.colocarElemento(enemigo.getX(), enemigo.getY(), 'E');
        }
        mapa.colocarElemento(pocion.getX(), pocion.getY(), 'P');
        mapa.colocarElemento(pocionVidaAlta.getX(), pocionVidaAlta.getY(), 'H');
        mapa.colocarElemento(arma.getX(), arma.getY(), 'A');
        mapa.colocarElemento(salida.getX(), salida.getY(), 'S');

        while (true) {
            // Mostrar mazmorra
            mapa.mostrarMazmorra();

            System.out.println("Jugador esta en (" + jugador.getX() + ", " + jugador.getY()+ ", vida: " + jugador.getVida()+ ", ataque: "+ jugador.getAtaque()+")");
            System.out.println("Mover (w/a/s/d): ");
            char movimiento = scanner.next().charAt(0);
            mapa.colocarElemento(jugador.getX(), jugador.getY(), '.'); // Limpiar posición anterior
            jugador.mover(movimiento);
            mapa.colocarElemento(jugador.getX(), jugador.getY(), 'J'); // Actualizar nueva posición

            for (Enemigo enemigo : enemigos) {
                if (jugador.getX() == enemigo.getX() && jugador.getY() == enemigo.getY()) {
                    while (enemigo.getVida() > 0 && jugador.getVida() > 0) {
                        System.out.println("¡Encuentras un " + enemigo.getNombre() + "! Vida del " + enemigo.getNombre() + ":" + enemigo.getVida()+", Ataque del" + enemigo.getNombre()+ ":"+ enemigo.getAtaque());
                        System.out.println("1. Atacar");
                        System.out.println("2. Usar poción de vida baja");
                        System.out.println("3. Usar poción de vida alta");
                        System.out.println("4. Equipar espada");
                        int opcion = scanner.nextInt();

                        switch (opcion) {
                        case 1:
                            enemigo.recibirAtaque(jugador.getAtaque());
                            System.out.println("Atacas al " + enemigo.getNombre() + ". Vida del " + enemigo.getNombre() + ": " + enemigo.getVida());
                            break;
                        case 2:
                            if (jugador.getInventario().getObjetos().contains(pocion)) {
                                jugador.usarObjeto(pocion);
                                System.out.println("Usas una poción de vida baja. Vida del jugador: " + jugador.getVida());
                            } else {
                                System.out.println("No tienes pociones de vida baja.");
                            }
                            break;
                        case 3:
                            if (jugador.getInventario().getObjetos().contains(pocionVidaAlta)) {
                                jugador.usarObjeto(pocionVidaAlta);
                                System.out.println("Usas una poción de vida alta. Vida del jugador: " + jugador.getVida());
                            } else {
                                System.out.println("No tienes pociones de vida alta.");
                            }
                            break;
                        case 4:
                            if (jugador.getInventario().getObjetos().contains(arma)) {
                                jugador.usarObjeto(arma);
                                System.out.println("Equipas una espada. Ataque del jugador: " + jugador.getAtaque());
                            } else {
                                System.out.println("No tienes armas.");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                        }

                        if (enemigo.getVida() > 0) {
                            enemigo.atacar(jugador);
                            System.out.println("El " + enemigo.getNombre() + " te ataca. Vida del jugador: " + jugador.getVida());
                        }
                    }

                    if (jugador.getVida() <= 0) {
                        System.out.println("¡Has sido derrotado!");
                        break;
                    } else {
                        System.out.println("¡Has derrotado al " + enemigo.getNombre() + "!");
                    }
                }
            }

            if (jugador.getX() == pocion.getX() && jugador.getY() == pocion.getY()) {
                jugador.getInventario().agregarObjeto(pocion);
                System.out.println("¡Has encontrado una poción de vida baja!");
            }
            
            if (jugador.getX() == pocionVidaAlta.getX() && jugador.getY() == pocionVidaAlta.getY()) {
                jugador.getInventario().agregarObjeto(pocionVidaAlta);
                System.out.println("¡Has encontrado una poción de vida alta!");
            }

            if (jugador.getX() == arma.getX() && jugador.getY() == arma.getY()) {
                jugador.getInventario().agregarObjeto(arma);
                System.out.println("¡Has encontrado un arma!");
            }

            if (jugador.getX() == salida.getX() && jugador.getY() == salida.getY()) {
                System.out.println("¡Has encontrado la salida! ¡Felicidades!");
                break;
            }

            if (jugador.getVida() <= 0) {
                System.out.println("¡Has sido derrotado!");
                break;
            }
        }
    }
}
