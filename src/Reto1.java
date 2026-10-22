
package src:
// Reto 1 version A: Catalogo de libros con lista simple


public class Reto1 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.insertarFinal("Rayuela");
        lista.insertarFinal("Pedro Paramo");
        lista.insertarFinal("Ficciones");
        lista.insertarFinal("Dracula");
        lista.insertarFinal("Fahrenheit 451");
        lista.mostrar();

        System.out.println("Buscar Ficciones: " + lista.buscar("Ficciones"));
        System.out.println("Buscar El Aleph: " + lista.buscar("El Aleph"));

        lista.eliminar("Rayuela");               // cabeza
        lista.mostrar();
        lista.eliminar("Ficciones");             // intermedio
        lista.mostrar();
        lista.eliminar("Fahrenheit 451");        // ultimo
        lista.mostrar();
    }
}

class Nodo {
    String libro;
    Nodo siguiente;

    Nodo(String libro) {
        this.libro = libro;
    }
}

class ListaSimple {
    private Nodo cabeza;

    // Agrega un libro al final de la lista
    public void insertarFinal(String libro) {
        Nodo nuevo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nuevo;                      // TODO 1: lista vacia, el nuevo es la cabeza
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {   // TODO 2: parar en el ultimo nodo
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;            // TODO 3: enlazar el nuevo al final
        }
    }

    // devuelve true si el libro esta en la lista 
    public boolean buscar(String libro) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.libro.equals(libro)) {    // TODO 4: comparar con equals
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // elimina la primera aparicion del librro
    public boolean eliminar(String libro) {
        if (cabeza == null) return false;

        if (cabeza.libro.equals(libro)) {
            cabeza = cabeza.siguiente;           // TODO 5: eliminar la cabeza
            return true;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.libro.equals(libro)) {          // TODO 6: el siguiente es el buscado
                actual.siguiente = actual.siguiente.siguiente;   // TODO 7: saltarlo
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // muestra la lista completa. 
    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.libro + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
