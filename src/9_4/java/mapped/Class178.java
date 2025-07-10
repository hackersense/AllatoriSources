package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;

// $VF: Compiled from um
public abstract class Class178 implements Cloneable, Class123, Serializable {
   // $VF: synthetic field
   public byte field665;
   // $VF: synthetic field
   public static Class399 field666 = new Class405();

   // $VF: synthetic method
   public final byte method142() {
      return this.field665;// 567
   }

   // $VF: synthetic method
   public static void method221(Class399 var0) {
      field666 = var0;// 138
   }// 285

   // $VF: synthetic method
   public int hashCode() {
      return field666.method749(this);// 443
   }

   // $VF: synthetic method
   public Class178 method222() {
      try {
         return (Class178)super.clone();// 579
      } catch (CloneNotSupportedException var1) {
         return null;// 415
      }
   }

   // $VF: synthetic method
   public static final Class178 method223(DataInputStream var0) {
      byte var2;
      switch (var2 = var0.readByte()) {// 148 455
         case 1:
            return new Class191(var0);// 157
         case 2:
         case 13:
         case 14:
         case 17:
         default:
            throw new Class239("Invalid byte tag in constant pool: " + var2);// 209
         case 3:
            return new Class181(var0);// 456
         case 4:
            return new Class184(var0);// 82
         case 5:
            return new Class183(var0);// 5
         case 6:
            return new Class179(var0);// 450
         case 7:
            return new Class182(var0);// 142
         case 8:
            return new Class185(var0);// 550
         case 9:
            return new Class190(var0);// 368
         case 10:
            return new Class188(var0);// 160
         case 11:
            return new Class189(var0);// 63
         case 12:
            return new Class186(var0);// 470
         case 15:
            return new Class193(var0);// 286
         case 16:
            return new Class194(var0);// 108
         case 18:
            return new Class192(var0);// 242
      }
   }

   // $VF: synthetic method
   @Override
   public abstract void method87(Class463 var1);

   // $VF: synthetic method
   public Object clone() {
      return super.clone();// 399
   }

   // $VF: synthetic method
   public Class178(byte var1) {
      this.field665 = var1;// 315 465
   }// 132

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return field666.method748(this, var1);// 291
   }

   // $VF: synthetic method
   public abstract void method3(DataOutputStream var1);

   // $VF: synthetic method
   public static Class399 method224() {
      return field666;// 223
   }
}
