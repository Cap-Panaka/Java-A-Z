import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        //TImer = Class that schedules tasks at specific times or periodically
        //        Useful for: sending notifications, scheduled updats, repetitive actions

        //TimerTask = Represents the task that will be executed by the Timer
        //             YOu will extend the TImerTask class to define your task
        //             Create a subclass ofTImerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task  = new TimerTask() {
            int count = 3;


          @Override
          public void run() {
              System.out.println("Hello World");
              count--;
              if (count <= 0) {
                  System.out.println("Task complete!");
                  timer.cancel();
              }
          }
        };

        timer.schedule(task, 0, 1000);
    }
}
