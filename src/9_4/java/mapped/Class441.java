package mapped;

import java.io.FilterReader;
import java.io.Reader;

// $VF: Compiled from mc
public class Class441 extends FilterReader {
   // $VF: synthetic method
   public int read(char[] var1, int var2, int var3) {
      Class441 var4 = this;

      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 1226
         int var10001 = var2 + var5;
         char var10002 = (char)var4.read();
         var5++;
         var1[var10001] = var10002;// 1046
      }

      return var3;// 1425
   }

   // $VF: synthetic method
   public int read() {
      int var3;
      if ((var3 = this.in.read()) != 36) {// 1109 1543
         return var3;// 1021
      } else {
         int var4;
         if ((var4 = this.in.read()) < 0) {// 1307 1334
            return -1;// 1344
         } else if (var4 >= 48 && var4 <= 57 || var4 >= 97 && var4 <= 102) {// 1555
            int var2;
            if ((var2 = this.in.read()) < 0) {// 1020 1421
               return -1;// 1207
            } else {
               char[] var5 = new char[]{(char)var4, (char)var2};// 1127
               return Integer.parseInt(new String(var5), 16);// 1277 1406
            }
         } else {
            return Class523.field1768[var4];// 1295
         }
      }
   }

   // $VF: synthetic method
   public Class441(Reader var1) {
      super(var1);// 1598
   }// 1088
}
