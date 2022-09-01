package Program_practise;

public class Armstrong_Number {

	public static void main(String[] args) {
		int i = 153;
		int givenarm_no = i;

		String str = String.valueOf(i);
		int lenght = str.length();
		
		System.out.println("Number of digit:-"+lenght);
		int Arm_number=0;
		while (i!=0)
		{
			int value=1;
			
			int rem= i%10;
			 
			for (int j=0;j<lenght;j++)
			{
				
				value =rem*value ;
			}
			
			
			
			Arm_number= value+	Arm_number;
			
			i=i/10;
			
		}
		System.out.println(	Arm_number);
		if ( givenarm_no==Arm_number)
		{
			System.out.println("this is a armstrong_number");
		}
		else
		{
			System.out.println("this is a non-armstrong_number");
		}
		

	}

}
