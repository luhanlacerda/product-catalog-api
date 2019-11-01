package lacerda.luhan.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("product-catalog-api");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}