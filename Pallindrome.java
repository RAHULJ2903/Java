package week1.day2;

public class Pallindrome {

	public static void main(String[] args) {
	 int num =456;
	 int temp =num;
	 int sum=0,r;
	 while (num>0) {
		 r=num%10;
		 sum=(sum*10)+r;
		 num=num/10;
		
	 }
if(temp==sum)	
	System.out.println("pallindrome number");
else
	System.out.println("not pallindrome");
	}

}
