package taller.entidades;

import java.util.Date;

import javax.persistence.*;

import taller.dto.ServicioDTO;

public class Servicio {

	@Id
	@GeneratedValue
	@Column(name = "ID_SERVICIO")
	private Integer id;
	
	@Column(name = "FECHA_SERVICIO")
	private Date fecha_servicio;
	@Column(name = "PRIORIDAD")
	private String prioridad;
	@Column(name = "ESTADO")
	private String estado; //En Progreso, Pendiente, Finalizado, Cancelado
	@Column(name = "TIPO_SERVICIO")
	private String tipo_servicio; //falla,reemplazo toner
	@Column(name = "SINTOMAS")
	private String sintomas;
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	//MANY TO ONE
	private Cliente cliente;

	public Servicio() {
		cliente = new Cliente();
	}
	
	public ServicioDTO asDTO() {
		ServicioDTO dto = new ServicioDTO();
		
		dto.setId(getId());
		dto.setFecha_servicio(getFecha_servicio());
		dto.setPrioridad(getPrioridad());
		dto.setEstado(getEstado());
		dto.setTipo_servicio(getTipo_servicio());
		dto.setSintomas(getSintomas());
		dto.setObservaciones(getObservaciones());
		dto.setCliente(getCliente().asDTO());
		
		return dto;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha_servicio() {
		return fecha_servicio;
	}

	public void setFecha_servicio(Date fecha_servicio) {
		this.fecha_servicio = fecha_servicio;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(String tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Servicio [id=" + id + ", fecha_servicio=" + fecha_servicio + ", prioridad=" + prioridad + ", estado="
				+ estado + ", tipo_servicio=" + tipo_servicio + ", sintomas=" + sintomas + ", observaciones="
				+ observaciones + ", cliente=" + cliente + "]";
	}
	
}
