package by.itstep.vikvik.javalessons.lesson42.classWork.controller;

import by.itstep.vikvik.javalessons.lesson42.classWork.model.SecondThread;

import java.util.concurrent.TimeUnit;

public class FourthController {
    public static void main(String[] args) throws InterruptedException {
        SecondThread threadLogic = new SecondThread();
        int count = 5;
        Thread[] threads = new Thread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadLogic);
            threads[i].start();
        }

        while (true) {
            if (threads[0].isAlive() || threads[1].isAlive()
                    || threads[2].isAlive() || threads[3].isAlive()
                    || threads[4].isAlive()) {
                TimeUnit.SECONDS.sleep(1);
            } else {
                break;
            }
        }

        //

        System.out.println("\nThe main thread finished...");
    }
}
