package me.Crosant.System_Tools;

public class getSystemPropertys {

	public static void SystemPropertys()
    {
		String Java_Version = System.getProperty("java.version");
		String SystemOS = System.getProperty("os.name");
    	String SystemType = System.getProperty("os.arch");
    	String SystemVersion = System.getProperty("os.version");
    	String UserName = System.getProperty("user.name");
    	String UserDir = System.getProperty("user.home");
    	System.out.println("/*************************************************************\\");
    	System.out.println("|                                                             |");
    	System.out.println("|    Java Version:    "+ Java_Version + "                                |");
    	System.out.println("|                                                             |");
    	System.out.println("|    Operating System: "+ SystemOS + " " + SystemType + " Version: " + SystemVersion + "             |");
    	System.out.println("|                                                             |");
    	System.out.println("|    User: " + UserName + "                                            |");
    	System.out.println("|                                                             |");
    	System.out.println("|    Home: " + UserDir +"                                   |");
    	System.out.println("|                                                             |");
    	System.out.println(" ************************************************************* ");

    	
    }
	
}
