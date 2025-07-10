package mapped;

import java.io.DataInput;
import java.io.DataOutputStream;

// $VF: Compiled from hj
public class Class209 implements Cloneable, Class123 {
   // $VF: synthetic field
   public int field773;
   // $VF: synthetic field
   public int field774;

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 465

   // $VF: synthetic method
   public final void method3(DataOutputStream var1) {
      var1.writeShort(this.field773);
      var1.writeShort(this.field774);// 146 567
   }// 400

   // $VF: synthetic method
   public Class209() {
   }// 161

   // $VF: synthetic method
   public boolean method161() {
      return (this.field774 & 16) != 0;// 399
   }

   // $VF: synthetic method
   public void method90(int var1) {
      this.field773 = var1;// 39
   }// 368

   // $VF: synthetic method
   public boolean method163() {
      return (this.field774 & -32768) != 0;// 424
   }

   // $VF: synthetic method
   public int method17() {
      return this.field773;// 278
   }

   // $VF: synthetic method
   public boolean method101() {
      return (this.field774 & 4096) != 0;// 412
   }

   // $VF: synthetic method
   public String method5(Class149 var1) {
      return this.field773 == 0 ? null : var1.method176(this.field773, (byte)1);// 73 398 555
   }

   // $VF: synthetic method
   public void method6(int var1) {
      this.field774 = var1;// 455
   }// 148

   // $VF: synthetic method
   public Class209(DataInput var1) {
      this.field773 = var1.readUnsignedShort();// 1
      this.field774 = var1.readUnsignedShort();// 46 406
   }// 170

   // $VF: synthetic method
   public Class209 method372() {
      try {
         return (Class209)this.clone();// 493
      } catch (CloneNotSupportedException var1) {
         return null;// 22
      }
   }

   // $VF: synthetic method
   public int method2() {
      return this.field774;// 240
   }
}
