package mx.com.telas.uttt.data.entity;

import java.sql.Time;

/**
 *
 * @author AlexisGasga
 */
public class Turno {
    private Integer idTurno;
    private String turno;
    private Time horaEntrada;
    private Time horaSalida;

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

//    @Override
//    public boolean equals(Object o) {
//        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString() {
        return turno;
    }
    
}
