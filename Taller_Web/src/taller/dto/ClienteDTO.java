package taller.dto;

import java.util.ArrayList;
import java.util.List;

import taller.dto.*;
import taller.entidades.Cliente;
import taller.entidades.Servicio;

public class ClienteDTO {
	
	private Integer id;
	private String nombre;
	private String dni;
	private String domicilio;
	private String localidad;
	private String provincia;
	private String telefono;
	private String cuit;
	private String tipodoc;
	private String numfax;
	private String email;
	private String observaciones;
	
	private List<ServicioDTO> servicios;
	
	public ClienteDTO() {
		servicios = new ArrayList<ServicioDTO>();
	}
	
	public Cliente asBO(){
		Cliente cli = new Cliente();
		
		cli.setId(getId());
		cli.setNombre(getNombre());
		cli.setDni(getDni());
		cli.setDomicilio(getDomicilio());
		cli.setLocalidad(getLocalidad());
		cli.setProvincia(getProvincia());
		cli.setTelefono(getTelefono());
		cli.setCuit(getCuit());
		cli.setTipodoc(getTipodoc());
		cli.setNumfax(getNumfax());
		cli.setEmail(getEmail());
		cli.setObservaciones(getObservaciones());
		
		List<Servicio> listaServicios = new ArrayList<Servicio>();
		for (ServicioDTO dto : getServicios()) {
			listaServicios.add(dto.asBO());
		}
		cli.setServicios(listaServicios);
		
		return cli; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}

	public String getNumfax() {
		return numfax;
	}

	public void setNumfax(String numfax) {
		this.numfax = numfax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<ServicioDTO> getServicios() {
		return servicios;
	}

	public void setServicios(List<ServicioDTO> servicios) {
		this.servicios = servicios;
	}
	
}
