# Shopping-Cart-Using-Java

This Java project implements a simple shopping cart system using a custom-built `HashMap` data structure. The cart allows users to add, remove, and view products while calculating the total price of all items in the cart.

## 📁 Project Structure

- `HashMap.java`: Implements a custom hash map to store products and their quantities. It handles operations like put, remove, resize, and calculates total cart value.
- `ShoppingCart.java`: Provides methods for adding, removing, displaying cart contents, and getting the total price.
- `ShoppingCartDriver.java`: Demonstrates how to use the shopping cart system through a main method.

## 📦 Key Features

- ✅ Custom implementation of HashMap using linked list chaining
- 🛒 Add and remove products with quantity tracking
- 💰 Calculate the total price of all products in the cart
- 📈 Automatically resizes the underlying structure as the load increases
- 🖨️ Clean `toString()` overrides for meaningful output

## 📘 Product Class

Each `Product` object contains:
- `id` – Unique identifier
- `name` – Name of the product
- `price` – Price per unit

Equality and hashcode are overridden based on the product ID to ensure correct behavior in the HashMap.

## 🧪 Sample Output

```java
Product ID: 5, Name: airBuds, Price: 25900.0, Quantity: 3
Product ID: 4, Name: iWatchPro, Price: 69900.0, Quantity: 1
Product ID: 3, Name: m3Air, Price: 109900.0, Quantity: 2
Product ID: 2, Name: iPad, Price: 56900.0, Quantity: 1
Product ID: 1, Name: iP16Pro, Price: 69900.0, Quantity: 1
Total Cart Price: 497300.0

## 📚 Concepts Practiced

-Custom data structures in Java
-Hashing and collision handling (chaining)
-Object-oriented programming (OOP) concepts
-Encapsulation and class design

## 🙌 Acknowledgments
This project was built as part of a learning exercise to understand how HashMaps work under the hood and apply them in a practical use-case like a shopping cart.
