public class Alumno {

    private int matricula;
    private int nota;
    private String nombre;

    public Alumno( int matricula, int nota, String nombre ) {
        this.matricula = matricula;
        this.nota = nota;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula( int matricula ) {
        this.matricula = matricula;
    }

    public int getNota() {
        return nota;
    }

    public void setNota( int nota ) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "matricula=" + matricula +
                ", nota=" + nota +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
