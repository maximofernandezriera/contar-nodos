# Ejercicio: Diccionario Básico en Java

## Descripción

Este ejercicio consiste en implementar un sistema de búsqueda simple para un diccionario que almacena pares de palabras (clave y valor) utilizando un array.

## Estructura de Datos

Trabajaremos con una clase sencilla llamada `Entrada` que representa cada par del diccionario:

```java
class Entrada {
    String palabra;
    String significado;

    Entrada(String palabra, String significado) {
        this.palabra = palabra;
        this.significado = significado;
    }
}
```

Cada entrada contiene:
- **palabra**: La clave que queremos buscar (ej: "Java").
- **significado**: La definición o traducción asociada (ej: "Lenguaje de programación").

## Enunciado

Implementa el método `buscarSignificado` que:

1. Reciba como parámetro un **array de objetos Entrada** (el diccionario).
2. Reciba una **String** con la palabra que queremos buscar.
3. Devuelva una **String** con el significado correspondiente.
4. Si la palabra no existe en el diccionario, debe devolver el mensaje: `"Palabra no encontrada"`.

### Firma del método

```java
public static String buscarSignificado(Entrada[] diccionario, String palabraBuscada)
```

## Ejemplos

### Ejemplo 1: Palabra existente
```
Diccionario: [{"Java", "Lenguaje"}, {"Hola", "Saludo"}]
Búsqueda: "Java"
Resultado: "Lenguaje"
```

### Ejemplo 2: Palabra inexistente
```
Diccionario: [{"Java", "Lenguaje"}]
Búsqueda: "Python"
Resultado: "Palabra no encontrada"
```

---

## Resolución

### Análisis del problema

Para encontrar un significado en un diccionario basado en un array, debemos realizar una **búsqueda secuencial**. Esto implica revisar cada posición del array una por una hasta que encontremos la palabra que coincide con nuestra búsqueda.

### Algoritmo paso a paso

1. **Recorrer** el array desde la posición `0` hasta el final.
2. **Comparar** la palabra de la entrada actual con la palabra buscada (recuerda usar `.equals()`).
3. **Si coinciden**: Devolver inmediatamente el significado de esa entrada.
4. **Si termina el bucle** y no hemos devuelto nada: Significa que la palabra no está, por lo que devolvemos `"Palabra no encontrada"`.

### Representación visual

Buscando "Manzana" en un diccionario de 3 frutas:

```
Índice 0: [Pera | Fruta verde] -> ¿Es "Manzana"? NO.
Índice 1: [Manzana | Fruta roja] -> ¿Es "Manzana"? SÍ. 
RETORNAR "Fruta roja"
```