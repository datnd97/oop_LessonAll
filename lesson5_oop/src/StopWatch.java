public class StopWatch {
   private double startTime = 0;
   private double endTime = 0;
   private boolean On = false;
   StopWatch() {
        this.startTime = System.currentTimeMillis();
   }
   StopWatch(double start,double end) {
       this.startTime = start;
       this.endTime  = end;
   }
   public void start() {
        this.startTime = System.currentTimeMillis();
        On = true;
   }
   public void end() {
       this.endTime = System.currentTimeMillis();
        On = false;
   }

   public double getElapsedTime() {
       double rs;
       if(On) {
           rs = (System.currentTimeMillis() - startTime);
       }
       else {
           rs = (endTime - startTime);
       }
       return  rs;
   }
   public double getElapsedTimeSecs() {
       double rs;
       if(On) {
           rs = (System.currentTimeMillis() - startTime) /1000;
       }
       else {
           rs  = (endTime - startTime) / 1000;
       }
       return rs;
   }


}
