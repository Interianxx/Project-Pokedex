class PokemonClase {

    private String nombre;
    private int numeroPokedex;
    private String tipoPrimario;
    private String tipoSecundario;
    private int salud;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;

      // Constructor que inicializa las propiedades del Pokemon.
    public PokemonClase(String nombre, int numeroPokedex, String tipoPrimario, String tipoSecundario,
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

       // Metodos para obtener los valores de las propiedades del Pokemon
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
  // Metodo toString para obtener una representacion en cadena del Pokemon.
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
/*
 * Clase donde se ubican los datos de los Pokemon, en caso de que se realicen cambios drasticos se puede utilizar esta como base.
 */
