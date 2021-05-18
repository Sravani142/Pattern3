public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of rows needed to print the pattren");
			int rows = sc.nextInt();
			for(int i=1;i<=rows ; i++)
			{
				for(int j = rows; j>i; j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(i*2)-1; k++)
				{
					if(k==1 || k==(i*2)-1||i==rows)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			
		}

	}


