package mapped;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// $VF: Compiled from hg
public class Class557 {
   // $VF: synthetic field
   public ClassLoader field1962;

   // $VF: synthetic method
   public static ClassLoader method1772() {
      String var0;
      if ((var0 = System.getProperty("bcel.classloader")) == null || "".equals(var0)) {// 161 273
         var0 = Class440.class.getCanonicalName();// 141
      }

      try {
         return (ClassLoader)Class.forName(var0).newInstance();// 123
      } catch (Exception var2) {// 78
         throw new RuntimeException(var2.toString());// 418
      }
   }

   // $VF: synthetic method
   public static void main(String[] var0) {
      if (var0.length == 0) {// 87
         System.out.println("Missing class name.");// 586
      } else {
         String var1 = var0[0];// 463
         String[] var3 = new String[var0.length - 1];// 198
         System.arraycopy(var0, 1, var3, 0, var3.length);// 424
         new Class557().method1773(var1, var3);// 588
      }
   }// 329 399

   // $VF: synthetic method
   public void method1773(String var1, String[] var2) {
      Class var8 = this.field1962.loadClass(var1);// 604
      Method var4 = null;// 22

      try {
         Method var10000 = var4 = var8.getMethod("main", var2.getClass());// 144
         int var9 = var10000.getModifiers();// 272
         Class var5 = var10000.getReturnType();// 321
         if (!Modifier.isPublic(var9) || !Modifier.isStatic(var9) || Modifier.isAbstract(var9) || var5 != void.class) {// 179
            throw new NoSuchMethodException();// 567
         }
      } catch (NoSuchMethodException var7) {// 33
         System.out.println("In class " + var1 + ": public static void main(String[] argv) is not defined");// 0
         return;// 246
      }

      try {
         var4.invoke(null, var2);// 278
      } catch (Exception var6) {// 485
         var6.printStackTrace();// 68
      }
   }// 59 391

   // $VF: synthetic method
   public Class557() {
      this(method1772());// 465
   }// 132

   // $VF: synthetic method
   public Class557(ClassLoader var1) {
      this.field1962 = var1;// 46 170
   }// 553
}
