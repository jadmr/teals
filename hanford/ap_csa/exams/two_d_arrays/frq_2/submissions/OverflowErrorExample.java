package submissions;

import answer.Answer;

public class OverflowErrorExample extends Answer {

    public OverflowErrorExample() {
        super(-2);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                pixels[i][j] += amount;
            }
        }
    }
}
