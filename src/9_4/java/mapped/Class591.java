package mapped;

// $VF: Compiled from ej
public abstract class Class591 {
   // $VF: synthetic method
   public static void main(String[] var0) {
      String[] var1 = var0;
      if (var0.length != 1) {// 295
         System.out.println("Verifier front-end: need exactly one argument.");// 338
         System.exit(1);// 273
      }

      int var6;
      if ((var6 = var0[0].lastIndexOf(".class")) != -1) {// 141 580
         var0[0] = var0[0].substring(0, var6);// 226
      }

      var0[0] = var0[0].replace('/', '.');// 78

      try {
         Class.forName(var1[0]);// 185
      } catch (ExceptionInInitializerError var2) {// 406
         System.out.println("NativeVerifier: ExceptionInInitializerError encountered on '" + var0[0] + "'.");// 1
         System.out.println(var2);// 170
         System.exit(1);// 553
      } catch (LinkageError var3) {// 58
         System.out.println("NativeVerifier: LinkageError encountered on '" + var0[0] + "'.");// 190
         System.out.println(var3);// 315
         System.exit(1);// 465
      } catch (ClassNotFoundException var4) {// 132
         System.out.println("NativeVerifier: FILE NOT FOUND: '" + var0[0] + "'.");// 184
         System.exit(1);// 534
      } catch (Throwable var5) {// 488
         System.out.println("NativeVerifier: Unspecified verification error on'" + var0[0] + "'.");// 495
         System.exit(1);// 493
      }

      System.out.println("NativeVerifier: Class file '" + var0[0] + "' seems to be okay.");// 377
      System.exit(0);// 604
   }// 22
}
