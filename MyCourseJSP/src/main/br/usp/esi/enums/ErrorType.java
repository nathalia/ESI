package main.br.usp.esi.enums;

public enum ErrorType {
	ERROR_ONE("Argumento nulo encontrado."),
	ERROR_TWO("Usuario nao existe."),
	ERROR_THREE("Senha incorreta"),
	ERROR_FOUR("Id de usuario inexistente."),
	ERROR_FIVE("Erro ao acessar o banco de dados.");

	private String descType;

	private ErrorType(String descType) {
		this.descType = descType;
	}

	public String getDescType() {
		return descType;
	}
}
