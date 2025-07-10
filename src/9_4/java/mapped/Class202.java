package mapped;

import java.io.Serializable;

// $VF: Compiled from ok
public final class Class202 implements Class200, Cloneable, Serializable {
   // $VF: synthetic field
   public Class246 field705;
   // $VF: synthetic field
   public Class246 field706;
   // $VF: synthetic field
   public Class144 field707;
   // $VF: synthetic field
   public Class246 field708;

   // $VF: synthetic method
   public Class122 method271(Class221 var1) {
      return new Class122(
         this.field706.method2(),// 604
         this.field708.method2() + this.field708.method18().method17(),
         this.field705.method2(),
         this.field707 == null ? 0 : var1.method390(this.field707)
      );
   }

   // $VF: synthetic method
   public void method272(Class246 var1) {
      Class90.method35(this.field708, var1, this);
      this.field708 = var1;// 278 603
   }// 466

   // $VF: synthetic method
   public void method273(Class144 var1) {
      this.field707 = var1;// 450
   }// 386

   // $VF: synthetic method
   public Class144 method138() {
      return this.field707;// 286
   }

   // $VF: synthetic method
   public Class246 method274() {
      return this.field705;// 411
   }

   // $VF: synthetic method
   @Override
   public void method28(Class246 var1, Class246 var2) {
      boolean var4 = false;// 232
      if (this.field706 == var1) {// 463
         var4 = true;// 198
         this.method29(var2);// 424
      }

      if (this.field708 == var1) {// 588
         var4 = true;// 329
         this.method272(var2);// 412
      }

      if (this.field705 == var1) {// 257
         var4 = true;// 269
         this.method268(var2);// 455
      }

      if (!var4) {// 236
         throw new Class241("Not targeting " + var1 + ", but {" + this.field706 + ", " + this.field708 + ", " + this.field705 + "}");// 142
      }
   }// 99

   // $VF: synthetic method
   public void method268(Class246 var1) {
      Class90.method35(this.field705, var1, this);
      this.field705 = var1;// 579 589
   }// 555

   // $VF: synthetic method
   public Class246 method37() {
      return this.field708;// 115
   }

   // $VF: synthetic method
   public Class202(Class246 var1, Class246 var2, Class246 var3, Class144 var4) {
      this.method29(var1);// 1
      this.method272(var2);// 46
      this.method268(var3);// 170
      this.field707 = var4;// 406 553
   }// 58

   // $VF: synthetic method
   @Override
   public boolean method31(Class246 var1) {
      return this.field706 == var1 || this.field708 == var1 || this.field705 == var1;// 456
   }

   // $VF: synthetic method
   public void method29(Class246 var1) {
      Class90.method35(this.field706, var1, this);
      this.field706 = var1;// 146 179
   }// 567

   // $VF: synthetic method
   public Object clone() {
      Class202 var1 = this;

      try {
         return var1.clone();// 593
      } catch (CloneNotSupportedException var2) {// 336
         System.err.println(var2);// 540
         return null;// 291
      }
   }

   // $VF: synthetic method
   public Class246 method32() {
      return this.field706;// 69
   }
}
