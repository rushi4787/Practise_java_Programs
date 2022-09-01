package Program_practise;

public class OddPosition_Element_From_array {
	public static void main(String[] args) {
		
	
	
	char [] arr={'a','b','d','f','s','s','f','f','d','h'};
	
	for (int i=0;i<arr.length;i++)
	{
		if (i%2==0)
		{
			System.out.println("odd position character:-"+arr[i]);//odd position character
		}
		else
		{
			System.out.println("even positon charcter:-"+arr[i]);// even positon charcter
		}
		
	}
	

}
}