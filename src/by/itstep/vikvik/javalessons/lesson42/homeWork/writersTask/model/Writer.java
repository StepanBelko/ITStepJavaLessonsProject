package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model;

import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.controller.Main;
import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.view.PrinterToConsole;
import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.view.PrinterToFile;

public class Writer implements Runnable {
    String writerName;
    String writerText;

    public Writer(String writerName, String writerText) {
        this.writerName = writerName;
        this.writerText = writerText;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getWriterText() {
        return writerText;
    }

//    @Override
//    public void run() {
//        Printer printer = new Printer();
//        try {
//            printer.printText(this);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }


    @Override
    public void run() {
        Thread consoleThread = new Thread(new PrinterToConsole(this));
        Main.commonThreadCount++;
        consoleThread.setName(this.getWriterName() + " toConsoleThread");
        System.out.println("\nAdded new thread = " + consoleThread.getName());

        Thread fileThread = new Thread(new PrinterToFile(this));
        Main.commonThreadCount++;
        fileThread.setName(this.getWriterName() + " toFileThread");
        System.out.println("\nAdded new thread = " + fileThread.getName());

        consoleThread.start();
        fileThread.start();
    }
}
