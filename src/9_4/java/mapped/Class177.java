package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// $VF: Compiled from ai
public final class Class177 extends Class151 {
   // $VF: synthetic field
   public String field662;
   // $VF: synthetic field
   public byte[] field663;
   // $VF: synthetic field
   public static Map field664 = new HashMap();

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      if (this.field662 > 0) {// 99 368
         var1.write(this.field663, 0, this.field662);// 160
      }
   }// 63

   // $VF: synthetic method
   @Override
   public final String method20() {
      return this.field662;// 24
   }

   // $VF: synthetic method
   public final byte[] method207() {
      return this.field663;// 83
   }

   // $VF: synthetic method
   public static Class177[] method220() {
      Class177[] var0 = new Class177[field664.size()];// 185
      Iterator var1 = field664.values().iterator();// 406
      int var2 = 0;

      for (Iterator var10000 = var1; var10000.hasNext(); var10000 = var1) {// 1
         int var10001 = var2;
         Class177 var10002 = (Class177)var1.next();
         var2++;
         var0[var10001] = var10002;// 46
      }

      field664.clear();// 553
      return var0;// 58
   }

   // $VF: synthetic method
   public Class177(Class177 var1) {
      this(var1.method17(), var1.method2(), var1.method207(), var1.method94());// 159
   }// 493

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1001(this);// 588
   }// 329

   // $VF: synthetic method
   public Class177(int var1, int var2, byte[] var3, Class149 var4) {
      super((byte)-1, var1, var2, var4);
      this.field663 = var3;// 179
      this.field662 = ((Class191)var4.method171(var1, (byte)1)).method20();// 146 321
      field664.put(this.field662, this);// 400
   }// 33

   // $VF: synthetic method
   public final void method202(byte[] var1) {
      this.field663 = var1;// 69
   }// 116

   // $VF: synthetic method
   public Class177(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, (byte[])null, var4);// 330
      if (var2 > 0) {// 579 589
         this.field663 = new byte[var2];
         var3.readFully(this.field663);// 555
      }
   }// 415

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      this = (Class177)this.clone();// 540
      if (this.field663 != null) {// 291
         this.field663 = new byte[this.field663.length];// 57
         System.arraycopy(this.field663, 0, this.field663, 0, this.field663.length);// 169
      }

      this.field616 = var1;// 299
      return this;// 314
   }
}
