package Package1;

public class Assignment3 {
	int num1=10;
	int num2=2;
	public int sum(int a,int b) {
		int c=a+b;
		return c;
		
	}
	public int sub(int a1,int b2) {
		int c1=a1-b2;
		return c1;
		
	}
	public int multi(int p,int q) {
		int m=p*q;
		return m;
		
	}
	public int div(int x,int y) {
		int d=x/y;
		return d;
		
	}
	
	public static void main(String[] args) {
		
		Assignment3 obj=new Assignment3();
		
		int div1=obj.div(obj.num1,obj.num2);
		int sub1=obj.sub(div1,obj.num2);
		int sum1=obj.sum(sub1,obj.num2);
		int sub2=obj.sub(sum1,obj.num2);
		int result=obj.multi(sub2,obj.num2);
		System.out.println("Result of (((((10/2)-2)+2)-2)*2) :"+result);
		
	}

}
