# Java Polymorphism and Interfaces Demo
This project is a complete Java application designed to demonstrate the principles of Polymorphism and Interface-based Design

## Overview
**Interface** (`Pet`): Defines a blueprint with contract methods (`eat`, `playToy`) and demonstrates compile-time polymorphism through method overloading.

**Concrete Classes** (`Cat` & `Dog`): Implement the `Pet` interface, overriding the methods to provide species-specific behaviors (runtime polymorphism) while delegating parameterless calls to overloaded parameterized methods.

**Driver Class** (`PolymorphismSample`): Uses an interactive `Scanner` prompt to instantiate either a `Cat` or `Dog` into a generic `Pet` reference variable. It calls `pet.eat()` and `pet.playToy()`, allowing Java's dynamic method dispatch to automatically execute the correct implementation based on the user's choice.
## Key Concepts
**Runtime Polymorphism (Method Overriding / Dynamic Method Dispatch):**
- Declaring a single interface variable (`Pet pet;`) and assigning it a specific instance at runtime (`pet = new Cat();` or `pet = new Dog();`). When you call `pet.eat()`, Java automatically determines at runtime whether to invoke `Cat's eat()` or `Dog's eat()`.

**Compile-Time Polymorphism (Method Overloading):**
- Having multiple methods with the same name but different parameters (e.g., `eat()` vs. `eat(String food)`). Java knows which method to call at compile time based on the arguments you pass.
## Tool and Technologies
- Eclipse IDE for Java Developers 2026-06
- Java

## Objective
**1:** Master Core OOP Concepts: Provide a clean, practical implementation of Interfaces, Method Overloading, Method Overriding, and Polymorphism.

**2:** Achieve Decoupling: Demonstrate how using an interface reference (Pet pet) decouples execution logic from specific class types, eliminating the need for repeating conditional checks throughout the code.

**3:** Dynamic Execution: Illustrate how an object's behavior can be decided dynamically at runtime based on user interaction while maintaining uniform code execution.

## Author
**Ai Sugita**

Software development & Cyber Security

