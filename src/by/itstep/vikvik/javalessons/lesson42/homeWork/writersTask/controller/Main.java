package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.controller;


import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model.Writer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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
            threads.add(thread);

            if (writer.getWriterName().equals("Колас")) {
                thread.setPriority(Thread.MAX_PRIORITY);
            }

            thread.start();

        }

        System.out.println(mainThread.getName() + " finished");
    }

}
