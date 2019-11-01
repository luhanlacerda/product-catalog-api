package lacerda.luhan.dto;

import java.util.List;

import lacerda.luhan.entity.Caracteristica;
import lacerda.luhan.entity.Unidade;

public class ProdutoDTO {

	private String codigo;
	private String descricao;
	private List<Unidade> listUnidades;
	private List<Caracteristica> listCaracteristicas;

	public ProdutoDTO() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Unidade> getListUnidades() {
		return listUnidades;
	}

	public void setListUnidades(List<Unidade> listUnidades) {
		this.listUnidades = listUnidades;
	}

	public List<Caracteristica> getListCaracteristicas() {
		return listCaracteristicas;
	}

	public void setListCaracteristicas(List<Caracteristica> listCaracteristicas) {
		this.listCaracteristicas = listCaracteristicas;
	}

}
