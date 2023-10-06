import java.util.List;

public class PokemonGymOwner {

    private String gymOwner;
    private String town;
    List<Pokemon> pokemons;

    public PokemonGymOwner (String gymOwner, String town, List<Pokemon> pokemons) {
        this.gymOwner = gymOwner;
        this.town = town;
        this.pokemons = pokemons;
    }

    public String getGymOwner() {
        return gymOwner;
    }

    public void setGymOwner(String gymOwner) {
        this.gymOwner = gymOwner;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
