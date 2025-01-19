public interface InPokemon {

    public void displayMon();

    public String getName();

    public String getType();

    public int gethealthTotal();

    public int gethealthLeft();

    public int getAttack();

    public int getDef();

    public int getSpAtk();

    public int getSpDef();

    public int getSpeed();

    public String getMove();

    public boolean isFainted();

    public void addMove(String moveName);

    public int getMvAtk(int index);

    public String getMvName(int index);

    public String getFrontIMG();

    public String getRearIMG();

    public void addMoves();

    // eventually getGif

}
