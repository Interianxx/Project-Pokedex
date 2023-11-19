package CLASES;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String CSV_PATH = "pokedex.csv";

    /*
     * Este es el metodo que inicializa la Pokedex 
     * CSV_PATH almacena el csv que se encuentra alojado en la carpeta de este proyecto.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<PokemonAPI> ListaDePokemones = cargarPokemonsDeCSV(CSV_PATH);
        int seleccion;

        System.out.println("Proyecto - POKEDEX");
        
        // Usamos un bucle do-while para que el usuario pueda usar la pokedex despues de haber realiza una accion.
        do {
            BusquedaOrdenamiento.mostrarMenu();
            seleccion = entrada.nextInt();
            entrada.nextLine();

            switch (seleccion) {
                case 1 ->
                    BusquedaOrdenamiento.buscarPorNumero(ListaDePokemones, entrada);
                case 2 ->
                    BusquedaOrdenamiento.buscarPorNombre(ListaDePokemones, entrada);
                case 3 ->
                    BusquedaOrdenamiento.ordenarPorEstadistica(ListaDePokemones, entrada);
                case 4 ->
                    BusquedaOrdenamiento.salir();
                default ->
                    System.out.println("Por favor, digite una opcion valida del menu.");
            }
        } while (seleccion != 4);
    }
    
    /**
     * Aqui esta la magia
     * @param csvPath Aqui es donde se alojan la informacion de todos los pokemones 1017 en total
     * @return Retorna una lista de objetos que almacena la informacion de los pokemones.
     */
    private static List<PokemonAPI> cargarPokemonsDeCSV(String csvPath) {
        List<PokemonAPI> pokemonLista = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvPath))) {
            String[] nextLine;
            reader.readNext(); // Saltar la primera linea de los pokemones, ya que si no se salta este entra dentro de la lista
            while ((nextLine = reader.readNext()) != null) {
                // Parsea los datos y se crea objetos Pokemon
                PokemonAPI pokemon = new PokemonAPI(
                        nextLine[0],
                        Integer.parseInt(nextLine[1]),
                        nextLine[2],
                        nextLine[3],
                        Integer.parseInt(nextLine[4]),
                        Integer.parseInt(nextLine[5]),
                        Integer.parseInt(nextLine[6]),
                        Integer.parseInt(nextLine[7]),
                        Integer.parseInt(nextLine[8]),
                        Integer.parseInt(nextLine[9]));

                pokemonLista.add(pokemon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pokemonLista;
    }
}
