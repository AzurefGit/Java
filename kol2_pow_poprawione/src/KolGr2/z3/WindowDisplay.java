package KolGr2.z3;

public class WindowDisplay {
    Message message;

    public WindowDisplay(Message message) {
        this.message = message;
    }

    public void message(){
        message.showMessage();
    }
}

class TestWindow {
    public static void main(String[] args) {
        WindowDisplay windowDisplay1 = new WindowDisplay(new InfoMessage());
        WindowDisplay windowDisplay2 = new WindowDisplay(new ErrorMessage());

        windowDisplay1.message();
        windowDisplay2.message();
    }
}