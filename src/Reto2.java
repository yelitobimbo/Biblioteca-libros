
package src:
// Reto 2 : historial de lecctura con lista doble.


public class Reto2 {
    public static void main(String[] args) {
        ListaDoble historial = new ListaDoble();

        historial.insertarInicio("Rayuela");
        historial.insertarInicio("Pedro Paramo");
        historial.insertarInicio("Ficciones");
        historial.insertarInicio("Dracula");
        historial.insertarInicio("Fahrenheit 451");
        historial.mostrarAdelante();
        historial.mostrarInverso();

        historial.eliminar("Ficciones");         // intermedio
        historial.mostrarAdelante();
        historial.eliminar("Fahrenheit 451");    // cabeza
        historial.mostrarAdelante();
        historial.eliminar("Rayuela");           // cola
        historial.mostrarAdelante();
        historial.mostrarInverso();
    }
}

class NodoDoble {
    String libro;
    NodoDoble siguiente, anterior;

    NodoDoble(String libro) {
        this.libro = libro;
    }
}

class ListaDoble {
    private NodoDoble cabeza, cola;

    // agrega un libro al incio del historial. 
    public void insertarInicio(String libro) {
        NodoDoble nuevo = new NodoDoble(libro);
        if (cabeza == null) {
            cabeza = nuevo;                      // TODO 1: cabeza y cola son el nuevo
            cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;            // TODO 2: el nuevo apunta a la cabeza actual
            cabeza.anterior = nuevo;             // TODO 3: la cabeza actual apunta atras, al nuevo
            cabeza = nuevo;                      // TODO 4: el nuevo es la cabeza
        }
    }

    // elimina la primera aparicion del libro. 
    public boolean eliminar(String libro) {
        NodoDoble actual = cabeza;
        while (actual != null && !actual.libro.equals(libro)) {
            actual = actual.siguiente;
        }
        if (actual == null) return false;

        if (actual.anterior != null) {                    // TODO 5
            actual.anterior.siguiente = actual.siguiente;
        } else {
            cabeza = actual.siguiente;                    // era la cabeza
        }

        if (actual.siguiente != null) {                   // TODO 6
            actual.siguiente.anterior = actual.anterior;
        } else {
            cola = actual.anterior;                       // era la cola
        }
        return true;
    }

   // muestra de la cabza a la cola. 
    public void mostrarAdelante() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.print(actual.libro + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
// muestra de la cola a la cabeza. 
    public void mostrarInverso() {
        NodoDoble actual = cola;
        while (actual != null) {
            System.out.print(actual.libro + " -> ");   // TODO 7: imprimir y retroceder
            actual = actual.anterior;
        }
        System.out.println("null");
    }
}


