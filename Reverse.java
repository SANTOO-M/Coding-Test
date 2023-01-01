/*Write a java program to print your name and your name in reverse order*/

import java.io.*;
import java.util.Scanner;

public class Reverse{
   public static void main(String args[]){
	String name="Santhoshkumar",revName=" ";
	char c;
	System.out.println("My name: "+name);
	for(int i=0;i<name.length();i++){
		c=name.charAt(i);	
		revName=c+revName;
	}
	System.out.println("After reversing my name: "+revName);
   }
}