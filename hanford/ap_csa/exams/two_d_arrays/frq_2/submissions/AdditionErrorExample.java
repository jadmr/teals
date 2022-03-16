package submissions;

import answer.Answer;

public class AdditionErrorExample extends Answer {
     public AdditionErrorExample() {
        super(-3);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                if (pixels[i][j] + amount > 255) {
                    pixels[i][j] = 255;
                } else {
                    pixels[i][j] -= amount;
                }
            }
        }
    }
}
