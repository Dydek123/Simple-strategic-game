package Buildings;

import javax.swing.*;
import java.io.File;

public class Sawmill extends Building{
    public Sawmill() {
        this.cost = 3000;
        this.income = 500;
        this.type = "Sawmill";
        this.symbol =  "SWM";
        this.icon = new ImageIcon(System.getProperty("user.dir") + File.separator + "buildingIcons" + File.separator + "Sawmill.png");
    }
}
