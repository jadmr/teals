package submissions;

import answer.Answer;

public class Submission10 extends Answer {

    public Submission10() {
        super(10);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        /* indexes not specified, assume to be i & j, set to zero */
        int i = 0;
        int j = 0;

        if (pixels[i][j] < 255) {
            pixels[i][j] += 1;
        }

        if (pixels[i][j] >= 255) {
            pixels[i][j] = 255;
        }
    }

}
