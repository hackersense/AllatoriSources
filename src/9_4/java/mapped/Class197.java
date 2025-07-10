package mapped;

import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from dh
public abstract class Class197 extends Class196 implements Class198, Cloneable {
   // $VF: synthetic field
   public String field693;
   // $VF: synthetic field
   public ArrayList field694;
   // $VF: synthetic field
   public Class221 field695;
   // $VF: synthetic field
   public List field696 = new ArrayList();
   // $VF: synthetic field
   public Class138 field697;

   // $VF: synthetic method
   public void method262(Class151 var1) {
      this.field696.add(var1);// 246
   }// 552

   // $VF: synthetic method
   @Override
   public String method20() {
      return this.field693;// 315
   }

   // $VF: synthetic method
   public Object clone() {
      Class197 var1 = this;

      try {
         return var1.clone();// 600
      } catch (CloneNotSupportedException var2) {// 108
         System.err.println(var2);// 27
         return null;// 242
      }
   }

   // $VF: synthetic method
   @Override
   public Class138 method26() {
      return this.field697;// 406
   }

   // $VF: synthetic method
   public void method59(Class221 var1) {
      this.field695 = var1;// 461
   }// 358

   // $VF: synthetic method
   public void method122() {
      this.field694.clear();// 269
   }// 455

   // $VF: synthetic method
   public void method263(Class533 var1) {
      this.field694.add(var1);// 467
   }// 485

   // $VF: synthetic method
   public Class533[] method264() {
      Class533[] var2 = new Class533[this.field694.size()];// 456
      this.field694.toArray(var2);// 367
      return var2;// 82
   }

   // $VF: synthetic method
   public abstract String method93();

   // $VF: synthetic method
   public Class221 method46() {
      return this.field695;// 377
   }

   // $VF: synthetic method
   public void method265(Class151 var1) {
      this.field696.remove(var1);// 555
   }// 73

   // $VF: synthetic method
   public Class151[] method200() {
      Class151[] var2 = new Class151[this.field696.size()];// 160
      this.field696.toArray(var2);// 40
      return var2;// 63
   }

   // $VF: synthetic method
   public void method19() {
      this.field696.clear();// 588
   }// 329

   // $VF: synthetic method
   @Override
   public void method131(String var1) {
      this.field693 = var1;// 488
   }// 495

   // $VF: synthetic method
   @Override
   public void method266(Class138 var1) {
      if (var1.method142() == 16) {// 141
         throw new IllegalArgumentException("Type can not be " + var1);// 580
      } else {
         this.field697 = var1;// 123
      }
   }// 78

   // $VF: synthetic method
   public void method267(Class533 var1) {
      this.field694.remove(var1);// 87
   }// 586

   // $VF: synthetic method
   public Class197() {
      this.field694 = new ArrayList();// 93 151
   }// 295
}
