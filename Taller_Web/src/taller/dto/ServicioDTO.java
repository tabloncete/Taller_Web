package taller.dto;

import java.util.Date;

import taller.dto.ClienteDTO;
import taller.entidades.Servicio;

public class ServicioDTO {
	
	private Integer id;
	private Date fecha_servicio;
	private String prioridad;
	private String estado; 
	private String tipo_servicio; 
	private String sintomas;
	private String observaciones;
	
	private ClienteDTO cliente;
	
	public ServicioDTO() {
		cliente = new ClienteDTO();
	}
	
	public Servicio asBO() {
		Servicio serv = new Servicio();
		
		serv.setId(getId());
		serv.setFecha_servicio(getFecha_servicio());
		serv.setPrioridad(getPrioridad());
		serv.setEstado(getEstado());
		serv.setTipo_servicio(getTipo_servicio());
		serv.setSintomas(getSintomas());
		serv.setObservaciones(getObservaciones());
		serv.setCliente(getCliente().asBO());
		
		return serv;
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

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
}
