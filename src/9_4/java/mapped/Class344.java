package mapped;

// $VF: Compiled from ts
public class Class344 extends Class342 {
   // $VF: synthetic field
   public final Class517 field1002;
   // $VF: synthetic field
   public final ClassLoader field1003;

   // $VF: synthetic method
   @Override
   public String method625(String var1, String var2) {
      Class344 var3 = this;

      Class var4;
      Class var5;
      try {
         var5 = Class.forName(var1.replace('/', '.'), false, var3.field1003);// 149
         var4 = Class.forName(var2.replace('/', '.'), false, var3.field1003);// 157
      } catch (ClassNotFoundException var6) {// 24
         if (!Class517.method1471(this.field1002).contains(var6.getMessage())) {// 286
            Class517.method1471(this.field1002).add(var6.getMessage());// 600
            Class528.method1559("CLASS NOT FOUND: " + var6.getMessage());
            Class528.method1559("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");// 27
         }

         return "java/lang/Object";// 94
      } catch (NoClassDefFoundError var7) {// 209
         if (!Class517.method1471(this.field1002).contains(var7.getMessage())) {// 69
            Class517.method1471(this.field1002).add(var7.getMessage());// 116
            Class528.method1559("CLASS NOT FOUND: " + var7.getMessage());
            Class528.method1559("  ADD NEEDED JAR TO THE 'classpath' ELEMENT OF THE CONFIGURATION FILE.");// 464
         }

         return "java/lang/Object";// 31
      } catch (Exception var8) {// 21
         throw new RuntimeException(var8.toString());
      } catch (UnsupportedClassVersionError var9) {// 223
         if (!Class517.method1467(this.field1002)) {// 45
            Class517.method1466(this.field1002, true);// 23
            Class528.method1559("SOME CLASS(ES) CANNOT BE READ DUE TO JVM VERSION INCOMPATIBILITY: " + var9.toString());
            Class528.method1559("  USE NEWER JVM VERSION TO RUN ALLATORI.");// 468
         }

         return "java/lang/Object";// 285
      } catch (Error var10) {// 119
         return "java/lang/Object";// 32
      }

      if (var5.isAssignableFrom(var4)) {// 108 115 238 422 423 440
         return var1;// 61
      } else if (var4.isAssignableFrom(var5)) {// 220
         return var2;// 593
      } else if (!var5.isInterface() && !var4.isInterface()) {// 540
         while (!(var5 = var5.getSuperclass()).isAssignableFrom(var4)) {// 216 299
         }

         return var5.getName().replace('.', '/');// 314
      } else {
         return "java/lang/Object";// 291
      }
   }

   // $VF: synthetic method
   public Class344(Class517 var1, int var2, ClassLoader var3) {
      super(var2);// 450
      this.field1002 = var1;
      this.field1003 = var3;
   }
}
