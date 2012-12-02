import org.apache.log4j.Logger;

public class csHulk {
	private final static Logger LOGGER = Logger.getLogger(csHulk.class.getName());
    public static void main(String[] args) {
    	LOGGER.info("info level log test");
    	LOGGER.info("In loop");
    	for(int i=1;i<11;i++)
    	{
    		LOGGER.debug("loop run:"+i);
    	}
    	LOGGER.info("Out of the loop");
    	System.out.println("Sysout log");
    }
}