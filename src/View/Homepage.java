package View;

import javax.swing.*;
import java.awt.*;

public class Homepage extends JLayeredPane{
    private int width, height;
    public Homepage(int width, int height) {
        this.width = width;
        this.height = height;

        this.setBounds(0, 0, this.width + 1000, this.height + 1000);

        set_labels();

    }


    private void set_labels() {
        BackgroundHomepage background_hp = new BackgroundHomepage(this.width, this.height);
        this.add(background_hp, 1, 0);
    }
}
