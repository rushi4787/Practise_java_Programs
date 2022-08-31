package Program_practise;

import java.util.Random;

import org.apache.commons.lang3.RandomUtils;

public class Random_number {

	public static void main(String[] args) {
		Random random= new Random();
		int num= random.nextInt();
		
	//	System.out.println(num);
		
		RandomUtils utils= new 	RandomUtils();
	int num1=utils.nextInt(1, 100);
	System.out.println(num1);

	System.out.println(Math.random()*100);
	
	}

}
