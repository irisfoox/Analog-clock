package third;

public class Analog {
    public void getAngle(int hand1,int hand2) {
    	double x=30;
    	int diff;
    	if(hand1==12|| hand2==12) {
    	   diff=Math.abs(hand1-hand2)-6;    //am,pm mode at round hour
    	}
    	else {diff=Math.abs(hand1-hand2);}  //not a round hour
    	
    	switch(diff) {
    	case 1: System.out.println(String.format("the angle is %s deg.",x));
    	        break;
    	case 2: System.out.println(String.format("the angle is %s deg.",x*2));
                break;
    	case 3: System.out.println(String.format("the angle is %s deg.",x*3));
                break;
    	case 4: System.out.println(String.format("the angle is %s deg.",x*4));
                break;
    	case 5: System.out.println(String.format("the angle is %s deg.",x*5));
                break;
    	case 6: System.out.println(String.format("the angle is %s deg.",x*6));        
    	        break;
    	default: System.out.println("not a valid syntax");        
    	}
    	}
    	
    }

