package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false, length = 50)
	String nombre;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agencia")
	List<Influencer> influencers;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agencia")
	List<EmpAgencia> empleados;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agencia")
	List<Contrato> contratos;

	public Agencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agencia(Long id, String nombre, List<Influencer> influencers, List<EmpAgencia> empleados,
			List<Contrato> contratos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.influencers = influencers;
		this.empleados = empleados;
		this.contratos = contratos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Influencer> getInfluencers() {
		return influencers;
	}

	public void setInfluencers(List<Influencer> influencers) {
		this.influencers = influencers;
	}

	public List<EmpAgencia> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpAgencia> empleados) {
		this.empleados = empleados;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

}
