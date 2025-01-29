package z1Chef;

public class Chef {
    private Menu menu;

    public Chef(Menu menu) {
        this.menu = menu;
    }

    public void ugotuj(){
        menu.letHimCook();
    }
}

class Main{
    public static void main(String[] args) {
        Chef chefSalad = new Chef(new Salad());
        Chef chefMeat = new Chef(new Meat());

        chefSalad.ugotuj();
        chefMeat.ugotuj();
    }
}
