import java.util.List;

public class Main {
    public static void main( String[] args ) {
        List<Alumno> alumnos = List.of(
                new Alumno( 12345678, 10, "Luciano" ),
                new Alumno( 12345678, 8, "Gonzalo" )
        );
        Examen examen = new Examen( alumnos );

        System.out.println( examen.mejorAlumno() );
        System.out.println( examen.notaPromedio() );
        System.out.println( examen.cantidadAlumnos() );
    }
}