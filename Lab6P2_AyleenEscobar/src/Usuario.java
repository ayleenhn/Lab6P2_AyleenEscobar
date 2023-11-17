
import java.util.Date;


public class Usuario {
    //Nombre, correo, pais de residencia y fecha de nacimiento
    private String nombre, correo, pais;
    private Date date;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String pais, Date date) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return nombre;
    }
     
}
