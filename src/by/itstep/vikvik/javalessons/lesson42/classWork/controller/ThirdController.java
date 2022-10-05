package by.itstep.vikvik.javalessons.lesson42.classWork.controller;


import by.itstep.vikvik.javalessons.lesson42.classWork.model.SecondThread;

import java.util.concurrent.TimeUnit;

public class ThirdController {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The main thread started...");

        SecondThread threadLogic = new SecondThread();
        Thread thread1 = new Thread(threadLogic);
        Thread thread2 = new Thread(threadLogic);
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        TimeUnit.SECONDS.sleep(3);

        System.out.println("\nThe main thread finished...");

    }
}
