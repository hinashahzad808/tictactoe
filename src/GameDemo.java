import java.util.*;
class GameDemo {
public static void main(String[] args){
int b;
Game obj =new Game();
Scanner a=new Scanner(System.in);
System.out.println("Enter the symbol for First Player either 1 or 2 ");
int no=a.nextInt();
System.out.println("Enter the symbol for Second Player either 1 or 2");
int na=a.nextInt();
for(b=0;b<9;b++){
obj.show();
    if(b%2==0){       
       System.out.println("First Player Turn");
       System.out.println("Enter the row no for First Player");
         int i=a.nextInt();
	   System.out.println("Enter the column no for first player");
          int j=a.nextInt();
		   obj.setGame(i,j,no);
		 if(obj.display(no)){
		 System.out.println("Winner is First Player");	   
					return;
		 }
		   
	 }	 
	 else{
	     System.out.println("Second Player Turn");
       System.out.println("Enter the row no for second player");
         int i=a.nextInt();
	   System.out.println("Enter the column no for second player");
          int j=a.nextInt();
		  obj.setGame1(i,j,na);
		  if(obj.display(na)){
		 System.out.println("Winner is Second Player");	   
					return;
		 }
		   
	 }	
}
    System.out.println("Match Draw"); 
}
}