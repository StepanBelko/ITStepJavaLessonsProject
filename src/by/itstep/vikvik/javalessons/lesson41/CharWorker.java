package by.itstep.vikvik.javalessons.lesson41;

import java.io.*;

public class CharWorker {

    public static void write(String fileName) {
        try (Writer stream = new FileWriter(fileName)) {

            for (int i = 0; i < 1000; i++) {
                stream.write(i);
            }

            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(String fileName) {

        Reader stream = null;
        StringBuilder builder = new StringBuilder();
        try {
            stream = new FileReader(fileName);

            if (stream.ready()) {
                int temp;

                while ((temp = stream.read()) != -1) {
                    builder.append((char) temp).append(" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "" + builder;

    }
}
