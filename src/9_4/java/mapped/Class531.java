package mapped;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

// $VF: Compiled from ff
public class Class531 {
   // $VF: synthetic field
   public boolean field1788 = false;

   // $VF: synthetic method
   public static void main(String[] var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());// 488
      } catch (Exception var2) {// 495
         var2.printStackTrace();// 159
      }

      new Class531();
   }// 377

   // $VF: synthetic method
   public Class531() {
      Class256 var1 = new Class256();// 93
      if (this.field1788) {// 491 513
         var1.pack();// 147
      } else {
         var1.validate();// 338
      }

      Dimension var4 = Toolkit.getDefaultToolkit().getScreenSize();// 141
      Dimension var3;
      if ((var3 = var1.getSize()).height > var4.height) {// 226 580
         var3.height = var4.height;// 123
      }

      if (var3.width > var4.width) {// 418
         var3.width = var4.width;// 533
      }

      var1.setLocation((var4.width - var3.width) / 2, (var4.height - var3.height) / 2);
      var1.setVisible(true);// 46
      var1.field859.setModel(new Class486());// 170 406
      Class545.method1689(Class138.field583.method93());// 553
      var1.field859.setSelectedIndex(0);// 58
   }// 190
}
