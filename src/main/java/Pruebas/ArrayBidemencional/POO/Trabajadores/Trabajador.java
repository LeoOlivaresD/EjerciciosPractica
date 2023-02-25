package Pruebas.ArrayBidemencional.POO.Trabajadores;

import java.util.Scanner;

public class Trabajador {
    String nombreTrabajador;
    int horasTrabajadas, sueldoPorHora = 2000, totalHorasTrabajadasSemanal, sueldoSemanal;

    Scanner sc = new Scanner(System.in);

    public Trabajador(){};

    public Trabajador(String nombreTrabajador, int sueldoPorHora) {
        this.nombreTrabajador = nombreTrabajador;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    public Trabajador(String nombreTrabajador, int horasTrabajadas, int sueldoPorHora, int totalHorasTrabajadasSemanal, int sueldoSemanal) {
        this.nombreTrabajador = nombreTrabajador;
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
        this.totalHorasTrabajadasSemanal = totalHorasTrabajadasSemanal;
        this.sueldoSemanal = sueldoSemanal;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        System.out.println("Nombre trabajador");
        nombreTrabajador= sc.nextLine();
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        System.out.println("Cuantas horas trabajo?");
        horasTrabajadas = sc.nextInt();
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(int sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getTotalHorasTrabajadasSemanal() {
        return totalHorasTrabajadasSemanal;
    }

    public void setTotalHorasTrabajadasSemanal(int totalHorasTrabajadasSemanal) {
        this.totalHorasTrabajadasSemanal = totalHorasTrabajadasSemanal;
    }

    public int getSueldoSemanal() {
        return sueldoSemanal;
    }

    public void setSueldoSemanal(int sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombreTrabajador='" + nombreTrabajador + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", sueldoPorHora=" + sueldoPorHora +
                ", totalHorasTrabajadasSemanal=" + totalHorasTrabajadasSemanal +
                ", sueldoSemanal=" + sueldoSemanal +
                '}';
    }
}
