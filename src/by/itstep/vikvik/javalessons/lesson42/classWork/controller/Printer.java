package by.itstep.vikvik.javalessons.lesson42.classWork.controller;

import java.util.concurrent.TimeUnit;

public class Printer {
    public void print(String text) throws InterruptedException {
        System.out.print("[");
        TimeUnit.MILLISECONDS.sleep(200);

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            TimeUnit.MILLISECONDS.sleep(200);
        }

        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("]");
    }
}
