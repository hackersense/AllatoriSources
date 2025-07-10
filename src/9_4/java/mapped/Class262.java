package mapped;

import java.io.DataOutputStream;
import java.util.StringTokenizer;

// $VF: Compiled from ao
public class Class262 extends Class263 implements Class31, Class25, Class3 {
   // $VF: synthetic method
   public Class262() {
   }// 580

   // $VF: synthetic method
   public Class138 method14(Class221 var1) {
      return Class138.method150(this.method521(var1));// 148
   }

   // $VF: synthetic method
   @Override
   public void method10(Class471 var1) {
      var1.method1136(this);
      var1.method1135(this);// 23
      var1.method1208(this);// 440
      var1.method1094(this);// 248
      var1.method1231(this);// 45 97
   }// 138

   // $VF: synthetic method
   @Override
   public int method15(Class221 var1) {
      return Class138.method153(this.method521(var1));// 552 603
   }

   // $VF: synthetic method
   public Class262(short var1, int var2) {
      super(var1, var2);// 406
   }// 1

   // $VF: synthetic method
   public Class192 method516(Class221 var1) {
      return (Class192)var1.method402().method174(this.field1);// 6 22
   }

   // $VF: synthetic method
   @Override
   public Class186 method517(Class221 var1) {
      Class149 var2 = var1.method402();// 192
      Class192 var4 = this.method516(var1);// 574
      return (Class186)var2.method174(var4.method2());// 272
   }

   // $VF: synthetic method
   @Override
   public void method7(Class437 var1, boolean var2) {
      super.method7(var1, var2);
      this.field1 = 5;// 82 83
      var1.readUnsignedShort();// 5
   }// 279

   // $VF: synthetic method
   public String method518(Class221 var1) {
      return this.method520(var1);// 588
   }

   // $VF: synthetic method
   @Override
   public int method11(Class221 var1) {
      return Class138.method152(this.method521(var1));// 579 589
   }

   // $VF: synthetic method
   @Override
   public String method5(Class149 var1) {
      Class178 var2 = var1.method174(this.field1);// 465
      StringTokenizer var4 = new StringTokenizer(var1.method178(var2));// 132
      return new StringBuilder()
         .insert(0, Class125.field386[this.field3])// 184
         .append(" ")
         .append(var4.nextToken().replace('.', '/'))
         .append(var4.nextToken())
         .toString();
   }

   // $VF: synthetic method
   @Override
   public Class138 method1(Class221 var1) {
      return this.method14(var1);// 586
   }

   // $VF: synthetic method
   @Override
   public Class[] method9() {
      Class[] var2 = new Class[4 + Class481.field1582.length];// 470
      System.arraycopy(Class481.field1582, 0, var2, 0, Class481.field1582.length);// 149
      var2[Class481.field1582.length + 3] = Class481.field1585;// 24
      var2[Class481.field1582.length + 2] = Class481.field1578;// 286
      var2[Class481.field1582.length + 1] = Class481.field1583;// 600
      var2[Class481.field1582.length] = Class481.field1576;// 108
      return var2;// 27
   }

   // $VF: synthetic method
   public Class138[] method519(Class221 var1) {
      return Class138.method146(this.method521(var1));// 40
   }

   // $VF: synthetic method
   @Override
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);
      var1.writeShort(this.field1);// 423
      var1.writeByte(0);// 61
      var1.writeByte(0);// 238 525
   }// 220
}
