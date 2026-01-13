# Ejercicio: Contar Nodos en una Lista Enlazada

## Descripción

Este ejercicio consiste en implementar un método que cuente el número total de nodos en una lista enlazada simple.

## Estructura de Datos

Trabajaremos con la siguiente estructura de nodo:

```java
class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

Cada nodo contiene:
- **dato**: Un valor entero almacenado en el nodo
- **siguiente**: Una referencia al siguiente nodo de la lista (o `null` si es el último)

## Enunciado

Implementa el método `contarNodos` que:

1. Reciba como parámetro el **nodo inicial** (cabeza) de una lista enlazada
2. Devuelva un **entero** con el número total de nodos en la lista
3. Si la lista está vacía (`null`), debe devolver `0`

### Firma del método

```java
public static int contarNodos(Nodo inicio)
```

## Ejemplos

### Ejemplo 1: Lista con varios elementos

```
Lista: 5 -> 12 -> 7 -> 3
Resultado: 4
```

### Ejemplo 2: Lista con un solo elemento

```
Lista: 42
Resultado: 1
```

### Ejemplo 3: Lista vacía

```
Lista: null (vacía)
Resultado: 0
```

---

## Resolución

### Análisis del problema

Para contar los nodos de una lista enlazada, debemos **recorrer la lista completa** desde el primer nodo hasta el último, incrementando un contador por cada nodo que visitemos.

### Algoritmo paso a paso

1. **Inicializar** un contador a 0
2. **Inicializar** una variable auxiliar que apunte al nodo inicial
3. **Mientras** el nodo actual no sea `null`:
   - Incrementar el contador en 1
   - Avanzar al siguiente nodo
4. **Devolver** el valor del contador

### Representación visual

Supongamos que tenemos la lista `5 -> 12 -> 7 -> 3`:

```
Paso inicial:
contador = 0
actual → [5] → [12] → [7] → [3] → null

Paso 1:
contador = 1
actual → [12] → [7] → [3] → null

Paso 2:
contador = 2
actual → [7] → [3] → null

Paso 3:
contador = 3
actual → [3] → null

Paso 4:
contador = 4
actual → null  ← FIN del bucle

Resultado: 4
```

### Salida esperada

```
Lista 1: 5 -> 12 -> 7 -> 3
Número de nodos: 4
Esperado: 4

Lista 2: 42
Número de nodos: 1
Esperado: 1r

Lista 3: (vacía)
Número de nodos: 0
Esperado: 0
```
