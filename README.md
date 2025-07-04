# JavaDrawingTool
Panda Drawing Tool

A Java-based graphics demo that procedurally places and renders multiple non-overlapping pandas on a drawing surface, now with interactive controls for decoration and population count. Built using Swing/AWT, this project showcases clean object-oriented design, encapsulation, reusable graphics components, and a simple GUI for runtime customization.

Overview
This tool consists of:

Panda – a composite graphic made up of Body, Head, Face (and other parts), each responsible for drawing itself.

LocatedRectangle – an interface defining address(), width() and height(), with a default intersects(...) method for rectangle overlap detection.

Scene – manages a collection of Panda instances, assigns each a unique position, and filters out any that would collide.

DrawingArea – a JPanel subclass that integrates with Swing’s painting cycle, configures the Graphics context, populates the Scene, and draws every Panda at its stored location.

DrawingToolGUI – the entry point that creates the application window, embeds the DrawingArea, and provides interactive controls.

Features
Procedural placement of pandas, guaranteed never to overlap.

Adjustable population: set the number of pandas at runtime via a spinner or slider control.

Accessory decoration: toggle buttons let you add hats, bows, sunglasses or other adornments to each panda.

Encapsulation of drawing logic so each composite part (body, head, face, accessories) has a single responsibility.

Interface-driven collision detection that can be applied to any drawable object.

Clean separation of model (Scene) from view (DrawingArea) in a Swing application.

Getting Started

git clone https://github.com/yourusername/panda-drawing-tool.git
cd panda-drawing-tool

Compile
javac -d out src/drawingTool/*.java

Run
java -cp out drawingTool.DrawingToolGUI

When the window opens, use the provided controls to:

Set “Panda Count”: choose how many pandas to generate.

Toggle Accessories: click buttons (e.g. “Hat”, “Bow”, “Glasses”) to decorate all pandas.

Architecture & Design
Composition over inheritance: Panda is built by composing smaller parts rather than extending a monolithic class.

Interface-driven overlap checks: Any class implementing LocatedRectangle automatically gains intersects(...) without extra math.

Accessory extensibility: Accessories are implemented as additional drawable components that plug into the Panda composite.

Single graphics context: Drawing.set(pen) centralizes the Graphics object so that all parts draw in a consistent style.
