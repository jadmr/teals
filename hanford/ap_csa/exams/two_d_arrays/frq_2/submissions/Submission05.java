package submissions;

import answer.Answer;

public class Submission05 extends Answer {

    public Submission05() {
        super(5);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (/* forgot int */ int i = 0; i < numRows; i++) {
            for (/* forgot int */ int q = 0; q < numColumns; q++) /*forgot closing paranthesis*/ {
                pixels[i][q] = pixels[i][q] + amount;

                // forgot paranthesis here
                if (pixels[i][q] > 255) {
                    pixels[i][q] = 255;
                }
            }
        }
    }
}
