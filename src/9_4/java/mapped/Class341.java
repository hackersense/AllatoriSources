package mapped;

import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from hc
public class Class341 {
   // $VF: synthetic field
   public Map field962;
   // $VF: synthetic field
   public final Class496 field963;
   // $VF: synthetic field
   public final Class497 field964;

   // $VF: synthetic method
   public Class571 method607(Class246 var1) {
      Class571 var3;
      if ((var3 = (Class571)this.field962.get(var1)) == null) {// 86 473
         throw new Class242("InstructionContext requested for an InstructionHandle that's not known!");// 131
      } else {
         return var3;// 289
      }
   }

   // $VF: synthetic method
   public Class571[] method608() {
      Class571[] var2 = new Class571[this.field962.values().size()];// 199
      return (Class571[])this.field962.values().toArray(var2);// 512
   }

   // $VF: synthetic method
   public static Class497 method609(Class341 var0) {
      return var0.field964;
   }

   // $VF: synthetic method
   public boolean method610(Class246 var1) {
      return this.field964.method1332(var1) == null;// 311
   }

   // $VF: synthetic method
   public Class571[] method611(Class246[] var1) {
      Class341 var3 = this;
      Class571[] var2 = new Class571[var1.length];// 150

      for (int var10000 = var4 = 0; var10000 < var1.length; var10000 = var4) {// 56
         int var10001 = var4;
         Class571 var10002 = var3.method607(var1[var4]);
         var4++;
         var2[var10001] = var10002;// 416
      }

      return var2;// 427
   }

   // $VF: synthetic method
   public static Class496 method612(Class341 var0) {
      return var0.field963;// 338
   }

   // $VF: synthetic method
   public Class341(Class203 var1) {
      Class341 var5 = this;
      super();
      this.field962 = new HashMap();// 343
      this.field964 = new Class497(var1);// 62 476
      this.field963 = new Class496(var1);// 126
      Class246[] var4 = var1.method42().method39();// 519

      int var2;
      for (int var6 = var2 = 0; var6 < var4.length; var6 = var2) {// 376
         var5.field962.put(var4[var2], new Class570(var5, var4[var2++]));// 492
      }
   }// 155
}
