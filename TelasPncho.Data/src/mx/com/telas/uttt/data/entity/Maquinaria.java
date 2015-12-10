/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.telas.uttt.data.entity;

/**
 *
 * @author Alexis Gasga
 */
public class Maquinaria {
    private Integer idMaquinaria;
    private String funcionamiento;
    private Departamento idDepartamento;
    private Integer _idDepartamento;
    private Caracteristica idCaracteristica;
    private Integer _idCaracteristica;

    public Integer getIdMaquinaria() {
        return idMaquinaria;
    }

    public void setIdMaquinaria(Integer idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer IdDepartamento() {
        return _idDepartamento;
    }

    public void IdDepartamento(Integer _idDepartamento) {
        this._idDepartamento = _idDepartamento;
    }

    public Caracteristica getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Caracteristica idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public Integer IdCaracteristica() {
        return _idCaracteristica;
    }

    public void IdCaracteristica(Integer _idCaracteristica) {
        this._idCaracteristica = _idCaracteristica;
    }
    

    
}

