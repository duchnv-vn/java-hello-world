package section_13;

import java.util.logging.Logger;

public class CustomLogging {
    private static Logger logger = Logger.getLogger(CustomLogging.class.getName());

    public static void main(String[] args) {
        logger.info("This is info-level log message");
    }

}
