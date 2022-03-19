package submissions;

import answer.Answer;

public class Submission16 extends Answer {

    public Submission16() {
        super(16);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                // NOTE: corrected here so that 'pixel' is value at i,j
                // originally was comapring 'pixels' to ints
                int pixel = pixels[i][j];

                if (pixel >= 0 && pixel <= (255 - amount)) {
                    pixels[i][j] += amount;
                }
                else {
                    pixels[i][j] = 255;
                }
            }
        }
    }

}
