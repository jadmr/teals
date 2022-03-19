package submissions;

import answer.Answer;

public class Submission24 extends Answer{

    public Submission24() {
        super(24);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        // NOTE: used 'Int' here
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (pixels[i][j] + 10 <= 255) {
                    pixels[i][j] = pixels[i][j] + 10;
                } else {
                    pixels[i][j] = 255;
                }
            }
        }
    }
}
