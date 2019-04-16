package core.serialization;

import java.io.*;

/**
 * Запись в файл - сериализация
 */
public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Developer developer = new Developer("Carl Brams", "java", 4, 2000);

        FileOutputStream fileOutputStream = new FileOutputStream("Developer.info");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(developer);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Developer serialized successfully.");

    }

}
