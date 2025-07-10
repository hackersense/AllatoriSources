package mapped;

// $VF: Compiled from da
public class Class493 implements Class494 {
   // $VF: synthetic method
   @Override
   public boolean method1324(Class10 var1, Class10 var2) {
      if (var1.field3 == var2.field3) {// 93
         if (!(var1 instanceof Class113)) {// 151
            if (var1 instanceof Class90) {// 123
               if (((Class90)var1).field12 == ((Class90)var2).field12) {// 78
                  return true;
               }

               return false;
            }

            if (var1 instanceof Class18) {// 418
               return ((Class18)var1).method27().equals(((Class18)var2).method27());// 533
            }

            if (var1 instanceof Class278) {// 406
               if (((Class278)var1).method2() == ((Class278)var2).method2()) {// 1
                  return true;
               }

               return false;
            }

            if (var1 instanceof Class294) {// 170
               if (((Class294)var1).method142() == ((Class294)var2).method142()) {// 553
                  return true;
               }

               return false;
            }

            return true;// 190
         }

         Class246[] var3 = ((Class113)var1).method39();// 530
         Class246[] var4 = ((Class113)var2).method39();// 491
         if (var3.length == var4.length) {// 147
            int var5;
            for (int var10000 = var5 = 0; var10000 < var3.length; var10000 = ++var5) {// 295
               if (var3[var5] != var4[var5]) {// 338
                  return false;// 273
               }
            }

            return true;// 580
         }
      }

      return false;// 132
   }
}
