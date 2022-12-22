/*write a java program to search a word and count the number of times of occurrance of the word*/
public class CountOccurance{
	static int countOcc(String word,String find){
		String a[]=word.split(" ");
		int count=0;
	for(int i=0;i<a.length;i++){
		if(find.equals(a[i]))
		count++;
		}
	return  count;
	}	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Type the paragraph :");
	String word=sc.nextLine();
	System.out.println("Which word you want to find in paragraph?");
	String find=sc.nextLine();
	System.out.print(find+" <- This word presents in "+countOcc(word,find)+" times in paragraph.");
}}