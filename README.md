# Software Architecture – Interfaces Exercise

## Description

This exercise demonstrates the use of **interfaces in Java** to design a flexible sorting system.

The goal is to make the `Sorter` class capable of sorting different types of objects, such as `Person` and `Rectangle`, using the same sorting algorithm.

## Classes

### Person
- Stores a `name` and `surname`.
- Prints the person's name and surname.
- Implements `Sortable`.
- Persons are sorted by **surname**, then by **name**.

### Rectangle
- Stores `width` and `height`.
- Calculates its area.
- Implements `Sortable`.
- Rectangles are sorted by **area**.

### Sorter
- Uses the Bubble Sort algorithm.
- Sorts an array of `Sortable` objects.
- Can sort both `Person[]` and `Rectangle[]`.

### Sortable
- Interface that defines the `compareTo()` method.
- Allows different classes to define their own comparison rules.

## Question 6

### a. How are Rectangles sorted?

Rectangles are sorted by their **area**. The `compareTo()` method compares the areas of two rectangles.

### b. What enables Sorter to accept both Persons and Rectangles?

The **`Sortable` interface** enables `Sorter` to work with both `Person` and `Rectangle`. Both classes implement the interface and provide their own `compareTo()` method.

### c. Design

<img width="487" height="316" alt="image" src="https://github.com/user-attachments/assets/2757a203-7883-4dfc-bbde-d906bd12ea17" />
