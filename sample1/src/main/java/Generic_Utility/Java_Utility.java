package Generic_Utility;

import java.util.Random;

public class Java_Utility {

	public int getRandomNum()
	{
		Random ran = new Random();
		int rannum = ran.nextInt(1000);
		return rannum;
		
	}
}
