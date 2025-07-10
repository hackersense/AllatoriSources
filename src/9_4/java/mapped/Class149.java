package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from lh
public class Class149 implements Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public Class178[] field612;
   // $VF: synthetic field
   public int field613;

   // $VF: synthetic method
   public Class178 method171(int var1, byte var2) {
      Class178 var4;
      if ((var4 = this.method174(var1)) == null) {// 81 417
         throw new Class239("Constant pool at index " + var1 + " is null.");// 401
      } else if (var4.method142() != var2) {// 556
         throw new Class239("Expected class `" + Class125.field434[var2] + "' at index " + var1 + " and got " + var4);// 316
      } else {
         return var4;// 127
      }
   }

   // $VF: synthetic method
   public Class178[] method172() {
      return this.field612;// 103
   }

   // $VF: synthetic method
   public void method173(int var1, Class178 var2) {
      this.field612[var1] = var2;// 237
   }// 133

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      var1.method1016(this);// 603
   }// 278

   // $VF: synthetic method
   public Class178 method174(int var1) {
      if (var1 < this.field612.length && var1 >= 0) {// 227
         return this.field612[var1];// 129
      } else {
         throw new Class239("Invalid constant pool reference: " + var1 + ". Constant pool size is: " + this.field612.length);// 55
      }
   }

   // $VF: synthetic method
   public void method175(Class178[] var1) {
      this.field612 = var1;
      this.field613 = var1 == null ? 0 : var1.length;// 102 460
   }// 105

   // $VF: synthetic method
   public String method176(int var1, byte var2) {
      Class178 var5 = this.method171(var1, var2);// 172
      int var3;
      Class149 var7;
      switch (var2) {// 433
         case 7:
            while (false) {
            }

            var3 = ((Class182)var5).method2();// 413
            var7 = this;
            break;// 320
         case 8:
            var3 = ((Class185)var5).method2();// 212
            var7 = this;
            break;// 365
         default:
            throw new RuntimeException("getConstantString called with illegal tag " + var2);// 263
      }

      return ((Class191)var7.method171(var3, (byte)1)).method20();// 297 426
   }

   // $VF: synthetic method
   public Class149(DataInputStream var1) {
      Class149 var3 = this;
      super();
      this.field613 = var1.readUnsignedShort();// 58 315
      this.field612 = new Class178[this.field613];// 465

      for (int var10000 = var4 = 1; var10000 < var3.field613; var10000 = ++var4) {// 488
         var3.field612[var4] = Class178.method223(var1);// 495
         byte var2;
         if ((var2 = var3.field612[var4].method142()) == 6 || var2 == 5) {// 144 461
            var4++;// 358
         }
      }
   }// 272

   // $VF: synthetic method
   public Class149 method94() {
      Class149 var2 = this;
      Class149 var1 = null;// 384

      try {
         (var1 = (Class149)var2.clone()).field612 = new Class178[var2.field613];// 301 602

         for (int var4 = 1; var4 < var2.field613; var4++) {// 363
            if (var2.field612[var4] != null) {// 509
               var1.field612[var4] = var2.field612[var4].method222();// 35
            }
         }
      } catch (CloneNotSupportedException var3) {// 256
      }

      return var1;// 47
   }

   // $VF: synthetic method
   public int method2() {
      return this.field613;// 312
   }

   // $VF: synthetic method
   public Class149(Class178[] var1) {
      this.method175(var1);// 226 580
   }// 123

   // $VF: synthetic method
   public static final String method166(String var0) {
      int var4 = var0.length();// 209
      StringBuffer var5 = new StringBuffer(var4 + 5);// 69
      char[] var3 = var0.toCharArray();// 116

      int var1;
      for (int var6 = var1 = 0; var6 < var4; var6 = ++var1) {// 422
         switch (var3[var1]) {// 464
            case '\b':
               while (false) {
               }

               var5.append("\\b");// 411
               break;// 468
            case '\t':
               var5.append("\\t");// 440
               break;// 248
            case '\n':
               var5.append("\\n");// 31
               break;// 21
            case '\r':
               var5.append("\\r");// 223
               break;// 45
            case '"':
               var5.append("\\\"");// 285
               break;// 119
            default:
               var5.append(var3[var1]);// 238
         }
      }

      return var5.toString();// 525
   }

   // $VF: synthetic method
   public void method3(DataOutputStream var1) {
      Class149 var2 = this;
      int var10000 = 1;
      var1.writeShort(this.field613);// 536

      for (int var3 = 1; var10000 < var2.field613; var10000 = ++var3) {// 307
         if (var2.field612[var3] != null) {// 218
            var2.field612[var3].method3(var1);// 109
         }
      }
   }// 385

   // $VF: synthetic method
   public String method177(int var1, byte var2) {
      return this.method178(this.method171(var1, var2));// 135 253
   }

   // $VF: synthetic method
   public String method178(Class178 var1) {
      byte var4;
      switch (var4 = var1.method142()) {// 398 415
         case 1:
            while (false) {
            }

            return ((Class191)var1).method20();// 38 412
         case 2:
         default:
            throw new RuntimeException("Unknown constant type " + var4);// 24
         case 3:
            return "" + ((Class181)var1).method2();// 40 63
         case 4:
            return "" + ((Class184)var1).method230();// 142 236
         case 5:
            return "" + ((Class183)var1).method228();// 99 368
         case 6:
            return "" + ((Class179)var1).method226();// 269 455
         case 7:
            int var8 = ((Class182)var1).method2();// 87
            return Class523.method1504(((Class191)this.method171(var8, (byte)1)).method20(), false);// 232 399 586
         case 8:
            int var3 = ((Class185)var1).method2();// 198
            Class178 var6 = this.method171(var3, (byte)1);// 424
            return "\"" + method166(((Class191)var6).method20()) + "\"";// 28 588
         case 9:
         case 10:
         case 11:
            return this.method177(((Class187)var1).method17(), (byte)7) + "." + this.method177(((Class187)var1).method2(), (byte)12);// 149 450
         case 12:
            return this.method177(((Class186)var1).method17(), (byte)1) + " " + this.method177(((Class186)var1).method2(), (byte)1);// 82 550
      }
   }
}
