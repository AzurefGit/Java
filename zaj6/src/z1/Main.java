package z1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> computerGraphics = new ArrayList<>();
        computerGraphics.add(new Vector(11, 22, "Plik1"));
        computerGraphics.add(new Vector(11, 22, "Plik2"));
        computerGraphics.add(new Vector(11, 22, "Plik3"));
        computerGraphics.add(new Vector(11, 22, "Plik4"));
        computerGraphics.add(new Vector(11, 22, "Plik5"));

        for(ComputerGraphic cg: computerGraphics){
            cg.loadFile();
            cg.saveFile();
        }

    }
}
