class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MyAnimal {
  public static void main(String[] args) {
    Animal myAni = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
    Dog mySecDog = new Dog(); // 可以看到語法上這樣也能過 , 所以多型只是一種概念 , 並非強制性的
    myAni.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    mySecDog.animalSound();
  }
}