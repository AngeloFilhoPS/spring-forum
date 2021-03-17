package br.com.alura.forum.controller.dto;

public class TokenDTO {
    private String tipo;
    private String token;

    public TokenDTO(String token, String tipo) {
        this.token =token;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getToken() {
        return token;
    }
}
