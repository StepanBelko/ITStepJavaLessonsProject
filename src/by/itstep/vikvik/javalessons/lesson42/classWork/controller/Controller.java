package by.itstep.vikvik.javalessons.lesson42.classWork.controller;


public class Controller {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread id = " + thread.getId());
        System.out.println("thread name = " + thread.getName());
        thread.setName("my main thread");
        System.out.println("thread name = " + thread.getName());
        System.out.println("thread group = " + thread.getThreadGroup());
        System.out.println("thread priority = " + thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("thread priority = " + thread.getPriority());
        System.out.println("is alive = " + thread.isAlive());
        System.out.println("is daemon = " + thread.isDaemon());
        System.out.println("is kill = " + thread.isInterrupted());
        System.out.println("state = " + thread.getState());

    }
}
