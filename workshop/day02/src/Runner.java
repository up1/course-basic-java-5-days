class Runner {
    // Properties
    public String name;
    private int runningTimeInMinute;
    protected int runningTimeInMinute2;

    public Runner(String name, int runningTimeInMinute) {
        this.name = name;
        this.runningTimeInMinute = runningTimeInMinute;
    }

    // Methods/ behaviors

    public int getTime() {
        return runningTimeInMinute;
    }

    public void setRunningTimeInMinute(int runningTimeInMinute) {
        this.runningTimeInMinute = runningTimeInMinute;
    }
}
