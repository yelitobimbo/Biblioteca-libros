
package src:
// reto 3: turnos de prestamo con lista circular.

public class Reto3 {
    public static void main(String[] args) {
        ListaCircular fila = new ListaCircular();

       fila.insertar("Oscar");
        fila.insertar("Yaneli");
        fila.insertar("Emmanuel");
       fila.insertar("Fernanda");
       fila.insertar("Luis");
        fila.mostrarUnaVuelta();
        System.out.println("Total: " + fila.contar());

       fila.eliminarSiguienteDe("Yaneli");     // elimina a Emmanuel (intermedio)
       fila.mostrarUnaVuelta();
      fila.eliminarSiguienteDe("Luis");        // elimina a Oscar (cabeza)
        fila.mostrarUnaVuelta();
     fila.eliminarSiguienteDe("Yaneli");     // elimina a Fernanda
       fila.mostrarUnaVuelta();
       fila.eliminarSiguienteDe("Yaneli");     // elimina a Luis (cola)
        fila.mostrarUnaVuelta();

      fila.eliminarSiguienteDe("Yaneli");     // un solo nodo: queda vacia
        System.out.println("Total: " + fila.contar());
    }
}


class NodoCircular {
    String estudiante;
    NodoCircular siguiente;

    NodoCircular(String estudiante) {
        this.estudiante = estudiante;
    }
}

class ListaCircular {
    private NodoCircular cabeza, cola;

    // aagrega un estudiante al final de la fila. 
    public void insertar(String estudiante) {
        NodoCircular nuevo = new NodoCircular(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;                      // TODO 1: un solo nodo, se apunta a si mismo
            cola = nuevo;
            nuevo.siguiente = nuevo;
        } else {
            cola.siguiente = nuevo;              // TODO 2: la cola apunta al nuevo
            nuevo.siguiente = cabeza;            // TODO 3: cerrar el circulo
            cola = nuevo;
        }
    }

    // muestra la fila dando una sola vuelta. 
    public void mostrarUnaVuelta() {
        if (cabeza == null) return;
        NodoCircular actual = cabeza;
        do {
            System.out.print(actual.estudiante + " -> ");
            actual = actual.siguiente;           // TODO 4: avanzar
        } while (actual != cabeza);              // TODO 5: parar al volver a la cabeza
        System.out.println("(vuelve a " + cabeza.estudiante + ")");
    }

    // Cuenta los estudiantes de la fila. 
    public int contar() {
        if (cabeza == null) return 0;
        int total = 0;                           // TODO 6
        NodoCircular actual = cabeza;
        do {
            total++;
            actual = actual.siguiente;
        } while (actual != cabeza);
        return total;
    }

 // elimina al estudiante que sigue despues del indicado.
    public void eliminarSiguienteDe(String estudiante) {
        if (cabeza == null) return;
        NodoCircular actual = cabeza;
        do {
            if (actual.estudiante.equals(estudiante)) {      // TODO 7
                NodoCircular eliminado = actual.siguiente;
                if (eliminado == actual) {                   // un solo nodo
                    cabeza = null;
                    cola = null;
                    return;
                }
                actual.siguiente = eliminado.siguiente;      // saltar al eliminado
                if (eliminado == cabeza) cabeza = eliminado.siguiente;
                if (eliminado == cola) cola = actual;
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}

