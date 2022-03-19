package submissions;

import answer.Answer;

public class Submission20 extends Answer {

    public Submission20() {
        super(20);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        // NOTE: for loops work as written, but submitter thought
        // updating value retrieved from array would update reference in 2d array.
        // This is a small but significant misunderstanding. Otherwise answer looks fine.
        // Possibly bump this score up manually

        for (int[] row : pixels) {
            for (int pixel : row) {
                if (pixel + amount >= 255) {
                    pixel = 255;
                } else {
                    pixel += amount;
                }
            }
        }
    }
}
