### Solución en código

```java
public static int contarNodos(Nodo inicio) {
    // Inicializamos el contador a 0
    int contador = 0;
    
    // Usamos una variable auxiliar para recorrer la lista
    // sin perder la referencia al inicio
    Nodo actual = inicio;
    
    // Recorremos la lista mientras haya nodos
    while (actual != null) {
        // Contamos el nodo actual
        contador++;
        
        // Avanzamos al siguiente nodo
        actual = actual.siguiente;
    }
    
    // Devolvemos el total de nodos contados
    return contador;
}
```

### Explicación línea por línea

| Línea | Explicación |
|-------|-------------|
| `int contador = 0;` | Creamos una variable para llevar la cuenta de nodos. Empezamos en 0 porque aún no hemos contado ninguno. |
| `Nodo actual = inicio;` | Creamos una variable auxiliar que apunta al primer nodo. Usamos esta variable para movernos por la lista sin perder la referencia al inicio. |
| `while (actual != null)` | Continuamos mientras haya nodos por visitar. Cuando `actual` sea `null`, habremos llegado al final de la lista. |
| `contador++;` | Incrementamos el contador porque hemos encontrado un nodo. |
| `actual = actual.siguiente;` | Avanzamos al siguiente nodo de la lista. |
| `return contador;` | Devolvemos el número total de nodos contados. |

### Casos especiales

1. **Lista vacía (`inicio == null`)**: El bucle `while` nunca se ejecuta porque la condición `actual != null` es falsa desde el principio. Se devuelve 0.

2. **Lista con un solo nodo**: El bucle se ejecuta una vez, se incrementa el contador a 1, y luego `actual.siguiente` es `null`, terminando el bucle.


