import java.util.*;
import java.io.*;
public class ForestFire {
    public static void main(String[] args) throws IOExeption {
        ArrayList<Forest> forests = new ArrayList<Forest>();
        Scanner scan = new Scanner(new File("forest.csv"));
        if(scan.hasNextLine()){
            scan.nextLine();
        }
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String type = parts[1];
            String vegitation = parts[2];
            double area_sq_mi = Double.parseDouble(parts[3]);
            double cell_area_sq_mi = Double.parseDouble(parts[4]);
            Integer gridRows = Integer.parseInt(parts[5]);
            Integer gridCols = Integer.parseInt(parts[6]);
            Double burn_rate = Double.parseDouble(parts[7]);
            int initial_tree_count = Integer.parseInt(parts[8]);
            int burn_duration = Integer.parseInt(parts[9]);
            Forest f = new Forest(name, type, vegitation, cell_area_sq_mi, burn_duration, burn_duration, initial_tree_count, burn_duration);
            forests.add(f);

        }

        Forest f = forests.get(0);
        Tree [] [] grid = f.getGrid();
        for(int row = 0; row < grid.length; row++){
            for (int col = 0; col<grid[0].length; col++){
                grid[row][col] = new Tree(Tree.EMPTY);
            }
            System.out.println();
        }


        // Step 1: Read in the data file (forests.csv) and create Forest objects.
        //   - Open the CSV file.
        //   - Skip/read the header row.
        //   - Parse each line into fields and construct a Forest.
        //   - Store forests in an ArrayList: ArrayList<Forest> forests = ...

        // Step 2: Pick one forest to run the simulation.
        //   - Choose by index.
        //   - Start at least one burning tree to begin the fire.

        // Step 3: Run the simulation.
        //   - Repeat spreadFire() for a fixed number of steps (or until fire ends).
        //   - At the end, print percentBurned() and summary stats.
        //   - At the end of each simulation step, you should write the current state of the Tree[][] grid to a file

        // Step 4: We will vibe code our way to visualization

    }

}
