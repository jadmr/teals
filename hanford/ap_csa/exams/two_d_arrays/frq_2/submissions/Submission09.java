package submissions;

import answer.Answer;

public class Submission09 extends Answer {

    public Submission09() {
        super(9);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        int numRows = pixels.length;
        int numColumns = pixels[0].length;

        for (int y = 0; y < numColumns; y++) {
            for (int x = 0; x < numRows; x++) {
                pixels[y][x] = pixels[y][x] + 10;

                if (pixels[y][x] > 255){
                    pixels[y][x] = 255;
                }
            }
        }
    }

}
