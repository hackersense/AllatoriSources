package mapped;

// $VF: Compiled from oq
public class Class538 {
   // $VF: synthetic field
   public static String field1830 = "disable";
   // $VF: synthetic field
   public static String field1831 = "enable";
   // $VF: synthetic field
   public static String field1832 = "maximum";
   // $VF: synthetic field
   public static Object[][] field1833 = new Object[][]{{"string-encryption", Class503.class}, {"", ""}, {"", ""}};

   // $VF: synthetic method
   public static Class502 method1628(String var0) {
      String var1 = var0;

      for (int var10000 = var4 = field1833.length - 1; var10000 >= 0; var10000 = --var4) {// 557
         if (var1.equals(field1833[var4][0])) {// 34
            Class var2 = (Class)field1833[var4][1];// 332

            try {
               return (Class502)var2.newInstance();// 30
            } catch (Exception var3) {
               throw new Class225("Cannot instantiate property class");// 252
            }
         }
      }

      throw new Class225("Unknown property");// 310
   }
}
