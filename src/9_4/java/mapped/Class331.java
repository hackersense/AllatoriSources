package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from kn
public class Class331 extends Class332 {
   // $VF: synthetic field
   public Class332[] field920;

   // $VF: synthetic method
   @Override
   public void method527(DataOutputStream var1) {
      Class331 var2 = this;
      var1.writeByte(this.field934);
      var1.writeShort(this.field920.length);// 93 513

      for (int var10000 = var3 = 0; var10000 < var2.field920.length; var10000 = var3) {// 151
         var2.field920[var3++].method527(var1);// 491
      }
   }// 295

   // $VF: synthetic method
   public int method528() {
      return this.field920.length;// 534
   }

   // $VF: synthetic method
   public Class332[] method529() {
      return this.field920;// 190
   }

   // $VF: synthetic method
   public Class331(int var1, Class332[] var2, Class149 var3) {
      super(var1, var3);// 20
      if (var1 != 91) {// 204
         throw new RuntimeException("Only element values of type array can be built with this ctor");// 239
      } else {
         this.field920 = var2;// 498
      }
   }// 484

   // $VF: synthetic method
   @Override
   public String method530() {
      Class331 var2 = this;
      StringBuffer var1;
      (var1 = new StringBuffer()).append("[");// 141 580
      int var3 = 0;

      for (int var10000 = var3; var10000 < var2.field920.length; var10000 = ++var3) {// 226
         var1.append(var2.field920[var3].method530());// 78
         if (var3 + 1 < var2.field920.length) {// 418
            var1.append(",");// 533
         }
      }

      var1.append("]");// 406
      return var1.toString();// 1
   }
}
