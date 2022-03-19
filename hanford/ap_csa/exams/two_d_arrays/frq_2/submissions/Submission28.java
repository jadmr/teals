package submissions;

import answer.Answer;

public class Submission28 extends Answer{

    public Submission28() {
        super(28);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {

                // NOTE: did not declare pixel, tried modifying pixels directly
                if (pixels[0][0] + amount <= 255) {
                    pixels[0][0] = pixels[row][col] + amount;
                }
            }
        }
    }
}
