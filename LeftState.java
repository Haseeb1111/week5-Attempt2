package haseeb;

public class LeftState implements State {
	 

		public void doAction(RcketCon context) {
		   System.out.println("Player is in leftside state");
		   context.setState(this);	
		}
	 
		public String toString(){
		   return "Left State";
		}
	 

}
 