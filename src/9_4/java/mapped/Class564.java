package mapped;

// $VF: Compiled from st
public class Class564 {
   // $VF: synthetic field
   public String field1982;
   // $VF: synthetic field
   public String field1983;
   // $VF: synthetic field
   public boolean field1984;
   // $VF: synthetic field
   public String field1985;
   // $VF: synthetic field
   public int field1986;
   // $VF: synthetic field
   public String field1987;

   // $VF: synthetic method
   public boolean method1812(Class203 var1) {
      if (!Class356.method669(var1, this.field1986)) {// 6
         return false;
      } else if (!var1.method20().matches(this.field1987)) {// 144
         return false;
      } else if (!var1.method164().toString().matches(this.field1982)) {// 461
         return false;
      } else {
         return !Class356.method676(var1.method277(), this.field1985) ? false : this.field1983 == null || Class356.method672(var1.method264(), this.field1983);// 192 358
      }
   }

   // $VF: synthetic method
   public void method1813(String var1) {
      String[] var2;
      String[] var10000;
      if ((var2 = var1.split("\\(|\\)")).length != 2) {// 30 260
         if (var2.length == 1 && var1.endsWith("()")) {// 143
            var10000 = var2;
         } else {
            if (var2.length <= 2 || !var1.contains("regex:")) {// 20
               throw new RuntimeException("Invalid template.");// 484
            }

            String var5 = var1.substring(0, var1.lastIndexOf(40));// 204
            String var4 = var1.substring(var1.lastIndexOf(40) + 1, var1.lastIndexOf(41));// 239
            var10000 = var2 = new String[]{var5, var4};// 310
         }
      } else {
         var10000 = var2;// 18
      }

      if (var10000.length == 1) {
         var10000 = var2;
         this.field1985 = "";// 513
      } else {
         var10000 = var2;// 151
         String var6 = var2[1];
         this.field1985 = Class356.method681(var6);// 530
      }

      String[] var7;
      if ((var7 = (var1 = var10000[0]).split("\\s+")) != null && var7.length != 0) {// 273 295 338
         this.field1987 = Class356.method679(var7[var7.length - 1]);// 580
         Class564 var10;
         if (var7.length > 1 && !Class356.method678(var7[var7.length - 2]) && !Class356.method680(var7[var7.length - 2])) {// 123
            this.field1982 = Class356.method677(var7[var7.length - 2]);// 78
            var10 = this;
         } else {
            var10 = this;// 533
            this.field1982 = ".*";
         }

         var10.field1986 = Class356.method673(var1);// 406
         if (Class356.method680(var7[0])) {// 46
            this.field1983 = Class356.method677(var7[0].substring(1));// 170
            this.field1983 = 'L' + this.field1983.replaceAll("\\\\\\.", "/") + ';';// 553
         } else {
            this.field1983 = null;// 190
         }
      } else {
         throw new Class225("Invalid template.");// 161
      }
   }// 58 465

   // $VF: synthetic method
   public boolean method1814() {
      return this.field1984;// 146
   }

   // $VF: synthetic method
   public Class564(String var1, boolean var2) {
      this.method1813(var1);// 7
      this.field1984 = var2;// 10 335
   }// 507

   // $VF: synthetic method
   public boolean method1815(Class208 var1) {
      if (!Class356.method669(var1, this.field1986)) {// 534
         return false;
      } else if (!var1.method190().matches(this.field1987)) {// 488
         return false;
      } else if (!var1.method26().toString().matches(this.field1982)) {// 495
         return false;
      } else {
         return !Class356.method676(var1.method277(), this.field1985) ? false : this.field1983 == null || Class356.method670(var1.method137(), this.field1983);// 159 493
      }
   }
}
