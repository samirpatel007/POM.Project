package com.pageclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;



public class loadproperties {
	
	static ResourceBundle prop;
	
	public loadproperties()  {
		try {
			String env=System.getProperty("env");
//			File src = new File("./resource/toolbelt.properties");
//			FileInputStream fil = new FileInputStream(src);
			prop=ResourceBundle.getBundle(env);
			
		} catch (Exception e) {
			System.out.println("Exception is ===="+e.getMessage());
		}
	}
	
	public static String getProperty(String name){
		return prop.getString(name);
	}
	
	public String getchromepath()
	{
		return prop.getString("chromepath");
	}
	
	public String getUrl()
	{
		return prop.getString("url");
	}
	public String getUsername()
	{
		return prop.getString("uName");
	}
	public String getPassword()
	{
		return prop.getString("pWord");
	}
	public String getWrongpwd()
	{
		return prop.getString("wPwd");
	}
}
