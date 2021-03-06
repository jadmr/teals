package grading;

import answer.Answer;

public class OverflowEvaluator extends Evaluator {

    @Override
    protected void EvaluateAnswer(Answer answer, Score score) {
        this.pixels = new int[][] {
            {255, 255},
            {255, 255}
        };

        answer.brighten(this.pixels, 1);

        boolean didOverflow = false;

        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels.length; col++) {
                if (pixels[row][col] > 255) {
                    didOverflow = true;
                }
            }
        }

        if (didOverflow) {
            score.decrementGradeAsPercentage(10);
            score.addError("pixel values exceeded 255 when adding 1 to 255", 10);
        }
    }
}
