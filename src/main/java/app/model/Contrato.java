package app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false, length = 50)
	String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empresa_id")
	Empresa empresa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agencia_id")
	Agencia agencia;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "influencer_id")
	Influencer influencer;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	Date fechaCreacion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empleado_empresa_id")
	EmpEmpresa empEmpresa;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empreado_agencia_id")
	EmpAgencia empAgencia;

	public Contrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrato(Long id, String nombre, Empresa empresa, Agencia agencia, Influencer influencer, Date fechaCreacion,
			EmpEmpresa empEmpresa, EmpAgencia empAgencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.empresa = empresa;
		this.agencia = agencia;
		this.influencer = influencer;
		this.fechaCreacion = fechaCreacion;
		this.empEmpresa = empEmpresa;
		this.empAgencia = empAgencia;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Influencer getInfluencer() {
		return influencer;
	}

	public void setInfluencer(Influencer influencer) {
		this.influencer = influencer;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public EmpEmpresa getEmpEmpresa() {
		return empEmpresa;
	}

	public void setEmpEmpresa(EmpEmpresa empEmpresa) {
		this.empEmpresa = empEmpresa;
	}

	public EmpAgencia getEmpAgencia() {
		return empAgencia;
	}

	public void setEmpAgencia(EmpAgencia empAgencia) {
		this.empAgencia = empAgencia;
	}

}
