package utilities;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[]= {2,5,1,3,4,4,4,4,4,4};
		int majelement=findmajority(arr,arr.length);
		boolean a=checkmaj(arr,arr.length,majelement);
		if(a)
				System.out.println("the majority element is:"+majelement);
		else
			System.out.println("No majority element");

	}
	public static int findmajority(int a[],int n)
	{
		int index=0;
		int  count=1;
		
		for(int i=1;i<a.length;i++) {
			if(a[index]==a[i])
				count++;
			else 
				count --;
			if(count==0)
			{
				index=i;
				count =1;
			}
		}
		return a[index];
	}
	public static boolean checkmaj(int a[],int n,int x) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==x)
				count++;
		}
		if(count>n/2)
			return true;
		else
			return false;
	}

}
