package estudio23.com.testclases.profesores;

import android.media.Image;

/**
 * Created by jose on 29/6/16.
 */
public class Profes
{
    private String nombre, idioma, descripcion, nombreProfe, horario, alumnos,foto;
    private float ratingP;

    public Profes()
    {

    }



    public Profes(String nombre, String idioma, String descripcion, String nombreProfe, String horario, String alumnos, String foto, float ratingP)
    {
        this.nombre=nombre;
        this.idioma=idioma;
        this.descripcion=descripcion;
        this.nombreProfe=nombreProfe;
        this.horario=horario;
        this.alumnos=alumnos;
        this.ratingP=ratingP;
        this.foto=foto;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public float getRatingP() {
        return ratingP;
    }

    public void setRatingP(float ratingP) {
        this.ratingP = ratingP;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}


