package submissions;

import answer.Answer;

public class Submission11 extends Answer {

    public Submission11() {
        super(11);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numCols = pixels[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (pixels[i][j] < 0) {
                    pixels[i][j] = 0;
                }

                pixels[i][j] = pixels[i][j] + amount;

                if (pixels[i][j] + amount > 255) {
                    pixels[i][j] = 255;
                }
            }
        }
    }
}
