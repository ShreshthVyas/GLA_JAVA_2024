package Lecture16;

public class AxisandOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		int odd =0;
		//for counting odd length palindromic substrings
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis+orbit< s.length()  && axis-orbit>=0 ; orbit++) {
				if(s.charAt(axis+orbit) != s.charAt(axis-orbit)) {
					break;
				}
				odd++;
			}
		}
		int even =0;
		//for counting even length palindromic substrings
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis+orbit< s.length()  && axis-orbit>=0 ; orbit++) {
				if(s.charAt((int)(axis+orbit)) != s.charAt((int)(axis-orbit))) {
					break;
				}
				even++;
			}
		}
		
		System.out.println(odd+even);
			
	}

}
