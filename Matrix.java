import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int MAX=50;
		int arr[][]=new int[MAX][MAX];
		int row,col;
		System.out.println("Enter The number of rows: ");
		row=sc.nextInt();
		System.out.println("Enter the number of columns: ");
		col=sc.nextInt();
		System.out.println("Enter The Elements of the Matrix Row Wise:");
for(int i=0;i<row;i++)
	{
for(int j=0;j<col;j++)
{
 arr[i][j]=sc.nextInt();
			}
		}
		
//Displaying the Matrix
System.out.println("Matrix is:");
for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
//finding sum of prime numbers
int sum=0;
		
for(int i=0;i<row;i++)
{
   for(int j=0;j<col;j++)
{
int chk=0;
for(int k=2;k<=arr[i][j]/2;k++)
{
if(arr[i][j]%k==0)
{
chk=1;
	}
}
if(chk==0)
{
if(arr[i][j]!=1)
sum+=arr[i][j];
}
}
}
		System.out.println("Sum of Prime numbers of the matrix is ="+sum);
	}
}