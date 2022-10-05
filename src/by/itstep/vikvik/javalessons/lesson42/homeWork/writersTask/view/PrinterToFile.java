package by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.view;

import by.itstep.vikvik.javalessons.lesson42.homeWork.writersTask.model.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PrinterToFile implements Runnable {
    Writer writer;

    public PrinterToFile(Writer writer) {
        this.writer = writer;
    }

    private Writer getWriter() {
        return writer;
    }

    public static void printToFile(Writer writer) throws InterruptedException {

        try {
            String filePath = String.format("/Users/skynet/IdeaProjects/ITStepJavaLessonsProject/src/by/itstep/vikvik/javalessons/lesson42/homeWork/writersTask/books/%s.txt", writer.getWriterName());
            Random random = new Random();

            String name = writer.getWriterName();
            String text = writer.getWriterText();

            try (FileWriter fileWriter = new FileWriter(filePath, false)) {
                System.out.printf("\n%s начал печатать в файл: \n", name);

                TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);
                fileWriter.append(String.format("\n%s начал печатать: \n", name));

                for (int i = 0; i < text.length(); i++) {
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);
                    fileWriter.append(text.charAt(i));
                }
                fileWriter.append(String.format("\n%s закончил печатать\n", name));
                System.out.println(String.format("\n%s закончил печать в файл\n", name));
            }
            TimeUnit.MILLISECONDS.sleep(random.nextInt(200) + 1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            printToFile(this.getWriter());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
