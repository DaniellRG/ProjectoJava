/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mantenimiento;

/**
 *
 * @author soul
 */
public class Mantenimiento {
    
    
    private String equipo;
    private String tecnico;
    private String fecha;
    private String tipoMantenimiento;
    private String estado;

    public Mantenimiento(String equipo, String tecnico, String fecha, String tipoMantenimiento, String estado) {
        this.equipo = equipo;
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.tipoMantenimiento = tipoMantenimiento;
        this.estado = estado;
        
    }
    
    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }

    public String getTecnico() { return tecnico; }
    public void setTecnico(String tecnico) { this.tecnico = tecnico; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getTipoMantenimiento() { return tipoMantenimiento; }
    public void setTipoMantenimiento(String tipoMantenimiento) { this.tipoMantenimiento = tipoMantenimiento; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    
}
