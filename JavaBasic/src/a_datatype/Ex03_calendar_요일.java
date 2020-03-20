package a_datatype;

import java.util.Calendar;

public class Ex03_calendar_요일 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();//지금시간연원일 얻어오기
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		
		System.out.println("year:"+y+" month:"+(m+1)+" date:"+d); //월은 +1
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m2 = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		System.out.println("hour:"+h+" minute:"+m2+" second:"+s);
		//일요일(1)~토요일(7)
		String i [] = {"일","월","화","수","목","금","토"};
		System.out.println(i[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일");

		
	
	}
}
