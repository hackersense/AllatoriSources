package mapped;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from xi
public class Class478 extends Class475 {
   // $VF: synthetic field
   public List field1560 = new ArrayList();

   // $VF: synthetic method
   public List method1267() {
      return this.field1560;// 59
   }

   // $VF: synthetic method
   public Class478(Class221 var1) {
      super(91, var1);// 507
   }// 34

   // $VF: synthetic method
   @Override
   public void method1254(DataOutputStream var1) {
      var1.writeByte(this.field1555);
      var1.writeShort(this.field1560.size());// 377 604

      for (Iterator var10000 = var3 = this.field1560.iterator(); var10000.hasNext(); var10000 = var3) {// 22
         ((Class475)var3.next()).method1254(var1);// 144 461
      }
   }// 192

   // $VF: synthetic method
   public int method1266() {
      return this.field1560.size();// 555
   }

   // $VF: synthetic method
   public void method1268(Class475 var1) {
      this.field1560.add(var1);// 87
   }// 586

   // $VF: synthetic method
   public Class478(int var1, Class332[] var2, Class221 var3) {
      Class478 var6 = this;
      super(var1, var3);// 252
      if (var1 != 91) {// 20
         throw new RuntimeException("Only element values of type array can be built with this ctor");// 204
      } else {
         this.field1560 = new ArrayList();// 310

         for (int var7 = var5 = 0; var7 < var2.length; var7 = var5) {// 498
            var6.field1560.add(var2[var5++]);// 409
         }
      }
   }// 18

   // $VF: synthetic method
   @Override
   public String method1255() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("[");// 146 179
      Iterator var4 = this.field1560.iterator();// 567

      while (var4.hasNext()) {
         Class475 var3 = (Class475)var4.next();// 33
         var1.append(var3.method1255());// 0
         if (var4.hasNext()) {// 240
            var1.append(",");// 246
         }
      }

      var1.append("]");// 603
      return var1.toString();// 278
   }

   // $VF: synthetic method
   public Class478(Class331 var1, Class221 var2, boolean var3) {
      Class478 var7 = this;
      super(91, var2);// 190
      this.field1560 = new ArrayList();// 315
      Class332[] var6 = var1.method529();// 465

      int var4;
      for (int var8 = var4 = 0; var8 < var6.length; var8 = var4) {// 132
         Class332 var10001 = var6[var4];
         var4++;
         var7.field1560.add(Class475.method1260(var10001, var2, var3));// 534
      }
   }// 495

   // $VF: synthetic method
   @Override
   public Class332 method1253() {
      Class332[] var1 = new Class332[this.field1560.size()];// 295
      int var2 = 0;// 338
      Iterator var5;
      Iterator var10000 = var5 = this.field1560.iterator();// 273

      while (var10000.hasNext()) {
         Class475 var4 = (Class475)var5.next();// 141
         var10000 = var5;
         int var10002 = var2;
         Class332 var10003 = var4.method1253();
         var2++;
         var1[var10002] = var10003;// 580
      }

      return new Class331(this.field1555, var1, this.field1550.method402());// 123
   }
}
