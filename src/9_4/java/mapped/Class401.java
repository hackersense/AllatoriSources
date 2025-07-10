package mapped;

// $VF: Compiled from wj
public class Class401 implements Class399 {
   // $VF: synthetic method
   @Override
   public boolean method748(Object var1, Object var2) {
      var1 = var1;// 272
      Class203 var3 = (Class203)var2;// 321
      return var1.method20().equals(var3.method20()) && var1.method93().equals(var3.method93());// 179
   }

   // $VF: synthetic method
   @Override
   public int method749(Object var1) {
      Class203 var2;
      return (var2 = (Class203)var1).method93().hashCode() ^ var2.method20().hashCode();// 240 246
   }
}
