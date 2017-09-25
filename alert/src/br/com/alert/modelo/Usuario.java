package br.com.alert.modelo;

public class Usuario {

	private Long COD_CONTATO;
	private String NOME_CONTATO;
	private String EMAIL_CONTATO;
	private String SENHA_CONTATO;
	private String NROCEL_CONTATO;
	private Long COD_PRIVILEGIO;
	private String IND_ATIVO;

	public Long getCOD_CONTATO() {
		return COD_CONTATO;
	}

	public void setCOD_CONTATO(Long cOD_CONTATO) {
		COD_CONTATO = cOD_CONTATO;
	}

	public String getNOME_CONTATO() {
		return NOME_CONTATO;
	}

	public void setNOME_CONTATO(String nOME_CONTATO) {
		NOME_CONTATO = nOME_CONTATO;
	}

	public String getEMAIL_CONTATO() {
		return EMAIL_CONTATO;
	}

	public void setEMAIL_CONTATO(String eMAIL_CONTATO) {
		EMAIL_CONTATO = eMAIL_CONTATO;
	}

	public String getSENHA_CONTATO() {
		return SENHA_CONTATO;
	}

	public void setSENHA_CONTATO(String sENHA_CONTATO) {
		SENHA_CONTATO = sENHA_CONTATO;
	}

	public String getNROCEL_CONTATO() {
		return NROCEL_CONTATO;
	}

	public void setNROCEL_CONTATO(String nROCEL_CONTATO) {
		NROCEL_CONTATO = nROCEL_CONTATO;
	}

	public Long getCOD_PRIVILEGIO() {
		return COD_PRIVILEGIO;
	}

	public void setCOD_PRIVILEGIO(Long cOD_PRIVILEGIO) {
		COD_PRIVILEGIO = cOD_PRIVILEGIO;
	}

	public String getIND_ATIVO() {
		return IND_ATIVO;
	}

	public void setIND_ATIVO(String iND_ATIVO) {
		IND_ATIVO = iND_ATIVO;
	}

}
