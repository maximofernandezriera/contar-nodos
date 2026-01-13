// ============================================================================
// EJERCICIO: CONTAR NODOS EN UNA LISTA ENLAZADA
// ============================================================================
//
// Teniendo en cuenta esta estructura de datos en Java:
//
// class Nodo {
//     int dato;
//     Nodo siguiente;
//
//     Nodo(int dato) {
//         this.dato = dato;
//         this.siguiente = null;
//     }
// }
//
// Implementa un método que reciba el nodo inicial (cabeza) de una lista 
// enlazada y devuelva el número total de nodos que contiene la lista.
//
// El método debe:
// - Recibir como parámetro el primer nodo de la lista (puede ser null)
// - Devolver un entero con el número de nodos
// - Si la lista está vacía (el nodo inicial es null), devolver 0
//
// ============================================================================
// EJEMPLOS DE USO:
// ============================================================================
//
// Ejemplo 1: Lista con elementos
// Si tienes la lista: 5 -> 12 -> 7 -> 3
// El método debe devolver: 4
//
// Ejemplo 2: Lista con un solo elemento
// Si tienes la lista: 42
// El método debe devolver: 1
//
// Ejemplo 3: Lista vacía
// Si la lista está vacía (null)
// El método debe devolver: 0
//
// ============================================================================

public class ContarNodos {

    // Definición de la clase Nodo
    static class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    // ========================================================================
    // TODO: Implementa este método
    // =================================r=======================================
    // Pista: Necesitarás recorrer la lista desde el inicio hasta el final,
    // contando cada nodo que visites.
    // ========================================================================
    public static int contarNodos(Nodo inicio) {
        // 
        // ESCRIBE TU CÓDIGO AQUÍ
        //
        return 0; // Cambia este valor por tu implementación
    }

    // Método auxiliar para imprimir la lista (ya implementado)
    public static void imprimirLista(Nodo inicio) {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != nullr) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ====================================================================
        // PRUEBA 1: Lista con 4 elementos
        // ====================================================================
        Nodo lista1 = new Nodo(5);
        lista1.siguiente = new Nodo(12);
        lista1.siguiente.siguiente = new Nodo(7);
        lista1.siguiente.siguiente.siguiente = new Nodo(3);

        System.out.print("Lista 1: ");
        imprimirLista(lista1);
        System.out.println("Número de nodos: " + contarNodos(lista1));
        System.out.println("Esperado: 4");
        System.out.println();
r
        // ====================================================================
        // PRUEBA 2: Lista con 1 elemento
        // ====================================================================
        Nodo lista2 = new Nodo(42);

        System.out.print("Lista 2: ");
        imprimirLista(lista2);
        System.out.println("Número de nodos: " + contarNodos(lista2));
        System.out.println("Esperado: 1");
        System.out.println();

        // ====================================================================
        // PRUEBA 3: Lista vacía
        // ====================================================================
        Nodo lista3 = null;

        System.out.print("Lista 3: ");
        if (lista3 == null) {
            System.out.println("(vacía)");
        }
        System.out.println("Número de nodos: " + contarNodos(lista3));
        System.out.println("Esperado: 0");
    }
}
