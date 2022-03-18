package grading;

import answer.Answer;

public class DiffNumRowsColsEvaluator extends Evaluator {
    @Override
    protected void EvaluateAnswer(Answer answer, Score score) {
        // create a pixel matrix with diff num of cols and rows
        this.pixels = new int[][] {
            {100, 100, 100},
            {100, 100, 100}
        };

        answer.brighten(this.pixels, 10);

        boolean didNotAddCorrectly = false;
        var firstValue = pixels[0][0];

        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                if (pixels[row][col] != firstValue) {
                    didNotAddCorrectly = true;
                }
            }
        }

        if (didNotAddCorrectly) {
            score.decrementGradeAsPercentage(10);
            score.addError("pixel values were not incremented correctly with differening number of rows and columns", 10);
        }
    }
}
