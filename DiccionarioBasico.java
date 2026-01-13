// ============================================================================
// EJERCICIO: DICCIONARIO BÁSICO (BÚSQUEDA EN ARRAY)
// ============================================================================
//
// Teniendo en cuenta esta estructura de datos en Java:
//
// class Entrada {
//     String palabra;
//     String significado;
//
//     Entrada(String palabra, String significado) {
//         this.palabra = palabra;
//         this.significado = significado;
//     }
// }
//
// Implementa un método que busque una palabra en un array de entradas
// y devuelva su significado.
//
// El método debe:
// - Recibir el array de objetos Entrada.
// - Recibir la palabra (String) a buscar.
// - Devolver el significado (String) si la encuentra.
// - Devolver "Palabra no encontrada" si no existe en el array.
//
// ============================================================================

public class DiccionarioBasico {

    // Definición de la clase Entrada
    static class Entrada {
        String palabra;
        String significado;

        public Entrada(String palabra, String significado) {
            this.palabra = palabra;
            this.significado = significado;
        }
    }

    // ========================================================================
    // TODO: Implementa este método
    // ========================================================================
    // Pista: Usa un bucle for para recorrer el array y compara las cadenas
    // usando el método .equals() en lugar de ==.
    // ========================================================================
    public static String buscarSignificado(Entrada[] diccionario, String palabraBuscada) {
        // 
        // ESCRIBE TU CÓDIGO AQUÍ
        //
        return ""; 
    }

    public static void main(String[] args) {
        // Creamos un diccionario de prueba
        Entrada[] miDiccionario = {
            new Entrada("Java", "Un lenguaje de programación robusto"),
            new Entrada("HTML", "Lenguaje de marcas para la web"),
            new Entrada("GitHub", "Plataforma de alojamiento de código")
        };

        // ====================================================================
        // PRUEBA 1: Palabra existente
        // ====================================================================
        String busqueda1 = "Java";
        System.out.println("Buscando: " + busqueda1);
        System.out.println("Resultado: " + buscarSignificado(miDiccionario, busqueda1));
        System.out.println("Esperado: Un lenguaje de programación robusto");
        System.out.println();

        // ====================================================================
        // PRUEBA 2: Palabra inexistente
        // ====================================================================
        String busqueda2 = "Python";
        System.out.println("Buscando: " + busqueda2);
        System.out.println("Resultado: " + buscarSignificado(miDiccionario, busqueda2));
        System.out.println("Esperado: Palabra no encontrada");
        System.out.println();
    }
}