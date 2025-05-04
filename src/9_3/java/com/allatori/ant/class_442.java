package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_442 extends JDialog {
    public static int field_1734;
    public JButton field_1725;
    public class_475 field_1726;
    public JButton field_1727;
    public JPanel field_1728;
    public JPanel field_1729;
    public String field_1730;
    public JButton field_1731;
    public JButton field_1732;
    public JPanel field_1733;
    public JPanel field_1735;

    public class_442(Frame frame, boolean z) {
        super(frame, z);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public void method_399(ActionEvent actionEvent) {
        try {
            method_1650(actionEvent);
        } catch (Throwable th) {
            method_1649(th);
        }
    }

    public class_442(String str) {
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
        int lastIndexOf = str.lastIndexOf(".class");
        this.field_1730 = (lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str).replace('/', '.');
        method_97();
    }

    public class_442(Frame frame) {
        super(frame);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public class_442(Dialog dialog, String str) {
        super(dialog, str);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public class_442(Frame frame, String str) {
        super(frame, str);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public JPanel method_1663() {
        if (this.field_1735 == null) {
            try {
                this.field_1735 = new JPanel();
                this.field_1735.setName("Pass3Panel");
                this.field_1735.setLayout((LayoutManager) null);
                this.field_1735.setBackground(SystemColor.controlShadow);
                this.field_1735.setBounds(30, class_555.field_2301, 50, 50);
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1735;
    }

    public void method_1647(ActionEvent actionEvent) {
        try {
            method_1655(actionEvent);
        } catch (Throwable th) {
            method_1649(th);
        }
    }

    public class_442(Dialog dialog, boolean z) {
        super(dialog, z);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public void method_401() {
        method_1654().addActionListener(this.field_1726);
        method_1664().addActionListener(this.field_1726);
        method_1659().addActionListener(this.field_1726);
        method_1657().addActionListener(this.field_1726);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JPanel method_1656() {
        if (this.field_1733 == null) {
            try {
                this.field_1733 = new JPanel();
                this.field_1733.setName("Pass2Panel");
                this.field_1733.setLayout((LayoutManager) null);
                this.field_1733.setBackground(SystemColor.controlShadow);
                this.field_1733.setBounds(30, 90, 50, 50);
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1733;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r0 = java.awt.Color.red;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void method_1650(ActionEvent actionEvent) {
        method_1655(actionEvent);
        Color color = Color.green;
        class_225 method_1574 = class_412.method_1574(this.field_1730);
        if (method_1574.method_1059().method_1212() != 1) {
            color = Color.yellow;
        } else {
            try {
                int length = class_474.method_1810(this.field_1730).method_904().length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (method_1574.method_1058(i).method_1212() != 1) {
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        method_1663().setBackground(color);
        method_1663().repaint();
    }

    public class_442(Frame frame, String str, boolean z) {
        super(frame, str, z);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public class_442(Dialog dialog) {
        super(dialog);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public void method_1655(ActionEvent actionEvent) {
        method_1653(actionEvent);
        class_275 method_1059 = class_412.method_1574(this.field_1730).method_1059();
        if (method_1059.method_1212() == 1) {
            method_1656().setBackground(Color.green);
            method_1656().repaint();
        }
        if (method_1059.method_1212() == 0) {
            method_1656().setBackground(Color.yellow);
            method_1656().repaint();
        }
        if (method_1059.method_1212() == 2) {
            method_1656().setBackground(Color.red);
            method_1656().repaint();
        }
    }

    public void method_1643(ActionEvent actionEvent) {
        class_412.method_1574(this.field_1730).method_1061();
        class_474.method_1820(this.field_1730);
        method_1660().setBackground(Color.gray);
        method_1660().repaint();
        method_1656().setBackground(Color.gray);
        method_1656().repaint();
        method_1663().setBackground(Color.gray);
        method_1663().repaint();
    }

    public JButton method_1654() {
        if (this.field_1731 == null) {
            try {
                this.field_1731 = new JButton();
                this.field_1731.setName("Pass1Button");
                this.field_1731.setText("Pass1: Verify binary layout of .class file");
                this.field_1731.setBackground(SystemColor.controlHighlight);
                this.field_1731.setBounds(100, 40, 300, 30);
                this.field_1731.setActionCommand("Button1");
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1731;
    }

    public static JButton method_1642(class_442 class_442Var) {
        return class_442Var.method_1664();
    }

    public static void method_1644(class_442 class_442Var, ActionEvent actionEvent) {
        class_442Var.method_404(actionEvent);
    }

    public static JButton method_1645(class_442 class_442Var) {
        return class_442Var.method_1657();
    }

    public static JButton method_1646(class_442 class_442Var) {
        return class_442Var.method_1659();
    }

    public static JButton method_1648(class_442 class_442Var) {
        return class_442Var.method_1654();
    }

    public static void method_1652(class_442 class_442Var, ActionEvent actionEvent) {
        class_442Var.method_1647(actionEvent);
    }

    public static void method_1658(class_442 class_442Var, ActionEvent actionEvent) {
        class_442Var.method_405(actionEvent);
    }

    public static void method_1662(class_442 class_442Var, ActionEvent actionEvent) {
        class_442Var.method_399(actionEvent);
    }

    public static int method_433() {
        return field_1734;
    }

    public static int method_47() {
        int i = field_1734;
        field_1734 = i - 1;
        return i;
    }

    public class_442(Dialog dialog, String str, boolean z) {
        super(dialog, str, z);
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
    }

    public void method_1653(ActionEvent actionEvent) {
        class_275 method_1057 = class_412.method_1574(this.field_1730).method_1057();
        if (method_1057.method_1212() == 1) {
            method_1660().setBackground(Color.green);
            method_1660().repaint();
        }
        if (method_1057.method_1212() == 2) {
            method_1660().setBackground(Color.red);
            method_1660().repaint();
        }
    }

    public class_442() {
        this.field_1729 = null;
        this.field_1728 = null;
        this.field_1733 = null;
        this.field_1735 = null;
        this.field_1731 = null;
        this.field_1732 = null;
        this.field_1725 = null;
        this.field_1726 = new class_475(this);
        this.field_1730 = "java.lang.Object";
        this.field_1727 = null;
        method_97();
    }

    public void method_405(ActionEvent actionEvent) {
        try {
            method_1643(actionEvent);
        } catch (Throwable th) {
            method_1649(th);
        }
    }

    public void method_404(ActionEvent actionEvent) {
        try {
            method_1653(actionEvent);
        } catch (Throwable th) {
            method_1649(th);
        }
    }

    public JPanel method_1651() {
        if (this.field_1729 == null) {
            try {
                this.field_1729 = new JPanel();
                this.field_1729.setName("JDialogContentPane");
                this.field_1729.setLayout((LayoutManager) null);
                method_1651().add(method_1660(), method_1660().getName());
                method_1651().add(method_1663(), method_1663().getName());
                method_1651().add(method_1656(), method_1656().getName());
                method_1651().add(method_1654(), method_1654().getName());
                method_1651().add(method_1664(), method_1664().getName());
                method_1651().add(method_1659(), method_1659().getName());
                method_1651().add(method_1657(), method_1657().getName());
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1729;
    }

    public void method_97() {
        class_442 class_442Var;
        try {
            setName("VerifyDialog");
            setDefaultCloseOperation(2);
            setSize(430, 280);
            setVisible(true);
            setModal(true);
            setResizable(false);
            setContentPane(method_1651());
            method_401();
            class_442Var = this;
        } catch (Throwable th) {
            method_1649(th);
            class_442Var = this;
        }
        class_442Var.setTitle(new StringBuilder().insert(0, "'").append(this.field_1730).append("' verification - JustIce / BCEL").toString());
    }

    public JButton method_1664() {
        if (this.field_1732 == null) {
            try {
                this.field_1732 = new JButton();
                this.field_1732.setName("Pass2Button");
                this.field_1732.setText("Pass 2: Verify static .class file constraints");
                this.field_1732.setBackground(SystemColor.controlHighlight);
                this.field_1732.setBounds(100, 100, 300, 30);
                this.field_1732.setActionCommand("Button2");
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1732;
    }

    public JButton method_1657() {
        if (this.field_1727 == null) {
            try {
                this.field_1727 = new JButton();
                this.field_1727.setName("FlushButton");
                this.field_1727.setText("Flush: Forget old verification results");
                this.field_1727.setBackground(SystemColor.controlHighlight);
                this.field_1727.setBounds(60, ASMStuffs.field_121, 300, 30);
                this.field_1727.setForeground(Color.red);
                this.field_1727.setActionCommand("FlushButton");
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1727;
    }

    public void method_1649(Throwable th) {
        System.out.println("--------- UNCAUGHT EXCEPTION ---------");
        th.printStackTrace(System.out);
    }

    /* JADX DEBUG: Move duplicate insns, count: 2 to block B:2:0x0006 */
    public static void method_1661(String[] strArr) {
        field_1734 = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < strArr.length) {
                try {
                    class_442 class_442Var = new class_442(strArr[i2]);
                    class_442Var.setModal(true);
                    class_442Var.addWindowListener(new class_609());
                    class_442Var.setVisible(true);
                } catch (Throwable th) {
                    System.err.println("Exception occurred in main() of javax.swing.JDialog");
                    th.printStackTrace(System.out);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public JPanel method_1660() {
        if (this.field_1728 == null) {
            try {
                this.field_1728 = new JPanel();
                this.field_1728.setName("Pass1Panel");
                this.field_1728.setLayout((LayoutManager) null);
                this.field_1728.setBackground(SystemColor.controlShadow);
                this.field_1728.setBounds(30, 30, 50, 50);
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1728;
    }

    public JButton method_1659() {
        if (this.field_1725 == null) {
            try {
                this.field_1725 = new JButton();
                this.field_1725.setName("Pass3Button");
                this.field_1725.setText("Passes 3a+3b: Verify code arrays");
                this.field_1725.setBackground(SystemColor.controlHighlight);
                this.field_1725.setBounds(100, class_555.field_2273, 300, 30);
                this.field_1725.setActionCommand("Button2");
            } catch (Throwable th) {
                method_1649(th);
            }
        }
        return this.field_1725;
    }
}
