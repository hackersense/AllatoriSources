package mapped;

import smardecSB.ldc;

// $VF: Compiled from fq
public class Class417 implements Class418 {
   // $VF: synthetic field
   public Class547 field1236 = new Class547(null);
   // $VF: synthetic field
   public Class338 field1237;

   // $VF: synthetic method
   @Override
   public void method838() {
      Class429.field1273 = null;// 409
   }// 389

   // $VF: synthetic method
   public Class417(Class338 var1) {
      this.field1237 = var1;// 335 507
   }// 557

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var3 = var1;
      Class417 var4 = this;
      if (Class429.field1273.contains(var1)) {// 260
         try {
            var4.method840(var3);// 143
         } catch (Exception var2) {
            this.field1236.method1711(var1);
            this.method840(var1);// 20 204
         }
      }
   }// 239 310

   // $VF: synthetic method
   public void method840(Class206 var1) {
      Class206 var10 = var1;
      Class417 var11 = this;
      Class208[] var8 = var1.method341();// 93

      int var6;
      for (int var14 = var6 = 0; var14 < var8.length; var14 = ++var6) {// 151
         Class208 var4;
         if ((var4 = var8[var6]).method369() != null) {// 491 530
            Class246 var3;
            Class203 var5;
            Class246 var15 = var3 = (var5 = Class376.method716(var4, var10.method93(), var10.method46(), var10.method46().method402())).method42().method32();// 147 295 338

            while (var15 != null) {// 273
               label40: {
                  if (var3.method18() instanceof ldc) {// 161
                     ldc var7 = (ldc)var3.method18();// 141
                     Class178 var2;
                     if ((var2 = var10.method46().method174(var7.method2())) instanceof Class185) {// 226 580
                        String var12;
                        if ((var12 = ((Class191)var10.method46().method174(((Class185)var2).method2())).method20()) != null// 78 123
                           && var12.startsWith(Class429.field1280)) {
                           String var13 = var12.substring(Class429.field1280.length());// 418
                           String var9 = new StringBuilder().insert(0, var10.method93()).append(var5.method20()).toString();// 533
                           var16 = var3;
                           var7.method6(var10.method46().method409(Class429.method855(var13, var9)));// 185
                           break label40;// 406
                        }

                        if (var12 != null && var12.startsWith(Class467.field1527)) {// 1
                           var7.method6(var10.method46().method409(Class467.method1050(var12, var11.field1237.method559(), var10.method93(), var5.method20())));// 46
                        }
                     }
                  }

                  var16 = var3;// 190
               }

               var15 = var3 = var16.method32();
            }

            var5.method309();// 465
            var10.method360(var4, var5.method315());// 132
         }
      }
   }// 534
}
