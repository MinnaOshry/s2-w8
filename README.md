# Forest Fire Simulation Lab

## Overview
This project simulates the spread of fire through a forest using a two-dimensional array. You will use object-oriented programming to model trees and forests, and run experiments to see how different factors affect fire spread.

## Files
- `Tree.java`: Class representing a single tree (with state and burn time).
- `Forest.java`: Class representing a forest, its metadata, and the grid of trees.
- `ForestFire.java`: **Starter code** for the simulation logic. Complete the stubbed methods.
- `forests.csv`: Sample data file with real-world forest metadata.

## Instructions
1. **Read the Problem:**
   - You will simulate a forest fire on a 2D grid. Each cell is a `Tree` that can be empty, a tree, or burning.
   - The fire spreads to adjacent trees with a certain probability (`burn_rate`).
   - Each burning tree burns for a set number of steps (`burn_duration`) before becoming empty.

2. **Understand the Classes:**
   - `Tree`: Has a state (EMPTY, TREE, BURNING) and burn time. Use private fields and accessors.
   - `Forest`: Stores metadata (name, type, vegetation, burn_rate, ignition_chance, initial_tree_count, burn_duration) and a 2D array of `Tree` objects.

3. **Complete the Simulation Logic:**
   - In `Forest.java`, complete the following methods:
     - `deepCopy()`: Deep copy a 2D array of trees.
     - `spreadFire()`: Simulate one step of fire spread.
     - `initializeForest()`: Fill a grid with trees at the given density.
     - `percentBurned()`: Calculate the percent of trees burned.

4. **Use the Data File:**
   - `forests.csv` contains 11 major world forests with real-world area data. Each row: `name,type,vegetation,area_sq_mi,cell_area_sq_mi,grid_rows,grid_cols,burn_rate,initial_tree_count,burn_duration`
   - In this dataset, `cell_area_sq_mi` is set to `100` (so one cell is **100 square miles**, not 1 square mile).
   - Example rows:
     ```csv
     name,type,vegetation,area_sq_mi,cell_area_sq_mi,grid_rows,grid_cols,burn_rate,initial_tree_count,burn_duration
     Daintree Rainforest,Tropical Rainforest,Broadleaf,463,100,3,3,0.2,40000,1
     Black Forest,Temperate,Coniferous,2320,100,5,5,0.7,500000,3
     Amazon Rainforest,Tropical Rainforest,Broadleaf,2100000,100,145,145,0.4,5000000,2
     Siberian Taiga,Boreal,Coniferous,3863000,100,197,197,0.85,8500000,5
     ```
   - You may write code to load this data and use it to configure your simulation.

   **Dataset Details:**
   
   The 11 forests in the dataset represent a range of sizes and fire dangers:
   
   | Forest | Location | Size (sq mi) | Grid | Burn Rate | Danger |
   |--------|----------|------------|------|-----------|--------|
   | Daintree Rainforest | Australia | 463 | 3×3 | 0.2 | Very Low |
   | Black Forest | Germany | 2,320 | 5×5 | 0.7 | High |
   | Tongass National Forest | Alaska | 26,096 | 16×16 | 0.4 | Medium |
   | Great Western Woodlands | Australia | 61,776 | 25×25 | 0.8 | Very High |
   | Chocó Rainforest | Colombia/Ecuador | 63,800 | 25×25 | 0.3 | Low |
   | Valdivian Temperate Rainforest | Chile | 95,700 | 31×31 | 0.45 | Medium |
   | Southeast Asian Rainforests | Borneo | 127,000 | 36×36 | 0.25 | Low |
   | Amazon Rainforest | South America | 2,100,000 | 145×145 | 0.4 | Medium |
   | Canadian Boreal Forest | Canada | 2,116,000 | 146×146 | 0.8 | Very High |
   | Congo Rainforest | Central Africa | 772,200 | 88×88 | 0.3 | Low |
   | Siberian Taiga | Russia | 3,863,000 | 197×197 | 0.85 | Extreme |

   **Dataset Notes:**
   - `cell_area_sq_mi = 100`: Each cell represents 100 square miles (chosen for computational reasonableness).
   - Grid dimensions computed from real area: `grid_size ≈ √(area_sq_mi / 100)`, rounded to integers.
   - Burn rates calibrated by forest type: Rainforests (0.2–0.4), Temperate (0.45–0.7), Boreal (0.8–0.85).
   - Initial tree counts and burn duration reflect ecosystem fire characteristics.
   - Grids range from classroom-friendly 3×3 (Daintree) to massive 197×197 (Siberian Taiga) for research-scale experiments.


5. **Experiment:**
   - Try different grid sizes, densities, and burn rates.
   - Visualize the grid (optional: print to console or use a GUI).
   - Analyze how changing parameters affects the outcome.
