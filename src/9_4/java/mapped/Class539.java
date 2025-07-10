package mapped;

import java.util.Locale;
import java.util.Vector;

// $VF: Compiled from ux
public class Class539 {
   // $VF: synthetic field
   public final Class543 field1834;
   // $VF: synthetic field
   public Vector field1835;
   // $VF: synthetic field
   public boolean field1836;

   // $VF: synthetic method
   public void method1629(boolean var1) {
      this.field1836 = var1;// 939
   }// 885

   // $VF: synthetic method
   public void method1630(String var1, boolean var2, String var3) {
      String var5 = var1.replaceAll("\\.", "\\\\.").replaceAll("\\*", ".*");// 615 723 798
      this.field1835.add(new Class507(this, var5, var2, var3));// 635
   }// 981

   // $VF: synthetic method
   public boolean method1631() {
      return this.field1836;// 795
   }

   // $VF: synthetic method
   public boolean method1632(String var1) {
      String var4;
      if (!(var4 = var1.toLowerCase(Locale.ENGLISH)).endsWith(".jar")// 700 978
         && !var4.endsWith(".class")
         && !var4.endsWith(".jks")
         && !var4.endsWith(".ttf")
         && !var4.endsWith(".png")
         && !var4.endsWith(".jpg")
         && !var4.endsWith(".jpeg")
         && !var4.endsWith(".gif")
         && !var4.endsWith(".bmp")
         && !var4.endsWith(".svg")
         && !var4.endsWith(".ico")) {
         for (Class507 var3 : this.field1835) {// 620
            if (var1.matches(Class507.method1360(var3))) {// 799
               return Class507.method1359(var3);
            }
         }

         return false;// 876
      } else {
         return false;// 803
      }
   }

   // $VF: synthetic method
   public String method1633(String var1) {
      var1.toLowerCase(Locale.ENGLISH);// 887

      for (Class507 var4 : this.field1835) {// 884
         if (var1.matches(Class507.method1360(var4))) {// 748
            return Class507.method1361(var4);
         }
      }

      return "UTF-8";// 825
   }

   // $VF: synthetic method
   public Class539(Class543 var1) {
      this.field1834 = var1;
      this.field1836 = false;// 648 714
      this.field1835 = new Vector();// 761
   }
}
