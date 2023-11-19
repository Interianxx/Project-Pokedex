# Project-Pokedex
This project consists of a database created from the PokeAPI, with information on the pokemon available to date, from which a sorting method and a search method will be implemented, depending on the characteristics of the pokemon.

## Descripción

Este proyecto consiste en una base de datos creada desde la PokeAPI, con informacion de los pokemon disponibles hasta la fecha. El usuario podra buscar si se encuentra un pokemon dentro de nuestra base de datos y podra ordenarlos en base a sus estadisticas.

## Caracteristicas
- Buscar pokemon por No. de pokedex. Inserte un numero del 1 al 1000 para localizar un pokemon y ver si se encuentra disponible.
- Buscar pokemon por Nombre. Escriba el nombre del pokemon con total exactitud y 
- Ordenar las estadisticas de los pokemons

## Requerimientos

- Tener instalado la JVM en tu equipo (Java Virtual Machine)
- Si quieres editar el código, te recomendamos usar el IDE Netbeans, y tener instalado el JDK (Java Development Kit). Sugerimos utilizar Netbeans para poder visualizar el funcionamiento de codigo.
- Es necesario que una vez agregado el proyecto a netbeans se ejecute "clean and build project" para que se instalen las dependencias necesarias. Si se desean instalar manualmente estas son las dependencias:
opencsv-5.5.2.jar
- Librerias...
- Nota adicional: El metodo main se ubica en la clase PokemonDatabase.java

## El programa en funcionamiento
Seleccione la opcion 1 para buscar pokemon por no. de pokedex. El numero debe ser del 1 al 1000.
![sys](https://imgur.com/WuGSFY1.png)
Seleccione la opcion 2 para buscar un pokemon por su nombre, es necesario que se introduzca su nombre con total exactitud para poder encontrarlo. 
![sys](https://imgur.com/nWGOBZM.png)
Seleccione la opcion 3 ordenar a los pokemon de acuerdo a sus estadisticas. Primero seleccione la estadistica que quiere utilizar como parametro de ordenamiento. Despues seleccione si quiere ver el ordenamiento de forma ascendente o descendente.
![sys](https://imgur.com/S2wI4My.png)

![sys](https://imgur.com/goGrscC.png)

## Cómo ejecutarlo

Descargue el proyecto en un zip. Abre Netbeans y en la opcion de Archivo seleccione la opcion de Importar. Si no se desea instalar las dependencias manualmente use "clean and build project" para que se instalen. Por ultimo ponga a correr el metodo main.

## Mejoras posibles

Por tiempo, algunas funcionalidades extra no se han implementado. Entre ellas, está la de guardar todo el stock en un archivo para que al abrir de nuevo el programa, este refleje la información de dicho archivo. Tambien es necesario que el usuario acceda a la carpeta donde esta ubicado el programa para acceder a los reportes.
