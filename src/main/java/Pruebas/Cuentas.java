package Pruebas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cuentas implements Comparable<Cuentas> {
    private Integer id;
    private String name;
    private String tipo;
    private Integer precio;
    private String email;
    Scanner sc = new Scanner(System.in);
    boolean validacion = false;
    public Cuentas (){
    };

    public Cuentas(Integer id, String name, String tipo, Integer precio, String email) {
        this.id = id;
        this.name = name;
        this.tipo = tipo;
        this.precio = precio;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
       do{
           System.out.println("Ingrese un \"numero entero\" para determinar el id de la cuenta");
           try {
               id = sc.nextInt();
               validacion = true;
           }catch (InputMismatchException e){
               sc.nextLine();
               System.out.println("Error, no haz ingresado un numero valido");
           }
       }while (validacion == false);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        sc.nextLine();
        do{
            System.out.println("Ingrese el nombre de la cuenta");
            name = sc.nextLine();
        }while(name.isEmpty() || name.equals(" "));
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        do {
            System.out.println("Que tipo de cuenta es ? (Red social, Gamer, Streaming)");
            tipo = sc.nextLine();
        }while (tipo.isEmpty() || tipo.length() < 4);
        this.tipo = tipo;
    }

    public Integer getPrecio() {

        return precio;

    }

    public void setPrecio(Integer precio) {
        do {
            System.out.println("Ingrese el precio de venta de la cuenta o valor aproximado");
            precio = sc.nextInt();
            if (precio <= 0){
                System.out.println("el precio ingresado debe ser mayo a 0, repita el proceso");
            }
        }while (precio <= 0);
        this.precio = precio;
        sc.nextLine();
    }

    public String getEmail() {

        return email;
    }
    public void setEmail(String email){
        do {
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            System.out.println("Introduzca el correo vinculado a la cuenta");
            email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (matcher.find() == true){
                System.out.println("Correo ingresado correctamente");
                validacion = true;
            }else{
                System.out.println("Error, correo ingresado invalido, revíselo y vuelva a intentarlo");
            }
        }while (!validacion);
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cuentas cuentas) {
        return this.id.compareTo(cuentas.getId());
    }
}
