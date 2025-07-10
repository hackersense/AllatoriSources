package mapped;

import java.io.FilterWriter;
import java.io.Writer;

// $VF: Compiled from mc
public class Class434 extends FilterWriter {
   // $VF: synthetic method
   public void write(char[] var1, int var2, int var3) {
      Class434 var4 = this;

      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 1499
         int var10002 = var2 + var5;
         var5++;
         var4.write(var1[var10002]);// 1651
      }
   }// 1630

   // $VF: synthetic method
   public void write(String var1, int var2, int var3) {
      this.write(var1.toCharArray(), var2, var3);// 1281
   }// 1313

   // $VF: synthetic method
   public Class434(Writer var1) {
      super(var1);// 1387
   }// 1151

   // $VF: synthetic method
   public void write(int var1) {
      if (Class523.method1538((char)var1) && var1 != 36) {// 1124
         this.out.write(var1);// 1070
      } else {
         this.out.write(36);// 1613
         if (var1 >= 0 && var1 < 48) {// 1335
            this.out.write(Class523.field1769[var1]);// 1216
         } else {
            char[] var3;
            if ((var3 = Integer.toHexString(var1).toCharArray()).length == 1) {// 1086 1279
               this.out.write(48);// 1090
               this.out.write(var3[0]);// 1516
            } else {
               this.out.write(var3[0]);// 1587
               this.out.write(var3[1]);// 1300
            }
         }
      }
   }// 1388 1418 1531 1608
}
