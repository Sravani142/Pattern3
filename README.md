# Pattern3
Print the star pattern

//Create a new Scanner object

                          Scanner sc = new Scanner(System.in);


//Get the number of rows from the user

                          System.out.println("Enter the number of rows needed to print the pattren");
			  int rows = sc.nextInt();

"## printing the pattern ##"
                
                         for(int i=1;i<=rows ; i++)		
                        
// print space in decreasing order

                         for(int j = rows; j>i; j--)
				

//print the star in increasing order

                        for(int k=1;k<=(i*2)-1; k++)
				{
					                
				  if(k==1 || k==(i*2)-1||i==rows)
                                        System.out.print("*");
				  else
				        System.out.print(" ");
                                 }       
//for the next line use below  statement

                       System.out.println();
