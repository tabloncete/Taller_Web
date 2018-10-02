package taller.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import taller.dto.*;
import taller.dto.ClienteDTO;

@Entity
@Table(name="CLIENTES")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "IDCLIENTES")
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DNI")
	private String dni;
	@Column(name = "DOMICI")
	private String domicilio;
	@Column(name = "LOCALI")
	private String localidad;
	@Column(name = "PROVIN")
	private String provincia;
	@Column(name = "TELEFO")
	private String telefono;
	@Column(name = "CUIT")
	private String cuit;
	@Column(name = "TIPODOC")
	private String tipodoc;
	@Column(name = "NUMFAX")
	private String numfax;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "OBSERV")
	private String observaciones;
	
	//Lista de Servicios
	//One to many, con inverse join
	@OneToMany
	@JoinTable
	(
	    name="SERVICIOS_CLIENTES",
	    joinColumns={ @JoinColumn(name="ID_CLIENTE", referencedColumnName="IDCLIENTES") },
	    inverseJoinColumns={ @JoinColumn(name="ID_SERVICIO", referencedColumnName="ID_SERVICIO") }
	)
	private List<Servicio> servicios;
	
	public Cliente() {
		servicios = new ArrayList<Servicio>();
	}
	
	public ClienteDTO asDTO() {
		ClienteDTO dto = new ClienteDTO();
		
		dto.setId(getId());
		dto.setNombre(getNombre());
		dto.setDni(getDni());
		dto.setDomicilio(getDomicilio());
		dto.setLocalidad(getLocalidad());
		dto.setProvincia(getProvincia());
		dto.setTelefono(getTelefono());
		dto.setCuit(getCuit());
		dto.setTipodoc(getTipodoc());
		dto.setNumfax(getNumfax());
		dto.setEmail(getEmail());
		dto.setObservaciones(getObservaciones());
		
		List<ServicioDTO> listaServicios = new ArrayList<ServicioDTO>();
		for (Servicio bo : getServicios()) {
			listaServicios.add(bo.asDTO());
		}
		dto.setServicios(listaServicios);
		
		return dto;
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

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", localidad="
				+ localidad + ", provincia=" + provincia + ", telefono=" + telefono + ", cuit=" + cuit + ", tipodoc="
				+ tipodoc + ", numfax=" + numfax + ", email=" + email + ", observaciones=" + observaciones
				+ ", servicios=" + servicios + "]";
	}
	
}
