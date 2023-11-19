package CLASES;

// Esta clase aloja las caracteristicas de los Pokemones.
public class PokemonAPI {

    private final String nombre;
    private final int numeroPokedex;
    private final String tipoPrimario;
    private final String tipoSecundario;
    private final int salud;
    private final int ataque;
    private final int defensa;
    private final int ataqueEspecial;
    private final int defensaEspecial;
    private final int velocidad;

    // En este constructor inicializamos las caracteristicas del pokemon.
    public PokemonAPI(String nombre, int numeroPokedex, String tipoPrimario, String tipoSecundario,
            int salud, int ataque, int defensa, int ataqueEspecial,
            int defensaEspecial, int velocidad) {
        this.nombre = nombre;
        this.numeroPokedex = numeroPokedex;
        this.tipoPrimario = tipoPrimario;
        this.tipoSecundario = tipoSecundario;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
    }

    // Métodos para retornar las caracteristicas del Pokemon.
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public String getTipoPrimario() {
        return tipoPrimario;
    }

    public String getTipoSecundario() {
        return tipoSecundario;
    }

    public int getSalud() {
        return salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    // Este metodo imprime las caracteristicas del Pokemon en cadena.
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Numero Pokedex: " + numeroPokedex +
                ", Tipo Primario: " + tipoPrimario +
                ", Tipo Secundario: " + tipoSecundario +
                ", Salud: " + salud +
                ", Ataque: " + ataque +
                ", Defensa: " + defensa +
                ", Ataque Especial: " + ataqueEspecial +
                ", Defensa Especial: " + defensaEspecial +
                ", Velocidad: " + velocidad;
    }
}
