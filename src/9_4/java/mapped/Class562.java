package mapped;

// $VF: Compiled from ux
public class Class562 {
   // $VF: synthetic field
   public Class556 field1974;
   // $VF: synthetic field
   public final Class580 field1975;
   // $VF: synthetic field
   public String field1976;

   // $VF: synthetic method
   public void method1802(String var1) {
      this.field1976 = var1;// 1394
   }// 1662

   // $VF: synthetic method
   public boolean method1803(Class338 var1, Class206 var2, Class208 var3) {
      if (var1 == null) {// 1094
         return false;
      } else {
         return this.field1974.method1771() == 0 ? false : this.field1974.method1767(var1, var2, var3) > 0;// 1131 1626
      }
   }

   // $VF: synthetic method
   public String method1804() {
      return this.field1976;// 1113
   }

   // $VF: synthetic method
   public Class562(Class580 var1) {
      this.field1975 = var1;
      this.field1974 = new Class556(0);// 1305
      this.field1976 = null;// 1250 1603
   }

   // $VF: synthetic method
   public void method1805(Class587 var1) {
      this.field1974.method1768(var1);// 1466
   }// 1572
}
