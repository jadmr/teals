package students;

import java.util.HashMap;
import java.util.Map;

public class Students {
    private Map<Integer, String> studentNames;

    // Class contains map of ids to students. Workaround for not getting JSON Simple working in a WSL2 env
    public Students() {
        this.studentNames = new HashMap<Integer, String>();

        // Sample submissions
        this.studentNames.put(-1, "No Errors Example");
        this.studentNames.put(-2, "Overflow Example");
        this.studentNames.put(-3, "Addition Error Example");
        this.studentNames.put(-4, "Incorrect Handling of Diff Number of Rows and Columns Example");
        this.studentNames.put(-5, "Incorrect Handling of Adding Zero Example");

        // DO NOT push a commit listing student names

    }

    public Map<Integer, String> getStudentNames() {
        return this.studentNames;
    }
}
