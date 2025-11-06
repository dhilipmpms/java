class Animal {

String name;

public Animal(String name) {

this.name= name;

System.out.println("Animal constructor called for: "+this.name);

}

public void output() {

System.out.println("This is an animal named: "+ name);

}

}

class Dog extends Animal {

String breed;

public Dog(String name, String breed) {

super(name);

this.breed= breed;

System.out.println("Dog constructor called for: "+this.name+" 

("+this.breed+")");

}

public void output() {

super.output(); 

System.out.println("This is a dog of breed: "+ breed);

}

}

public class Main {

public static void main(String[] args) {

Dog myDog=new Dog("Buddy", "Golden Retriever");

myDog.output();

}

}
