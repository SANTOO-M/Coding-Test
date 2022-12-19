/* 3. java program to print the given two Strings are anagram or not

Anagram:
	An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once. For example, "cinema" is an anagram for "iceman".
*/
import java.util.Arrays;
class Anagram{
	public static void main(String args[]){
	String s1="Binary";	
	String s2="Brainy";
	char c1[]=s1.toCharArray();	// converts String to char array
	char c2[]=s2.toCharArray();	// converts String to char array
	if(c1.length!=c2.length){
	System.out.println("Not an Anagram");	
	System.exit(0);
	}
	Arrays.sort(c1);		//sorting the char array
	Arrays.sort(c2);		//sorting the char array
	for(int i=0;i<c1.length;i++){
		if(c1[i]!=c2[i]){
		System.out.println("Not an Anagram");
		System.exit(0);	
		}
	}
	System.out.println("Its an Anagram");	
}
}
