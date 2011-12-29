package me.Crosant.System_Tools;

import java.*;
import java.util.*;


public class System_Tools 
{
    public static void main( String[] args )
    {
    	
    	
    	
    }

    public static void system()
    {
    	
    	String Java_Version = System.getProperty("java.version");
    	System.out.println("Java Version: " + Java_Version);
    	String SystemOS = System.getProperty("os.name");
    	String SystemType = System.getProperty("os.arch");
    	String SystemVersion = System.getProperty("os.version");
    	System.out.println("Operating System: "+ SystemOS + " " + SystemType + " Version: " + SystemVersion);
    	String UserName = System.getProperty("user.name");
    	String UserDir = System.getProperty("user.home");
    	System.out.println("User: " + UserName + " \rHome: " + UserDir );
    	
    }

}
