package datadriven;

public class Sample
{
	public static void main(String[] args) 
	{
		String[][] sref = new String[3][2];
		
		sref[0][0]="admin";
		sref[0][1]="manager";
		
		sref[1][0]="mohan";
		sref[1][1]="mohan123";
		
		sref[2][0]="Saurav";
		sref[2][1]="Saurav123";
		
		System.out.println(sref[0][0]);
		System.out.println(sref[0][1]);
		
		System.out.println(sref[1][0]);
		System.out.println(sref[1][1]);
		
		System.out.println(sref[2][0]);
		System.out.println(sref[2][1]);
		
		System.out.println("======================");
		for(int i=0;i<=sref.length-1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(sref[i][j]+" ");
			}
			System.out.println();
		}
	}
}





