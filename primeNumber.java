package Program_practise;

public class primeNumber {

	public static void main(String[] args) {
		
		
		 for (int i=1;i<=100;i++)
		 {
			 int  count=0;
			 for (int j=2;j<i;j++)
			 {
				 
				 int rem= i%j;
				 if (rem==0)
				 {
					 count++;
				 }
			 }
			 if(count==0)
			
			 {
				 System.out.println(i);
			 }
			
		 }

	}

}
