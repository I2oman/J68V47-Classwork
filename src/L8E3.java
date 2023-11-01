import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L8E3 {
    public static List<String> directions = new ArrayList<String>(Arrays.asList(
            "Start by exiting the building you are currently in and turning left onto the main road.",
            "Walk down the road for two blocks until you reach the traffic lights.",
            "At the traffic lights, turn right onto Oak Street.",
            "Follow Oak Street for one block then turn left onto Elm Street.",
            "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
            "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
            "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
    ));

    public static void main(String[] args) {
        printSteps();
        addStep(5, "After turning onto Elm Street, walk past the grocery store on your right.");
        printSteps();
        removeStep(8);
        printSteps();
    }

    private static void printSteps() {
        for (int i = 0; i < directions.size(); i++) {
            System.out.println((i + 1) + ". " + directions.get(i));
        }
        System.out.println();
    }

    private static void addStep(int position, String direction) {
        directions.add(position - 1, direction);
    }

    private static void removeStep(int position) {
        directions.remove(position - 1);
    }
}
