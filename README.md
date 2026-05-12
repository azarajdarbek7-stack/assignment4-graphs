# Assignment 4: Graph Traversal System

## Project Overview
This project implements a graph using an Adjacency List to manage vertices and edges. It features BFS and DFS traversal algorithms to analyze performance across different graph sizes.

## Class Descriptions
* **Vertex**: Represents a node with a unique ID.
* **Edge**: Connects two vertices.
* **Graph**: Stores the Adjacency List and implements BFS/DFS.
* **Experiment**: Measures execution time using `System.nanoTime()`.
* **Main**: Runs the application and generates test graphs.

## Algorithm Analysis
Both BFS and DFS have a time complexity of **O(V + E)**. 
* **BFS** is ideal for finding the shortest path in unweighted graphs.
* **DFS** is useful for cycle detection and pathfinding in deep structures.

## Experimental Results
| Graph Size | BFS Time (ns) | DFS Time (ns) |
| :--- | :--- | :--- |
| 10 vertices | 1,598,900 | 184,100 |
| 30 vertices | 259,700 | 326,600 |
| 100 vertices | 1,017,000 | 794,200 |

## Screenshots
![Structure](structure.png)
![Traversal](traversal.png)
![Performance](performance.png)
## Reflection
I learned how to represent graphs and the practical differences between BFS and DFS. The main challenge was correctly measuring time in nanoseconds for small graphs and ensuring the project structure matches the requirements.
