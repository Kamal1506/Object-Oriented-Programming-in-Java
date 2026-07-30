// Composition
// Which is better? Composition or Inheritance?

// Wrong answer:

// Composition.

// Wrong answer:

// Inheritance.

// Correct answer:

// It depends on the relationship.

// If it is IS-A, use inheritance.
// If it is HAS-A, use composition.

class Engine{
  void startEngine(){
    System.out.println("Engine started");
  }
}

class Car{
  Engine e = new Engine();
  void startCar(){
    e.startEngine();
    System.out.println("Car started");
  }
}


// Memory Picture
// Car Object
// │
// ├── Engine Object

// The Car contains an Engine.

// It doesn't become one.
