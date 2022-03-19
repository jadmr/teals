import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import answer.Answer;
import grading.AdditionEvaluator;
import grading.DiffNumRowsColsEvaluator;
import grading.Evaluator;
import grading.Grader;
import grading.OverflowEvaluator;
import grading.Score;
import grading.ZeroAdditionEvaluator;
import students.Students;

public class Problem {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Read source of student names
        var students = new Students();

        var evaluators = getEvaluators();
        var grader = new Grader(students.getStudentNames(), evaluators);

        // Create submissions
        var submissions = getStudentSubmissions();

        // Grade answers
        var scores = new ArrayList<Score>();

        for (var submission : submissions) {
            var score = grader.GradeAnswer(submission);
            scores.add(score);
        }

        // Export answers
        exportScores(scores);
    }

    private static ArrayList<Evaluator> getEvaluators() {
        var evaluators = new ArrayList<Evaluator>();

        evaluators.add(new AdditionEvaluator());
        evaluators.add(new DiffNumRowsColsEvaluator());
        evaluators.add(new OverflowEvaluator());
        evaluators.add(new ZeroAdditionEvaluator());

        return evaluators;
    }

    private static ArrayList<Answer> getStudentSubmissions() {
        var submissions = new ArrayList<Answer>();

        // Add samples
        /*
        submissions.add(new submissions.NoErrorsExample());
        submissions.add(new submissions.OverflowErrorExample());
        submissions.add(new submissions.AdditionErrorExample());
        submissions.add(new submissions.IncorrectHandlingNumRowsAndColsError());
        submissions.add(new submissions.IncorrectAddingZeroError());
        submissions.add(new submissions.DidNotCompileExample());
        */

        // Add student submissions
        submissions.add(new submissions.Submission00());
        submissions.add(new submissions.Submission01());
        submissions.add(new submissions.Submission02());
        submissions.add(new submissions.Submission03());
        submissions.add(new submissions.Submission04());
        submissions.add(new submissions.Submission05());
        submissions.add(new submissions.Submission06());
        submissions.add(new submissions.Submission07());
        submissions.add(new submissions.Submission08());
        submissions.add(new submissions.Submission09());
        submissions.add(new submissions.Submission10());
        submissions.add(new submissions.Submission11());
        submissions.add(new submissions.Submission12());
        submissions.add(new submissions.Submission13());
        submissions.add(new submissions.Submission14());
        submissions.add(new submissions.Submission15());
        submissions.add(new submissions.Submission16());
        submissions.add(new submissions.Submission17());
        submissions.add(new submissions.Submission18());
        submissions.add(new submissions.Submission19());
        submissions.add(new submissions.Submission20());
        submissions.add(new submissions.Submission21());
        submissions.add(new submissions.Submission22());
        submissions.add(new submissions.Submission23());
        submissions.add(new submissions.Submission24());
        submissions.add(new submissions.Submission26());
        submissions.add(new submissions.Submission28());
        submissions.add(new submissions.Submission29());
        submissions.add(new submissions.Submission32());

        return submissions;
    }

    private static void exportScores(ArrayList<Score> scores){
        try (var writer = new FileWriter("scores.csv", false)) {
            var sb = new StringBuilder();

            // Create headers
            sb.append("Name");
            sb.append(',');
            sb.append("Score");
            sb.append(',');
            sb.append("Errors");
            sb.append('\n');

            // Write scores
            for (var score : scores) {
                var unencryptedName = new String(score.getEncodedName(), "UTF-8");

                // Write name
                sb.append(unencryptedName);
                sb.append(',');

                // Write score
                sb.append(score.getGradeAsPercentage());
                sb.append(',');

                // Write errors (if any)
                var errors = getListOfErrors(score.getErrors());
                sb.append(errors);
                sb.append('\n');
            }

            writer.write(sb.toString());

        } catch (IOException e) {
            System.out.println("Failed to generate CSV file");
            e.printStackTrace();
        }


        var average = 0.0;
        for (var score : scores) {
            average += score.getGradeAsPercentage();
        }

        average = average / scores.size();
        System.out.println("Class average is " + average);
    }

    private static String getListOfErrors(Map<String, Integer> errors) {
        String concatenatedErrors = "";

        for (var entry : errors.entrySet()) {
            var message = entry.getKey();
            var pointsDeducted = entry.getValue();

            concatenatedErrors += message + " (-" + pointsDeducted + ") | ";
        }

        return concatenatedErrors;
    }
}