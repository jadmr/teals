package submissions;

import answer.Answer;

public class Submission26 extends Answer {

    public Submission26() {
        super(26);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        //NOTE: missing initialization to 0
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                // NOTE: had int before pixels
                if (pixels[i][j] + amount > 255) {
                    // NOTE: used pixel instead of pixels
                    pixels[i][j] = 255;
                } else {
                    pixels[i][j] = pixels[i][j] + amount;
                }

            }
        }
    }
}
