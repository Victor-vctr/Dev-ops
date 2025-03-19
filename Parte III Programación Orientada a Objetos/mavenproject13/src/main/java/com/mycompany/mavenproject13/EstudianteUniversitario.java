package com.mycompany.mavenproject13;

/**
 *
 * @author dev-ops
 */
public class EstudianteUniversitario extends Estudiante{
    private String carrera;
    private int semestre;

    // Constructor
    public EstudianteUniversitario(String nombre, int edad, String identificacion, String carrera, int semestre) {
        super(nombre, edad, identificacion); // Llamada al constructor de la superclase
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Método específico para EstudianteUniversitario
    public void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera + " en el semestre " + semestre + ".");
    }

    // Sobreescribir el método mostrarInformacion para agregar más datos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
