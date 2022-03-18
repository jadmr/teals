package submissions;

import answer.Answer;

public class Submission06 extends Answer {

    public Submission06() {
        super(6);
        flagAnswerAsDidNotCompile();

        // This submission assumed a 'setvalue' and 'getvalue'
        // method exists on an array (nope!). However, submiter
        // demonstrated that they knew what had to be done, so calls
        // to 'setvalue' have been replaced with '=' and 'getvalue'
        // has been replaced with accessing the 2d array at [i][j]
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numColumns; c++) {
                pixels[r][c] = pixels[r][c] + 10;

                if (pixels[r][c] > 255) {
                    pixels[r][c] = 255;
                }
            }

            // return pixels[][];
        }
    }

}
