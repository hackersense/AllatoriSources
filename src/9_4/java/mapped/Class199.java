package mapped;

import java.io.Serializable;

// $VF: Compiled from ge
public class Class199 implements Class200, Class198, Cloneable, Serializable {
   // $VF: synthetic field
   public Class246 field698;
   // $VF: synthetic field
   public int field699;
   // $VF: synthetic field
   public String field700;
   // $VF: synthetic field
   public Class138 field701;
   // $VF: synthetic field
   public Class246 field702;

   // $VF: synthetic method
   @Override
   public void method131(String var1) {
      this.field700 = var1;// 73
   }// 415

   // $VF: synthetic method
   public void method268(Class246 var1) {
      Class90.method35(this.field698, var1, this);
      this.field698 = var1;// 456 510
   }// 367

   // $VF: synthetic method
   public void method6(int var1) {
      this.field699 = var1;// 466
   }// 467

   // $VF: synthetic method
   @Override
   public String method20() {
      return this.field700;// 586
   }

   // $VF: synthetic method
   public void method29(Class246 var1) {
      Class90.method35(this.field702, var1, this);
      this.field702 = var1;// 279 450
   }// 386

   // $VF: synthetic method
   @Override
   public void method28(Class246 var1, Class246 var2) {
      boolean var4 = false;// 27
      if (this.field698 == var1) {// 242
         var4 = true;// 94
         this.method268(var2);// 209
      }

      if (this.field702 == var1) {// 116
         var4 = true;// 422
         this.method29(var2);// 464
      }

      if (!var4) {// 31
         throw new Class241("Not targeting " + var1 + ", but {" + this.field698 + ", " + this.field702 + "}");// 21
      }
   }// 45

   // $VF: synthetic method
   public int hashCode() {
      return this.field699 ^ this.field700.hashCode() ^ this.field701.hashCode();// 220 593
   }

   // $VF: synthetic method
   public int method2() {
      return this.field699;// 391
   }

   // $VF: synthetic method
   public Object clone() {
      Class199 var1 = this;

      try {
         return var1.clone();// 307
      } catch (CloneNotSupportedException var2) {// 218
         System.err.println(var2);// 109
         return null;// 213
      }
   }

   // $VF: synthetic method
   public Class199(int var1, String var2, Class138 var3, Class246 var4, Class246 var5) {
      if (var1 >= 0 && var1 <= 65535) {// 406
         this.field700 = var2;
         this.field701 = var3;// 553
         this.field699 = var1;// 58
         this.method268(var4);// 190
         this.method29(var5);// 170 315
      } else {
         throw new Class241("Invalid index index: " + var1);// 1
      }
   }// 465

   // $VF: synthetic method
   @Override
   public Class138 method26() {
      return this.field701;// 38
   }

   // $VF: synthetic method
   public Class246 method37() {
      return this.field698;// 236
   }

   // $VF: synthetic method
   public Class246 method32() {
      return this.field702;// 160
   }

   // $VF: synthetic method
   public Class124 method269(Class221 var1) {
      int var2 = this.field698.method2();// 272
      int var6;
      if ((var6 = this.field702.method2() - var2) > 0) {// 179 321
         var6 += this.field702.method18().method17();// 146
      }

      int var4 = var1.method106(this.field700);// 400
      int var5 = var1.method106(this.field701.method20());// 33
      return new Class124(var2, var6, var4, var5, this.field699, var1.method402());// 0
   }

   // $VF: synthetic method
   @Override
   public boolean method31(Class246 var1) {
      return this.field698 == var1 || this.field702 == var1;// 138
   }

   // $VF: synthetic method
   public boolean equals(Object var1) {
      Class199 var3;
      return !(var1 instanceof Class199)// 137
         ? false// 50
         : (var3 = (Class199)var1).field699 == this.field699 && var3.field698 == this.field698 && var3.field702 == this.field702;// 135 474
   }

   // $VF: synthetic method
   @Override
   public void method266(Class138 var1) {
      this.field701 = var1;// 424
   }// 28
}
