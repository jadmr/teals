package submissions;

import answer.Answer;

public class Submission04 extends Answer {

    public Submission04() {
        super(4);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numColumns; c++) {
                if (pixels[r][c] > 255 - amount) {
                    pixels[r][c] = 255;
                } else {
                    pixels[r][c] = pixels[r][c] + amount;
                }
            }
        }
    }
}
