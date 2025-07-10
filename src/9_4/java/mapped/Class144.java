package mapped;

// $VF: Compiled from cj
public class Class144 extends Class137 {
   // $VF: synthetic field
   public String field599;

   /** @deprecated */
   // $VF: synthetic method
   public boolean method159() {
      try {
         return !Class411.method790(this.field599).method329();// 278 466
      } catch (ClassNotFoundException var1) {
         return false;// 485
      }
   }

   // $VF: synthetic method
   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class144 ? ((Class144)var1).field599.equals(this.field599) : false;// 190
   }

   // $VF: synthetic method
   public String method93() {
      return this.field599;// 141
   }

   // $VF: synthetic method
   public boolean method160(Class144 var1) {
      Class205 var3;
      return (var3 = Class411.method790(this.field599)).method252() ? true : Class411.method790(var1.field599).method343().equals(var3.method343());// 27 94 108 209 600
   }

   // $VF: synthetic method
   public Class144(String var1) {
      super((byte)14, "L" + var1.replace('.', '/') + ";");
      this.field599 = var1.replace('/', '.');// 151 530
   }// 491

   // $VF: synthetic method
   public boolean method161() {
      return !Class411.method790(this.field599).method329();// 142 236
   }

   // $VF: synthetic method
   @Override
   public int hashCode() {
      return this.field599.hashCode();// 185
   }

   // $VF: synthetic method
   public boolean method162(Class144 var1) {
      return !this.method159() && !var1.method159() ? Class411.method779(this.field599, var1.field599) : false;// 83 367 456
   }

   /** @deprecated */
   // $VF: synthetic method
   public boolean method163() {
      try {
         return Class411.method790(this.field599).method329();// 144 461
      } catch (ClassNotFoundException var1) {
         return false;// 192
      }
   }

   // $VF: synthetic method
   public boolean method101() {
      return Class411.method790(this.field599).method329();// 232 399
   }
}
