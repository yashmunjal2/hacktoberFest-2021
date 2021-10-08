class AvailableTicket extends Thread{
    int available;
    int wantedMike;
    int wantedJohn;
    public AvailableTicket(int avail, int reqJohn, int reqMike) {
        available = avail;
        wantedMike = reqMike;
        wantedJohn = reqJohn;
    }
    public void run() {
        synchronized (this) {
            int wanted;
            String threadName = Thread.currentThread().getName();
            if(threadName=="John") {
                wanted = wantedJohn;
            }
            else {
                wanted = wantedMike;
            }
            if(available >= wanted) {
                System.out.print(Thread.currentThread().getName());
                System.out.println(": tickets booked: " + wanted);
                available = available - wanted;
            }
            else {
                System.out.println(Thread.currentThread().getName() + ": not booked");
            }
        }
    }
    
}
