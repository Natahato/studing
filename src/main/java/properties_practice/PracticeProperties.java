package properties_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PracticeProperties {


    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        properties.setProperty("Beverly Hills", "90210");

        System.out.println(properties.getProperty("Beverly Hills"));

// Для зберігання пропеті у файлі

//        FileOutputStream fileOutputStream = new FileOutputStream("my.properties");
//        properties.store(fileOutputStream, "my comments");

        FileInputStream fileInputStream = new FileInputStream("my.properties");

        properties.load(fileInputStream);
        System.out.println(properties.getProperty("max"));

    }
}