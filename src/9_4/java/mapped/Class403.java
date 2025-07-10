package mapped;

// $VF: Compiled from re
public class Class403 implements Class399 {
   // $VF: synthetic method
   @Override
   public boolean method748(Object var1, Object var2) {
      var1 = var1;// 123
      Class204 var3 = (Class204)var2;// 78
      return var1.method20().equals(var3.method20()) && var1.method93().equals(var3.method93());// 418
   }

   // $VF: synthetic method
   @Override
   public int method749(Object var1) {
      Class204 var2;
      return (var2 = (Class204)var1).method93().hashCode() ^ var2.method20().hashCode();// 170 553
   }
}
