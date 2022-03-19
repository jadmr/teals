package submissions;

import answer.Answer;

public class Submission19 extends Answer {

    public Submission19() {
        super(19);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRow = pixels.length;
        int numColumns = pixels[0].length;

        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numColumns; j++) {
                // NOTE: used 'pixel' here instead of 'pixels'
                // missing parenthesis
                if (pixels[i][j] > 255 + amount) {
                    // NOTE: forgot [i] here
                    pixels[i][j] = 255;
                } else {
                    pixels[i][j] = pixels[i][j] + amount;
                }
            }
        }
    }

}
