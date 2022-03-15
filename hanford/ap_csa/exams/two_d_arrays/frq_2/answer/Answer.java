package answer;

public abstract class Answer {
    protected int id;
    protected boolean didCompile;

    protected Answer(int id) {
        this.id = id;
        this.didCompile = true;
    }

    public abstract void brighten(int[][] pixels, int amount);

    public int getId() {
        return this.id;
    }

    public void flagAnswerAsDidNotCompile() {
        this.didCompile = false;
    }

    public boolean getDidCompile() {
        return this.didCompile;
    }
}