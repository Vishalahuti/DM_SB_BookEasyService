package com.template.dto;

public class AuthResponse {
//    private String token;
//
//    public AuthResponse(String token) {
//        this.token = token;
//    }
//
//	public String getToken() {
//		return token;
//	}

	
    private String token;
    private String message;

    public AuthResponse(String token) {
        this.token = token;
    }

    public AuthResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
