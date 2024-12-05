package c1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WorkTool> workTools = new ArrayList<>();
        workTools.add(new Hammer("Młotek", 2023));
        workTools.add(new Screwdriver("śrubokręt krzyżak", 2024));
        workTools.add(new Screwdriver("śrubokręt płaski", 2024));
        workTools.add(new Saw("Piła", 2024));
        workTools.add(new Saw("Piła", 2024));

        for(WorkTool wt:workTools){
            wt.use();
        }
        WorkTool narzedzie = new Hammer("młot", 2020);
        WorkTool lyzka = new Hammer("łyżka", 1901){
            @Override
            public void use(){
                System.out.println("Nałożona zupę na łyzkę");
            }
        }; //klasa anonimowa
        System.out.println(lyzka);
    }
}
