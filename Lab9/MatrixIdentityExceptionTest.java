import java.util.Scanner;

class MatrixIdentityException extends Exception
{
	public String toString()
	{
	 return ("Identity Matrix Exception");
	}
}

class Matrix
{
 int order;
 int a[][] = new int[10][10];
 int i,j;
 
 Matrix(int o)
 {
    Scanner in = new Scanner(System.in);
	order=o;
	System.out.println("Enter the elements:");
		for (i=0; i<order; i++)
		for (j=0; j<order; j++)
		a[i][j] = in.nextInt();
 }
 
 void checkIdentity() throws MatrixIdentityException
  {
	for (i=0; i<order; i++)
	for (j=0; j<order; j++)		
	if((i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0))
		throw new MatrixIdentityException();
  }
 
}

class MatrixIdentityExceptionTest{

	public static void main(String ar[]) 
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the order - ");
		int r = in.nextInt();
		
		Matrix M=new Matrix(r);
		
		try
		{
		 M.checkIdentity();   
		}
		
		catch(MatrixIdentityException e)
		{
		 System.out.println("Exception : "+e);
		}
	}
}