package UtilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

	public static String getProperty(String key) {

		String path = System.getProperty("user.dir") + "/src/main/resources/ConfigLayer/config.properties";

		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			return prop.getProperty(key);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
}
