# Bautista-post2-u6
Unidad 6: Antipatrones de Diseño Post-Contenido 2

Post-Contenido 2: Eliminación de Spaghetti Code

Proyecto Maven en Java donde se refactoriza un sistema de procesamiento de pedidos aplicando los patrones Strategy y Command.

Objetivo

Eliminar el antipatrón Spaghetti Code presente en la clase ProcesadorPedidos, reduciendo la complejidad ciclomatica, mejorando mantenibilidad, reutilización y testabilidad.

Antipatrón identificado: Spaghetti Code

La versión inicial contenía:

Condicionales anidados hasta 6 niveles.
Reglas de descuento mezcladas con salida por consola.
Difícil mantenimiento.
Violación del principio OCP (Open/Closed Principle).
Código rígido y poco escalable.

Solución aplicada
Patrón Strategy

Se encapsuló la lógica de descuentos en clases independientes:

EstrategiaDescuento (interfaz)
DescuentoVIP
DescuentoPremium
DescuentoEstandar
Patrón Command

Se encapsuló la operación de procesar pedidos:

ComandoPedido (interfaz)
ComandoProcesarPedido
Selector centralizado
SelectorEstrategia

Selecciona automáticamente la estrategia según el tipo de cliente.

Diagrama / Descripción de clases
Pedido
│
├── EstrategiaDescuento
│   ├── DescuentoVIP
│   ├── DescuentoPremium
│   └── DescuentoEstandar
│
├── ComandoPedido
│   └── ComandoProcesarPedido
│
├── SelectorEstrategia
│
└── Main

Comparación antes vs después

Antes
Método procesarPedido() gigante.
6 niveles de anidamiento.
Mucho if / else.
Lógica mezclada.

Después
Una clase por responsabilidad.
Sin condicionales gigantes.
Código extensible.
Fácil agregar nuevos descuentos.

Ejecución
mvn compile
mvn exec:java

Salida de ejemplo
Procesando pedido: P001
 Estrategia: VIP | Descuento: 45%
 Total final: $660,00

Procesando pedido: P005
 Estrategia: ESTANDAR | Descuento: 0%
 Total final: $80,00
 
 Capturas

<img width="1874" height="990" alt="image" src="https://github.com/user-attachments/assets/97923be5-bb2d-4de2-9197-1d24ab24b38b" />


