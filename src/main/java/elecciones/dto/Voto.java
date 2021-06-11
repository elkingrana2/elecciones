package elecciones.dto;

import java.security.Timestamp;

public class Voto {
	
	int id;
	Timestamp fechaCreacion;
	Timestamp fechaVoto;
	String uuid;
	String enlace;
	int estamento;
	int candidato;
	int votante;
	public Voto(int id, Timestamp fechaCreacion, Timestamp fechaVoto, String uuid, String enlace, int estamento,
			int candidato, int votante) {
		this.id = id;
		this.fechaCreacion = fechaCreacion;
		this.fechaVoto = fechaVoto;
		this.uuid = uuid;
		this.enlace = enlace;
		this.estamento = estamento;
		this.candidato = candidato;
		this.votante = votante;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Timestamp getFechaVoto() {
		return fechaVoto;
	}
	public void setFechaVoto(Timestamp fechaVoto) {
		this.fechaVoto = fechaVoto;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public int getEstamento() {
		return estamento;
	}
	public void setEstamento(int estamento) {
		this.estamento = estamento;
	}
	public int getCandidato() {
		return candidato;
	}
	public void setCandidato(int candidato) {
		this.candidato = candidato;
	}
	public int getVotante() {
		return votante;
	}
	public void setVotante(int votante) {
		this.votante = votante;
	}
	
	
	
	

}
