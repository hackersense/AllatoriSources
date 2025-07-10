package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from fh
public final class Class219 implements Cloneable {
   // $VF: synthetic field
   public byte field804;
   // $VF: synthetic field
   public Class149 field805;
   // $VF: synthetic field
   public int field806 = -1;

   // $VF: synthetic method
   public byte method142() {
      return this.field804;// 144
   }

   // $VF: synthetic method
   public Class219(byte var1, int var2, Class149 var3) {
      this.method328(var1);// 190
      this.method6(var2);// 315
      this.method96(var3);// 58 465
   }// 132

   // $VF: synthetic method
   public String method20() {
      if (this.field804 == 7) {// 28
         return this.field806 < 0 ? ", class=<unknown>" : ", class=" + this.field805.method177(this.field806, (byte)7);// 38 329 588
      } else {
         return this.field804 == 8 ? ", offset=" + this.field806 : "";// 148 257 269
      }
   }

   // $VF: synthetic method
   public void method328(byte var1) {
      if (var1 >= 0 && var1 <= 8) {// 495
         this.field804 = var1;// 561
      } else {
         throw new RuntimeException("Illegal type for StackMapType: " + var1);// 159
      }
   }// 377

   // $VF: synthetic method
   public Class219(DataInputStream var1, Class149 var2) {
      this(var1.readByte(), -1, var2);
      if (this.method101()) {// 226 580
         this.method6(var1.readShort());// 123
      }

      this.method96(var2);// 418
   }// 533

   // $VF: synthetic method
   public final boolean method101() {
      return this.field804 == 7 || this.field804 == 8;// 399
   }

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeByte(this.field804);// 330
      if (this.method101()) {// 589
         var1.writeShort(this.method2());// 579
      }
   }// 73

   // $VF: synthetic method
   public int method2() {
      return this.field806;// 240
   }

   // $VF: synthetic method
   public final Class149 method94() {
      return this.field805;// 94
   }

   // $VF: synthetic method
   public Class219 method388() {
      try {
         return (Class219)this.clone();// 450
      } catch (CloneNotSupportedException var1) {
         return null;// 149
      }
   }

   // $VF: synthetic method
   public final void method96(Class149 var1) {
      this.field805 = var1;// 21
   }// 115

   // $VF: synthetic method
   public void method6(int var1) {
      this.field806 = var1;// 272
   }// 321
}
