# Pokemon_Turmalina

Integrantes: Manuel Pastrana Blazquez y Álvaro Pereda Sánchez.

Pokemon Turmalina es un FanGame de la famosa saga de videojuegos Pokemon.

El juego pertenecerá al género de los juegos de rol (RPG) y se centra en el entrenamiento y en los combates de Pokémons. El objetivo principal del juego es convertirse en el Campeón del distrito derrotando a los entrenadores de toda la aldea.

En "Pokémon Turmalina", los jugadores exploran el distrito de Siofra, luchan contra otros entrenadores y completan misiones para avanzar en la historia. 

Al protagonista se le otorgará un equipo Pokémon con el que tendrá que vencer a todos los entrenadores para poder acabar el juego y así alzarse como el mejor entrenador de Siofra.


---
# UML

```mermaid
---
title: Pokemon Turmalina
---
classDiagram
    Pokemon <|-- Pikachu
    Pokemon <|-- Charmander
    class Pokemon{
        -nombre:String
        -tipo:String
        -HP:int
        -derrotado:Boolean = false
        +Pokemon(String nombre,String tipo,int HP)
        +getNombre() String
        +getHP() int
        +getDerrotado() Boolean
        +setDerrotado()
        +atacar(Pokemon rival, int damage)
        +selector()* int
    }
    class Pikachu{
        -rayo:int = 40
        -placaje:int = 10
        +Pikachu(String nombre,String tipo,int HP)
        +getRayo() int
        +getPlacaje() int
        +selector()* int
    }
    class Charmander{
        -ascuas:int = 20
        -furia:int = 10
        +Charmander(String nombre,String tipo,int HP)
        +getAscuas() int
        +getFuria() int
        +selector()* int
    }
    class Entrenador{
        -nombre:String
        -equipo:Pokemon[] = new Pokemon[2]
        +Entrenador(String nombre, Pokemon[] equipo)
        +getNombre() String
        +getEquipo():Pokemon[]
        +setEquipo(Pokemon[] equipo)
        +verEquipo()
        +cambio() Pokemon
        
    }
    class Rival{
        -nombre:String
        -equipo:Pokemon[] = new Pokemon[2]
        +Rival(String nombre, Pokemon[] equipo)
        +getNombre() String
        +getEquipo() Pokemon[]
        +setEquipo(Pokemon[] equipo)
        +cambio() Pokemon
    }
    class Battle{
        -Entrenador jugador
        -Rival rival
        +Battle(Entrenador jugador, Rival rival)
        +modificarEquipo(Pokemon derrotado, Pokemon[] equipo):Pokemon[]
        +iniciar()
    }

