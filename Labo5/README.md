# laboratorio-09

### 1. ¿Qué es una coroutine en Kotlin y cómo se diferencia de un hilo tradicional? 

Las coroutines son un mecanismo de programación que permite escribir código asíncrono de manera secuencial y estructurada en Kotlin. A diferencia de los hilos tradicionales, las coroutines son concurrencia cooperativa, lo que significa que el programador tiene el control para decidir cuándo se suspende y reanuda.

### 2. ¿Cuál es la importancia de la suspensión en las coroutines y cómo se implementa? 

La suspensión en las coroutines de Android se refiere a la capacidad de suspender momentáneamente la ejecución de una coroutine sin obstruir el main thread. su implementaciòn,cuando se suspende una coroutine, el hilo que estaba utilizando se libera para que otras coroutines o acciones puedan utilizarlo.

### 3. ¿Cuál es el propósito del Dispatcher en las coroutines y cómo se elige uno adecuado para cada tarea? 

es especificar en qué hilo (o hilos) se ejecutará una coroutine. Son sumamente tiles ya que existen tareas de Input/Output de red o de archivos , que no pueden realizarse en el hilo principal.

### 4. ¿Cuál es el propósito y el uso de la función async en las coroutines?

es permitirn que una coroutine espere a que se complete una operaciòn asincrona sin bloquear la ejecucion de todo el programa.
