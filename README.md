# Project-Pokedex
This project consists of a database created from the PokeAPI, with information on the pokemon available to date, from which a sorting method and a search method will be implemented, depending on the characteristics of the pokemon.

## Descripción

Este proyecto consiste en una base de datos creada desde la PokeAPI, con informacion de los pokemon disponibles hasta la fecha. El usuario podra buscar si se encuentra un pokemon dentro de nuestra base de datos y podra ordenarlos en base a sus estadisticas.

## Caracteristicas
- Buscar pokemon por No. de pokedex. Inserte un numero del 1 al 1000 para localizar un pokemon y ver si se encuentra disponible.
- Buscar pokemon por Nombre. Escriba el nombre del pokemon con total exactitud y 
- Ordenar las estadisticas de los pokemons

## Dependencias 
Este proyecto utiliza las siguientes dependencias_

- [Opencsv](https://github.com/opencsv/opencsv): Biblioteca para leer y escribir archivos CSV en Java.
- [Apache Commons Lang3](https://commons.apache.org/proper/commons-lang/): Biblioteca de utilidades generales para Java.

Asegúrate de tener estas dependencias instaladas antes de ejecutar el proyecto, aunque ya esten agregadas en el archivo pom.xml.

## Librerias
Este proyecto utiliza estas 3 librerias que son importantes para el ordenamiento

- Quicksort: El Quicksort es un algoritmo de ordenamiento eficiente que se basa en la técnica de "divide y vencerás". En esta Pokedex, se utiliza para ordenar los Pokémon según ciertas caracteristicas.
- Collections: La clase `Collections` proporciona un método `sort` que se utiliza para ordenar la lista de Pokémon. Esta función se aplica, por ejemplo, al ordenar los resultados de la búsqueda por nombre.
- Arrays: la clase `Arrays` también proporciona un método `sort` que se utiliza para ordenar arrays, aunque en este caso se prefiere la utilización de `Collections.sort()` para listas.

## Requerimientos

- Tener instalado la JVM en tu equipo (Java Virtual Machine)
- Si quieres editar el código, te recomendamos usar el IDE Netbeans, y tener instalado el JDK (Java Development Kit). Sugerimos utilizar Netbeans para poder visualizar el funcionamiento de codigo.
- Es necesario que una vez agregado el proyecto a netbeans se ejecute "clean and build project" para que se reconozcan las dependencias necesarias. 

## El programa en funcionamiento
Seleccione la opcion 1 para buscar pokemon por no. de pokedex. El numero debe ser del 1 al 1017.

![sys](https://i.imgur.com/UCPNNyD.png)

Seleccione la opcion 2 para buscar un pokemon por su nombre, es necesario que se introduzca su nombre con total exactitud para poder encontrarlo. 

![sys](https://i.imgur.com/2rlOx3y.png)
Seleccione la opcion 3 ordenar a los pokemon de acuerdo a sus estadisticas. Primero seleccione la estadistica que quiere utilizar como parametro de ordenamiento. Despues seleccione si quiere ver el ordenamiento de forma ascendente o descendente.

![sys](https://i.imgur.com/jFdBcNq.png)

## Cómo ejecutarlo

Descargue el proyecto en un zip. Abre Netbeans y en la opcion de Archivo seleccione la opcion de Importar. Si no se desea instalar las dependencias manualmente use "clean and build project" para que se instalen. Por ultimo ponga a correr el metodo main.

