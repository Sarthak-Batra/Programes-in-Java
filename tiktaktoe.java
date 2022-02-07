import java.util.*;
class logic
{
	Scanner sc = new Scanner(System.in);
	int flag=0,x,X,y,O,player1=88,player2=79; 
	// int a[][] =new int[3][3];  
	int[][] a ={{95,95,95},{95,95,95},{95,95,95}};
  void construct(){
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		 System.out.printf(" %c",a[i][j]);                           //empty tictaktoe
	    }
	    System.out.printf("\n");
	}
	System.out.printf("\n");
	for(int b=0;b<9;b++)                                     // loop for input index
	{
		if(flag==1)
		break;
        else if(b%2==0)
	    {
	     System.out.printf("player 1 enter your position in form of i,j \n");             
	     
	     x = sc.nextInt();
	     y = sc.nextInt();
	     // while(x>2||x<0||y>2||y<0){

	     // }
	while(a[x][y]!=95 || x>2||x<0||y>2||y<0)                                              // condition for already indexed place
          {
           System.out.printf("already used index . Re-enter your index \n");     
           x = sc.nextInt();
	     y = sc.nextInt();
          }
    if(a[x][y]==95)                                               // taking input for empty index player 1
		{                                                         
	     a[x][y]=player1;                                              
	     System.out.printf("\n");
	  for(int i=0;i<3;i++)
	    {
		  for(int j=0;j<3;j++)
		    {
		     System.out.printf(" %c",a[i][j]);
	        }
	      System.out.printf("\n");
	    }
	    System.out.printf("\n");
    }
   }
    
	else{
	System.out.printf("player 2 enter your position in form of i,j \n");
	x = sc.nextInt();
	     y = sc.nextInt();
	
	while(a[x][y]!=95)                                               // condition for already indexed place
       {
        System.out.printf("already used index . Re-enter your index \n");     
        x = sc.nextInt();
	     y = sc.nextInt();
        }
    if(a[x][y]==95)
	 {                                                       // taking input for empty index player 2
	  a[x][y]=player2;
	  System.out.printf("\n");
	  for(int i=0;i<3;i++)
	   {
	   	 for(int j=0;j<3;j++)
		 {
		  System.out.printf(" %c",a[i][j]);
	     }
	      System.out.printf("\n");
	   }
	   System.out.printf("\n");
      }
    }
	for(int i=0;i<3;i++)                                         //conditions ---->
 	 {
	  if(a[i][0] == 88 && a[i][1] == 88 && a[i][2]== 88) 
	   {
	    System.out.printf("player 1 wins");
	    flag=1;
	    break;
       }
       if(a[i][0]==79 && a[i][1] ==79 && a[i][2]==79)
       {
	    System.out.printf("player 2 wins");
	    flag=1;
	    break;
       }

	   if(a[0][i] == 88 && a[1][i] ==88 && a[2][i]==88)
       {
	    System.out.printf("player 1 wins");
	    flag=1;
	    break;
       }
       if(a[0][i]==79 && a[1][i] ==79 && a[2][i]==79)
	   {
	    System.out.printf("player 2 wins");
	    flag=1;
	    break;
       }
	
	   if(a[0][0] == 88 && a[1][1] ==88 && a[2][2]==88)
       {
	    System.out.printf("player 1 wins");
	    flag=1;
	    break;
       }
       if(a[0][0]==79 && a[1][1] ==79 && a[2][2]==79)
	   {
	    System.out.printf("player 2 wins");
	    flag=1;
	    break;
       }
       
       if(a[0][2] == 88 && a[1][1] ==88 && a[2][0]==88)
       {
	    System.out.printf("player 1 wins");
	    flag=1;
	    break;
       }
       if(a[0][2]==79 && a[1][1] ==79 && a[2][0]==79)
	   {
	    System.out.printf("player 2 wins");
	    flag=1;
	    break;
       }
   }
}
}
}
class Main{
	 public static void main(String[] args){
		logic con =new logic();
		con.construct();
	}
}