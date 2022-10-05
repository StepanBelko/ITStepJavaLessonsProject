package by.itstep.vikvik.javalessons.lesson41;

import java.io.*;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;
        try {
            stream = new FileOutputStream(fileName);

            for (int i = 0; i < 1000; i++) {
                stream.write(i);
            }

            stream.flush();
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
    }

    public static String read(String fileName) {
        StringBuilder builder = new StringBuilder();
        try (InputStream stream = new FileInputStream(fileName);) {

            if (stream.available() != 0) {
                int temp;

                while ((temp = stream.read()) != -1) {
                    builder.append(temp).append(" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "" + builder;
    }
}
