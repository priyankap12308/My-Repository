package Programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TestClass {
	public void delete(StringBuilder sb,char c, StringBuilder sb2){
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!=c){
				sb2.append(sb.charAt(i));
			}
		}
		String s2=sb2.toString();
		System.out.println("The result is "+s2);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		StringBuilder sb=new StringBuilder(s);
		StringBuilder sb2=new StringBuilder("");
		System.out.println("Enter the Character");
		char c=sc.nextLine().charAt(0);
		TestClass t=new TestClass();
		t.delete(sb,c,sb2);
		
	}
	
}
