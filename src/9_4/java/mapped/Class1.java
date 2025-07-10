package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from zi
public abstract class Class1 extends Class10 implements Class16, Class278 {
   // $VF: synthetic field
   public int field1;

   // $VF: synthetic method
   public Class1() {
   }// 226

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      String var3;
      if (!(var3 = var1.method402().method176(this.field1, (byte)7)).startsWith("[")) {// 510 541 550
         var3 = "L" + var3 + ";";// 456
      }

      return Class138.method151(var3);// 82
   }

   // $VF: synthetic method
   @Override
   public final int method2() {
      return this.field1;// 198
   }

   // $VF: synthetic method
   public Class1(short var1, int var2) {
      super(var1, (short)3);
      this.method6(var2);// 1 46
   }// 170

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);
      var1.writeShort(this.field1);// 488 534
   }// 495

   // $VF: synthetic method
   @Override
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, super.method4(var1)).append(" ").append(this.field1).toString();// 272
   }

   // $VF: synthetic method
   @Override
   public String method5(Class149 var1) {
      Class178 var4;
      String var3 = var1.method178(var4 = var1.method174(this.field1));// 240 246
      if (var4 instanceof Class182) {// 552
         var3 = var3.replace('.', '/');// 603
      }

      return new StringBuilder().insert(0, Class125.field386[this.field3]).append(" ").append(var3).toString();// 466
   }

   // $VF: synthetic method
   @Override
   public void method6(int var1) {
      if (var1 < 0) {// 455
         throw new Class241("Negative index value: " + var1);// 148
      } else {
         this.field1 = var1;// 142
      }
   }// 39

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      this.method6(var1.readUnsignedShort());
      this.field1 = 3;// 73 415
   }// 398
}
