# Laboratorio3

Presentado por:
Juan Sebastián Ensuncho
Kevin Steven Kiberato


# Solucion:

## Punto 1
En el primer punto se realizo el diseño de patrones tipo estrategia (Strategy Pattern), este algoritmo se caracteriza porque el comportamiento de las clases o el mismo algoritmo puede cambiar en la ejecucion, en este creamos objetos que representan varias estrategias y un objeto de contexto cuyo comportamiento varía según su objeto de estrategia. El objeto de estrategia cambia el algoritmo de ejecución del objeto de contexto.

Los pasos fueron:

Paso #1:
Creacion de interfase

Paso #2:
Creacion de una clase concreta implementando la misma interfase
Creacion de las distintas operaciones viaje en bicicleta, bus o taxi.

Paso #3:
Creación de la clase contexto donde se ejecutara el strategy

Paso #4:
Creación de la clase principal donde usaremos Context para ver un cambio en el comportamiento cuando cambie Strategy


