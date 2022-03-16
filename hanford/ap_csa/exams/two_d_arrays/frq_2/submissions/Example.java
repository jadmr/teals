package submissions;

import answer.Answer;

public class Example extends Answer {

    public Example() {
        super(-1);
    }

    @Override
    public void brighten(int[][] pixels, int amount) {
        System.out.println("In example!");
    }

}