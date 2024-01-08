# Pokemon Turmalina

Integrantes: Manuel Pastrana Blázquez y Álvaro Pereda Sánchez.

Pokemon Turmalina es un FanGame de la famosa saga de videojuegos Pokemon.

El juego pertenece al género de los juegos de rol (RPG) y se centra en el entrenamiento y en los combates de Pokémons. El objetivo principal del juego es convertirse en el Campeón del distrito derrotando a los entrenadores de toda la aldea.

En "Pokémon Turmalina", los jugadores exploran Pueblo Siofra, luchan contra otros entrenadores y completan misiones para avanzar en la historia. 

Al protagonista se le otorgará un equipo Pokémon con el que tendrá que vencer a todos los entrenadores para poder acabar el juego y así alzarse como el mejor entrenador de Pueblo Siofra.

# Como jugar

El movimiento se basa en el uso de las teclas awsd. Al comienzo del juego aparecerás en el inicio de Pueblo Siofra, con un equipo de pokemons predeterminado. Si tienes dudas de que hacer en en Pueblo Siofra puedes consultar las misiones en el botón que hay en la esquina inferior izquierda.

Una vez que derrotes a un entrenador pokemon no podrás volver a luchar con él. Además, asegurate de explorar bien el mapa.

# Patrón de Diseño Modelo-Vista-Controlador (MVC)

En la arquitectura de nuestro juego (Pokémon Turmalina), hemos optado por implementar el patrón de diseño Modelo-Vista-Controlador (MVC). Este enfoque organizativo es esencial para estructurar el código de manera clara.

En nuestro juego, el Modelo abarca la información relativa a los Pokémon, sus estadísticas, movimientos y cualquier otro aspecto que involucre datos subyacentes.

La Vista es la capa encargada de la presentación y la interfaz de usuario. Aquí se encuentra todo lo relacionado con la visualización de la información para el jugador. En nuestro contexto, la Vista abarca la representación gráfica de los Pokémon, los elementos del juego y la interfaz de usuario.

El Controlador actúa como intermediario entre el Modelo y la Vista. Se encarga de gestionar las interacciones del usuario, interpretando las acciones y actualizando el Modelo en consecuencia. En nuestro juego, el Controlador maneja la entrada del jugador, como las selecciones de Pokémon, los combates y otras interacciones.


# Ejecutable

Pokemon Turmalina cuenta con un archivo ejecutable para poder disfrutar del juego. Aunque hay que seguir unos pasos para que se pueda ejecutar correctamente.
    
    1.- Tendrás que descargar la carpeta con el nombre de PokemonTurmalinaEjecutable, en la que hay tres archivos, 
    como se muestra en la foto.
    
[![imagen-2023-12-04-231259208.png](https://i.postimg.cc/mrV9BP0z/imagen-2023-12-04-231259208.png)](https://postimg.cc/nsjr1hVp)
    
    2.- El primer archivo son las carpetas con las librerias de JavaFX para que funcione 
        correctamente Pokemon Turmalina.
    
        El segundo archivo es un .bat que sirve para ejecutar PokemonTurmalina.jar, 
        ya que en las nuevas versiones de java, donde está hecho Pokemon Turmalina,
        JavaFx no está dentro de Java por lo que necesitamos unas librerias externas para que funcione el .jar.
        
        El tercer archivo es el .jar que contiene todo el juego.

    3.- Este es el paso más importante, se tendrá que editar ejecutable.bat y editar las url que salen en el
    para que funcione en el ordenador.
    La primera url debe ser donde se encuentra la lib, que se encuentra dentro de la carpeta javafx-sdk-21.0.1.
    El segundo url debe ser donde se encuentra PokemonTurmalina.jar
    Los tres puntos indican que parte de la url se tiene que modificar con la ruta correcta.

[![imagen-2023-12-04-231552293.png](https://i.postimg.cc/5t93BWJz/imagen-2023-12-04-231552293.png)](https://postimg.cc/jD9PT9Lq)
[![imagen-2023-12-04-231822370.png](https://i.postimg.cc/tg76RqyB/imagen-2023-12-04-231822370.png)](https://postimg.cc/v1FT3d4n)

    
        

---
# UML

```mermaid
---
title: Pokemon Turmalina
---
classDiagram
    class Main {
        +start(Stage pantallaInicio)
        +main(String[] args)
    }
      class Equipo {
    - pokemon1: Pokemon
    - pokemon2: Pokemon
    - pokemon3: Pokemon
    - pokemon4: Pokemon
    - pokemon5: Pokemon
    - pokemon6: Pokemon
    + Equipo(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6)
    + getPokemon1(): Pokemon
    + getPokemon2(): Pokemon
    + getPokemon3(): Pokemon
    + getPokemon4(): Pokemon
    + getPokemon5(): Pokemon
    + getPokemon6(): Pokemon
    + getListaPokemon(): ArrayList<Pokemon>
  }

  class Pokemon {
    - nombre: String
    - vida_total: int
    - vida: int
    - nivel: int
    - genero: char
    + Pokemon(String nombre, int vida_total, int vida, int nivel, char genero)
    + getNombre(): String
    + getVida_total(): int
    + getVida(): int
    + setVida(int vida)
    + getNivel(): int
    + getGenero(): char
    + getImg(): String
  }
class AtaqueEspecial{
    <<Interface>>
    ataqueMuyArriesgado(): int
    ataqueSeguro(): int
}

  class AtaqueEspecialRandom {
    <<Abstract>>
    +AtaqueEspecialRandom(String nombre,int vidaTotal, int vida , int nivel , char genero, String img)
    +ataqueMuyArriesgado(): int
    +ataqueSeguro(): int
  }
  class Blastoise {
    +Blastoise()
    +ataqueSeguro(): int
  }
  class Bulbasaur {
    +Bulbasaur()
    +ataqueSeguro(): int
  }
  class Charizard {
    +Charizard()
    +ataqueSeguro(): int
  }
  class Dialga {
    +Dialga()
    +ataqueSeguro(): int
  }
  class Entei {
    +Entei()
    +ataqueSeguro(): int
  }
  class Gengar {
    +Gengar()
    +ataqueSeguro(): int
  }
  class Mew {
    +Mew()
    +ataqueSeguro(): int
  }
  class Mewtwo {
    +Mewtwo()
    +ataqueSeguro(): int
  }
  class Rapidash {
    +Rapidash()
    +ataqueSeguro(): int
  }
  class Snorlax {
    +Snorlax()
    +ataqueSeguro(): int
  }

    class ControllerInicio {
        -inicioAnchorPane: AnchorPane
        +ButtonJugar(ActionEvent event)
        +ButtonSalir(ActionEvent event)
    }

    class PantallaInicio {
        -inicioAnchorPane: AnchorPane
        +ButtonJugar
        +ButtonSalir
    }

    class PantallaMapa {
        -gameplayAnchorPane: AnchorPane
        -sprite: ImageView
        -casa: Rectangle
        -casa2: Rectangle
        -casa3: Rectangle
        -casaGrande1: Rectangle
        -casaGrande2: Rectangle
        -casaGrande3: Rectangle
        -vallaRio: Rectangle
        -valla: Rectangle
        -arboles: Rectangle
        -arboles1: Rectangle
        -arboles2: Rectangle
        +fight1()
        +Ajustes()
        +Equipo()
        +Informacion()
        +Pozo()
    }

    class ControllerMapa {
        -gameplayAnchorPane: AnchorPane
        -sprite: ImageView
        -casa: Rectangle
        -casa2: Rectangle
        -casa3: Rectangle
        -casaGrande1: Rectangle
        -casaGrande2: Rectangle
        -casaGrande3: Rectangle
        -vallaRio: Rectangle
        -valla: Rectangle
        -arboles: Rectangle
        -arboles1: Rectangle
        -arboles2: Rectangle
        -Xusuario: double
        -Yusuario: double
        -transition: TranslateTransition
        -distancia: int
        -hitboxX: double
        -hitboxY: double
        -npcHitboxX: double
        -npcHitboxY: double
        -imagenX: double
        -imagenY: double
        -controllerLucha: ControllerLucha
        -controllerPozo: ControllerPozo
        -controllerEquipo: ControllerEquipo
        -winNpc1: Boolean
        -winNpc2: Boolean
        -winNpc3: Boolean
        -equipo: Equipo
        +initialize(URL location, ResourceBundle resources)
        +setEquipo(Equipo equipo)
        +abrirPantallaFxml(String pantallafxml)
        +fight1(ActionEvent event)
        +fight2(ActionEvent event)
        +fight3(ActionEvent event)
        +NoSalida(ActionEvent event)
        +Ajustes(ActionEvent event)
        +Equipo(ActionEvent event)
        +Informacion(ActionEvent event)
        +Pozo(ActionEvent event)
        +handleKeyPress(KeyEvent event)
        +moveSprite(double newX, double newY)
        +colisionConNpc1(double newX, double newY): boolean
        +colisionConNpc2(double newX, double newY): boolean
        +colisionConNpc3(double newX, double newY): boolean
        +colisionPozo(double newX, double newY): boolean
        +colisionNoSalida(double newX, double newY): boolean
        +colisionesMapa(double newX, double newY): boolean
        +setPosicionJugador(double Xusuario, double Yusuario)
    }

    class ControllerAjustes {
        -ajustesAnchorPane: AnchorPane
        +ButtonVolver(ActionEvent event)
        +ButtonTitulo(ActionEvent event)
    }

    class PantallaAjustes {
        -ajustesAnchorPane: AnchorPane
        +ButtonVolver
        +ButtonTitulo
    }

    class ControllerEquipo {
        -idLayout2: GridPane
        -vida: Label
        -vida2: Label
        -vida3: Label
        -vida4: Label
        -vida5: Label
        -vida6: Label
        -nombre: Label
        -nombre2: Label
        -nombre3: Label
        -nombre4: Label
        -nombre5: Label
        -nombre6: Label
        -nivel: Label
        -nivel2: Label
        -nivel3: Label
        -nivel4: Label
        -nivel5: Label
        -nivel6: Label
        -pb: ProgressBar
        -pb2: ProgressBar
        -pb3: ProgressBar
        -pb4: ProgressBar
        -pb5: ProgressBar
        -pb6: ProgressBar
        -equipo: Equipo
        -pokemonLucha: Pokemon
        +initialize(URL location, ResourceBundle resources)
        +setEquipo(Equipo equipo)
        +elegir1()
        +elegir2()
        +elegir3()
        +elegir4()
        +elegir5()
        +elegir6()
        +getPokemonSeleccionado(): Pokemon
        +Buttonvolver(ActionEvent event)
        +cerrarVentanaActual()
    }

    class PantallaEquipo {
        -idLayout2: GridPane
        -imagen: ImageView
        -imagen2: ImageView
        -imagen3: ImageView
        -imagen4: ImageView
        -imagen5: ImageView
        -imagen6: ImageView
        -nombre: Label
        -nombre2: Label
        -nombre3: Label
        -nombre4: Label
        -nombre5: Label
        -nombre6: Label
        -nivel: Label
        -nivel2: Label
        -nivel3: Label
        -nivel4: Label
        -nivel5: Label
        -nivel6: Label
        -pb: ProgressBar
        -pb2: ProgressBar
        -pb3: ProgressBar
        -pb4: ProgressBar
        -pb5: ProgressBar
        -pb6: ProgressBar
        -vida: Label
        -vida2: Label
        -vida3: Label
        -vida4: Label
        -vida5: Label
        -vida6: Label
        -gen: ImageView
        -gen2: ImageView
        -gen3: ImageView
        -gen4: ImageView
        -gen5: ImageView
        -gen6: ImageView
        +elegir1()
        +elegir2()
        +elegir3()
        +elegir4()
        +elegir5()
        +elegir6()
        +Buttonvolver()
    }
 class ControllerLucha {
        -idLayout: GridPane
        -idNombre: Label
        -idNivel: Label
        -idNombreRival: Label
        -idNivelRival: Label
        -idPSRival: Label
        -idPS: Label
        -idImagenRival: ImageView
        -idGeneroRival: ImageView
        -idImagen: ImageView
        -idGenero: ImageView
        -idAtaque1: Button
        -idAtaque2: Button
        -idAtaque3: Button
        -idCancelar: Button
        -idPbRival: ProgressBar
        -idPb: ProgressBar
        -cuadroTexto: TextArea
        -equipo: Equipo
        -pokemonUsuario: Pokemon
        -pokemonRival: Pokemon
        -pausa: PauseTransition
        -turnoUsuario: boolean
        -turnoRival: boolean
        +initialize()
        +getEquipo(): Equipo
        +asignarElementosFx()
        +asignarElementosFxRival()
        +cambiarPokemon()
        +setEquipo(Equipo equipo)
        +setRival(Pokemon pokemonRival)
        +botonAtacar()
        +botonCambiar()
        +ataqueSeguro()
        +ataqueArriesgado()
        +ataqueMuyArriesgado()
        +cancelar()
        +ataqueRival()
        +actualizarVidaUsuario(int damage)
        +actualizarVidaRival(int damage)
        +Buttonhuir(ActionEvent event)
        +cerrarVentanaActual()
        +combate()
    }

    class PantallaLucha {
        -idLayout: GridPane
        -idNombre: Label
        -idNivel: Label
        -idImagenRival: ImageView
        -idNombreRival: Label
        -idGeneroRival: ImageView
        -idNivelRival: Label
        -idImagen: ImageView
        -idGenero: ImageView
        -atacar: Button
        -cambiar: Button
        -idAtaque1: Button
        -idAtaque2: Button
        -idCancelar: Button
        -idAtaque3: Button
        -idPSRival: Label
        -idPbRival: ProgressBar
        -idPS: Label
        -idPb: ProgressBar
        -cuadroTexto: TextArea
        -equipo: Equipo
        -pokemonUsuario: Pokemon
        -vidaUsuario: int
        -vidaRival: int
        -pausa: PauseTransition
        +botonAtacar()
        +botonCambiar()
        +ataqueSeguro()
        +ataqueArriesgado()
        +ataqueMuyArriesgado()
        +cancelar()
        +Buttonhuir()
    }
      class PantallaInformacion {
        -informacionAnchorPane: AnchorPane
        +ButtonVolver()
      }
      class ControllerPozo {
        -Xusuario: double
        -Yusuario: double
        -transition: TranslateTransition
        -distancia: int
        -hitboxX: double
        -hitboxY: double
        -imagenX: double
        -imagenY: double
        -imagenXX: double
        -imagenYY: double
        -posicion: ControllerMapa
        -controllerLucha: ControllerLucha
        -controllerEquipo: ControllerEquipo
        -winBoss: Boolean
        -equipo: Equipo
        -PozoAnchorPane: AnchorPane
        -sprite: ImageView
        +initialize(URL location, ResourceBundle resources)
        +setEquipo(Equipo equipo)
        +handleKeyPress(KeyEvent event)
        +moveSprite(double newX, double newY)
        +colisionEscalera(double newX, double newY): boolean
        +colisionBoss(double newX, double newY): boolean
        +superficie(ActionEvent event)
        +abrirPantallaFxml(String pantallafxml)
        +fightBoss(ActionEvent event)
        +Ajustes(ActionEvent event)
        +Equipo(ActionEvent event)
        +Informacion(ActionEvent event)
    }
      class PantallaPozo {
        -PozoAnchorPane: AnchorPane
        -sprite: ImageView
        +Ajustes()
        +Equipo()
        +Informacion()
      }
      class VentanaNoSalida {
        -ajustesAnchorPane: AnchorPane
        -text1: Label
        -text2: Label
    }

    Main --> PantallaInicio : llama a
    PantallaInicio --o ControllerInicio : depende de
    ControllerInicio --> PantallaMapa : llama a
    PantallaMapa --o ControllerMapa : depende de
    ControllerMapa --> PantallaEquipo : llama a
    ControllerMapa --> PantallaAjustes : llama a
    ControllerMapa --> PantallaLucha : llama a
    ControllerMapa --> PantallaInformacion : llama a
    ControllerMapa --> PantallaPozo : llama a
    ControllerMapa --> VentanaNoSalida : llama a
    VentanaNoSalida --o  ControllerAjustes : depende de
    PantallaAjustes --o ControllerAjustes : depende de
    PantallaEquipo --o ControllerEquipo : depende de
    PantallaLucha --o  ControllerLucha : depende de
    PantallaInformacion --o  ControllerAjustes : depende de
    PantallaPozo --o  ControllerPozo : depende de
    AtaqueEspecial --|> AtaqueEspecialRandom
    Pokemon --|> AtaqueEspecialRandom
    AtaqueEspecialRandom --|> Blastoise
    AtaqueEspecialRandom --|> Bulbasaur
    AtaqueEspecialRandom --|> Charizard
    AtaqueEspecialRandom --|> Dialga
    AtaqueEspecialRandom --|> Entei
    AtaqueEspecialRandom --|> Gengar
    AtaqueEspecialRandom --|> Mew
    AtaqueEspecialRandom --|> Mewtwo
    AtaqueEspecialRandom --|> Rapidash
    AtaqueEspecialRandom --|> Snorlax





