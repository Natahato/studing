package properties_practice;

import java.util.Properties;

public class defaultPropertiesPractice {

    public static void main(String[] args) {

        Properties defaultProperties = new Properties();

        defaultProperties.setProperty("something", "my default");

        Properties properties = new Properties(defaultProperties);

        System.out.println(properties.getProperty("something"));

    }
}
