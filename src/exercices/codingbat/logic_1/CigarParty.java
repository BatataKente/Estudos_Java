package exercices.codingbat.logic_1;

public class CigarParty {
	 public boolean cigarParty(int cigars, boolean isWeekend) {
		  final boolean cigarsIsBetween4060 = cigars >= 40 && cigars <= 60;
		  final boolean cigarsIsUpTo40 = cigars >= 40;
		  if(isWeekend && cigarsIsUpTo40) return true;
		  if(cigarsIsBetween4060) return true;
		  return false;
	}

	public boolean cigarParty_1(int cigars, boolean isWeekend) {
	  final boolean cigarsIsBetween4060 = cigars >= 40 && cigars <= 60;
	  final boolean cigarsIsUpTo40 = cigars >= 40;
	  return (
		    isWeekend && cigarsIsUpTo40 ||
		    cigarsIsBetween4060
	  );
	}
	
	public boolean cigarParty_2(int cigars, boolean isWeekend) {
		  if (isWeekend) {
			  return (cigars >= 40);
		  } else {
			  return (cigars >= 40 && cigars <= 60);
		  }
	}

	public boolean cigarParty_3(int cigars, boolean isWeekend) {
		 if (isWeekend) return (cigars >= 40);
		 return (cigars >= 40 && cigars <= 60);
	}
}
