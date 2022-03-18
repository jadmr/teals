package submissions;

import answer.Answer;

public class Submission08 extends Answer {

    public Submission08() {
        super(8);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int i = 0; i <= numRows - 1; i++) {
            // pixels.set(i, (pixels.get(i) + amount))
            pixels[i][0] = pixels[i][0] + amount;

            for (int j = 0; j <= numColumns - 1; j++) {
                // pixels.set(i, (pixels.get(i) + amount))
                pixels[0][j] = pixels[0][j] + amount;
            }
        }
    }

}
