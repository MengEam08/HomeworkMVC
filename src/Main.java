import controller.UserController;
import view.View;

import javax.swing.plaf.ViewportUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        View.UI();
        View.addNewUser();
        View.removeUserById(1);

    }
}
