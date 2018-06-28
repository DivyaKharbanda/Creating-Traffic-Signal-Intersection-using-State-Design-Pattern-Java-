package fourWayStreetLights.util;

public class Logger 
{
	public static enum DebugLevel 
	{ 
		CONSTRUCTOR, FILE_PROCESSOR, NONE, MovingState, StartState, GoneState
    };
    static DebugLevel debugLevel;
    
    public static void setDebugValue (int levelIn) 
    {
		switch (levelIn) 
    		{
    	case 5: debugLevel = DebugLevel.GoneState; break;
		case 4: debugLevel = DebugLevel.StartState; break;
		case 3: debugLevel = DebugLevel.MovingState; break;
    	case 2: debugLevel = DebugLevel.CONSTRUCTOR; break;
    	case 1: debugLevel = DebugLevel.FILE_PROCESSOR; break;
    	default: debugLevel = DebugLevel.NONE; break;
    	}
     }
    public static void setDebugValue (DebugLevel levelIn) {
    	debugLevel = levelIn;
        }

        public static void writeMessage (String     message  ,
                                         DebugLevel levelIn ) {
    	if (levelIn == debugLevel)
    	    System.out.println(message);
        }

        public String toString() {
    	return "The debug level has been set to the following " + debugLevel;
        }
}
