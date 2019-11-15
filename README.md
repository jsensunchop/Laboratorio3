# Laboratorio3

Presentado por:

Juan Sebastián Ensuncho

Kevin Steven Liberato


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


## Punto 2
- Crear clase MedalloPizzaStore la cual es la nueva sede
- crear clases PaisaStyleBeansPizza,PaisaStyleRicePizza,PaisaStyleThreePhasePizza que seran las pizzas correspondientes a esta sede con sus respectivos ingredientes locales y adiciones
- modificar clase DependentPizzaStore añadiendo las nuevas clases para su reconocimiento en el programa.

## Punto 3
El patrón de construcción construye un objeto complejo usando objetos simples y usando un enfoque paso a paso. Este tipo de patrón de diseño viene bajo el patrón de creación, ya que este patrón proporciona una de las mejores formas de crear un objeto.

Una clase Builder construye el objeto final paso a paso. Este constructor es independiente de otros objetos.

## Punto 4

## Punto 5
- crear clase coffe que será el objeto principal
- crear clase CondimentDecorator a la cual se va a extender las adiciones necesarias
- crear clases, WithMilk,Mocha,WithFigure,CTime que seran las adiciones con su respectivo valor (CTime no se cobra)
- crear clase TostaoCoffe que sera la que cree los nuevos productos segun su complejidad usando las diferentes adiciones
