package submissions;

import answer.Answer;

public class Submission03 extends Answer {

    public Submission03() {
        super(3);
        flagAnswerAsDidNotCompile();
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        // 'obj' was undefined
        var obj = 0;

        pixelsset(pixels /* int[i][j] */, obj + amount);

        if (obj > 255) {
            obj = 255;
        }

        if (obj < 0) {
            obj = 0;
        }

        // return pixels;
    }

    // function definition added so this can compile
    private void pixelsset(int[][] pixels, int amount) {
    }
}
