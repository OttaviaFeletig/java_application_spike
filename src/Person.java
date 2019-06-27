public class Person {

    private String name;
    private Boolean glasses;

    public Person(String name, Boolean glasses) {
        this.name = name;
        this.glasses = glasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGlasses() {
        return glasses;
    }

    public void setGlasses(Boolean glasses) {
        this.glasses = glasses;
    }
}
