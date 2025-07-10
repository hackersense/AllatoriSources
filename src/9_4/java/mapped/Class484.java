package mapped;

import java.util.ArrayList;

// $VF: Compiled from jb
public class Class484 {
   // $VF: synthetic field
   public ArrayList field1622 = new ArrayList();
   // $VF: synthetic field
   public int field1623;

   // $VF: synthetic method
   public int method1295() {
      return this.field1622.size();// 138
   }

   // $VF: synthetic method
   public boolean method1296() {
      return this.field1622.isEmpty();// 428
   }

   // $VF: synthetic method
   public Class484 method1297() {
      return (Class484)this.clone();// 330
   }

   // $VF: synthetic method
   public void method1298(Class484 var1) {
      Class484 var2 = this;

      try {
         if (var2.method1304() == var1.method1304() && var2.method1295() == var1.method1295()) {// 280
            for (int var4 = 0; var4 < var2.method1295(); var4++) {// 227
               if (!(var2.field1622.get(var4) instanceof Class136) && var1.field1622.get(var4) instanceof Class136) {// 288
                  throw new Class233("Backwards branch with an uninitialized object on the stack detected.");// 129
               }

               if (!var2.field1622.get(var4).equals(var1.field1622.get(var4))// 110
                  && var2.field1622.get(var4) instanceof Class136
                  && !(var1.field1622.get(var4) instanceof Class136)) {
                  throw new Class233("Backwards branch with an uninitialized object on the stack detected.");// 221
               }

               if (var2.field1622.get(var4) instanceof Class136 && !(var1.field1622.get(var4) instanceof Class136)) {// 193 251
                  var2.field1622.set(var4, ((Class136)var2.field1622.get(var4)).method138());// 486
               }

               if (!var2.field1622.get(var4).equals(var1.field1622.get(var4))) {// 245
                  if (!(var2.field1622.get(var4) instanceof Class137) || !(var1.field1622.get(var4) instanceof Class137)) {// 296
                     throw new Class233("Cannot merge stacks of different types:\nStack A:\n" + var2 + "\nStack B:\n" + var1);// 394
                  }

                  var2.field1622.set(var4, ((Class137)var2.field1622.get(var4)).method141((Class137)var1.field1622.get(var4)));// 417
               }
            }
         } else {
            throw new Class233("Cannot merge stacks of different size:\nOperandStack A:\n" + var2 + "\nOperandStack B:\n" + var1);// 370
         }
      } catch (ClassNotFoundException var3) {// 275
         throw new Class242("Missing class: " + var3.toString());// 355
      }
   }// 369

   // $VF: synthetic method
   public Class484(int var1, Class144 var2) {
      this.field1623 = var1;// 1
      this.method1302(var2);// 46 406
   }// 170

   // $VF: synthetic method
   public Class138 method1299(int var1) {
      Class484 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var1; var10000 = var3) {// 149
         var3++;
         var2.method1300();// 157
      }

      return null;// 286
   }

   // $VF: synthetic method
   public Class138 method1300() {
      return (Class138)this.field1622.remove(this.method1295() - 1);// 82 367
   }

   // $VF: synthetic method
   public Class484(int var1) {
      this.field1623 = var1;// 141 580
   }// 226

   // $VF: synthetic method
   public Class138 method1301() {
      return this.method1305(0);// 269
   }

   // $VF: synthetic method
   public int hashCode() {
      return this.field1622.hashCode();// 192
   }

   // $VF: synthetic method
   public void method1302(Class138 var1) {
      if (var1 == null) {// 69
         throw new Class242("Cannot push NULL onto OperandStack.");// 116
      } else if (var1 != Class138.field584 && var1 != Class138.field585 && var1 != Class138.field594 && var1 != Class138.field581) {// 464
         if (this.method1304() >= this.field1623) {// 21
            throw new Class242("OperandStack too small, should have thrown proper Exception elsewhere. Stack: " + this);// 115
         } else {
            this.field1622.add(var1);// 45
         }
      } else {
         throw new Class242("The OperandStack does not know about '" + var1 + "'; use Type.INT instead.");// 25
      }
   }// 23

   // $VF: synthetic method
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class484)) {// 33
         return false;// 0
      } else {
         Class484 var3 = (Class484)var1;// 246
         return this.field1622.equals(var3.field1622);// 552
      }
   }

   // $VF: synthetic method
   public Object clone() {
      Class484 var2;
      (var2 = new Class484(this.field1623)).field1622 = (ArrayList)this.field1622.clone();// 184 534
      return var2;// 488
   }

   // $VF: synthetic method
   public void method1303(Class136 var1) {
      Class484 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field1622.size(); var10000 = ++var3) {// 548
         if (var2.field1622.get(var3) == var1) {// 545
            var2.field1622.set(var3, var1.method138());// 570
         }
      }
   }// 282

   // $VF: synthetic method
   public int method1304() {
      Class484 var1 = this;
      int var3 = 0;// 291

      int var2;
      for (int var10000 = var2 = 0; var10000 < var1.field1622.size(); var10000 = var2) {// 57
         Class138 var10001 = var1.method1305(var2);// 169
         var2++;
         var3 += var10001.method2();
      }

      return var3;// 299
   }

   // $VF: synthetic method
   public Class138 method1305(int var1) {
      return (Class138)this.field1622.get(this.method1295() - var1 - 1);// 160
   }

   // $VF: synthetic method
   public int method1306() {
      return this.field1623;// 424
   }

   // $VF: synthetic method
   public void method1307() {
      this.field1622 = new ArrayList();// 22
   }// 6
}
