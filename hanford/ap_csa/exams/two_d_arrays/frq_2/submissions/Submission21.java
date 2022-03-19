package submissions;

import answer.Answer;

public class Submission21 extends Answer {

    public Submission21() {
        super(21);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;

        //NOTE: [0] was incorrect place here, after length
        int numColumns = pixels[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                // NOTE: missing int type here
                // NOTE: assumed pixels has 'get' method
                int pixelVal = pixels[row][col];
                pixelVal += amount;

                if (pixelVal > 255) {
                    pixels[row][col] = 255;
                } else {
                    pixels[row][col] = pixelVal;
                }
            }
        }
    }
}
