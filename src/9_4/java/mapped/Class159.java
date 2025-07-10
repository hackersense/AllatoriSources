package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;

// $VF: Compiled from bi
public final class Class159 extends Class151 {
   // $VF: synthetic field
   public int field631;
   // $VF: synthetic field
   public int field632;

   // $VF: synthetic method
   public Class159(int var1, int var2, int var3, int var4, Class149 var5) {
      super((byte)9, var1, var2, var5);
      this.field632 = var3;// 377
      this.field631 = var4;// 561 604
   }// 22

   // $VF: synthetic method
   public final void method85(int var1) {
      this.field632 = var1;// 40
   }// 63

   // $VF: synthetic method
   public Class159(Class159 var1) {
      this(var1.method17(), var1.method2(), var1.method84(), var1.method30(), var1.method94());// 295
   }// 273

   // $VF: synthetic method
   public final String method190() {
      return ((Class191)this.field616.method171(this.field632, (byte)1)).method20();// 83 279
   }

   // $VF: synthetic method
   @Override
   public final void method3(DataOutputStream var1) {
      super.method3(var1);
      var1.writeShort(this.field632);// 68 485
      var1.writeShort(this.field631);// 59
   }// 391

   // $VF: synthetic method
   public Class159(int var1, int var2, DataInputStream var3, Class149 var4) {
      this(var1, var2, var3.readUnsignedShort(), var3.readUnsignedShort(), var4);// 170
   }// 553

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
      System.err.println("Visiting non-standard PMGClass object");// 567
   }// 400

   // $VF: synthetic method
   public final int method84() {
      return this.field632;// 455
   }

   // $VF: synthetic method
   public final void method89(int var1) {
      this.field631 = var1;// 424
   }// 28

   // $VF: synthetic method
   public final String method93() {
      return ((Class191)this.field616.method171(this.field631, (byte)1)).method20();// 27 600
   }

   // $VF: synthetic method
   public final int method30() {
      return this.field631;// 398
   }

   // $VF: synthetic method
   @Override
   public Class151 method181(Class149 var1) {
      return (Class159)this.clone();// 248
   }
}
