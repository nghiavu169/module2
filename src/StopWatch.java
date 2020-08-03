
public class StopWatch {
    private long startTime, endTime;

    public long getStartTime(){
        return this.startTime = System.currentTimeMillis();
    }
    public long getEndTime(){
        return this.endTime = System.currentTimeMillis();
    }


    public static class Main {
        public static void main(String[] args) {
            StopWatch stopWatch = new StopWatch();
            System.out.printf("Start time:%20s\n", stopWatch.getStartTime());
            System.out.printf("End time:%22s", stopWatch.getEndTime());
        }
    }
}

