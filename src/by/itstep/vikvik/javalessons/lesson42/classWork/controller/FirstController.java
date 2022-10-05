package by.itstep.vikvik.javalessons.lesson42.classWork.controller;


import by.itstep.vikvik.javalessons.lesson42.classWork.model.FirstThread;

public class FirstController {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();

//        new FirstThread().start();

        Thread main = Thread.currentThread();

        while (true) {
            System.out.printf("\nid = %d, name = %s",
                    main.getId(), main.getName());
        }
    }
}
