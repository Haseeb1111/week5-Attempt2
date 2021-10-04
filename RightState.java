package haseeb;


public class RightState implements State {

	

		public void doAction(RcketCon context) {
		   System.out.println("Player is in Rightside state");
		   context.setState(this);	
		}
	 
		public String toString(){
		   return "RightSide State";
		}
	 
}