package mapped;

import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from tu
public class Class588 {
   // $VF: synthetic field
   public Class338 field2358;
   // $VF: synthetic field
   public boolean field2359 = false;

   // $VF: synthetic method
   public void method1950() {
      Class588 var2 = this;
      Iterator var1 = this.field2358.method553();// 93

      Class588 var10000;
      while (true) {
         if (var1.hasNext()) {
            Class206 var4;
            if ((var4 = (Class206)var1.next()).method190().startsWith("javax.microedition.")) {// 151 530
               Class580.method1932().method1854(true);// 491
               var10000 = this;
               break;// 147
            }

            if (!var4.method190().startsWith("android.")) {// 295
               continue;
            }

            Class580.method1932().method1851(true);// 338
            var10000 = this;
            break;// 273
         }

         var10000 = this;// 226
         break;
      }

      var10000.method1953();
      Class424 var7 = new Class424(this.field2358);// 418
      Iterator var5 = this.field2358.method553();// 533

      while (var5.hasNext()) {
         Class206 var3 = (Class206)var5.next();// 185
         if (!Class580.method1924().method2043(var2.field2358, var3)) {// 406
            var7.method839(var3);
         }
      }

      var2.method1952();
      var7.method838();// 170
      Class418 var6;
	   // 184
	   if (var2.field2359) {// 46 190
         var6 = new Class421(var2.field2358);// 315
	   } else {
         var6 = new Class417(var2.field2358);// 132
	   }
	   var10000 = var2;

	   Iterator var9 = var10000.field2358.method553();

      while (var9.hasNext()) {
         Class206 var8 = (Class206)var9.next();// 534
         if (!Class580.method1924().method2043(var2.field2358, var8)) {// 488
            var6.method839(var8);
         }
      }

      var6.method838();// 159
      var2.method1951();// 377
      new Class426(var2.field2358).method839(null);// 22
   }// 6

   // $VF: synthetic method
   public void method1951() {
      Class588 var3 = this;
      Class547 var1 = new Class547(this.field2358);// 40
      Iterator var2 = this.field2358.method553();// 63

      while (var2.hasNext()) {
         Class206 var4 = (Class206)var2.next();// 541
         if (!Class580.method1924().method2043(var3.field2358, var4)) {// 550
            var1.method1711(var4);
         }
      }
   }// 456

   // $VF: synthetic method
   public void method1952() {
      try {
         new Class340(this.field2358).method588();// 412
      } catch (Exception var2) {
         var2.printStackTrace();
         try {
            Logger.warning("Rerunning obfuscation due to un-renamed packages.");// 269
            new Class340(this.field2358).method588();// 455
         } catch (Exception var1) {
            var1.printStackTrace();
         }
      }
   }// 39 142 368

   // $VF: synthetic method
   public void method1953() {
      Class588 var1 = this;
      if (Class580.method1933().method1919()) {// 358
         new Class430(this.field2358).method839(null);// 192
      }

      Vector var5 = new Vector();// 272
      var5.add(new Class419());// 146
      var5.add(new Class432(this.field2358));// 567
      var5.add(new Class422(this.field2358));// 400
      if (Class580.method1921().method929() != null && Class580.method1921().method935() != null) {// 33
         var5.add(new Class431(this.field2358));// 0
      }

      if (Class580.method1926().method1643() != null) {// 240
         var5.add(new Class425(this.field2358));// 246
      }

      int var10000 = Class580.method1932().method1866();// 603
      Class580.method1932();
      if (var10000 == 1) {
         Class428 var2;
         if ((var2 = new Class428(this.field2358)).method853()) {// 278 466
            var5.add(var2);// 467
            this.field2359 = true;// 485
         } else {
            var5.add(new Class429(this.field2358));// 59
         }
      } else {
         var5.add(new Class429(this.field2358));// 330
      }

      var5.add(new Class427(this.field2358));// 579
      var5.add(new Class420(this.field2358));// 555
      var5.add(new Class423(this.field2358));// 73
      Iterator var6 = this.field2358.method553();// 415

      while (var6.hasNext()) {
         Class206 var3 = (Class206)var6.next();// 398
         Iterator var4;
         if (!Class580.method1924().method2043(var1.field2358, var3)) {// 428
            for (Iterator var9 = var4 = var5.iterator(); var9.hasNext(); var9 = var4) {// 87
               ((Class418)var4.next()).method839(var3);// 586
            }
         }
      }

      Iterator var10 = var6 = var5.iterator();// 463

      while (var10.hasNext()) {
         Class418 var8 = (Class418)var6.next();
         var10 = var6;
         var8.method838();// 198
      }
   }// 424

   // $VF: synthetic method
   public Class588(Class338 var1) {
      this.field2358 = var1;// 239 310
      Class208.method221(Class402.method750());// 498
      Class372.method711(Integer.toBinaryString(var1.method554()).length());// 484
   }// 409
}
