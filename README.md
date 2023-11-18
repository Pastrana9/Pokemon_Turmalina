# Pokemon Turmalina

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
    class Main {
        +start(Stage pantallaInicio)
        +main(String[] args)
    }

    class ControllerInicio {
        -inicioAnchorPane: AnchorPane
        +ButtonJugar(ActionEvent event)
        +ButtonSalir(ActionEvent event)
    }

    class PantallaInicio {
        -inicioAnchorPane: AnchorPane
        +ButtonJugar(ActionEvent event)
        +ButtonSalir(ActionEvent event)
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
        +fight1(ActionEvent event)
        +Ajustes(ActionEvent event)
        +Equipo(ActionEvent event)
        +Informacion(ActionEvent event)
        +initialize(URL location, ResourceBundle resources)
        -handleKeyPress(KeyEvent event)
        -moveSprite(double newX, double newY)
        -colisionConNpc1(double newX, double newY): boolean
        -colisionConNpc2(double newX, double newY): boolean
        -colisionConNpc3(double newX, double newY): boolean
        -colisionesMapa(double newX, double newY): boolean
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
        +fight1(ActionEvent event)
        +Ajustes(ActionEvent event)
        +Equipo(ActionEvent event)
        +Informacion(ActionEvent event)
        +initialize(URL location, ResourceBundle resources)
        -handleKeyPress(KeyEvent event)
        -moveSprite(double newX, double newY)
        -colisionConNpc1(double newX, double newY): boolean
        -colisionConNpc2(double newX, double newY): boolean
        -colisionConNpc3(double newX, double newY): boolean
        -colisionesMapa(double newX, double newY): boolean
    }

    class ControllerAjustes {
        -ajustesAnchorPane: AnchorPane
        +ButtonVolver(ActionEvent event)
        +ButtonTitulo(ActionEvent event)
    }

    class PantallaAjustes {
        -ajustesAnchorPane: AnchorPane
        +ButtonVolver(ActionEvent event)
        +ButtonTitulo(ActionEvent event)
    }

    class ControllerEquipo {
        -equipo: Equipo
        -lucha: ControllerLucha
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
        +initialize()
        +setEquipo(Equipo equipo)
        +elegir2()
    }

    class PantallaEquipo {
        -equipoAnchorPane: AnchorPane
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
    }
 class ControllerLucha {
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
        +initialize()
        +setEquipo(Equipo equipo)
        +botonAtacar()
        +botonCambiar()
        +mostrarPSRival()
        +mostrarVidaRival()
        +mostrarVida()
        +mostrarPS()
        +ataqueSeguro()
        +ataqueArriesgado()
        +ataqueMuyArriesgado()
        +cancelar()
        +ataqueRival()
        +actualizarVidaUsuario(int damage)
        +actualizarVidaRival(int damage)
        +cerrarVentanaActual()
        +setPokemonUsuario(Pokemon pokemon)
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
        +initialize()
        +setEquipo(Equipo equipo)
        +botonAtacar()
        +botonCambiar()
        +mostrarPSRival()
        +mostrarVidaRival()
        +mostrarVida()
        +mostrarPS()
        +ataqueSeguro()
        +ataqueArriesgado()
        +ataqueMuyArriesgado()
        +cancelar()
        +ataqueRival()
        +actualizarVidaUsuario(int damage)
        +actualizarVidaRival(int damage)
        +cerrarVentanaActual()
        +setPokemonUsuario(Pokemon pokemon)
    }
      class PantallaInformacion {
        -informacionAnchorPane: AnchorPane
        +ButtonVolver(ActionEvent event)
      }
    
      class ControllerInformacion {
        +ButtonVolver(ActionEvent event)
      }

    Main --> PantallaInicio : llama a
    PantallaInicio --> ControllerInicio : depende de
    ControllerInicio --> PantallaMapa : llama a
    PantallaMapa --> ControllerMapa : depende de
    ControllerMapa --> PantallaEquipo : llama a
    ControllerMapa --> PantallaAjustes : llama a
    ControllerMapa --> PantallaLucha : llama a
    ControllerMapa --> PantallaInformacion : llama a
    PantallaAjustes --> ControllerAjustes : depende de
    PantallaEquipo --> ControllerEquipo : depende de
    PantallaLucha -->  ControllerLucha : depende de
    PantallaInformacion -->  ControllerInformacion : depende de




