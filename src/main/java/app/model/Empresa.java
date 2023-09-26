package app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false, length = 50)
	String nombre;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "empresa")
	List<EmpEmpresa> empleados;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	List<Contrato> contratos;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(Long id, String nombre, List<EmpEmpresa> empleados, List<Contrato> contratos) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public List<EmpEmpresa> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<EmpEmpresa> empleados) {
		this.empleados = empleados;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

}