package mapped;

// $VF: Compiled from jc
public class Class485 {
   // $VF: synthetic field
   public Class589[] field1624;

   // $VF: synthetic method
   public Class485(int var1) {
      Class485 var2 = this;
      super();
      this.field1624 = new Class589[var1];// 151 530

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 491
         Class589[] var4 = var2.field1624;// 147
         int var10001 = var3;
         Class589 var10002 = new Class589();
         var3++;
         var4[var10001] = var10002;
      }
   }// 338

   // $VF: synthetic method
   public Class589 method1308(int var1) {
      if (var1 >= 0 && var1 < this.field1624.length) {// 580
         return this.field1624[var1];// 78
      } else {
         throw new Class242("Slot number for local variable information out of range.");// 226
      }
   }

   // $VF: synthetic method
   public void method1309(int var1, String var2, int var3, int var4, Class138 var5) {
      if (var1 >= 0 && var1 < this.field1624.length) {// 465
         this.field1624[var1].method1956(var2, var3, var4, var5);// 488
         if (var5 == Class138.field578) {// 495
            this.field1624[var1 + 1].method1956(var2, var3, var4, Class139.method156());// 159
         }

         if (var5 == Class138.field576) {// 561
            this.field1624[var1 + 1].method1956(var2, var3, var4, Class141.method157());// 377
         }
      } else {
         throw new Class242("Slot number for local variable information out of range.");// 132
      }
   }// 22
}
