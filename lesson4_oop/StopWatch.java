package lesson4_oop;

import java.util.Date;

public class StopWatch {

        private double startTime;
        private double endTime;

        public StopWatch(double startTime, double endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public StopWatch() {
            Date date = new Date();
            this.startTime = System.currentTimeMillis();
        }

        public double getStartTime() {
            return startTime;
        }

        public void setStartTime(double startTime) {
            this.startTime = startTime;

        }

        public double getEndTime() {
            return endTime;
        }

        public void setEndTime(double endTime) {
            this.endTime = endTime;
        }




}
