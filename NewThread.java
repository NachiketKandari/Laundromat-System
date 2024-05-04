package laundro;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "second thread");

    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i < 0; i--) {
                System.out.println("");
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("");
        }
        System.out.println("Exiting child thread.");
    }
}