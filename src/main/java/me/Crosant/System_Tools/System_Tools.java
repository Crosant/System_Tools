package me.Crosant.System_Tools;

import java.io.IOException;


public class System_Tools 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	System.out.println("/*************************************************************\\");
    	System.out.println("|                                                             |");
    	System.out.println("|    System_Tools V 0.0.1 By Crosant                          |");
    	System.out.println("|                                                             |");
    	System.out.println("|    Loading please wait!                                     |");
    	System.out.println("|                                                             |");
    	System.out.println("|                                                             |");
    	System.out.println(" ************************************************************* ");
    	Thread.sleep(3000);

    	menu();

    }
    
    public static void menu() throws Exception{
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	Thread.sleep(3000);
    	System.out.println("/*************************************************************\\");
    	System.out.println("|                                                             |");
    	System.out.println("|    Menu:                                                    |");
    	System.out.println("|    1. Get System Informations                               |");
    	System.out.println("|    2.                                                       |");
    	System.out.println("|    3. Exit                                                  |");
    	System.out.println("|                                                             |");
    	System.out.println(" ************************************************************* ");
    	
    	int in = System.in.read();
    	if (in == 49){
    	
    	getSystemPropertys.SystemPropertys();
    	
    	
    	}
    	else if(in == 50){
    		
    		System.out.println("Not finished Jet");
    	
    		menu();
    	}
    	else if(in == 51){
    		
    		System.exit(0);
    		
    	}
    	
    	
    }
    

}
