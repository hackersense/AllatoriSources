package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from ti
public class Class476 extends Class475 {
   // $VF: synthetic field
   public int field1557;
   // $VF: synthetic field
   public int field1558;

   // $VF: synthetic method
   public String method1261() {
      return ((Class191)this.method1257().method174(this.field1557)).method20();// 589
   }

   // $VF: synthetic method
   @Override
   public void method1254(DataOutputStream var1) {
      var1.writeByte(this.field1555);
      var1.writeShort(this.field1558);// 493
      var1.writeShort(this.field1557);// 159 561
   }// 377

   // $VF: synthetic method
   public void method1262(int var1) {
      this.field1558 = var1;// 236
   }// 142

   // $VF: synthetic method
   public Class476(int var1, int var2, Class221 var3) {
      super(101, var3);
      if (this.field1555 != 101) {// 30 143
         throw new RuntimeException("Only element values of type enum can be built with this ctor");// 252
      } else {
         this.field1558 = var1;
         this.field1557 = var2;// 204 239
      }
   }// 310

   // $VF: synthetic method
   @Override
   public Class332 method1253() {
      return new Class335(this.field1555, this.field1558, this.field1557, this.field1558.method402());// 93
   }

   // $VF: synthetic method
   public Class476(Class144 var1, String var2, Class221 var3) {
      super(101, var3);
      this.field1558 = var3.method106(var1.method20());// 273
      this.field1557 = var3.method106(var2);// 161 338
   }// 141

   // $VF: synthetic method
   public void method1263(int var1) {
      this.field1557 = var1;// 28
   }// 588

   // $VF: synthetic method
   public String method1264() {
      return ((Class191)this.method1257().method174(this.field1558)).method20();// 466
   }

   // $VF: synthetic method
   @Override
   public String method1255() {
      return ((Class191)this.method1257().method174(this.field1557)).method20();// 144 358
   }

   // $VF: synthetic method
   public int method1265() {
      return this.field1557;// 232
   }

   // $VF: synthetic method
   public Class476(Class335 var1, Class221 var2, boolean var3) {
      super(101, var2);// 418
      if (var3) {// 533
         this.field1558 = var2.method106(var1.method544());
         this.field1557 = var2.method106(var1.method542());// 46 406
      } else {
         this.field1558 = var1.method538();// 315
         this.field1557 = var1.method528();// 465
      }
   }// 184 553

   // $VF: synthetic method
   public int method1266() {
      return this.field1558;// 257
   }
}
