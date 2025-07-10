package mapped;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from oj
public class Class128 implements Class123, Class125 {
   // $VF: synthetic field
   public int field547;
   // $VF: synthetic field
   public List field548;
   // $VF: synthetic field
   public int field549;
   // $VF: synthetic field
   public Class149 field550;
   // $VF: synthetic field
   public boolean field551;

   // $VF: synthetic method
   public String method93() {
      Class128 var1 = this;
      StringBuffer var4;
      (var4 = new StringBuffer()).append("@");// 279 450
      var4.append(this.method20());// 386
      if (this.method104().length > 0) {// 470
         var4.append("(");// 157
         int var2 = 0;// 24

         for (int var10000 = var2; var10000 < var1.method104().length; var10000 = var2) {
            Class544 var3 = var1.method104()[var2];// 600
            var2++;
            var4.append(var3.method1682());// 108
         }

         var4.append(")");// 242
      }

      return var4.toString();// 209
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field551;// 160
   }

   // $VF: synthetic method
   @Override
   public void method87(Class463 var1) {
   }// 358

   // $VF: synthetic method
   public static Class128 method102(DataInputStream var0, Class149 var1, boolean var2) {
      DataInputStream var6 = var0;
      Class128 var5 = new Class128(var0.readUnsignedShort(), var1, var2);// 553
      int var7 = 0;
      var5.field549 = var0.readUnsignedShort();// 58

      for (int var3 = 0; var7 < var5.field549; var7 = var3) {// 315
         List var8 = var5.field548;// 465
         int var10003 = var6.readUnsignedShort();
         Class332 var10004 = Class332.method533(var6, var1);
         var3++;
         var8.add(new Class544(var10003, var10004, var1));
      }

      return var5;// 184
   }

   // $VF: synthetic method
   public int method17() {
      return this.field547;// 467
   }

   // $VF: synthetic method
   public Class128(int var1, Class149 var2, boolean var3) {
      this.field547 = var1;// 226
      this.field550 = var2;// 78
      this.field551 = var3;// 418 580
      this.field548 = new ArrayList();// 185
   }// 406

   // $VF: synthetic method
   public final int method2() {
      return this.field549;// 555
   }

   // $VF: synthetic method
   public void method103(Class544 var1) {
      if (this.field548 == null) {// 510
         this.field548 = new ArrayList();
      }

      this.field548.add(var1);// 456
   }// 367

   // $VF: synthetic method
   public String method20() {
      return ((Class191)this.field550.method171(this.field547, (byte)1)).method20();// 33 400
   }

   // $VF: synthetic method
   public Class544[] method104() {
      return (Class544[])this.field548.toArray(new Class544[this.field548.size()]);// 463
   }

   // $VF: synthetic method
   public void method3(DataOutputStream var1) {
      Class128 var2 = this;
      int var10000 = 0;
      var1.writeShort(this.field547);
      var1.writeShort(this.field548.size());// 38 412

      for (int var3 = 0; var10000 < var2.field548.size(); var10000 = var3) {// 257
         Object var4 = var2.field548.get(var3);// 269
         var3++;
         ((Class544)var4).method1685(var1);// 455
      }
   }// 236
}
