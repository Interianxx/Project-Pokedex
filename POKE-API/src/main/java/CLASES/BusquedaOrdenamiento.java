package CLASES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Este metodo muestra el menu de la aplicacion
 */
public class BusquedaOrdenamiento {
    
    public static void mostrarMenu() {
        System.out.println("BIENVENIDO A LA POKEDEX, NUMERO UNO EN CAMPECHE");
        System.out.println("1.- Buscar pokemon por No. de pokedex");
        System.out.println("2.- Buscar pokemon por Nombre");
        System.out.println("3.- Ordenar las estadisticas de los pokemons ");
        System.out.println("4.- salir\n");
    }

    /**
     * Busca un Pokémon por su número de Pokedex.
     * @param listaDePokemones Lista de Pokémon donde se realizará la búsqueda.
     * @param entrada Scanner para recibir la entrada del usuario.
     */
    public static void buscarPorNumero(List<PokemonAPI> listaDePokemones, Scanner entrada) {
        System.out.println("Que numero de Pokedex deseas buscar?");
        int pokemonNumero = entrada.nextInt();
        PokemonAPI encontrado = encontrarPokemonPorNumero(listaDePokemones, pokemonNumero);

        mostrarResultado(encontrado);
    }
    
    /**
     * Busca un Pokémon por su nombre.
     * @param listaDePokemones Lista de Pokémon donde se realizará la búsqueda.
     * @param entrada Scanner para recibir la entrada del usuario.
     */
    public static void buscarPorNombre(List<PokemonAPI> listaDePokemones, Scanner entrada) {
        System.out.println("Que nombre de Pokemon deseas buscar?");
        String pokemonNombre = entrada.nextLine();
        PokemonAPI encontrado = encontrarPokemonPorNombre(listaDePokemones, pokemonNombre);

        mostrarResultado(encontrado);
    }

    /**
     * Ordena la lista de Pokémon por una estadística específica.
     * @param listaDePokemones Lista de Pokémon que se ordenará.
     * @param entrada Scanner para recibir la entrada del usuario.
     */
    
    /*
    Importante: Al momento de imprimir por estadistica tome como referencia que el codigo se lee
    de arriba para abajo ya que si se lee de abajo para arriba se puede confundir.
    */
    public static void ordenarPorEstadistica(List<PokemonAPI> listaDePokemones, Scanner entrada) {
        System.out.println("En que estadistica deseas ordenar los Pokemon? (salud, ataque, defensa, ataque especial, defensa especial, velocidad)");
        String estadistica = entrada.nextLine().toLowerCase();
        System.out.print("Deseas ordenar de forma ascendente o descendente ?,");
        System.out.println("  Digite 1 si descendente, digite 2 si es ascendente");
        String orden = entrada.nextLine().toLowerCase();

        if (validarEstadistica(estadistica)) {
            quickSort(listaDePokemones, estadistica, orden.equals("2"));
            System.out.println("Listado de Pokemon ordenado por " + estadistica + " de forma " + orden + ":");
            listaDePokemones.forEach(pokemon -> System.out.println(pokemon.getNombre() + " (" + pokemon.getTipoPrimario() + ", " + pokemon.getTipoSecundario() + ") - " + getStatValue(pokemon, estadistica)));
            System.out.println();
        } else {
            System.out.println("Estadistica no valida.");
            System.out.println();
        }
    }

    public static void salir() {
        System.out.println("Gracias por utilizar nuestra Pokedex.\n");
    }

    private static PokemonAPI encontrarPokemonPorNumero(List<PokemonAPI> pokemonLista, int pokedexNumero) {
        return pokemonLista.stream()
                .filter(pokemon -> pokemon.getNumeroPokedex() == pokedexNumero)
                .findFirst()
                .orElse(null);
    }

    private static PokemonAPI encontrarPokemonPorNombre(List<PokemonAPI> listaDePokemones, String nombre) {
        return listaDePokemones.stream()
                .filter(pokemon -> pokemon.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    private static void quickSort(List<PokemonAPI> listaDePokemones, String estadistica, boolean asc) {
        int n = listaDePokemones.size();
        quickSortHelper(listaDePokemones, 0, n - 1, estadistica, asc);
    }

    private static void quickSortHelper(List<PokemonAPI> listaDePokemones, int low, int high, String estadistica, boolean asc) {
        if (low < high) {
            int pi = partition(listaDePokemones, low, high, estadistica, asc);
            quickSortHelper(listaDePokemones, low, pi - 1, estadistica, asc);
            quickSortHelper(listaDePokemones, pi + 1, high, estadistica, asc);
        }
    }

    private static int partition(List<PokemonAPI> listaDePokemones, int low, int high, String estadistica, boolean asc) {
        int pivote = getStatValue(listaDePokemones.get(high), estadistica);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            int statValueJ = getStatValue(listaDePokemones.get(j), estadistica);

            if ((asc && statValueJ < pivote) || (!asc && statValueJ > pivote)) {
                i++;
                Collections.swap(listaDePokemones, i, j);
            }
        }

        Collections.swap(listaDePokemones, i + 1, high);

        return i + 1;
    }

    private static int getStatValue(PokemonAPI pokemon, String estadistica) {
        return switch (estadistica) {
            case "salud" -> pokemon.getSalud();
            case "ataque" -> pokemon.getAtaque();
            case "defensa" -> pokemon.getDefensa();
            case "ataque especial" -> pokemon.getAtaqueEspecial();
            case "defensa especial" -> pokemon.getDefensaEspecial();
            case "velocidad" -> pokemon.getVelocidad();
            default -> 0;
        };
    }
    
    /**
     * Muestra el resultado de la búsqueda.
     * @param encontrado Pokémon encontrado (puede ser nulo si no se encuentra).
     */
    private static void mostrarResultado(PokemonAPI encontrado) {
        if (encontrado != null) {
            System.out.println("Pokemon encontrado: " + encontrado.getNombre());
            System.out.println("Detalles del Pokemon:\n" + encontrado + "\n");
        } else {
            System.out.println("Pokemon no encontrado.\n");
        }
    }

    /**
     * Valida si la estadística proporcionada es válida.
     * @param estadistica Estadística a validar.
     * @return true si la estadística es válida, false si no lo es.
     */
    private static boolean validarEstadistica(String estadistica) {
        return Arrays.asList("salud", "ataque", "defensa", "ataque especial", "defensa especial", "velocidad").contains(estadistica);
    }
}