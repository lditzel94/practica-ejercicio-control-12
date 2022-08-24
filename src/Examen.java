import java.util.Comparator;
import java.util.List;

public class Examen {

    private List<Alumno> alumnos;

    public Examen( List<Alumno> alumnos ) {
        this.alumnos = alumnos;
    }

    public int cantidadAlumnos() {
        return alumnos.size();
    }

    public double notaPromedio() {
        double sumNotas = 0;
        for ( Alumno alumno : alumnos ) {
            sumNotas += alumno.getNota();
        }

        return sumNotas / cantidadAlumnos();
    }

    public Alumno mejorAlumno() {
        Alumno alumno = alumnos.stream().max( Comparator.comparing( Alumno::getNota ) ).get();
        return alumno;
    }
}
