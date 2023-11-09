# Rectangle Collision Detection

This Java program demonstrates collision detection between two moving rectangles within a graphical user interface (GUI), mimicking the logo that bounces around as you are playing a DVD.

## How to Run

1. Ensure you have the Java Development Kit (JDK) installed.
2. Compile the Java files: `javac MyRectangle.java RectangleCanvas.java CollisionTester.java`
3. Run the compiled program: `java CollisionTester`
4. The program displays a GUI window showing the collision detection between the moving rectangles.

## Class Overview
### MyRectangle Class
Defines a rectangle with attributes and methods for drawing, position, dimensions, movement, and collision handling.
### RectangleCanvas Class
Extends JComponent, handling rectangle painting, animation, and collision detection within the graphical canvas.
### CollisionTester Class
Contains the main method, creating the GUI window, setting up components, and initiating collision detection animation.
