package Buildings;

import javax.swing.*;
import java.io.File;

public class Quarry extends Building{
    public Quarry() {
        this.cost = 500;
        this.income = 200;
        this.type = "Quarry";
        this.symbol =  "Qu";
        this.icon = new ImageIcon(System.getProperty("user.dir") + File.separator + "buildingIcons" + File.separator + "quarry.png");
    }
}
