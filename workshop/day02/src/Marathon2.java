import java.util.ArrayList;
import java.util.List;

public class Marathon2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.add(new Runner("Elena", 341));
        runners.add(new Runner("Thomas", 273));
        runners.add(new Runner("Hamilton", 278));
        runners.add(new Runner("Emma", 275));
        runners.add(new Runner("John", 243));

        int minTime = runners.get(0).getTime();
        int position = 0;
        for (int i = 0; i < runners.size(); i++) {
            int time = runners.get(i).getTime();
            if (minTime > time) {
                minTime = time;
                position = i;
            }
        }
        System.out.println(runners.get(position).name);
    }
}
