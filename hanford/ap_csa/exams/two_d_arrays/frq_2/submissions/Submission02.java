package submissions;

import answer.Answer;

public class Submission02 extends Answer {

    public Submission02() {
        super(2);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        for (int i = 0; i < pixels[0][0 /* '' */]; i++) {
            for (int j = 0; j < pixels[0 /* '' */][0]; j++) {
                if (/*int*/ i < 245) {
                    /*int*/ i += 10;
                }
                else if (/*int*/ i < 255) {
                    /* int */ i = 255;
                }

                /* return int[][] pixel; */
            }
        }
    }
}
