package grading;

import java.util.HashMap;
import java.util.Map;

public class Score {
    private byte[] encodedName;
    private int gradeAsPercentage;
    private Map<String, Integer> errors;

    public Score(byte[] encodedName){
        this.encodedName = encodedName;
        this.gradeAsPercentage = 100;
        this.errors = new HashMap<String, Integer>();
    }

    public byte[] getEncodedName() {
        return this.encodedName;
    }

    public int getGradeAsPercentage() {
        return this.gradeAsPercentage;
    }

    public void decrementGradeAsPercentage(int amount) {
        this.gradeAsPercentage -= amount;
    }

    public Map<String, Integer> getErrors(){
        return this.errors;
    }

    public void addError(String message, int amountDeducted) {
        this.errors.put(message, amountDeducted);
    }
}
