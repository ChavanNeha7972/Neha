package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	
	Properties pro;
	public ReadConfig()
	{
		File path=new File("./Configuration/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+e.getMessage());
		}
	
	}
	
	public String getURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String user=pro.getProperty("username");
		return user;
	}
	
	public String getPassword()
	{
		String pass=pro.getProperty("password");
		return pass;
	}
	
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFirefoxPath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}