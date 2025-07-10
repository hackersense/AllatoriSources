package mapped;

import java.util.Hashtable;
import java.util.Vector;

// $VF: Compiled from is
public class Class555 {
   // $VF: synthetic field
   public Class499 field1956;
   // $VF: synthetic field
   public Class499 field1957;
   // $VF: synthetic field
   public Hashtable field1958 = new Hashtable();
   // $VF: synthetic field
   public Vector field1959;

   // $VF: synthetic method
   public boolean method1761(String var1) {
      return this.field1958.containsKey(var1);// 530
   }

   // $VF: synthetic method
   public String method1762(String var1) {
      Vector var3;
      return (var3 = (Vector)this.field1958.get(var1)).size() > 0 ? Class582.method1945((Class582)var3.get(0)) : null;// 161 273 338
   }

   // $VF: synthetic method
   public void method1763(String var1, String var2, int var3, int var4) {
      if (!this.field1958.containsKey(var1)) {// 409
         this.field1958.put(var1, new Vector());// 389
      }

      ((Vector)this.field1958.get(var1)).add(new Class582(var2, var3, var4, null));// 18
   }// 513

   // $VF: synthetic method
   public void method1764(String var1, String var2) {
      this.method1763(var1, var2, -1, -1);// 239
   }// 310

   // $VF: synthetic method
   public String method1765(String var1, int var2) {
      for (Class582 var5 : var6 = (Vector)this.field1958.get(var1)) {// 78 123
         if (var2 >= Class582.method1944(var5) && var2 <= Class582.method1946(var5)) {// 418
            return Class582.method1945(var5);
         }
      }

      return var6.size() > 0 ? Class582.method1945((Class582)var6.get(0)) : null;// 185 406
   }
}
