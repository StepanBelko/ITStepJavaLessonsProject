package by.itstep.vikvik.javalessons.lesson42.classWork.controller;


import by.itstep.vikvik.javalessons.lesson42.classWork.model.SecondThread;

public class FifthController {
    public static void main(String[] args) throws InterruptedException {
        SecondThread threadLogic = new SecondThread();
        int count = 5;
        Thread[] threads = new Thread[count];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadLogic);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        //

        System.out.println("\nThe main thread finished...");
    }
}
