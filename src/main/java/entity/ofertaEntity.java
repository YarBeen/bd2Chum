/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Anthony
 */
public class ofertaEntity {
    private int id;
    private int idComprador;
    private int idPublicacion;
    private int Regateo;
    private String Mensaje;
    private String Aceptacion;

    public ofertaEntity(int id, int idComprador, int idPublicacion, int Regateo, String Mensaje, String Aceptacion) {
        this.id = id;
        this.idComprador = idComprador;
        this.idPublicacion = idPublicacion;
        this.Regateo = Regateo;
        this.Mensaje = Mensaje;
        this.Aceptacion = Aceptacion;
    }
    

    public ofertaEntity(int idComprador, int idPublicacion, int Regateo, String Mensaje, String Aceptacion) {
        this.idComprador = idComprador;
        this.idPublicacion = idPublicacion;
        this.Regateo = Regateo;
        this.Mensaje = Mensaje;
        this.Aceptacion = Aceptacion;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getIdComprador() {
        return idComprador;
    }


    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }


    public int getIdPublicacion() {
        return idPublicacion;
    }


    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }


    public int getRegateo() {
        return Regateo;
    }


    public void setRegateo(int regateo) {
        Regateo = regateo;
    }


    public String getMensaje() {
        return Mensaje;
    }


    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }


    public String getAceptacion() {
        return Aceptacion;
    }


    public void setAceptacion(String aceptacion) {
        Aceptacion = aceptacion;
    }

}
