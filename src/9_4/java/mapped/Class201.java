package mapped;

import java.io.Serializable;

// $VF: Compiled from qg
public class Class201 implements Class200, Cloneable, Serializable {
   // $VF: synthetic field
   public int field703;
   // $VF: synthetic field
   public Class246 field704;

   // $VF: synthetic method
   @Override
   public void method28(Class246 var1, Class246 var2) {
      if (var1 != this.field704) {// 190
         throw new Class241("Not targeting " + var1 + ", but " + this.field704 + "}");// 315
      } else {
         this.method29(var2);// 132
      }
   }// 534

   // $VF: synthetic method
   public int method2() {
      return this.field703;// 428
   }

   // $VF: synthetic method
   public Object clone() {
      Class201 var1 = this;

      try {
         return var1.clone();// 0
      } catch (CloneNotSupportedException var2) {// 240
         System.err.println(var2);// 246
         return null;// 552
      }
   }

   // $VF: synthetic method
   public Class201(Class246 var1, int var2) {
      this.method29(var1);// 295
      this.method6(var2);// 147 338
   }// 273

   // $VF: synthetic method
   public Class210 method270() {
      return new Class210(this.field704.method2(), this.field703);// 144
   }

   // $VF: synthetic method
   public void method29(Class246 var1) {
      Class90.method35(this.field704, var1, this);
      this.field704 = var1;// 272 321
   }// 179

   // $VF: synthetic method
   @Override
   public boolean method31(Class246 var1) {
      return this.field704 == var1;// 418
   }

   // $VF: synthetic method
   public void method6(int var1) {
      this.field703 = var1;// 579
   }// 555

   // $VF: synthetic method
   public Class246 method32() {
      return this.field704;// 68
   }
}
