package haseeb;

public class IdleState implements State {
    public void doAction(RcketCon rcketcon) {
        System.out.println("Player is in idle state");
        rcketcon.setState(this);	
     }
  
     public String toString(){
        return "Idle State";
     }
    
}
