package submissions;

import answer.Answer;

public class Submission13 extends Answer {

    public Submission13() {
        super(13);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                if (pixels[i][j] < 255) {
                    pixels[i][j] += amount;
                }
            }
        }
    }

}
