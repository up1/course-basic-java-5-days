public class Marathon {

    public static void main(String[] args) {
        String[] runnerNames = new String[10];
        runnerNames[0] = "Elena";
        runnerNames[1] = "Thomas";
        runnerNames[2] = "Hamilton";
        runnerNames[3] = "Emma";
        runnerNames[4] = "John";
        int[] runningTimes = {341, 273, 278, 275, 243};

        int minTime = runningTimes[0];
        int position = 0;
        for (int i = 1; i < runningTimes.length; i++) {
            if (minTime > runningTimes[i]) {
                minTime = runningTimes[i];
                position = i;
            }
        }
        System.out.println(position + "=" + runnerNames[position]);
    }
}
