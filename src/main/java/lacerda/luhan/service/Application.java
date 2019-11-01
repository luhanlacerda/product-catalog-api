package lacerda.luhan.service;

import javax.ws.rs.ApplicationPath;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/test")
public class Application extends ResourceConfig {

	private static final Log logger = LogFactory.getLog(Application.class);

	public Application() {
		logger.info("entrou application");
		this.packages("lacerda.luhan.service");
	}

}
