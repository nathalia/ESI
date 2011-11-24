package main.br.usp.esi.enums;

public enum HorarioType {
	UM("Seg - 8:00"), 
	DOIS("Seg - 10:15"), 
	TRES("Seg - 14:00"), 
	QUATRO("Seg - 16:15"), 
	CINCO("Seg - 19:00"), 
	SEIS("Seg - 21:15"),
	SETE("Ter - 8:00"), 
	OITO("Ter - 10:15"), 
	NOVE("Ter - 14:00"), 
	DEZ("Ter - 16:15"), 
	ONZE("Ter - 19:00"), 
	DOZE("Ter - 21:15"),
	TREZE("Qua - 8:00"), 
	QUATORZE("Qua - 10:15"), 
	QUINZE("Qua - 14:00"), 
	DEZESSEIS("Qua - 16:15"), 
	DEZESSETE("Qua - 19:00"), 
	DEZOITO("Qua - 21:15"),
	DEZENOVE("Qui - 8:00"), 
	VINTE("Qui - 10:15"), 
	VINTE_UM("Qui - 14:00"), 
	VINTE_DOIS("Qui - 16:15"), 
	VINTE_TRES("Qui - 19:00"), 
	VINTE_QUATRO("Qui - 21:15"),
	VINTE_CINCO("Sex - 8:00"), 
	VINTE_SEIS("Sex - 10:15"), 
	VINTE_SETE("Sex - 14:00"), 
	VINTE_OITO("Sex - 16:15"), 
	VINTE_NOVE("Sex - 19:00"), 
	TRINTA("Sex - 21:15"),
	TRINTA_UM("Sab - 08:00"), 
	TRINTA_DOIS("Sab - 10:15"), 
	TRINTA_TRES("Sab - 14:00"), 
	TRINTA_QUATRO("Sab - 16:15"), 
	TRINTA_CINCO("Sab - 19:00"), 
	TRINTA_SEIS("Sab - 21:15");
	
	private String desc;

	private HorarioType(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
