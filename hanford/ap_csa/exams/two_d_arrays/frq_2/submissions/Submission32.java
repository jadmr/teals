package submissions;

import answer.Answer;

public class Submission32 extends Answer{

    public Submission32() {
        super(32);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                pixels[row][col] += amount;

                if (pixels[row][col] > 255) {
                    pixels[row][col] = 255;
                }
            }
        }
    }
}
