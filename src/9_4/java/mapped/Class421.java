package mapped;

import smardecSB.ldc;

// $VF: Compiled from by
public class Class421 implements Class418 {
   // $VF: synthetic field
   public Class547 field1239 = new Class547(null);
   // $VF: synthetic field
   public Class338 field1240;

   // $VF: synthetic method
   @Override
   public void method838() {
      Class428.field1250 = null;// 409
      Class428.field1264 = null;// 389
   }// 18

   // $VF: synthetic method
   public void method840(Class206 var1) {
      Class421 var2 = this;
      Class208[] var8 = var1.method341();// 151

      int var6;
      for (int var10000 = var6 = 0; var10000 < var8.length; var10000 = ++var6) {// 530
         Class208 var4;
         if ((var4 = var8[var6]).method369() != null) {// 147 491
            Class246 var3;
            Class203 var5;
            Class246 var14 = var3 = (var5 = Class376.method716(var4, var1.method93(), var1.method46(), var1.method46().method402())).method42().method32();// 273 295 338

            while (var14 != null) {// 161
               label40: {
                  if (var3.method18() instanceof ldc) {// 141
                     ldc var7 = (ldc)var3.method18();// 580
                     Class178 var10;
                     if ((var10 = var1.method46().method174(var7.method2())) instanceof Class185) {// 123 226
                        String var11;
                        if ((var11 = ((Class191)var1.method46().method174(((Class185)var10).method2())).method20()) != null// 78 418
                           && var11.startsWith(Class428.field1267)) {
                           String var12 = var11.substring(Class428.field1267.length());// 533
                           String var9;
                           String var13 = var12.substring((var9 = var12.substring(0, var12.indexOf(Class428.field1267))).length() + Class428.field1267.length());// 185 406
                           var15 = var3;
                           var7.method6(var1.method46().method409(Class428.method856(var13, var1.method93(), var5.method20(), var9)));// 1
                           break label40;// 46
                        }

                        if (var11 != null && var11.startsWith(Class467.field1527)) {
                           var7.method6(var1.method46().method409(Class467.method1050(var11, var2.field1240.method559(), var1.method93(), var5.method20())));// 170
                        }
                     }
                  }

                  var15 = var3;// 315
               }

               var14 = var3 = var15.method32();
            }

            var5.method309();// 132
            var1.method360(var4, var5.method315());// 184
         }
      }
   }// 488

   // $VF: synthetic method
   public Class421(Class338 var1) {
      this.field1240 = var1;// 335 507
   }// 557

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var3 = var1;
      Class421 var4 = this;
      if (Class428.field1264.contains(var1)) {// 260
         try {
            var4.method840(var3);// 143
         } catch (Exception var2) {
            this.field1239.method1711(var1);
            this.method840(var1);// 20 204
         }
      }
   }// 239 310
}
