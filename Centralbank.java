package basicprograms;

public abstract class Centralbank {
	
	 public abstract void Statebanklocation();
	 
	 public static void main(String args[]) {
		 StateBank SB = new StateBank();
		 SB.Statebanklocation();
		 
		 LocalBank LB = new LocalBank();
		 LB.Statebanklocation();
		 
	 }

}
