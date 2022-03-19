package submissions;

import answer.Answer;

public class Submission15 extends Answer {

    public Submission15() {
        super(15);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        Integer add = null;

        for (int r = 0; r < pixels.length; r++) {
            for (int c = 0; c < pixels[0].length; c++) {
                // NOTE: wrong type here, but intention is to take value out of 2d array
                // pixels pixel = pixels[r][c]
                int pixel = pixels[r][c];
                add = add;

                int brightenUp = pixel + add;

                if (brightenUp >= 255) {
                    //NOTE: originally '=='
                    brightenUp = 255;
                }

                // return brightenUp;
            }
        }

        // return -1;
    }

}
