package answer;

public abstract class Answer {
    protected int id;
    protected boolean didCompile;
    protected boolean didAttemptAnswer;

    protected Answer(int id) {
        this.id = id;
        this.didCompile = true;
        this.didAttemptAnswer = true;
    }

    public abstract void brighten(int[][] pixels, int amount);

    public int getId() {
        return this.id;
    }

    public void flagAnswerAsDidNotCompile() {
        this.didCompile = false;
    }

    public void flagAnswerAsNotAttempted() {
        this.didAttemptAnswer = false;
    }

    public boolean getDidCompile() {
        return this.didCompile;
    }

    public boolean getDidAttemptAnswer() {
        return this.didAttemptAnswer;
    }
}