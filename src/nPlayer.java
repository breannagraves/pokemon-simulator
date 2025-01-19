import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nPlayer implements InPlayer {
    String pName;
    // nPokemon[] team;
    String choice;
    List<nPokemon> team = new ArrayList<nPokemon>();
    Scanner scanner = new Scanner(System.in);

    public nPlayer(String pName, nPokemon[] team) {
        this.pName = pName;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return pName;
    }

    @Override
    public List<nPokemon> getTeam() {
        // TODO Auto-generated method stub
        // System.out.println(team.get(0).name);

        return team;
    }

    @Override
    public void addPoke(String name) {
        PokeLoader loader = new PokeLoader();
        nPokemon pokemon = loader.createMon(name);
        // add moves after creating mon, then pass pkm with moves to player team

        pokemon.addMoves();

        team.add(pokemon);

    }

}