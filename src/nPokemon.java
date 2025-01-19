import java.util.ArrayList;
import java.util.List;

public class nPokemon implements InPokemon {
    int index;
    String name;
    String type;
    String move;
    int tHealth;
    int remHealth;
    int atk;
    int def;
    int spAtk;
    int spDef;
    int speed;
    int lvl;
    List<Move> moveList = new ArrayList<Move>();
    String frontIMG;
    String rearIMG;

    public nPokemon(int index, String name, String type, int tHealth,
            int remHealth, int atk, int def, int spAtk, int spDef, int speed, int lvl, Move moveList, String frontIMG,
            String rearIMG) {

        this.index = index;
        this.name = name;
        this.type = type;
        this.tHealth = tHealth;
        this.remHealth = remHealth;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.lvl = lvl;
        this.rearIMG = rearIMG;
        this.frontIMG = frontIMG;

    }

    @Override
    public boolean isFainted() {

        if (this.remHealth <= 1) {
            return true;
        } else
            return false;

    }

    public void displayMon() {

    }

    // TODO Auto-generated method stub

    @Override
    public int gethealthTotal() {
        return this.tHealth;

    }

    @Override
    public int gethealthLeft() {
        return this.remHealth;

    }

    @Override
    public int getAttack() {
        return this.atk;

    }

    @Override
    public int getDef() {
        return this.def;

    }

    @Override
    public int getSpAtk() {
        return this.spAtk;

    }

    @Override
    public int getSpDef() {
        return this.spDef;

    }

    @Override
    public int getSpeed() {
        return this.speed;

    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public String getType() {
        return this.type;

    }
    // @Override
    // public String getMove() {
    // TODO Auto-generated method stub
    // return null;
    // }

    @Override
    public String getMove() {
        return move;

    }

    @Override
    public void addMove(String moveName) {

        // TODO Auto-generated method stub
        MoveFactory moveLoader = new MoveFactory();
        Move move = moveLoader.createMove(moveName);
        moveList.add(move);

    }

    public int getMvAtk(int index) {

        return this.moveList.get(index).baseAtk;

    }

    public String getMvName(int index) {
        return this.moveList.get(index).moveName;
    }

    @Override
    public String getFrontIMG() {
        // TODO Auto-generated method stub
        return this.frontIMG;
    }

    @Override
    public String getRearIMG() {
        // TODO Auto-generated method stub
        return this.rearIMG;
    }

    @Override
    public void addMoves() {
        // TODO Auto-generated method stub

    }

}
