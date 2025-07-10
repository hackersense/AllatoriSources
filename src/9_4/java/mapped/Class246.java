package mapped;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// $VF: Compiled from wk
public class Class246 implements Serializable {
   // $VF: synthetic field
   public static Class246 field836 = null;
   // $VF: synthetic field
   public int field837 = -1;
   // $VF: synthetic field
   public Class246 field838;
   // $VF: synthetic field
   public Map field839;
   // $VF: synthetic field
   public Class10 field840;
   // $VF: synthetic field
   public Class246 field841;
   // $VF: synthetic field
   public Set field842;

   // $VF: synthetic method
   public final Class246 method37() {
      return this.field841;// 58
   }

   // $VF: synthetic method
   public void method429(Object var1) {
      if (this.field839 != null) {// 103
         this.field839.remove(var1);// 548
      }
   }// 570

   // $VF: synthetic method
   public int method2() {
      return this.field837;// 450
   }

   // $VF: synthetic method
   public void method115() {
      if (this.field842 != null) {// 220
         this.field842.clear();// 593
      }
   }// 540

   // $VF: synthetic method
   public void method430(Class200 var1) {
      if (this.field842 != null) {// 137
         this.field842.remove(var1);// 50
      }
   }// 135

   // $VF: synthetic method
   public final Class246 method32() {
      return this.field838;// 406
   }

   // $VF: synthetic method
   public Class200[] method431() {
      if (!this.method101()) {// 280
         return null;// 370
      } else {
         Class200[] var2 = new Class200[this.field842.size()];// 95
         this.field842.toArray(var2);// 227
         return var2;// 55
      }
   }

   // $VF: synthetic method
   public String method4(boolean var1) {
      return new StringBuilder().insert(0, Class523.method1530(this.field837, 4, false, ' ')).append(": ").append(this.field840.method4(var1)).toString();// 110
   }

   // $VF: synthetic method
   public void method432(Class10 var1) {
      if (var1 == null) {// 22
         throw new Class241("Assigning null to handle");// 6
      } else if (this.getClass() != Class247.class && var1 instanceof Class90) {// 461
         throw new Class241("Assigning branch instruction " + var1 + " to plain handle");// 358
      } else {
         if (this.field840 != null) {// 574
            this.field840.method19();// 272
         }

         this.field840 = var1;// 179
      }
   }// 146

   // $VF: synthetic method
   public int method34(int var1, int var2) {
      this.field837 += var1;// 63
      return 0;// 541
   }

   // $VF: synthetic method
   public Object method433(Object var1) {
      return this.field839 != null ? this.field839.get(var1) : null;// 145 499 549
   }

   // $VF: synthetic method
   public void method10(Class471 var1) {
      this.field840.method10(var1);// 212
   }// 365

   // $VF: synthetic method
   public Collection method434() {
      if (this.field839 == null) {// 564
         this.field839 = new HashMap(3);// 48
      }

      return this.field839.values();// 438
   }

   // $VF: synthetic method
   public boolean method101() {
      return this.field842 != null && this.field842.size() > 0;// 15
   }

   // $VF: synthetic method
   public Class246(Class10 var1) {
      this.method432(var1);// 330 391
   }// 589

   // $VF: synthetic method
   public void method122() {
      this.field838 = this.field841 = null;// 440
      this.field840.method19();
      this.field840 = null;// 97
      this.field837 = -1;// 411
      this.field839 = null;// 248 468
      this.method115();// 138
      this.method19();// 285
   }// 119

   // $VF: synthetic method
   public static final Class246 method435(Class10 var0) {
      if (field836 == null) {// 586
         return new Class246(var0);// 399
      } else {
         Class246 var2 = field836;// 463
         field836 = var2.field838;
         var2.method432(var0);// 198 424
         return var2;// 28
      }
   }

   // $VF: synthetic method
   public void method19() {
      this.field838 = field836;// 422
      field836 = this;// 464
   }// 25

   // $VF: synthetic method
   public Class10 method436(Class10 var1) {
      Class10 var3 = this.field840;// 278
      this.field840 = var1;// 466
      return var3;// 467
   }

   // $VF: synthetic method
   public void method6(int var1) {
      this.field837 = var1;// 108
   }// 27

   // $VF: synthetic method
   public void method437(Object var1, Object var2) {
      if (this.field839 == null) {// 316
         this.field839 = new HashMap(3);// 207
      }

      this.field839.put(var1, var2);// 127
   }// 355

   // $VF: synthetic method
   public void method438(Class200 var1) {
      if (this.field842 == null) {// 72
         this.field842 = new HashSet();// 268
      }

      this.field842.add(var1);// 536
   }// 307

   // $VF: synthetic method
   public final Class10 method18() {
      return this.field840;// 184
   }
}
