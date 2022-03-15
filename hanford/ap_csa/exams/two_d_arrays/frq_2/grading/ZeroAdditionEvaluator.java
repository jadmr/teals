package grading;

import answer.Answer;

public class ZeroAdditionEvaluator extends Evaluator {

    @Override
    protected void EvaluateAnswer(Answer answer, Score score) {
        answer.brighten(this.pixels, 0);

        boolean didNotAddCorrectly = false;

        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels.length; col++) {
                if (pixels[row][col] != 100) {
                    didNotAddCorrectly = true;
                }
            }
        }

        if (didNotAddCorrectly) {
            score.decrementGradeAsPercentage(10);
            score.addError("pixel values were modified when adding zero", 10);
        }
    }

}
