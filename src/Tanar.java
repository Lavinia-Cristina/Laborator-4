

public class Tanar {
    private String name;
    private int age;
    private String address;

    public Tanar(String numenou, int agenou, String adresanoua) {
        this.name = numenou;
        this.age = agenou;
        this.address = adresanoua;
    }

    @Override
    public String toString() {
        return "Tanar{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
