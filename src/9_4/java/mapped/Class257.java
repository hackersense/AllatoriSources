package mapped;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

// $VF: Compiled from oe
public class Class257 extends JDialog {
   // $VF: synthetic field
   public JButton field897;
   // $VF: synthetic field
   public String field898;
   // $VF: synthetic field
   public Class388 field899;
   // $VF: synthetic field
   public JButton field900;
   // $VF: synthetic field
   public JPanel field901;
   // $VF: synthetic field
   public JButton field902;
   // $VF: synthetic field
   public JPanel field903;
   // $VF: synthetic field
   public JPanel field904 = null;
   // $VF: synthetic field
   public JPanel field905 = null;
   // $VF: synthetic field
   public JButton field906;
   // $VF: synthetic field
   public static int field907;

   // $VF: synthetic method
   public static JButton method494(Class257 var0) {
      return var0.method495();
   }

   // $VF: synthetic method
   public Class257(Dialog var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 198
   }// 424

   // $VF: synthetic method
   public void method122() {
      Class257 var1 = this;

      Class257 var10000;
      label14: {
         try {
            var1.setName("VerifyDialog");
            var1.setDefaultCloseOperation(2);// 262
            var1.setSize(430, 280);// 475
            var1.setVisible(true);// 100
            var1.setModal(true);// 202
            var1.setResizable(false);// 178 250
            var1.setContentPane(var1.method500());// 128
            var1.method19();// 290
         } catch (Throwable var2) {// 199
            var10000 = this;// 512
            this.method507(var2);
            break label14;
         }

         var10000 = this;
      }

      var10000.setTitle("'" + this.field898 + "' verification - JustIce / BCEL");// 176
   }// 124

   // $VF: synthetic method
   public JButton method495() {
      Class257 var1 = this;
      if (this.field902 == null) {// 453
         try {
            var1.field902 = new JButton();// 224
            var1.field902.setName("Pass3Button");// 494
            var1.field902.setText("Passes 3a+3b: Verify code arrays");// 560
            var1.field902.setBackground(SystemColor.controlHighlight);// 174
            var1.field902.setBounds(100, 160, 300, 30);// 71
            var1.field902.setActionCommand("Button2");// 375
         } catch (Throwable var2) {
            this.method507(var2);// 326
            return this.field902;// 521
         }

         return this.field902;
      } else {
         return this.field902;
      }
   }

   // $VF: synthetic method
   public JButton method496() {
      Class257 var1 = this;
      if (this.field906 == null) {// 599
         try {
            var1.field906 = new JButton();// 88
            var1.field906.setName("Pass2Button");// 306
            var1.field906.setText("Pass 2: Verify static .class file constraints");// 8
            var1.field906.setBackground(SystemColor.controlHighlight);// 331
            var1.field906.setBounds(100, 100, 300, 30);// 384
            var1.field906.setActionCommand("Button2");// 130
         } catch (Throwable var2) {
            this.method507(var2);// 233
            return this.field906;// 357
         }

         return this.field906;
      } else {
         return this.field906;
      }
   }

   // $VF: synthetic method
   public Class257() {
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 466
      this.method122();// 467
   }// 485

   // $VF: synthetic method
   public Class257(Dialog var1) {
      super(var1);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 589
   }// 579

   // $VF: synthetic method
   public Class257(String var1) {
      String var3 = var1;
      super();
      this.field904 = null;// 491
      this.field905 = null;// 295
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 209
      int var2;
      if ((var2 = var1.lastIndexOf(".class")) != -1) {// 69 116
         var3 = var1.substring(0, var2);// 422
      }

      String var4 = var3.replace('/', '.');// 25
      this.field898 = var4;// 31
      this.method122();// 21
   }// 115

   // $VF: synthetic method
   public static void method497(Class257 var0, ActionEvent var1) {
      var0.method498(var1);
   }

   // $VF: synthetic method
   public Class257(Dialog var1, boolean var2) {
      super(var1, var2);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 38
   }// 257

   // $VF: synthetic method
   public void method498(ActionEvent var1) {
      ActionEvent var3 = var1;
      Class257 var4 = this;

      try {
         var4.method491(var3);// 216
      } catch (Throwable var2) {// 137
         this.method507(var2);// 135
      }
   }// 443 474

   // $VF: synthetic method
   public static JButton method499(Class257 var0) {
      return var0.method496();
   }

   // $VF: synthetic method
   public static void main(String[] var0) {
      String[] var2 = var0;
      field907 = var0.length;// 480

      int var1;
      for (int var10000 = var1 = 0; var10000 < var2.length; var10000 = ++var1) {// 518
         try {
            Class257 var4 = new Class257(var2[var1]);// 387
            var4.setModal(true);
            var4.addWindowListener(new Class390());// 261
            var4.setVisible(true);// 276 380
         } catch (Throwable var3) {// 167
            System.err.println("Exception occurred in main() of javax.swing.JDialog");// 414
            var3.printStackTrace(System.out);// 12
         }
      }
   }// 462

   // $VF: synthetic method
   public Class257(Frame var1) {
      super(var1);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 142
   }// 39

   // $VF: synthetic method
   public void method19() {
      this.method512().addActionListener(this.field899);// 264
      this.method496().addActionListener(this.field899);// 323
      this.method495().addActionListener(this.field899);// 458
      this.method513().addActionListener(this.field899);// 591
   }// 572

   // $VF: synthetic method
   public Class257(Frame var1, boolean var2) {
      super(var1, var2);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 470
   }// 149

   // $VF: synthetic method
   public JPanel method500() {
      Class257 var1 = this;
      if (this.field904 == null) {// 596
         try {
            var1.field904 = new JPanel();// 499
            var1.field904.setName("JDialogContentPane");// 76
            var1.field904.setLayout(null);// 145
            var1.method500().add(var1.method508(), var1.method508().getName());// 390
            var1.method500().add(var1.method515(), var1.method515().getName());// 573
            var1.method500().add(var1.method511(), var1.method511().getName());// 520
            var1.method500().add(var1.method512(), var1.method512().getName());// 502
            var1.method500().add(var1.method496(), var1.method496().getName());// 188
            var1.method500().add(var1.method495(), var1.method495().getName());// 172
            var1.method500().add(var1.method513(), var1.method513().getName());// 564
         } catch (Throwable var2) {
            this.method507(var2);// 181
            return this.field904;// 413
         }

         return this.field904;
      } else {
         return this.field904;
      }
   }

   // $VF: synthetic method
   public void method501(ActionEvent var1) {
      ActionEvent var3 = var1;
      Class257 var4 = this;

      try {
         var4.method488(var3);// 516
      } catch (Throwable var2) {// 55
         this.method507(var2);// 129
      }
   }// 107 258

   // $VF: synthetic method
   public static int method17() {
      return field907--;
   }

   // $VF: synthetic method
   public static void method502(Class257 var0, ActionEvent var1) {
      var0.method501(var1);
   }

   // $VF: synthetic method
   public static void method503(Class257 var0, ActionEvent var1) {
      var0.method510(var1);
   }

   // $VF: synthetic method
   public void method504(ActionEvent var1) {
      ActionEvent var3 = var1;
      Class257 var4 = this;

      try {
         var4.method505(var3);// 66
      } catch (Throwable var2) {// 218
         this.method507(var2);// 15
      }
   }// 385 471

   // $VF: synthetic method
   public void method505(ActionEvent var1) {
      Class257 var8 = this;
      this.method491(var1);// 9
      Color var7 = Color.green;// 243
      Class576 var4;
      if ((var4 = Class545.method1689(this.field898)).method1912().method1942() == 1) {// 229 531 566
         try {
            int var3 = Class411.method790(var8.field898).method341().length;// 104 309 430

            for (int var2 = 0; var2 < var3; var2++) {// 442
               if (var4.method1911(var2).method1942() != 1) {// 344 345
                  var7 = Color.red;// 449
                  break;// 37
               }
            }
         } catch (ClassNotFoundException var5) {// 195
            var5.printStackTrace();// 577
         }
      } else {
         var7 = Color.yellow;// 75
      }

      this.method515().setBackground(var7);// 111
      this.method515().repaint();// 587
   }// 304

   // $VF: synthetic method
   public static void method506(Class257 var0, ActionEvent var1) {
      var0.method504(var1);
   }

   // $VF: synthetic method
   public void method507(Throwable var1) {
      System.out.println("--------- UNCAUGHT EXCEPTION ---------");// 505
      var1.printStackTrace(System.out);// 421
   }// 583

   // $VF: synthetic method
   public JPanel method508() {
      Class257 var1 = this;
      if (this.field905 == null) {// 65
         try {
            var1.field905 = new JPanel();// 80
            var1.field905.setName("Pass1Panel");// 283
            var1.field905.setLayout(null);// 544
            var1.field905.setBackground(SystemColor.controlShadow);// 114
            var1.field905.setBounds(30, 30, 50, 50);// 460
         } catch (Throwable var2) {
            this.method507(var2);// 469
            return this.field905;// 196
         }

         return this.field905;
      } else {
         return this.field905;
      }
   }

   // $VF: synthetic method
   public static JButton method509(Class257 var0) {
      return var0.method513();
   }

   // $VF: synthetic method
   public Class257(Frame var1, String var2) {
      super(var1, var2);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 63
   }// 541

   // $VF: synthetic method
   public void method510(ActionEvent var1) {
      ActionEvent var3 = var1;
      Class257 var4 = this;

      try {
         var4.method489(var3);// 468
      } catch (Throwable var2) {// 119
         this.method507(var2);// 423
      }
   }// 61 525

   // $VF: synthetic method
   public static int method2() {
      return field907;
   }

   // $VF: synthetic method
   public Class257(Dialog var1, String var2) {
      super(var1, var2);
      this.field901 = null;
      this.field903 = null;
      this.field897 = null;
      this.field906 = null;
      this.field902 = null;
      this.field899 = new Class388(this);
      this.field898 = "java.lang.Object";
      this.field900 = null;// 428
   }// 87

   // $VF: synthetic method
   public void method488(ActionEvent var1) {
      Class545.method1689(this.field898).method1914();// 601
      Class411.method792(this.field898);// 193
      this.method508().setBackground(Color.gray);// 251
      this.method508().repaint();// 486
      this.method511().setBackground(Color.gray);// 117
      this.method511().repaint();// 300
      this.method515().setBackground(Color.gray);// 245
      this.method515().repaint();// 296
   }// 404

   // $VF: synthetic method
   public JPanel method511() {
      Class257 var1 = this;
      if (this.field901 == null) {// 346
         try {
            var1.field901 = new JPanel();// 334
            var1.field901.setName("Pass2Panel");// 219
            var1.field901.setLayout(null);// 13
            var1.field901.setBackground(SystemColor.controlShadow);// 333
            var1.field901.setBounds(30, 90, 50, 50);// 284
         } catch (Throwable var2) {
            this.method507(var2);// 524
            return this.field901;// 431
         }

         return this.field901;
      } else {
         return this.field901;
      }
   }

   // $VF: synthetic method
   public JButton method512() {
      Class257 var1 = this;
      if (this.field897 == null) {// 263
         try {
            var1.field897 = new JButton();// 532
            var1.field897.setName("Pass1Button");// 297
            var1.field897.setText("Pass1: Verify binary layout of .class file");// 426
            var1.field897.setBackground(SystemColor.controlHighlight);// 11
            var1.field897.setBounds(100, 40, 300, 30);// 356
            var1.field897.setActionCommand("Button1");// 522
         } catch (Throwable var2) {
            this.method507(var2);// 340
            return this.field897;// 501
         }

         return this.field897;
      } else {
         return this.field897;
      }
   }

   // $VF: synthetic method
   public void method489(ActionEvent var1) {
      Class581 var2;
      if ((var2 = Class545.method1689(this.field898).method1910()).method1942() == 1) {// 254 539 594
         this.method508().setBackground(Color.green);// 388
         this.method508().repaint();// 120
      }

      if (var2.method1942() == 2) {// 479
         this.method508().setBackground(Color.red);// 347
         this.method508().repaint();// 298
      }
   }// 439

   // $VF: synthetic method
   public void method491(ActionEvent var1) {
      this.method489(var1);// 425
      Class581 var3;
      if ((var3 = Class545.method1689(this.field898).method1912()).method1942() == 1) {// 327 383 527
         this.method511().setBackground(Color.green);// 197
         this.method511().repaint();// 140
      }

      if (var3.method1942() == 0) {// 49
         this.method511().setBackground(Color.yellow);// 565
         this.method511().repaint();// 173
      }

      if (var3.method1942() == 2) {// 101
         this.method511().setBackground(Color.red);// 489
         this.method511().repaint();// 562
      }
   }// 247

   // $VF: synthetic method
   public JButton method513() {
      Class257 var1 = this;
      if (this.field900 == null) {// 556
         try {
            var1.field900 = new JButton();// 207
            var1.field900.setName("FlushButton");// 275
            var1.field900.setText("Flush: Forget old verification results");// 127
            var1.field900.setBackground(SystemColor.controlHighlight);// 355
            var1.field900.setBounds(60, 215, 300, 30);// 496
            var1.field900.setForeground(Color.red);// 369
            var1.field900.setActionCommand("FlushButton");// 215
         } catch (Throwable var2) {
            this.method507(var2);// 548
            return this.field900;// 523
         }

         return this.field900;
      } else {
         return this.field900;
      }
   }

   // $VF: synthetic method
   public Class257(Frame var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.field901 = null;// 273
      this.field903 = null;// 141
      this.field897 = null;// 226
      this.field906 = null;// 78
      this.field902 = null;// 533
      this.field899 = new Class388(this);// 406
      this.field898 = "java.lang.Object";// 190
      this.field900 = null;// 82 240
   }// 83

   // $VF: synthetic method
   public static JButton method514(Class257 var0) {
      return var0.method512();// 93
   }

   // $VF: synthetic method
   public JPanel method515() {
      Class257 var1 = this;
      if (this.field903 == null) {// 325
         try {
            var1.field903 = new JPanel();// 571
            var1.field903.setName("Pass3Panel");// 44
            var1.field903.setLayout(null);// 362
            var1.field903.setBackground(SystemColor.controlShadow);// 476
            var1.field903.setBounds(30, 150, 50, 50);// 542
         } catch (Throwable var2) {
            this.method507(var2);// 126
            return this.field903;// 376
         }

         return this.field903;
      } else {
         return this.field903;
      }
   }
}
