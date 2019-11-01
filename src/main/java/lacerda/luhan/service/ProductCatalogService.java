package lacerda.luhan.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import lacerda.luhan.dao.ProdutoDAO;
import lacerda.luhan.entity.Produto;

@Path("/produtos")
public class ProductCatalogService {

	private static final Log logger = LogFactory.getLog(ProductCatalogService.class);

	@Inject
	private ProdutoDAO produtoDAO;

	@GET
	@Path("/produtos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> getAllProdutos() {
		logger.info("Entrou service");
		List<Produto> produtos = produtoDAO.listAll();
		return produtos;
	}
	
	@GET
	@Path("/teste")
	@Produces(MediaType.APPLICATION_JSON)
	public String getProdutos() {
		return "OK";
	}

	@POST
	@Path("/produtos/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto productById(@PathParam("codigo") String codigo) throws Exception {
		return produtoDAO.findById(codigo);
	}

}
