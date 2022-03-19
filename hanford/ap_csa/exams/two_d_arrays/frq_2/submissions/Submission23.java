package submissions;

import answer.Answer;

public class Submission23 extends Answer{

    public Submission23() {
        super(23);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        // NOTE: forgot int type here
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                int pixel = pixels[i][j];
                pixel = pixel + amount;

                if (pixel > 255) {
                    pixel = 255;
                }

                // NOTE: used 'pixel' here
                pixels[i][j] = pixel;
            }
        }
    }
}
