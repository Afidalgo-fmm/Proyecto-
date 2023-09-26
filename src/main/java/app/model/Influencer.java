package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Influencer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false, length = 50)
	String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agencia_id", nullable = false)
	Agencia agencia;

	@OneToMany(mappedBy = "influencer")
	List<Contrato> conrtatos;

	public Influencer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Influencer(Long id, String nombre, Agencia agencia, List<Contrato> conrtatos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.agencia = agencia;
		this.conrtatos = conrtatos;
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

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public List<Contrato> getConrtatos() {
		return conrtatos;
	}

	public void setConrtatos(List<Contrato> conrtatos) {
		this.conrtatos = conrtatos;
	}

}
