
public class Move implements IMove {

    String moveName;
    String type;
    int baseAtk;
    int accuraccy;

    public Move(String moveName, String type, int baseAtk, int accurracy) {
        this.moveName = moveName;
        this.type = type;
        this.baseAtk = baseAtk;
        this.accuraccy = accurracy;
        // loads in move info, might need more attributes

    }

    @Override
    public String getMoveName() {
        // TODO Auto-generated method stub
        return this.moveName;
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return this.type;
    }

    @Override
    public int getAccuracy() {
        // TODO Auto-generated method stub
        return this.accuraccy;
    }

    @Override
    public int getBaseAtk() {
        // TODO Auto-generated method stub
        return this.baseAtk;
    }
}
