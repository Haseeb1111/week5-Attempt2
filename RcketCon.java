package haseeb;

    
public class RcketCon {
    private State state;
 
    public RcketCon(){
       state = null;
    }
 
    public void setState(State state){
       this.state = state;		
    }
 
    public State getState(){
       return state;
    }
 }