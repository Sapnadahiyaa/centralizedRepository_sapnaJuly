package Package1;

public class Assignment2 {
	
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
			
			Assignment2 obj=new Assignment2();
			
			int sumresult1=obj.sum(obj.num1,obj.num2);
			int sumresult2=obj.sum(sumresult1,obj.num2);
			int subresult1=obj.sub(sumresult2,obj.num2);
			int multiresult1=obj.multi(subresult1,obj.num2);
			int result=obj.div(multiresult1,obj.num2);
			
			System.out.println("Result of (((((10+2)+2)-2)*2)/2) :"+result);
			
		}

	}



