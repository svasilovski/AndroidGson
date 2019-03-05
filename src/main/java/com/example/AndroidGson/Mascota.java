package com.example.AndroidGson;

public class Mascota {
    private String apodo;
    private String raza;

    public Mascota() {
    }

    public Mascota(String apodo) {
        this.apodo = apodo;
    }

    public Mascota(String apodo, String raza) {
        this.apodo = apodo;
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
