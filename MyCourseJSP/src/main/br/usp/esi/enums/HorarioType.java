package main.br.usp.esi.enums;

public enum HorarioType {
	UM("Seg - 8:00"), 
	DOIS("Seg - 10:15"), 
	TRES("Seg - 14:00"), 
	QUATRO("Seg - 16:15"), 
	CINCO("Seg - 19:00"), 
	SEIS("Seg - 21:15"),
	SETE("Ter - 8:00"), 
	OITO("Ter - 8:15"), 
	NOVE("Ter - 14:00"), 
	DEZ("Ter - 14:15"), 
	ONZE("Ter - 19:00"), 
	DOZE("Ter - 21:15"),
	TREZE("Ter - 21:15"), 
	QUATORZE("Ter - 21:15"), 
	QUINZE("Ter - 21:15"), 
	DEZESSEIS("Ter - 21:15"), 
	DEZESSETE("Ter - 21:15"), 
	DEZOITO("Ter - 21:15"),
	DEZENOVE("Ter - 21:15"), 
	VINTE("Ter - 21:15"), 
	VINTE_UM("Ter - 21:15"), 
	QUINTA_QUATRO("Ter - 21:15"), 
	QUINTA_CINCO("Ter - 21:15"), 
	QUINTA_SEIS("Ter - 21:15"),
	SEXTA_UM("Ter - 21:15"), 
	SEXTA_DOIS("Ter - 21:15"), 
	SEXTA_TRES("Ter - 21:15"), 
	SEXTA_QUATRO("Ter - 21:15"), 
	SEXTA_CINCO("Ter - 21:15"), 
	SEXTA_SEIS("Ter - 21:15"),
	SABADO_UM("Ter - 21:15"), 
	SABADO_DOIS("Ter - 21:15"), 
	SABADO_TRES("Ter - 21:15"), 
	SABADO_QUATRO("Ter - 21:15"), 
	SABADO_CINCO("Ter - 21:15"), 
	SABADO_SEIS("Ter - 21:15");
	
	private String desc;

	private HorarioType(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
