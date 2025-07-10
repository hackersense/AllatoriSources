package mapped;

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

// $VF: Compiled from xf
public class Class256 extends JFrame {
   // $VF: synthetic field
   public JList field859;
   // $VF: synthetic field
   public JPanel field860;
   // $VF: synthetic field
   public JScrollPane field861;
   // $VF: synthetic field
   public JList field862;
   // $VF: synthetic field
   public JScrollPane field863;
   // $VF: synthetic field
   public JMenuBar field864;
   // $VF: synthetic field
   public String field865;
   // $VF: synthetic field
   public JTextPane field866;
   // $VF: synthetic field
   public JMenuItem field867;
   // $VF: synthetic field
   public JTextPane field868;
   // $VF: synthetic field
   public JPanel field869;
   // $VF: synthetic field
   public JTextPane field870;
   // $VF: synthetic field
   public GridLayout field871;
   // $VF: synthetic field
   public JSplitPane field872;
   // $VF: synthetic field
   public JMenu field873;
   // $VF: synthetic field
   public JTextPane field874;
   // $VF: synthetic field
   public JSplitPane field875;
   // $VF: synthetic field
   public JSplitPane field876;
   // $VF: synthetic field
   public JScrollPane field877;
   // $VF: synthetic field
   public GridLayout field878;
   // $VF: synthetic field
   public JScrollPane field879;
   // $VF: synthetic field
   public JTextPane field880;
   // $VF: synthetic field
   public JScrollPane field881;
   // $VF: synthetic field
   public JPanel field882;
   // $VF: synthetic field
   public JScrollPane field883;
   // $VF: synthetic field
   public GridLayout field884;
   // $VF: synthetic field
   public JSplitPane field885;
   // $VF: synthetic field
   public JMenuItem field886;
   // $VF: synthetic field
   public JScrollPane field887;
   // $VF: synthetic field
   public JPanel field888;
   // $VF: synthetic field
   public JPanel field889;
   // $VF: synthetic field
   public CardLayout field890;
   // $VF: synthetic field
   public JMenuItem field891;
   // $VF: synthetic field
   public JMenu field892;
   // $VF: synthetic field
   public GridLayout field893;
   // $VF: synthetic field
   public JList field894;
   // $VF: synthetic field
   public JScrollPane field895;
   // $VF: synthetic field
   public String field896;

   // $VF: synthetic method
   public void method488(ActionEvent var1) {
      String var2;
      if ((var2 = JOptionPane.showInputDialog("Please enter the fully qualified name of a class or interface to verify:")) != null && !var2.equals("")) {// 168 337
         Class545.method1689(var2);// 65
         this.field859.setSelectedValue(var2, true);// 504
      }
   }// 80 237

   // $VF: synthetic method
   public void method122() {
      this.field869 = (JPanel)this.getContentPane();// 428
      this.field869.setLayout(this.field890);
      this.setJMenuBar(this.field864);// 586
      this.setSize(new Dimension(708, 451));// 399
      this.setTitle("JustIce");// 87 232
      this.field860.setMinimumSize(new Dimension(100, 100));// 463
      this.field860.setPreferredSize(new Dimension(100, 100));// 198
      this.field860.setLayout(this.field884);// 424
      this.field872.setOrientation(0);// 28
      this.field882.setLayout(this.field878);// 588
      this.field888.setMinimumSize(new Dimension(200, 100));// 329
      this.field888.setPreferredSize(new Dimension(400, 400));// 412
      this.field888.setLayout(this.field893);// 38
      this.field889.setMinimumSize(new Dimension(100, 100));// 257
      this.field889.setLayout(this.field871);// 269
      this.field882.setMinimumSize(new Dimension(200, 100));// 455
      this.field873.setText("File");// 148
      this.field881.getViewport().setBackground(Color.red);// 236
      this.field863.getViewport().setBackground(Color.red);// 142
      this.field863.setPreferredSize(new Dimension(10, 10));// 39
      this.field859.addListSelectionListener(new Class385(this));// 368
      this.field859.setSelectionMode(0);// 550
      this.field861.setBorder(BorderFactory.createLineBorder(Color.black));// 510
      this.field861.setPreferredSize(new Dimension(100, 100));// 456
      this.field893.setRows(4);// 367
      this.field893.setColumns(1);// 82
      this.field893.setHgap(1);// 83
      this.field887.setBorder(BorderFactory.createLineBorder(Color.black));// 5
      this.field887.setPreferredSize(new Dimension(100, 100));// 279
      this.field874.setBorder(BorderFactory.createRaisedBevelBorder());// 450
      this.field874.setToolTipText("");// 386
      this.field874.setEditable(false);// 470
      this.field880.setBorder(BorderFactory.createRaisedBevelBorder());// 149
      this.field880.setEditable(false);// 157
      this.field870.setBorder(BorderFactory.createRaisedBevelBorder());// 24
      this.field870.setEditable(false);// 286
      this.field867.setText("New...");// 600
      this.field867.setAccelerator(KeyStroke.getKeyStroke(78, 2, true));// 108
      this.field867.addActionListener(new Class387(this));// 242
      this.field868.setEditable(false);// 464
      this.field866.setEditable(false);// 25
      this.field894.addListSelectionListener(new Class384(this));// 31
      this.field862.addListSelectionListener(new Class383(this));// 440
      this.field892.setText("Help");// 285
      this.field886.setText("What is...");// 119
      this.field886.addActionListener(new Class386(this));// 32
      this.field891.setText("About");// 593
      this.field891.addActionListener(new Class389(this));// 336
      this.field872.add(this.field889, "bottom");// 299
      this.field889.add(this.field863, null);// 314
      this.field863.getViewport().add(this.field870, null);// 137
      this.field872.add(this.field888, "top");// 50
      this.field888.add(this.field861, null);// 253
      this.field861.getViewport().add(this.field874, null);// 135
      this.field888.add(this.field887, null);// 474
      this.field888.add(this.field885, null);// 443
      this.field885.add(this.field879, "left");// 166
      this.field879.getViewport().add(this.field894, null);// 434
      this.field885.add(this.field883, "right");// 292
      this.field883.getViewport().add(this.field868, null);// 373
      this.field888.add(this.field875, null);// 72
      this.field875.add(this.field895, "left");// 268
      this.field895.getViewport().add(this.field862, null);// 497
      this.field875.add(this.field877, "right");// 66
      this.field877.getViewport().add(this.field866, null);// 536
      this.field887.getViewport().add(this.field880, null);// 307
      this.field876.add(this.field882, "top");// 218
      this.field882.add(this.field881, null);// 109
      this.field876.add(this.field860, "bottom");// 213
      this.field860.add(this.field872, null);// 15
      this.field881.getViewport().add(this.field859, null);// 385
      this.field864.add(this.field873);// 471
      this.field864.add(this.field892);// 270
      this.field869.add(this.field876, "jSplitPane1");// 582
      this.field873.add(this.field867);// 177
      this.field892.add(this.field886);// 266
      this.field892.add(this.field891);// 235
      this.field872.setDividerLocation(300);// 280
      this.field885.setDividerLocation(150);// 370
      this.field875.setDividerLocation(150);// 516
   }// 95

   // $VF: synthetic method
   public void processWindowEvent(WindowEvent var1) {
      super.processWindowEvent(var1);// 129
      if (var1.getID() == 201) {// 258
         System.exit(0);// 107
      }
   }// 110

   // $VF: synthetic method
   public void method489(ActionEvent var1) {
      JOptionPane.showMessageDialog(
         this,
         "JustIce is a Java class file verifier.\nIt was implemented by Enver Haase in 2001, 2002.\n<http://jakarta.apache.org/bcel/index.html>",// 560
         this.field865,
         1
      );
   }// 441

   // $VF: synthetic method
   public synchronized void method490(ListSelectionEvent var1) {
      Class256 var2 = this;
      if (!var1.getValueIsAdjusting()) {// 357
         Class576 var10 = Class545.method1689(this.field896);// 4
         String var5 = "";// 122
         boolean var6 = true;// 305
         boolean var4 = false;// 346

         for (int var10000 = var9 = 0; var10000 < var2.field862.getModel().getSize(); var10000 = ++var9) {// 228
            if (var2.field862.isSelectedIndex(var9)) {// 334
               Class581 var3;
               if ((var3 = var10.method1911(var9)).method1942() == 2) {// 13 219
                  var6 = false;// 333
                  var4 = true;// 284
               }

               Class205 var7 = null;// 234

               try {
                  var7 = Class411.method790(var10.method1913());// 517
                  var5 = var5 + "Method '" + var7.method341()[var9] + "': " + var3.method1943().replace('\n', ' ') + "\n\n";// 214
               } catch (ClassNotFoundException var8) {// 371
                  var8.printStackTrace();// 431
               }
            }
         }

         var2.field866.setText(var5);// 374
         var2.field866.setBackground(var6 ? Color.green : (var4 ? Color.red : Color.yellow));// 361
      }
   }// 47 453

   // $VF: synthetic method
   public void method491(ActionEvent var1) {
      JOptionPane.showMessageDialog(
         this,
         "The upper four boxes to the right reflect verification passes according to The Java Virtual Machine Specification.\nThese are (in that order): Pass one, Pass two, Pass three (before data flow analysis), Pass three (data flow analysis).\nThe bottom box to the right shows (warning) messages; warnings do not cause a class to be rejected.",// 326
         this.field865,
         1
      );
   }// 546

   // $VF: synthetic method
   public void method19() {
      this.setTitle("PLEASE WAIT");// 275
      Class576 var5;
      Class576 var10000 = var5 = Class545.method1689(this.field896);// 127
      var10000.method1914();// 355
      Class581 var4;
      if ((var4 = var10000.method1910()).method1942() == 2) {// 215 369
         this.field874.setText(var4.method1943());// 511
         this.field874.setBackground(Color.red);// 382
         this.field880.setText("");// 210
         this.field880.setBackground(Color.yellow);// 576
         this.field868.setText("");// 103
         this.field894.setListData(new Object[0]);// 548
         this.field868.setBackground(Color.yellow);// 545
         this.field866.setText("");// 570
         this.field862.setListData(new Object[0]);// 523
         var10000 = var5;
         this.field866.setBackground(Color.yellow);// 162
      } else {
         this.field874.setBackground(Color.green);// 503
         this.field874.setText(var4.method1943());// 339
         if ((var4 = var5.method1912()).method1942() == 2) {// 308 596
            this.field880.setText(var4.method1943());// 549
            this.field880.setBackground(Color.red);// 499
            this.field868.setText("");// 76
            this.field868.setBackground(Color.yellow);// 145
            this.field894.setListData(new Object[0]);// 390
            this.field866.setText("");// 573
            this.field866.setBackground(Color.yellow);// 520
            this.field862.setListData(new Object[0]);// 502
            var10000 = var5;
         } else {
            this.field880.setText(var4.method1943());// 172
            this.field880.setBackground(Color.green);// 564
            Class205 var6;
            String[] var2 = new String[(var6 = Class411.method790(this.field896)).method341().length];// 48 125

            int var1;
            for (int var12 = var1 = 0; var12 < var6.method341().length; var12 = var1) {// 413
               Class208[] var10002 = var6.method341();
               int var10001 = var1;
               String var15 = var10002[var1].toString().replace('\n', ' ').replace('\t', ' ');
               var1++;
               var2[var10001] = var15;// 320
            }

            this.field894.setListData(var2);// 365
            this.field894.setSelectionInterval(0, var6.method341().length - 1);// 366
            this.field862.setListData(var2);// 263
            this.field862.setSelectionInterval(0, var6.method341().length - 1);// 225
            var10000 = var5;// 426
         }
      }

      String[] var7 = var10000.method1908();
      this.field870.setBackground(var7.length == 0 ? Color.green : Color.yellow);// 11
      String var9 = "";// 356

      int var8;
      for (int var13 = var8 = 0; var13 < var7.length; var13 = var8) {// 522
         var7[var8] = var7[var8].replace('\n', ' ');// 41
         StringBuilder var14 = new StringBuilder().append(var9).append(var7[var8]);// 551
         var8++;
         var9 = var14.append("\n\n").toString();
      }

      this.field870.setText(var9);// 360
      this.setTitle(this.field896 + " - " + this.field865);// 312
   }// 340

   // $VF: synthetic method
   public Class256() {
      Class256 var1 = this;
      super();
      this.field876 = new JSplitPane();
      this.field860 = new JPanel();// 185 406
      this.field882 = new JPanel();// 1
      this.field872 = new JSplitPane();// 46
      this.field888 = new JPanel();// 170
      this.field859 = new JList();// 553
      this.field884 = new GridLayout();// 58
      this.field889 = new JPanel();// 190
      this.field878 = new GridLayout();// 315
      this.field864 = new JMenuBar();// 465
      this.field873 = new JMenu();// 132
      this.field881 = new JScrollPane();// 184
      this.field863 = new JScrollPane();// 534
      this.field861 = new JScrollPane();// 488
      this.field893 = new GridLayout();// 495
      this.field887 = new JScrollPane();// 159
      this.field890 = new CardLayout();// 493
      this.field865 = "JustIce by Enver Haase";// 561
      this.field871 = new GridLayout();// 604
      this.field874 = new JTextPane();// 22
      this.field880 = new JTextPane();// 6
      this.field870 = new JTextPane();// 144
      this.field867 = new JMenuItem();// 461
      this.field885 = new JSplitPane();// 358
      this.field875 = new JSplitPane();// 192
      this.field879 = new JScrollPane();// 574
      this.field883 = new JScrollPane();// 272
      this.field895 = new JScrollPane();// 321
      this.field877 = new JScrollPane();// 179
      this.field894 = new JList();// 146
      this.field862 = new JList();// 567
      this.field868 = new JTextPane();// 400
      this.field866 = new JTextPane();// 33
      this.field892 = new JMenu();// 0
      this.field886 = new JMenuItem();// 240
      this.field891 = new JMenuItem();// 246
      this.enableEvents(64L);// 466 467

      try {
         var1.method122();// 68
      } catch (Exception var2) {// 59
         var2.printStackTrace();// 391
      }
   }// 330 589

   // $VF: synthetic method
   public synchronized void method492(ListSelectionEvent var1) {
      Class256 var2 = this;
      if (!var1.getValueIsAdjusting()) {// 460
         Class576 var10 = Class545.method1689(this.field896);// 183
         String var5 = "";// 205
         boolean var6 = true;// 64
         boolean var4 = false;// 469

         for (int var10000 = var9 = 0; var10000 < var2.field894.getModel().getSize(); var10000 = ++var9) {// 249
            if (var2.field894.isSelectedIndex(var9)) {// 349
               Class581 var3;
               if ((var3 = var10.method1909(var9)).method1942() == 2) {// 164 196
                  var6 = false;// 554
                  var4 = true;// 429
               }

               Class205 var7 = null;// 506

               try {
                  var7 = Class411.method790(var10.method1913());// 318
                  var5 = var5 + "Method '" + var7.method341()[var9] + "': " + var3.method1943().replace('\n', ' ') + "\n\n";// 88
               } catch (ClassNotFoundException var8) {// 8
                  var8.printStackTrace();// 384
               }
            }
         }

         var2.field868.setText(var5);// 363
         var2.field868.setBackground(var6 ? Color.green : (var4 ? Color.red : Color.yellow));// 509
      }
   }// 35 102

   // $VF: synthetic method
   public synchronized void method493(ListSelectionEvent var1) {
      Class256 var4 = this;
      if (!var1.getValueIsAdjusting()) {// 193
         this.field896 = this.field859.getSelectedValue().toString();// 117

         Class256 var5;
         label17: {
            try {
               var4.method19();// 245
            } catch (ClassNotFoundException var2) {// 296
               var5 = this;
               var2.printStackTrace();// 417
               break label17;
            }

            var5 = this;
         }

         var5.field859.setSelectedValue(this.field896, true);// 401
      }
   }// 251 394
}
