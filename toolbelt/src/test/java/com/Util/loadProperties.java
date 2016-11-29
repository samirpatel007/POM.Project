
/* package com.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.os.ProcessUtils;

public class loadProperties (String name) throws IOException{

	ProcessUtils props = new ProcessUtils();
	Properties prop = new Properties();
	InputStream input = null;
	
	try {
		input = new FileInputStream("src/test/resources/toolbelt.properties");
		prop.load(input);
		String thres  = prop.getProperty(name);
		
	}
	catch (IOException ex) {
		ex.printStackTrace();
	}
	return threshold;
}


}*/
