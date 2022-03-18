package submissions;

import answer.Answer;

public class Submission00 extends Answer {

    public Submission00() {
        super(0);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int c = 0; c < numRows; c++) {
            for (int d = 0; d < numColumns; d++) {
                pixels[c][d] = pixels[c][d] + 10;

                if (pixels[c][d] > 255) {
                    pixels[c][d] = 255;
                }
            }
        }
    }
}