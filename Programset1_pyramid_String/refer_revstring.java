

public class refer_revstring
{
	public static void main(String[] args) {
	String tr="hello";
	char tt[]=new char[tr.length()];
	for(int i=0;i<tr.length()-1;i++)
	{
	     tt[i]=tr.charAt(i);
	}
	    	int t=6;
		int i=0;
		int j=4;
		while(i<j){
		for(i=0;i<t;i++)
		{
		    for(j=4;j>=0;j--)
		    {
		        char temp= tt[i];
		        tt[i]=tt[j];
		        tt[j]=temp;
		    }
		}
		}
		for(int k=0;k<=tt.length-1;k++){
		System.out.println("\n\t " + tt[k]);
	}

	}
}
