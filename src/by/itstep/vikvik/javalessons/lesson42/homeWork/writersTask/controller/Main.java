package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.controller;


import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model.Writer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static volatile int commonThreadCount = 0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Common thread count = " + commonThreadCount);

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " started");
        ArrayList<Writer> writerArrayList = new ArrayList<>();

        writerArrayList.add(new Writer("Пушкин", "Я помню чудное мгновенье"));
        writerArrayList.add(new Writer("Лермонтов", "Сижу за решёткой в темнице сырой"));
        writerArrayList.add(new Writer("Блок", "Мне страшно с тобою встречаться"));
        writerArrayList.add(new Writer("Высоцкий", "Считай по-нашему мы выпили немного"));
        writerArrayList.add(new Writer("Колас", "Устаньце, хлопцы, устаньце, браткi"));

        ArrayList<Thread> threads = new ArrayList<>();

        for (Writer writer : writerArrayList) {

            Thread thread = new Thread(writer);
            commonThreadCount++;
            thread.setName(writer.getWriterName() + " Thread");
            threads.add(thread);

            System.out.println("\nAdded new thread = " + thread.getName());
            TimeUnit.SECONDS.sleep(2);
            thread.start();

        }

        System.out.println(mainThread.getName() + " finished");
        System.out.println("Common thread count = " + commonThreadCount);
    }

}
