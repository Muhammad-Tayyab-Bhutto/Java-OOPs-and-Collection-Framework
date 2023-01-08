class Animal {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class Dog extends Animal {
    private String name;
    public void setName(String name){
        super.setName(name);
        this.name = super.getName();
    }
    public String getName(){
        return name;
    }
}
class Cat extends Dog {
    private String name;
    public void setName(String name){
        super.setName(name);
        this.name = super.getName();
    }
    public String getName(){
        return name;
    }
}
public class MultiLevelInheritence {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.setName("Animals");
        dog.setName("Sheru");
        cat.setName("Billy");
        System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(cat.getName());

    }
}
