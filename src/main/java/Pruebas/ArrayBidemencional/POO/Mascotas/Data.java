package Pruebas.ArrayBidemencional.POO.Mascotas;

public class Data {
    String[][] dataMascotas = new String[2][2];

    public void agregarMascotas(){
        for (int i = 0; i <2 ; i++) {
            Mascotas mascotas = new Mascotas();
            mascotas.setName(mascotas.getName());
            mascotas.setEspecie(mascotas.getEspecie());
            dataMascotas[i][0] = String.valueOf(mascotas);
            for (int j = 0; j <1 ; j++) {
                mascotas.setNameDueno(mascotas.getNameDueno());
                mascotas.setEdadDueno(mascotas.getEdadDueno());
                dataMascotas[j][1] = String.valueOf(mascotas);
            }
        }
    }
    public void showData(){
        for (int i = 0; i <2 ; i++) {
            System.out.println(dataMascotas[i][0]);
            for (int j = 0; j <1 ; j++) {
                System.out.println(dataMascotas[j][1]);
            }
        }
    }

}
