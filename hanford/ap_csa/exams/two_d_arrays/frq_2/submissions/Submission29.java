package submissions;

import answer.Answer;

public class Submission29 extends Answer{

    public Submission29() {
        super(29);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {

                //NOTE: row and column undefined here
                // Since submitter seemed to want to indicate i & j,
                // initialize these to i and j
                int row = i;
                int column = j;

                //NOTE: used 'pixels' here. No indexes specified
                if (pixels[row][column] > 0 && pixels[row][column] < 255) {
                    pixels[row][column] = 255;
                } else {
                    // NOTE: value set equal to 'pixels' here
                    pixels[row][column] = pixels[row][column];
                }

            }
        }
    }

}
