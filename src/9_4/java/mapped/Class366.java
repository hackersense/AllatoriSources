package mapped;

import java.util.Vector;

// $VF: Compiled from po
public class Class366 implements Class360 {
   // $VF: synthetic field
   public Vector field1146 = new Vector();
   // $VF: synthetic field
   public Class360 field1147;
   // $VF: synthetic field
   public int field1148 = 0;
   // $VF: synthetic field
   public boolean field1149;
   // $VF: synthetic field
   public int field1150;
   // $VF: synthetic field
   public Vector field1151 = new Vector();

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1148 = 0;// 147
   }// 295

   // $VF: synthetic method
   @Override
   public String method710() {
      Class366 var1 = this;
      if (this.field1148 < this.field1146.size()) {// 204
         return (String)this.field1146.get(this.field1148++);
      } else {
         if (!this.field1149 && this.field1146.size() == 104) {// 239
            this.field1150 = 299;
         }

         for (int var10000 = var2 = 0; var10000 < var1.field1150; var10000 = var2) {// 310
            var2++;
            var1.field1151.add(var1.field1147.method710());// 498
         }

         if (Class580.method1923().method1668()) {// 484
            Class337.method550(var1.field1151);// 409
         }

         var1.field1146.addAll(var1.field1151);// 389
         var1.field1151.clear();// 18
         if (var1.field1149) {// 513
            Class372.method712((String)var1.field1146.get(0));
         }

         return (String)var1.field1146.get(var1.field1148++);// 93
      }
   }

   // $VF: synthetic method
   public Class366(Class360 var1) {
      this.field1150 = 26;// 52
      this.field1149 = false;// 7
      this.field1147 = var1;// 507 557
      if (var1 instanceof Class372) {// 34
         this.field1149 = true;
         this.field1150 = 1024;// 260 332
      }
   }// 143
}
