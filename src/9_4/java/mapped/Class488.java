package mapped;

// $VF: Compiled from nf
public class Class488 implements Class487 {
   // $VF: synthetic field
   public int field1627 = 0;

   // $VF: synthetic method
   public static void main(String[] var0) {
      if (var0.length != 1) {// 552
         System.out.println("Need exactly one argument: The root class to verify.");// 603
         System.exit(1);// 278
      }

      int var2;
      if ((var2 = var0[0].lastIndexOf(".class")) != -1) {// 467 485
         var0[0] = var0[0].substring(0, var2);// 68
      }

      var0[0] = var0[0].replace('/', '.');
      Class488 var3 = new Class488();// 330
      Class545.method1690(var3);// 589
      Class545.method1689(var0[0]);// 391 579
      Class545.method1686(var3);// 555
   }// 73

   // $VF: synthetic method
   @Override
   public void method1310(String var1) {
      Class488 var11 = this;
      System.gc();// 273

      int var2;
      for (int var13 = var2 = 0; var13 < var11.field1627; var13 = var2) {// 161
         var2++;
         System.out.print(" ");// 141
      }

      System.out.println(var1);// 226
      var11.field1627++;// 123
      Class581 var7;
      Class576 var12;
      if ((var7 = (var12 = Class545.method1689(var1)).method1910()) != Class581.field2340) {// 78 185 533
         System.out.println("Pass 1:\n" + var7);// 406
      }

      Class581 var8;
      if ((var8 = var12.method1912()) != Class581.field2340) {// 46 170
         System.out.println("Pass 2:\n" + var8);// 553
      }

      if (var8 == Class581.field2340) {// 190
         try {
            Class205 var4 = Class411.method790(var12.method1913());// 465

            for (int var3 = 0; var3 < var4.method341().length; var3++) {// 132
               Class581 var9;
               if ((var9 = var12.method1909(var3)) != Class581.field2340) {// 184 534
                  System.out// 488
                     .println(
                        new StringBuilder()
                           .insert(0, var12.method1913())
                           .append(", Pass 3a, method ")
                           .append(var3)
                           .append(" ['")
                           .append(var4.method341()[var3])
                           .append("']:\n")
                           .append(var9)
                           .toString()
                     );
               }

               Class581 var10;
               if ((var10 = var12.method1911(var3)) != Class581.field2340) {// 493 561
                  System.out// 377
                     .println(
                        new StringBuilder()
                           .insert(0, var12.method1913())
                           .append(", Pass 3b, method ")
                           .append(var3)
                           .append(" ['")
                           .append(var4.method341()[var3])
                           .append("']:\n")
                           .append(var10)
                           .toString()
                     );
               }
            }
         } catch (ClassNotFoundException var5) {// 144
            System.err.println("Could not find class " + var12.method1913() + " in Repository");// 461
         }
      }

      var11.field1627--;// 574
   }// 272
}
