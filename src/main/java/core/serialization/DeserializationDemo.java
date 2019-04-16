package core.serialization;

import java.io.*;

/**
 * Чтение из файла - десериализация
 */
public class DeserializationDemo implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Developer developer = null;

        FileInputStream fileInputStream = new FileInputStream("Developer.info");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        developer = (Developer) objectInputStream.readObject();

        fileInputStream.close();
        objectInputStream.close();

        System.out.println("Deserialization... Developer:");

        System.out.println(developer);
    }


}
