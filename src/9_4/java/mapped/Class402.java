package mapped;

// $VF: Compiled from oy
public class Class402 implements Class399 {
   // $VF: synthetic field
   public static Class402 field1211 = new Class402();

   // $VF: synthetic method
   @Override
   public boolean method748(Object var1, Object var2) {
      var1 = var1;// 403
      Class208 var3 = (Class208)var2;// 537
      return var1.method190().equals(var3.method190()) && var1.method20().equals(var3.method20());// 222
   }

   // $VF: synthetic method
   public static Class402 method750() {
      return field1211;// 30
   }

   // $VF: synthetic method
   @Override
   public int method749(Object var1) {
      Class208 var2;
      return (var2 = (Class208)var1).method20().hashCode() ^ var2.method190().hashCode();// 7 10
   }
}
