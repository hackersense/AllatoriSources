package mapped;

// $VF: Compiled from wo
public class Class549 {
   // $VF: synthetic field
   public int field1887;
   // $VF: synthetic field
   public String field1888;
   // $VF: synthetic field
   public String field1889;
   // $VF: synthetic field
   public boolean field1890;
   // $VF: synthetic field
   public String field1891;
   // $VF: synthetic field
   public String field1892;

   // $VF: synthetic method
   public void method1722(String var1) {
      String[] var4;
      if ((var4 = var1.split("\\s+")) != null && var4.length != 0) {// 30 260
         int var3;
         Class549 var10000;
         if ((var3 = var4.length) >= 3 && "instanceof".equals(var4[var3 - 2])) {// 20 239
            var10000 = this;// 310
            int var10003 = var3 - 1;
            var3 -= 2;// 498
            this.field1891 = Class356.method677(var4[var10003]);
         } else {
            var10000 = this;// 409
            this.field1891 = null;
         }

         var10000.field1888 = Class356.method679(var4[var3 - 1]);// 513
         if (var3 > 1 && !Class356.method678(var4[var3 - 2]) && !Class356.method680(var4[var3 - 2])) {// 151
            var10000 = this;// 530
            this.field1892 = Class356.method677(var4[var3 - 2]);
         } else {
            var10000 = this;// 147
            this.field1892 = ".*";
         }

         var10000.field1887 = Class356.method673(var1);// 273
         if (Class356.method680(var4[0])) {// 141
            this.field1889 = Class356.method677(var4[0].substring(1));// 580
            this.field1889 = 'L' + this.field1889.replaceAll("\\\\\\.", "/") + ';';// 226
         } else {
            this.field1889 = null;// 78
         }
      } else {
         throw new Class225("Invalid template.");// 143
      }
   }// 123 533

   // $VF: synthetic method
   public Class549(String var1, boolean var2) {
      this.method1722(var1);// 7
      this.field1890 = var2;// 10 335
   }// 507

   // $VF: synthetic method
   public boolean method1723() {
      return this.field1890;// 604
   }

   // $VF: synthetic method
   public boolean method1724(Class338 var1, Class207 var2) {
      if (!Class356.method669(var2, this.field1887)) {// 1
         return false;
      } else if (!var2.method190().matches(this.field1888)) {// 46
         return false;
      } else if (!var2.method26().toString().matches(this.field1892)) {// 170
         return false;
      } else if (this.field1889 != null && !Class356.method670(var2.method137(), this.field1889)) {// 553
         return false;
      } else {
         if (this.field1891 != null) {// 58
            String var4;
            if ((var4 = var2.method20()).charAt(0) != 'L' || var4.charAt(var4.length() - 1) != ';') {// 190 315
               return false;// 534
            }

            String var5 = var4.substring(1, var4.length() - 1).replace('/', '.');// 465
            if (!Class356.method682(var1, var5, this.field1891)) {// 132
               return false;
            }
         }

         return true;// 159
      }
   }
}
