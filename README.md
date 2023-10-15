
---
# UML

```mermaid
---
title: Pokemon Turmalina
---
classDiagram
    note "From Duck till Zebra"
    Pokemon <|-- Duck
    note for Duck "can fly\ncan swim\ncan dive\ncan help in debugging"
    Pokemon <|-- Fish
    Pokemon <|-- Zebra
    Pokemon : -String nombre
    Pokemon : -String tipo
    Pokemon : -int HP
    Pokemon : -Boolean derrotado
    Pokemon: +Pokemon()
    Pokemon: +mate()
    Pokemon: +mate()
    Pokemon: +mate()
    Pokemon: +mate()
    Pokemon: +mate()
    class Duck{
        +String beakColor
        +swim()
        +quack()
    }
    class Fish{
        -int sizeInFeet
        -canEat()
    }
    class Zebra{
        +bool is_wild
        +run()
    }
