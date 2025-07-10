package mapped;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// $VF: Compiled from gz
public class Class467 {
   // $VF: synthetic field
   public static String field1527 = "allatori-custom-12321-32123:";

   // $VF: synthetic method
   public static String method1050(String var0, ClassLoader var1, String var2, String var3) {
      String var4 = var0;
      String[] var9 = null;// 226

      try {
         int var5 = Integer.parseInt(var4.substring(var4.indexOf(91) + 1, var4.indexOf(93)));// 78
         var4 = var4.substring(var4.indexOf(93) + 1);// 418
         String var10;
         if ((// 46
               var10 = (String)Class.forName((var9 = (String[])Class580.method1932().method1855().get(var5))[0], true, var1)// 185 533
                  .getDeclaredMethod(var9[1], String.class, String.class, String.class)// 406
                  .invoke(null, var4, var2, var3)// 1
            )
            == null) {
            Class528.method1559("Custom string encryption error: null value is returned by " + var9[0] + "." + var9[1] + "()");// 170
            throw new NullPointerException();// 553
         } else {
            return var10;// 190
         }
      } catch (ClassNotFoundException var6) {// 315
         Class528.method1559("Cannot load custom string encryption class (class not found): " + var9[0]);// 465
         return var4;
      } catch (NoSuchMethodException var7) {// 132
         Class528.method1559("Cannot find custom string encryption method: " + var9[0] + "." + var9[1] + "()");// 184
         return var4;// 495
      } catch (Exception var8) {// 534
         Class528.method1559("Custom string encryption error: " + var8.getMessage());// 488
         return var4;// 159
      }
   }

   // $VF: synthetic method
   public static String method1051(String var0, int var1, ClassLoader var2) {
      String var3 = var0;
      String[] var10 = (String[])Class580.method1932().method1855().get(var1);// 335

      try {
         Class var11 = Class.forName(var10[0], true, var2);// 557

         try {
            Method var4;
            if (!Modifier.isStatic((var4 = var11.getDeclaredMethod(var10[1], String.class)).getModifiers()) || !Modifier.isPublic(var4.getModifiers())) {// 260 332
               Class528.method1559("Custom string encryption method is not static and public: " + var10[0] + "." + var10[1] + "()");// 30
            }

            String var12;
            if ((var12 = (String)var4.invoke(null, var3)) == null) {// 143 252
               Class528.method1559("Custom string encryption error: null value is returned by " + var10[0] + "." + var10[1] + "()");// 20
               throw new NullPointerException();// 204
            } else {
               return var12;// 310
            }
         } catch (NoSuchMethodException var6) {// 498
            Method var5;
            if (!Modifier.isStatic((var5 = var11.getDeclaredMethod(var10[1], String.class, String.class, String.class)).getModifiers())// 409 484
               || !Modifier.isPublic(var5.getModifiers())) {
               Class528.method1559("Custom string encryption method is not static and public: " + var10[0] + "." + var10[1] + "()");// 389
            }

            return field1527 + '[' + var1 + ']' + var3;// 18
         }
      } catch (ClassNotFoundException var7) {// 93
         Class528.method1559("Cannot load custom string encryption class (class not found): " + var10[0]);// 151
         return var0;
      } catch (NoSuchMethodException var8) {// 530
         Class528.method1559("Cannot find custom string encryption method: " + var10[0] + "." + var10[1] + "()");// 491
         return var0;// 338
      } catch (Exception var9) {// 147
         Class528.method1559("Custom string encryption error: " + var9.getMessage());// 295
         return var0;// 273
      }
   }

   // $VF: synthetic method
   public static Class288 method1052(Class120 var0, int var1) {
      String[] var3 = (String[])Class580.method1932().method1855().get(var1);// 604
      return var0.method47(var3[2], var3[3], Class138.field593, new Class138[]{Class138.field593}, (short)184);// 22
   }
}
