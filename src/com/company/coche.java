package com.company;


public class coche {
    private String marca;
    private String modelo;
    private  String matricula;
    private  Integer potencia;
    private Double precio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public coche(String marca, String modelo, String matricula, Integer potencia, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        coche coche = (coche) o;

        if (!marca.equals(coche.marca)) return false;
        if (!modelo.equals(coche.modelo)) return false;
        if (!matricula.equals(coche.matricula)) return false;
        if (!potencia.equals(coche.potencia)) return false;
        return precio.equals(coche.precio);

    }

    @Override
    public int hashCode() {
        int result = marca.hashCode();
        result = 31 * result + modelo.hashCode();
        result = 31 * result + matricula.hashCode();
        result = 31 * result + potencia.hashCode();
        result = 31 * result + precio.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                '}';
    }
}
