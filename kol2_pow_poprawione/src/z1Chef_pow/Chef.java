package z1Chef_pow;

public class Chef {
    private Menu menu;

    public Chef(Menu menu) {
        this.menu = menu;
    }

    public void cook(){
        menu.letHimCook();
    }
}
class Main{
    public static void main(String[] args) {
        Chef chefSalad = new Chef(new Salad());
        Chef chefMeat = new Chef(new Meat());

        chefSalad.cook();
        chefMeat.cook();
    }

}