# Retos con listas simples, dobles y circulares

## Integrantes

José Emmanuel Arredondo Escalante
Yaneli Sánchez Cárdenas

## Datos de la actividad

*Asignatura:* Estructuras de datos
*Docente:* Gabriel Barron
*Grupo:* GTID244
*Fecha:* 22 de Octubre 20261
*Versión asignada:* A Biblioteca de libros


Reto 1: Catálogo de libros (lista simple)

Objetivo: Agregar, buscar y eliminar libros de una lista simple.

Explicación de los TODO

TODO

Explicación

1

Si la lista está vacía, el nuevo nodo será la cabeza.

2

Se recorre la lista hasta encontrar el último nodo.

3

Se conecta el último nodo con el nuevo.

4

Se compara el nombre del libro para saber si existe.

5

Para eliminar el primero, la cabeza pasa al siguiente nodo.

6

Se busca el nodo que contiene el libro a eliminar.

7

Se cambia el enlace para quitar el nodo de la lista.

Pruebas: Se agregaron cinco libros, se buscaron libros existentes y no existentes, y se eliminaron elementos de diferentes posiciones.

Evidencias





Reto 2: Historial de lectura (lista doble)

Objetivo: Insertar y eliminar libros, además de recorrer la lista hacia adelante y hacia atrás.

Explicación de los TODO

TODO

Explicación

1

Si la lista está vacía, el nuevo nodo será cabeza y cola.

2

El nuevo nodo apunta a la cabeza actual.

3

La cabeza actual apunta hacia atrás al nuevo nodo.

4

Se actualiza la cabeza con el nuevo nodo.

5

Se actualiza el enlace del nodo anterior al eliminado.

6

Se actualiza el enlace del nodo siguiente al eliminado.

7

Se recorre la lista desde la cola hasta la cabeza.

Pruebas: Se insertaron cinco libros y se eliminaron nodos del inicio, medio y final. También se comprobó el recorrido en ambos sentidos.

Evidencias





Reto 3: Turnos de préstamo (lista circular)

Objetivo: Agregar estudiantes, mostrar sus turnos, contarlos y eliminar al estudiante siguiente de uno indicado.

Explicación de los TODO

TODO

Explicación

1

Si hay un solo nodo, este apunta a sí mismo.

2

Se conecta el último nodo con el nuevo.

3

El nuevo apunta a la cabeza y se actualiza la cola.

4

Se avanza al siguiente nodo.

5

El recorrido termina al regresar a la cabeza.

6

Se cuentan los nodos dando una vuelta completa.

7

Se elimina el nodo siguiente y se actualizan los enlaces necesarios.

Pruebas: Se contaron los estudiantes y se probaron eliminaciones en distintas posiciones, incluyendo cuando solo quedaba un nodo.

Evidencias





Reflexión final

1. ¿Qué punteros tuvieron que actualizar en la eliminación de una lista doble y por qué son más que en la simple?

En la lista doble se actualizan las referencias del nodo anterior y del siguiente. En la lista simple solo se cambia la referencia hacia el siguiente nodo. Esto sucede porque la lista doble tiene enlaces en ambos sentidos.

2. ¿Qué error cometieron o evitaron por no considerar una lista vacía o de un solo nodo?

Evitamos errores al revisar si la lista estaba vacía antes de utilizar sus nodos. También consideramos cuando solo había un nodo para eliminarlo correctamente sin dejar referencias incorrectas.

3. ¿Qué pasaría si en la lista circular se recorre con while (actual != null)?

El programa entraría en un ciclo infinito, porque el último nodo siempre apunta al primero y nunca llega a null.

4. ¿En qué situación elegirían cada tipo de lista?

Simple: Cuando solo necesitamos avanzar, como en un catálogo de libros.

Doble: Cuando necesitamos avanzar y retroceder, como en un historial.

Circular: Cuando los turnos se repiten, como en una fila de préstamos.

5. ¿Qué fue lo más difícil y cómo lo resolvieron como bina?

Una de las partes más complicadas puede ser actualizar correctamente los enlaces al eliminar nodos.

Conclusión

Con estos retos aprendimos cómo funcionan las listas simples, dobles y circulares. También practicamos cómo insertar, buscar, recorrer y eliminar nodos, entendiendo la importancia de actualizar correctamente sus referencias.
