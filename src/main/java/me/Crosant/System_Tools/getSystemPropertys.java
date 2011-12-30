package me.Crosant.System_Tools;

public class getSystemPropertys {

	public static String Java_Version = System.getProperty("java.version");
	public static String SystemOS = System.getProperty("os.name");
	public static String SystemType = System.getProperty("os.arch");
	public static String SystemVersion = System.getProperty("os.version");
	public static String UserName = System.getProperty("user.name");
	public static String UserDir = System.getProperty("user.home");
	public static java.lang.management.OperatingSystemMXBean core1 =  java.lang.management.ManagementFactory.getOperatingSystemMXBean();
        public static int core = core1.getAvailableProcessors();
	public static void SystemPropertys() throws Exception
    {

		printpropertys();
    	
    }
	
	public static void printpropertys() throws Exception{
        System.out.println("/*************************************************************\\");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println("    System Information:                                      ");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println("    Java Version:    "+ Java_Version + "                                ");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println("    Operating System: "+ SystemOS + " " + SystemType + " Version: " + SystemVersion + "             ");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
        System.out.println("    Cores: " + core +"                                         ");
    	Thread.sleep(500);
        System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println("    User: " + UserName + "                                            ");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println("    Home: " + UserDir +"                                   ");
    	Thread.sleep(500);
    	System.out.println("|                                                             |");
    	Thread.sleep(500);
    	System.out.println(" ************************************************************* ");
        
    	System_Tools.menu();
        
        
	}


	
}
