package screenShot;

import net.bytebuddy.utility.RandomString;

public class RandomMaker {

	public static void main(String[] args) {
		
		//String kitni length ki chahiye ye 4 value will be in index qki ek hi naam rhega name wahi rhega
		//screenshot alag alag aayenge 3 is length here
		
		RandomString rs = new RandomString();
		
		System.out.println(rs.make(3));
		
		//har waqt unique string milegi
		
		//for number---have to use numberMaker

	}

}
