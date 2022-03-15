package grading;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import answer.Answer;

public class Grader {
    private Map<Integer, String> studentIds;
    private ArrayList<Evaluator> evaluators;

    public Grader(Map<Integer, String> studentIds, ArrayList<Evaluator> evaluators) {
        this.studentIds = studentIds;
        this.evaluators = evaluators;
    }

    public Score GradeAnswer(Answer answer) throws UnsupportedEncodingException {
        byte[] encodedStudentName = getEncodedStudentName(answer.getId());
        Score score = new Score(encodedStudentName);

        for (Evaluator evaluator : evaluators) {
            evaluator.Evaluate(answer, score);
        }

        return score;
    }

    private byte[] getEncodedStudentName(int id) throws UnsupportedEncodingException {
        String studentName = studentIds.get(id);

        try {
            return studentName.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
