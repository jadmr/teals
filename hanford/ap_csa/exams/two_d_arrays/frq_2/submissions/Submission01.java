package submissions;

import answer.Answer;

public class Submission01 extends Answer {

    public Submission01() {
        super(1);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int rows = pixels.length;
        int cols = pixels[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pixels[i][j] = pixels[i][j] + amount;

                if (pixels[i][j] > 255) {
                    pixels[i][j] = 255;
                }
            }
        }
    }
}
