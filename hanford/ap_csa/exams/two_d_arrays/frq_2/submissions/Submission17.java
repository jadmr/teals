package submissions;

import answer.Answer;

public class Submission17 extends Answer {

    public Submission17() {
        super(17);
        flagAnswerAsDidNotCompile();
        flagAnswerAsNotAttempted();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        // brighten(pixels, 100);

        System.out.println("brighten");
    }

}