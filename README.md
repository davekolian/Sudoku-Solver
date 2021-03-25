# Sudoku-Solver
 Sudoku-Solver is a java program that can solve Sudoku puzzles with the help of the Constraint Satisfaction Problem and the backtracking algorithm.
 
# How does it work?

As mentioned before it uses the backtracking algorithm to find a solution. 

Each cell contains a constraint that limits the numbers that can be placed on a cell. In most sudoku puzzles, the constraints are:
1. A number cannot be placed in a cell if said number is already present in the **current cell's column**.
2. A number cannot be placed in a cell if said number is already present in the **current cell's box** (where a box is a 3x3 grid of cells).
3. A number cannot be placed in a cell if said number is already present in the **current cell's row**.

In the case of the 3x3 diagonal puzzle, there is an additional constraint that is a number cannot be placed in a cell if the cell is in one of the diagonals and the corresponding diagonal contains the mentioned number.

The algorithm iterates through each **empty** cell (the name of the box for **one digit**) from left to right and top to bottom. It would place the first possible 'legal' value in each cell wherein a legal value is a number from 1 to MAX_VALUE (2x2 => 4, 2x3 => 6, 3x3 => 9) that does not break any of the constraints. The algorithm would then 'backtrack' if any of the other cells cannot have a value due to the constraints.

This loop would then run till a solution is found.

# How do I use it?

At the current moment, there is no portable version that can be used without installing any dependencies. However, if you do have technical knowledge then download the jar and batch file from [here](out/artifacts/Sudoku_Solver_jar). Then in the .bat file replace 'C:\JavaFX\javafx-sdk-11.0.2\lib' with the path to your JavaFX lib folder. Then just run the batch file!

# License
[MIT](LICENSE)
