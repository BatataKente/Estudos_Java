package exercices.codingbat.logic_2;

public class MakeBricks {
	public static void main(String[] args) {
		System.out.println(makeBricks(3, 1, 8));//→ true
		System.out.println(makeBricks(3, 2, 8));//→ true
		System.out.println(makeBricks(3, 1, 9));//→ false
		System.out.println(makeBricks(3, 2, 10)); //→ true
	}
	
//	We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) 
//	and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. 
//	This is a little harder than it looks and can be done without any loops.
	public static boolean makeBricks(int small, int big, int goal) {

		if(big*5 >= goal && (goal % (big*5)) == 0) {
			return true;
		}

		if(small >= goal) {
			return true;
		}
		
		int row = 0;
		
		for(int i = 0; i < big; i++) {
			int next_row = row + 5;
			if(next_row > goal) {
				break;
			}
			if(next_row == goal) {
				return true;
			}
			row = next_row;
		}
		for(int i = 0; i < small; i++) {
			row += 1;
			if(row == goal) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean makeBricksAlt(int small, int big, int goal) {
	    int bigBricksUsed = Math.min(goal / 5, big);
	    int remainingGoal = goal - (bigBricksUsed * 5);
	    return remainingGoal <= small;
	}
}
