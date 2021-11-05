package tp4;

public enum States {  
    ON, OFF;
    
    @Override
    public String toString() {
    	if( this == ON) {
    		return "On";
    	}
    	return "Off";
    }
}
