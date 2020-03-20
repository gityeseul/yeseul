package c_control;

public class Ex01_swutch_주민번호 {

public static void main(String[] args) {
	
	String id = "961205-2522222";
	char chul = id.charAt(8); //2
	String home = "";
	switch(chul) {
	default : home ="한국인"; break;
	case '0' : home = "서울"; break;
	case '1' : home = "인천/부산"; break;
	case '2' : home = "경기도"; break;
	
	}
	
	System.out.println("출산지는  "+home);	
}
}