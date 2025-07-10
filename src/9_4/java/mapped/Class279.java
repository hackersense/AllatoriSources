package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from bk
public class Class279 extends Class10 implements Class278, Class16 {
   // $VF: synthetic field
   public boolean field913;
   // $VF: synthetic field
   public int field914;

   // $VF: synthetic method
   @Override
   public final void method6(int var1) {
      if (var1 < 0) {// 398
         throw new Class241("Negative index value: " + var1);// 428
      } else {
         this.field914 = var1;// 586
         this.method122();// 399
      }
   }// 232

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1059(this);// 83
   }// 5

   // $VF: synthetic method
   public Class279() {
   }// 295

   // $VF: synthetic method
   public Class279(int var1) {
      super((short)169, (short)2);
      this.method6(var1);// 141 580
   }// 226

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      return Class140.field596;// 142
   }

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      if (this.field913 = var2) {// 146 179
         this.field914 = var1.readUnsignedShort();
         this.field914 = 4;// 400 567
      } else {
         this.field914 = var1.readUnsignedByte();
         this.field914 = 2;// 0 240
      }
   }// 33 552

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      if (this.field913) {// 46
         var1.writeByte(196);// 170
      }

      var1.writeByte(this.field913);// 58
      if (this.field913) {// 190
         var1.writeShort(this.field914);// 315
      } else {
         var1.writeByte(this.field914);// 132
      }
   }// 465 534

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field914).toString();// 412
   }

   // $VF: synthetic method
   @Override
   public final int method2() {
      return this.field914;// 59
   }

   // $VF: synthetic method
   public final void method122() {
      this.field913 = this.field914 > 255;// 493
      if (this.field913) {// 561
         this.field914 = 4;// 377
      } else {
         this.field914 = 2;// 22
      }
   }// 144 604
}
