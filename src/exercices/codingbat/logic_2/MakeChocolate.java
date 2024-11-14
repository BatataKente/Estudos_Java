package exercices.codingbat.logic_2;

public class MakeChocolate {
	
	public int makeChocolateAlt(int small, int big, int goal) {
	    int bigBarsUsed = Math.min(goal / 5, big);
	    int remainingGoal = goal - (bigBarsUsed * 5);
	    return (remainingGoal <= small) ? remainingGoal : -1;
	}
	
	public int makeChocolate(int small, int big, int goal) {
		if(big*5 > goal && goal % (big*5) == 0) {
			return 0;
		}
		if(((big*5) + small) < goal) {
			return -1;
		}
		int row = 0;
		for(int i = 0; i < big; i++) {
			int next_size = row + 5;
			if(next_size > goal) {
				break;
			}
			row = next_size;
		}
		if(small < (goal - row)) {
			return -1;
		}
		int usedSmallKilos = 0;
		for(; usedSmallKilos < small; usedSmallKilos++) {
			int next_size = row + 1;
			if(next_size > goal) {
				break;
			}
			row = next_size;
		}
		return usedSmallKilos;
	}
}
