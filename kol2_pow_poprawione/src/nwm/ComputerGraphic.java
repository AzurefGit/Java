package nwm;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ComputerGraphic {
    int width;
    int height;
    String fileName;

    public ComputerGraphic(int width, int height, String fileName) {
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }

    public abstract void loadFile();
    public abstract void saveFile();

}

class Main{
    public static void main(String[] args) {
        ComputerGraphic cgi1 = new Vector(2,2,"N1");
        ComputerGraphic cgi2 = new Vector(3,4,"N2");
        ComputerGraphic cgi3 = new Bitmap(22,12,"B1");
        ComputerGraphic cgi4 = new Bitmap(52,33,"B2");
        ComputerGraphic cgi5 = new Bitmap(50,55,"B3");

        ArrayList<ComputerGraphic> list = new ArrayList<>();
        list.add(cgi1);
        list.add(cgi2);
        list.add(cgi3);
        list.add(cgi4);
        list.add(cgi5);

        for (ComputerGraphic cGI : list){
            cGI.loadFile();
            cGI.saveFile();
            System.out.println(cGI.fileName);
        }

    }
}
