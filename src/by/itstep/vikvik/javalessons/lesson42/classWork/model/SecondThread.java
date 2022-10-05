package by.itstep.vikvik.javalessons.lesson42.classWork.model;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
//        while(true) {
//            System.out.printf("\nid = %d, name = %s",
//                    thread.getId(), thread.getName());
//        }

        for (int i = 0; i < 1000; i++) {

//            try {
//                TimeUnit.MILLISECONDS.sleep(200);
//            }catch(InterruptedException exception){
//                System.err.println(exception);
//            }

            System.out.printf("\nid = %d, name = %s",
                    thread.getId(), thread.getName());
        }

        System.out.printf("\n%s thread finished...", thread.getName());
    }
}
