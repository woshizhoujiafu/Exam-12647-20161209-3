package hand.zjf;

import java.util.Scanner;

public class DetermineDate {
	public static void main(String[] args){
		String date;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入日期：");
		date = input.nextLine();
		String date1 = date.substring(0,4);
		String date2 = date.substring(5,7);
		String date3 = date.substring(8,10);
		
		int year = Integer.valueOf(date1).intValue();
		int month = Integer.valueOf(date2).intValue();
		int day = Integer.valueOf(date3).intValue();
		num = dayNumber(year,month,day);
		System.out.println("你输入的日期为当年的第"+num+"天");
	}
	public static int dayNumber(int year,int month,int day){
		int num = 0;
		if(month==1){
			num = 31;
		}else if(month==2){
			num = 59;
		}else if(month==3){
			num = 90;
		}else if(month==4){
			num = 120;
		}else if(month==5){
			num = 151;
		}else if(month==6){
			num = 181;
		}else if(month==7){
			num = 212;
		}else if(month==8){
			num = 243;
		}else if(month==9){
			num = 273;
		}else if(month==10){
			num = 304;
		}else if(month==11){
			num = 334;
		}else{
			num = 334;
		}
		num +=day;
		if(!(year%4==0&&year%100==0)){
			num +=1;
		}
		return num;
	}
}
