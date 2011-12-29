package me.Crosant.System_Tools;

import java.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class System_Tools 
{
    public static void main( String[] args )
    {
    	String Java_Version = System.getProperty("java.version");
    	System.out.println("Java Version: " + Java_Version);
    	String SystemOS = System.getProperty("os.name");
    	System.out.println("Operating System: "+ SystemOS);
    }
}
