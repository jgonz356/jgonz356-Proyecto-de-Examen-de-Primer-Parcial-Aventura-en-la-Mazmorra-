package aventura_en_la_mazmorra;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Objeto> objetos;

    // Constructor
    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    // Método para agregar un objeto al inventario
    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    // Método para eliminar un objeto del inventario
    public void eliminarObjeto(Objeto objeto) {
        objetos.remove(objeto);
    }

    // Método para obtener la lista de objetos del inventario
    public List<Objeto> getObjetos() {
        return objetos;
    }

    // Método para obtener un objeto específico del inventario por índice
    public Objeto getObjeto(int indice) {
        if (indice >= 0 && indice < objetos.size()) {
            return objetos.get(indice);
        } else {
            return null;
        }
    }
    // Método para mostrar el inventario
    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (int i = 0; i < objetos.size(); i++) {
            System.out.println((i + 1) + ". " + objetos.get(i).getNombre());
        }
    }
}
