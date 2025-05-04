package com.allatori.ant;

import com.allatori.commons.ASMStuffs;
import com.allatori.interfaces.unmapped.class_555;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.event.ListSelectionEvent;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class JustIce extends JFrame {
    public String field_210;
    public JPanel field_215;
    public JSplitPane field_225 = new JSplitPane();
    public JPanel field_237 = new JPanel();
    public JPanel field_220 = new JPanel();
    public JSplitPane field_236 = new JSplitPane();
    public JPanel field_222 = new JPanel();
    public JList field_240 = new JList();
    public GridLayout field_213 = new GridLayout();
    public JPanel field_244 = new JPanel();
    public GridLayout field_230 = new GridLayout();
    public JMenuBar field_216 = new JMenuBar();
    public JMenu field_227 = new JMenu();
    public JScrollPane field_214 = new JScrollPane();
    public JScrollPane field_247 = new JScrollPane();
    public JScrollPane field_245 = new JScrollPane();
    public GridLayout field_224 = new GridLayout();
    public JScrollPane field_212 = new JScrollPane();
    public CardLayout field_233 = new CardLayout();
    public String field_226 = "JustIce by Enver Haase";
    public GridLayout field_232 = new GridLayout();
    public JTextPane field_238 = new JTextPane();
    public JTextPane field_217 = new JTextPane();
    public JTextPane field_239 = new JTextPane();
    public JMenuItem field_246 = new JMenuItem();
    public JSplitPane field_242 = new JSplitPane();
    public JSplitPane field_221 = new JSplitPane();
    public JScrollPane field_228 = new JScrollPane();
    public JScrollPane field_229 = new JScrollPane();
    public JScrollPane field_243 = new JScrollPane();
    public JScrollPane field_219 = new JScrollPane();
    public JList field_218 = new JList();
    public JList field_234 = new JList();
    public JTextPane field_223 = new JTextPane();
    public JTextPane field_231 = new JTextPane();
    public JMenu field_235 = new JMenu();
    public JMenuItem field_211 = new JMenuItem();
    public JMenuItem field_241 = new JMenuItem();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void method_400(ListSelectionEvent listSelectionEvent) {
        if (listSelectionEvent.getValueIsAdjusting()) {
            return;
        }
        class_225 method_1574 = class_412.method_1574(this.field_210);
        String str = "";
        int i = 0;
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        while (i < this.field_234.getModel().getSize()) {
            if (this.field_234.isSelectedIndex(i2)) {
                class_275 method_1058 = method_1574.method_1058(i2);
                if (method_1058.method_1212() == 2) {
                    z = false;
                    z2 = true;
                }
                try {
                    str = new StringBuilder().insert(0, str).append("Method '").append(class_474.method_1810(method_1574.method_1062()).method_904()[i2]).append("': ").append(method_1058.method_1213().replace('\n', ' ')).append("\n\n").toString();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            int i3 = i2 + 1;
            i = i3;
            i2 = i3;
        }
        this.field_231.setText(str);
        this.field_231.setBackground(z ? Color.green : z2 ? Color.red : Color.yellow);
    }

    public void method_97() {
        class_225 class_225Var;
        setTitle("PLEASE WAIT");
        class_225 method_1574 = class_412.method_1574(this.field_210);
        method_1574.method_1061();
        class_275 method_1057 = method_1574.method_1057();
        if (method_1057.method_1212() != 2) {
            this.field_238.setBackground(Color.green);
            this.field_238.setText(method_1057.method_1213());
            class_275 method_1059 = method_1574.method_1059();
            if (method_1059.method_1212() == 2) {
                this.field_217.setText(method_1059.method_1213());
                this.field_217.setBackground(Color.red);
                this.field_223.setText("");
                this.field_223.setBackground(Color.yellow);
                this.field_218.setListData(new Object[0]);
                this.field_231.setText("");
                this.field_231.setBackground(Color.yellow);
                this.field_234.setListData(new Object[0]);
                class_225Var = method_1574;
            } else {
                this.field_217.setText(method_1059.method_1213());
                this.field_217.setBackground(Color.green);
                class_440 method_1810 = class_474.method_1810(this.field_210);
                String[] strArr = new String[method_1810.method_904().length];
                int i = 0;
                int i2 = 0;
                while (i < method_1810.method_904().length) {
                    int i3 = i2 + 1;
                    strArr[i2] = method_1810.method_904()[i2].toString().replace('\n', ' ').replace('\t', ' ');
                    i = i3;
                    i2 = i3;
                }
                this.field_218.setListData(strArr);
                this.field_218.setSelectionInterval(0, method_1810.method_904().length - 1);
                this.field_234.setListData(strArr);
                this.field_234.setSelectionInterval(0, method_1810.method_904().length - 1);
                class_225Var = method_1574;
            }
        } else {
            this.field_238.setText(method_1057.method_1213());
            this.field_238.setBackground(Color.red);
            this.field_217.setText("");
            this.field_217.setBackground(Color.yellow);
            this.field_223.setText("");
            this.field_218.setListData(new Object[0]);
            this.field_223.setBackground(Color.yellow);
            this.field_231.setText("");
            this.field_234.setListData(new Object[0]);
            this.field_231.setBackground(Color.yellow);
            class_225Var = method_1574;
        }
        String[] method_1064 = class_225Var.method_1064();
        this.field_239.setBackground(method_1064.length == 0 ? Color.green : Color.yellow);
        int i4 = 0;
        String str = "";
        int i5 = 0;
        while (i4 < method_1064.length) {
            method_1064[i5] = method_1064[i5].replace('\n', ' ');
            int i6 = i5 + 1;
            str = new StringBuilder().insert(0, str).append(method_1064[i5]).append("\n\n").toString();
            i4 = i6;
            i5 = i6;
        }
        this.field_239.setText(str);
        setTitle(this.field_210 + " - " + this.field_226);
    }

    public void method_405(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(this, "JustIce is a Java class file verifier.\nIt was implemented by Enver Haase in 2001, 2002.\n<http://jakarta.apache.org/bcel/index.html>", this.field_226, 1);
    }

    public void method_401() {
        this.field_215 = getContentPane();
        this.field_215.setLayout(this.field_233);
        setJMenuBar(this.field_216);
        setSize(new Dimension(708, 451));
        setTitle("JustIce");
        this.field_237.setMinimumSize(new Dimension(100, 100));
        this.field_237.setPreferredSize(new Dimension(100, 100));
        this.field_237.setLayout(this.field_213);
        this.field_236.setOrientation(0);
        this.field_220.setLayout(this.field_230);
        this.field_222.setMinimumSize(new Dimension(ASMStuffs.field_150, 100));
        this.field_222.setPreferredSize(new Dimension(400, 400));
        this.field_222.setLayout(this.field_224);
        this.field_244.setMinimumSize(new Dimension(100, 100));
        this.field_244.setLayout(this.field_232);
        this.field_220.setMinimumSize(new Dimension(ASMStuffs.field_150, 100));
        this.field_227.setText("File");
        this.field_214.getViewport().setBackground(Color.red);
        this.field_247.getViewport().setBackground(Color.red);
        this.field_247.setPreferredSize(new Dimension(10, 10));
        this.field_240.addListSelectionListener(new class_453(this));
        this.field_240.setSelectionMode(0);
        this.field_245.setBorder(BorderFactory.createLineBorder(Color.black));
        this.field_245.setPreferredSize(new Dimension(100, 100));
        this.field_224.setRows(4);
        this.field_224.setColumns(1);
        this.field_224.setHgap(1);
        this.field_212.setBorder(BorderFactory.createLineBorder(Color.black));
        this.field_212.setPreferredSize(new Dimension(100, 100));
        this.field_238.setBorder(BorderFactory.createRaisedBevelBorder());
        this.field_238.setToolTipText("");
        this.field_238.setEditable(false);
        this.field_217.setBorder(BorderFactory.createRaisedBevelBorder());
        this.field_217.setEditable(false);
        this.field_239.setBorder(BorderFactory.createRaisedBevelBorder());
        this.field_239.setEditable(false);
        this.field_246.setText("New...");
        this.field_246.setAccelerator(KeyStroke.getKeyStroke(78, 2, true));
        this.field_246.addActionListener(new class_330(this));
        this.field_223.setEditable(false);
        this.field_231.setEditable(false);
        this.field_218.addListSelectionListener(new class_393(this));
        this.field_234.addListSelectionListener(new class_509(this));
        this.field_235.setText("Help");
        this.field_211.setText("What is...");
        this.field_211.addActionListener(new class_585(this));
        this.field_241.setText("About");
        this.field_241.addActionListener(new class_234(this));
        this.field_236.add(this.field_244, "bottom");
        this.field_244.add(this.field_247, (Object) null);
        this.field_247.getViewport().add(this.field_239, (Object) null);
        this.field_236.add(this.field_222, "top");
        this.field_222.add(this.field_245, (Object) null);
        this.field_245.getViewport().add(this.field_238, (Object) null);
        this.field_222.add(this.field_212, (Object) null);
        this.field_222.add(this.field_242, (Object) null);
        this.field_242.add(this.field_228, "left");
        this.field_228.getViewport().add(this.field_218, (Object) null);
        this.field_242.add(this.field_229, "right");
        this.field_229.getViewport().add(this.field_223, (Object) null);
        this.field_222.add(this.field_221, (Object) null);
        this.field_221.add(this.field_243, "left");
        this.field_243.getViewport().add(this.field_234, (Object) null);
        this.field_221.add(this.field_219, "right");
        this.field_219.getViewport().add(this.field_231, (Object) null);
        this.field_212.getViewport().add(this.field_217, (Object) null);
        this.field_225.add(this.field_220, "top");
        this.field_220.add(this.field_214, (Object) null);
        this.field_225.add(this.field_237, "bottom");
        this.field_237.add(this.field_236, (Object) null);
        this.field_214.getViewport().add(this.field_240, (Object) null);
        this.field_216.add(this.field_227);
        this.field_216.add(this.field_235);
        this.field_215.add(this.field_225, "jSplitPane1");
        this.field_227.add(this.field_246);
        this.field_235.add(this.field_211);
        this.field_235.add(this.field_241);
        this.field_236.setDividerLocation(300);
        this.field_242.setDividerLocation(class_555.field_2301);
        this.field_221.setDividerLocation(class_555.field_2301);
    }

    public void method_399(ActionEvent actionEvent) {
        String showInputDialog = JOptionPane.showInputDialog("Please enter the fully qualified name of a class or interface to verify:");
        if (showInputDialog == null || showInputDialog.equals("")) {
            return;
        }
        class_412.method_1574(showInputDialog);
        this.field_240.setSelectedValue(showInputDialog, true);
    }

    public void method_404(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(this, "The upper four boxes to the right reflect verification passes according to The Java Virtual Machine Specification.\nThese are (in that order): Pass one, Pass two, Pass three (before data flow analysis), Pass three (data flow analysis).\nThe bottom box to the right shows (warning) messages; warnings do not cause a class to be rejected.", this.field_226, 1);
    }

    public void method_402(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting()) {
            class_225 method_1574 = class_412.method_1574(this.field_210);
            String str = "";
            int i = 0;
            boolean z = true;
            boolean z2 = false;
            int i2 = 0;
            while (i < this.field_218.getModel().getSize()) {
                if (this.field_218.isSelectedIndex(i2)) {
                    class_275 method_1063 = method_1574.method_1063(i2);
                    if (method_1063.method_1212() == 2) {
                        z = false;
                        z2 = true;
                    }
                    try {
                        str = new StringBuilder().insert(0, str).append("Method '").append(class_474.method_1810(method_1574.method_1062()).method_904()[i2]).append("': ").append(method_1063.method_1213().replace('\n', ' ')).append("\n\n").toString();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                int i3 = i2 + 1;
                i = i3;
                i2 = i3;
            }
            this.field_223.setText(str);
            this.field_223.setBackground(z ? Color.green : z2 ? Color.red : Color.yellow);
        }
    }

    public JustIce() {
        enableEvents(64L);
        try {
            method_401();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void method_403(ListSelectionEvent listSelectionEvent) {
        JustIce justIceVar;
        if (listSelectionEvent.getValueIsAdjusting()) {
            return;
        }
        this.field_210 = this.field_240.getSelectedValue().toString();
        try {
            method_97();
            justIceVar = this;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            justIceVar = this;
        }
        justIceVar.field_240.setSelectedValue(this.field_210, true);
    }

    /* renamed from: processWindowEvent */
    public void m7x3d81a9b(WindowEvent windowEvent) {
        super.processWindowEvent(windowEvent);
        if (windowEvent.getID() == 201) {
            System.exit(0);
        }
    }
}
