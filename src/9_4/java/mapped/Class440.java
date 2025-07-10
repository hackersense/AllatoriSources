package mapped;

import java.io.ByteArrayInputStream;
import java.util.Hashtable;

// $VF: Compiled from tl
public class Class440 extends ClassLoader {
   // $VF: synthetic field
   public Class248 field1289;
   // $VF: synthetic field
   public Hashtable field1290 = new Hashtable();
   // $VF: synthetic field
   public String[] field1291;
   // $VF: synthetic field
   public static final String[] field1292 = new String[]{"java.", "javax.", "sun."};

   // $VF: synthetic method
   public Class440(ClassLoader var1, String[] var2) {
      this(var2);// 466
      this.field1289 = new Class249(var1);// 467
   }// 485

   // $VF: synthetic method
   public Class440() {
      this(field1292);// 495
   }// 159

   // $VF: synthetic method
   public Class loadClass(String var1, boolean var2) {
      Class440 var3 = this;
      Class var4 = null;// 330
      if ((var4 = (Class)this.field1290.get(var1)) == null) {// 555
         int var5;
         int var10000 = var5 = 0;

         while (true) {
            if (var10000 >= var3.field1291.length) {
               var11 = var4;// 198
               break;
            }

            if (var1.startsWith(var3.field1291[var5])) {// 87
               var11 = var4 = var3.getParent().loadClass(var1);// 586
               break;// 399
            }

            var10000 = ++var5;// 428
         }

         label36: {
            if (var11 == null) {
               Class205 var6 = null;// 424
               Class205 var12;
               if (var1.indexOf("$$BCEL$$") >= 0) {// 329
                  var12 = var6 = var3.method877(var1);// 412
               } else {
                  if ((var6 = var3.field1289.method443(var1)) == null) {// 257
                     throw new ClassNotFoundException(var1);// 148
                  }

                  var12 = var6 = var3.method878(var6);// 269
               }

               if (var12 != null) {// 39
                  byte[] var9 = var6.method207();// 368
                  var4 = var3.defineClass(var1, var9, 0, var9.length);// 99
                  var13 = var2;
                  break label36;// 160
               }

               var4 = Class.forName(var1);// 40
            }

            var13 = var2;// 550
         }

         if (var13) {
            var3.resolveClass(var4);// 510
         }
      }

      var3.field1290.put(var1, var4);// 82
      return var4;// 83
   }

   // $VF: synthetic method
   public Class440(ClassLoader var1) {
      super(var1);
      this.field1289 = Class250.method445();// 553
      this.field1291 = field1292;// 6 144
      this.field1289 = new Class249(var1);// 461
   }// 358

   // $VF: synthetic method
   public Class205 method877(String var1) {
      String var6 = var1.substring(var1.indexOf("$$BCEL$$") + 8);// 248 440
      Class205 var3 = null;// 97

      try {
         byte[] var7 = Class523.method1527(var6, true);// 468
         var3 = new Class410(new ByteArrayInputStream(var7), "foo").method765();// 138 285
      } catch (Throwable var5) {// 119
         var5.printStackTrace();// 32
         return null;// 238
      }

      Class149 var8;
      Class182 var4 = (Class182)(var8 = var3.method94()).method171(var3.method92(), (byte)7);// 220 423 525
      ((Class191)var8.method171(var4.method2(), (byte)1)).method131(var1.replace('.', '/'));// 291 336
      return var3;// 57
   }

   // $VF: synthetic method
   public Class205 method878(Class205 var1) {
      return var1;// 24
   }

   // $VF: synthetic method
   public Class440(String[] var1) {
      this.field1289 = Class250.method445();// 190
      this.field1291 = var1;// 146 567
   }// 400
}
