import java.util.*;
public class prg1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String st=sc.nextLine();
		st=st+' ';
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ')
			{
				count++;
			}
		}
		String s[]=new String[count];
		int j=0;
		for(int i=0;i<count;i++)
		{			
			s[i]="";
			while(st.charAt(j)!=' ')
			{
				s[i]+=st.charAt(j);
				j++;
			}
			j++;
		}
		int n=0,n2=s[0].length(),a=0,b=0;
		for(int i=0;i<count;i++)
		{
			if(s[i].length()>=n)
			{
				n=s[i].length();
				a=i;
			}
			if(s[i].length()<=n2)
			{
				n2=s[i].length();
				b=i;
			}
		}
		System.out.println("The Largest is "+s[a]);
		System.out.println("The Smallest is "+s[b]);
		sc.close();
	}
}
