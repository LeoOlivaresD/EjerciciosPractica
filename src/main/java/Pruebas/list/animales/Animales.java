package Pruebas.list.animales;

public class Animales implements Comparable <Animales> {
    private Integer id;
    private String name;
    private String type;
    private Integer age;

    public Animales(){}

    public Animales(Integer id, String name, String type, Integer age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Animales animales) {
        return this.name.compareTo(animales.getName());
    }
}
