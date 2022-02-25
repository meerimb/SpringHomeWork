package peaksoft.model;

public class Cat implements Animal{

    private String name;
    private int age;
    private String breed;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("Cat " +name+" is plused");
    }

    @Override
    public void animalMinus() {
        System.out.println("Cat "+name+"  is minused");
    }
}
