package grading;

import answer.Answer;

public abstract class Evaluator {
    protected int[][] pixels;

    public Evaluator() {
    }

    public void Evaluate(Answer answer, Score score) {
        this.pixels = new int[][] {
            {100, 100},
            {100, 100}
        };

        if (answer.getDidCompile() == false) {
            // Don't penalize multiple times
            if (!score.getErrors().containsKey("Answer did not compile")) {
                score.decrementGradeAsPercentage(15);
                score.addError("Answer did not compile", 15);
            }
        }

        try {
            this.EvaluateAnswer(answer, score);
        }
        catch (Exception e) {
            // Don't penalize multiple times
            if (!score.getErrors().containsKey("Answer threw exception")) {
                score.decrementGradeAsPercentage(35);
                score.addError("Answer threw exception", 35);
            }
        }
    }

    protected abstract void EvaluateAnswer(Answer answer, Score score);
}