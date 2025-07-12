package mapped;

// $VF: Compiled from rq
public class Class345 extends Class342 {
   // $VF: synthetic field
   public final ClassLoader field1004;
   // $VF: synthetic field
   public final Class446 field1005;

   // $VF: synthetic method
   @Override
   public String method625(String var1, String var2) {
      Class345 var3 = this;

      Class var4;
      Class var5;
      try {
         var5 = Class.forName(var1.replace('/', '.'), false, var3.field1004);// 394
         var4 = Class.forName(var2.replace('/', '.'), false, var3.field1004);// 556
      } catch (ClassNotFoundException var6) {// 316
         if (!Class446.method920(this.field1005).contains(var6.getMessage())) {// 207
            Class446.method920(this.field1005).add(var6.getMessage());// 275
            Logger.error("CLASS NOT FOUND: " + var6.getMessage());
            Logger.error("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");// 355
         }

         return "java/lang/Object";// 369
      } catch (NoClassDefFoundError var7) {// 215
         if (!Class446.method920(this.field1005).contains(var7.getMessage())) {// 511
            Class446.method920(this.field1005).add(var7.getMessage());// 382
            Logger.error("CLASS NOT FOUND: " + var7.getMessage());
            Logger.error("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");// 576
         }

         return "java/lang/Object";// 548
      } catch (Exception var8) {// 545
         throw new RuntimeException(var8.toString());
      } catch (UnsupportedClassVersionError var9) {// 523
         if (!Class446.method923(this.field1005)) {// 162
            Class446.method925(this.field1005, true);// 282
            Logger.error("SOME CLASS(ES) CANNOT BE READ DUE TO JVM VERSION INCOMPATIBILITY: " + var9.toString());
            Logger.error("  USE NEWER JVM VERSION TO RUN ALLATORI.");// 549
         }

         return "java/lang/Object";// 76
      } catch (Error var10) {// 145
         return "java/lang/Object";// 390
      }

      if (var5.isAssignableFrom(var4)) {// 127 210 503 520 570 573
         return var1;// 502
      } else if (var4.isAssignableFrom(var5)) {// 172
         return var2;// 564
      } else if (!var5.isInterface() && !var4.isInterface()) {// 281
         while (!(var5 = var5.getSuperclass()).isAssignableFrom(var4)) {// 181 433
         }

         return var5.getName().replace('.', '/');// 125
      } else {
         return "java/lang/Object";// 438
      }
   }

   // $VF: synthetic method
   public Class345(Class446 var1, int var2, ClassLoader var3) {
      super(var2);// 417
      this.field1005 = var1;
      this.field1004 = var3;
   }
}
