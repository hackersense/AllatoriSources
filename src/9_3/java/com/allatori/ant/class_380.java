package com.allatori.ant;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

// Name: com/allatori/iIIiiiIiIi
// Source: dm
public class class_380 {
    public boolean doNotValidate = false;

    public class_380() {
        JustIce justIceVar = new JustIce();
        if (this.doNotValidate) {
            justIceVar.pack();
        } else {
            justIceVar.validate();
        }
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension size = justIceVar.getSize();
        if (size.height > screenSize.height) {
            size.height = screenSize.height;
        }
        if (size.width > screenSize.width) {
            size.width = screenSize.width;
        }
        justIceVar.setLocation((screenSize.width - size.width) / 2, (screenSize.height - size.height) / 2);
        justIceVar.setVisible(true);
        justIceVar.field_240.setModel(new class_334());
        class_412.method_1574(class_212.field_808.method_464());
        justIceVar.field_240.setSelectedIndex(0);
    }

    // Remapped: method_1500
    public static void main(String[] strArr) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new class_380();
    }
}
