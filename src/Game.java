class Game {
public int i;
public int j;
public int[][] Game=new int[3][3];
public Game(){
for(i=0;i<3;i++)
        for(j=0;j<3;j++)
	       Game[i][j]=0;
}
public void setGame(int i,int j,int no){
this.Game[i][j]=no;
}
public void setGame1(int i,int j,int na){
this.Game[i][j]=na;
}


public void show(){
    System.out.print("2-D Array Initialization\n");
	for(i=0;i<3;i++){
        for(j=0;j<3;j++){
	      System.out.print(Game[i][j]+"\t");
		  }
			System.out.println("");
			}
}
public boolean display(int no){
  boolean win=false;
  for(i=0;i<3;i++){
      if((Game[i][0]==no && Game[i][1]==no && Game[i][2]==no) || (Game[0][i]==no   && Game[1][i]==no && Game[2][i]==no) || (Game[0][0]==no && Game[1][1]==no && Game[2][2]==no) || (Game[0][2]==no && Game[1][1]==no && Game[2][0]==no)){
	              win= true;
				  break;
				  }	
				  else
				  win= false;
	   
   }
   return win;
    
}
}