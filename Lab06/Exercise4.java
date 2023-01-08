abstract class Animal {
    String name;
    int age;
    char gender;

    Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    abstract void ProduceSound();
}

class Dog extends Animal {
    static int totalNumberOfDogs = 0;
    static int averageAge = 0;

    Dog(String name, int age, char gender) {
        super(name, age, gender);
        totalNumberOfDogs++;
        averageAge += age;
    }

    void ProduceSound() {
        System.out.println("Bow Wow");
    }

    void averageAgeOfDogs() {
        System.out.println("Average Age Of Dogs. " + (averageAge / totalNumberOfDogs));
    }
}

class Frog extends Animal {
    static int totalNumberOfFrogs = 0;
    static int averageAge = 0;

    Frog(String name, int age, char gender) {
        super(name, age, gender);
        totalNumberOfFrogs++;
        averageAge += age;
    }

    void ProduceSound() {
        System.out.println("Tan Tan");
    }

    void averageAgeOfFrogs() {
        System.out.println("Average Age Of Frogs. " + (averageAge / totalNumberOfFrogs));
    }
}

class Kitten extends Animal {
    static int totalNumberOfKittens = 0;
    static int averageAge = 0;

    Kitten(String name, int age, char gender) {
        super(name, age, gender);
        totalNumberOfKittens++;
        averageAge += age;
    }

    void ProduceSound() {
        System.out.println("Meaaoon");
    }

    void averageAgeOfKittens() {
        System.out.println("Average Age Of Kittens. " + (averageAge / totalNumberOfKittens));
    }
}

class Tomcat extends Animal {
    static int totalNumberOfTomcat = 0;
    static int averageAge = 0;

    Tomcat(String name, int age, char gender) {
        super(name, age, gender);
        totalNumberOfTomcat++;
        averageAge += age;
    }

    void ProduceSound() {
        System.out.println("Meaaoon");
    }

    void averageAgeOfKittens() {
        System.out.println("Average Age Of Tomcat. " + (averageAge / totalNumberOfTomcat));
    }
}

public class Exercise4 {
    public static void main(String[] args) {

        Dog dog[] = new Dog[10];
        Frog frog[] = new Frog[10];
        Kitten kitte[] = new Kitten[10];
        Tomcat[] tomcat = new Tomcat[10];
        dog[0] = new Dog("Puppy", 7, 'm');
        dog[1] = new Dog("Tiger", 3, 'm');
        dog[2] = new Dog("Sheru", 5, 'm');
        frog[0] = new Frog("Assian", 1, 'm');
        frog[1] = new Frog("South Indian", 2, 'f');
        frog[2] = new Frog("Western", 1, 'm');
        dog[0].ProduceSound();
        frog[1].ProduceSound();
        
        dog[2].averageAgeOfDogs();
        frog[2].averageAgeOfFrogs();
    
    }
}
