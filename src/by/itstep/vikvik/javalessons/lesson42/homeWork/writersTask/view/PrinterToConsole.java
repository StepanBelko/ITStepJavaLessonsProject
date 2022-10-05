package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.view;

import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model.Writer;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PrinterToConsole implements Runnable {
    Writer writer;

    public PrinterToConsole(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter() {
        return writer;
    }

    public static void printToConsole(Writer writer) throws InterruptedException {

        Random random = new Random();

        String name = writer.getWriterName();
        String text = writer.getWriterText();

        TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);
        System.out.printf("\n%s начал печатать в консоль: \n", name);

        for (int i = 0; i < text.length(); i++) {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);
            System.out.print(text.charAt(i));
        }
        System.out.printf("\n%s закончил печатать в консоль\n", name);
        TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);

    }

    @Override
    public void run() {
        try {
            printToConsole(this.getWriter());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
