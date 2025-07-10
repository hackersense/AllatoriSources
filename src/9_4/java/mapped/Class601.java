package mapped;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $VF: Compiled from ep
public class Class601 {
   // $VF: synthetic field
   public Vector field2419;
   // $VF: synthetic field
   public String field2420;
   // $VF: synthetic field
   public String field2421;
   // $VF: synthetic field
   public String field2422;
   // $VF: synthetic field
   public boolean field2423;
   // $VF: synthetic field
   public boolean field2424;
   // $VF: synthetic field
   public String[] field2425;
   // $VF: synthetic field
   public Vector field2426;
   // $VF: synthetic field
   public int field2427;
   // $VF: synthetic field
   public boolean field2428 = false;
   // $VF: synthetic field
   public String field2429;

   // $VF: synthetic method
   public boolean method2083(Class338 var1, Class207 var2) {
      Class601 var3 = this;

      for (int var10000 = var5 = 0; var10000 < var3.field2426.size(); var10000 = ++var5) {// 28
         Class549 var4;
         if ((var4 = (Class549)var3.field2426.get(var5)).method1724(var1, var2)) {// 329 588
            if (!var4.method1723()) {
               return true;
            }

            return false;
         }
      }

      return false;// 38
   }

   // $VF: synthetic method
   public void method2084(String var1) {
      Matcher var5;
      if ((var5 = Pattern.compile("(.*?(?:class|interface))\\s+(.+?)(?:\\s+extends\\s+(.+?))?(?:\\s+implements\\s+(.+?))?(?:\\s+instanceof\\s+(.+?))?")// 141
            .matcher(var1))
         .matches()) {// 580
         String var2 = var5.group(1);// 226
         this.field2427 = Class356.method673(var2);// 123
         Matcher var8;
         if (Class356.method680(var2)) {// 418
            int var3;
            if ((var3 = var2.indexOf(32)) == -1) {// 185 533
               var3 = var2.length();
            }

            this.field2421 = Class356.method677(var2.substring(1, var3));// 406
            this.field2421 = 'L' + this.field2421.replaceAll("\\\\\\.", "/") + ';';// 1
            var8 = var5;
         } else {
            this.field2421 = null;// 170
            var8 = var5;// 190
         }

         String var7 = var8.group(2);
         this.field2422 = Class356.method677(var7);
         this.field2429 = Class356.method677(var5.group(3));// 132 184
         this.field2425 = Class356.method683(var5.group(4));// 315 488 495
         this.field2420 = Class356.method677(var5.group(5));// 493 561
      } else {
         throw new Class225("Invalid template.");// 604
      }
   }// 377

   // $VF: synthetic method
   public void method2085(Class549 var1) {
      this.field2426.add(var1);// 33
   }// 0

   // $VF: synthetic method
   public boolean method2086() {
      return this.field2424;// 467
   }

   // $VF: synthetic method
   public boolean method2087(Class208 var1) {
      Class601 var2 = this;

      for (int var10000 = var4 = 0; var10000 < var2.field2419.size(); var10000 = ++var4) {// 148
         Class564 var3;
         if ((var3 = (Class564)var2.field2419.get(var4)).method1815(var1)) {// 142 236
            if (!var3.method1814()) {
               return true;
            }

            return false;
         }
      }

      return false;// 368
   }

   // $VF: synthetic method
   public boolean method2088() {
      return this.field2423;// 391
   }

   // $VF: synthetic method
   public void method2089(Class564 var1) {
      this.field2419.add(var1);// 552
   }// 603

   // $VF: synthetic method
   public Class601(String var1, boolean var2, boolean var3, boolean var4) {
      this(var1, var2, var3);
      this.field2428 = var4;// 147 491
   }// 295

   // $VF: synthetic method
   public boolean method2090() {
      return this.field2428;// 555
   }

   // $VF: synthetic method
   public boolean method2091() {
      return this.field2426.size() > 0;// 428
   }

   // $VF: synthetic method
   public boolean method2092() {
      return this.field2419.size() > 0;// 232
   }

   // $VF: synthetic method
   public boolean method2093(Class203 var1) {
      Class601 var2 = this;

      for (int var10000 = var4 = 0; var10000 < var2.field2419.size(); var10000 = ++var4) {// 63
         Class564 var3;
         if ((var3 = (Class564)var2.field2419.get(var4)).method1812(var1)) {// 541 550
            if (!var3.method1814()) {
               return true;
            }

            return false;
         }
      }

      return false;// 456
   }

   // $VF: synthetic method
   public Class601(String var1, boolean var2, boolean var3) {
      this.field2426 = new Vector();
      this.field2419 = new Vector();
      this.field2424 = var2;// 389
      this.field2423 = var3;// 18
      this.method2084(var1);// 409 513
   }// 93

   // $VF: synthetic method
   public boolean method2094(Class338 var1, Class206 var2) {
      if (!Class356.method669(var2, this.field2427)) {// 461
         return false;
      } else if (!var2.method93().matches(this.field2422)) {// 358
         return false;
      } else if (!var2.method190().matches(this.field2429)) {// 192
         return false;
      } else if (!Class356.method671(var2.method130(), this.field2425)) {// 574
         return false;
      } else {
         return !Class356.method682(var1, var2.method93(), this.field2420)// 272
            ? false
            : this.field2421 == null || Class356.method672(var2.method264(), this.field2421);// 321
      }
   }

   // $VF: synthetic method
   public Class601() {
      this.field2426 = new Vector();// 252 310
      this.field2419 = new Vector();// 20
   }// 498

   // $VF: synthetic method
   public Class601 method2095() {
      Class601 var2 = new Class601();// 5
      var2.field2424 = this.field2424;
      var2.field2423 = this.field2423;// 450
      var2.field2428 = this.field2428;// 386
      var2.field2427 = this.field2427;// 470
      var2.field2422 = this.field2422;// 149
      var2.field2429 = this.field2429;// 157
      var2.field2420 = this.field2420;// 24
      var2.field2425 = this.field2425;// 286
      var2.field2421 = this.field2421;// 279 600
      return var2;// 108
   }
}
