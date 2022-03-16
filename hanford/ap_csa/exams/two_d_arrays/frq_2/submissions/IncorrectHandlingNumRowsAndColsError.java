package submissions;

import answer.Answer;

public class IncorrectHandlingNumRowsAndColsError extends Answer {
     public IncorrectHandlingNumRowsAndColsError() {
        super(-4);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels.length; j++) {
                if (pixels[i][j] + amount > 255) {
                    pixels[i][j] = 255;
                } else {
                    pixels[i][j] += amount;
                }
            }
        }
    }
}
