package haseeb;
public class demo {
	public static void main(String[] args) {
	   RcketCon rcketcon = new RcketCon();
 
	   RightState rightState = new RightState();
	   rightState.doAction(rcketcon);
 
	   System.out.println(rcketcon.getState().toString());
 
	   LeftState leftState = new LeftState();
	   leftState.doAction(rcketcon);
 
	   System.out.println(rcketcon.getState().toString());

	   IdleState idleState = new IdleState();
	   idleState.doAction(rcketcon);
 
	   System.out.println(rcketcon.getState().toString());
	}
 }