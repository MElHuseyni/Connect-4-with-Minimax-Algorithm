
import java.util.*;



public class connect4AI{

	public static void main(String[] args) throws CloneNotSupportedException{
	
	System.out.println("Enter the depth:");
	Scanner in = new Scanner(System.in);
	int depth = in.nextInt();
	
		
	minimaxAgent mma = new minimaxAgent(depth);
	State s=new State(6,7);
	while(true){
		int action = mma.getAction(s);
		//System.out.println("WOWOW");
		s = s.generateSuccessor('O', action);
		s.printBoard();
		//check if O won?
		if(s.isGoal('O'))
		break;
		int enemy_move = in.nextInt();
		s = s.generateSuccessor('X', enemy_move);
		s.printBoard();
		//check if X won? break
		if(s.isGoal('X'))
		break;
		//pause
	}
		
		

	}
}