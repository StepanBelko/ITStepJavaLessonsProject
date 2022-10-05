package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model;

import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.view.Printer;

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
        Thread consoleThread = new Thread();
        Thread fileThread = new Thread();
        try {

            Printer.printToConsole(this);
            Printer.printToFile(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
