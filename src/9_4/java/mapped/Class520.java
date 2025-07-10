package mapped;

// $VF: Compiled from ux
public class Class520 {
   // $VF: synthetic field
   public Class556 field1763;
   // $VF: synthetic field
   public Class556 field1764;
   // $VF: synthetic field
   public final Class580 field1765;

   // $VF: synthetic method
   public boolean method1473(Class338 var1, Class206 var2, Class207 var3) {
      if (var1 == null) {// 1369
         return true;
      } else {
         return this.field1764.method1771() == 0 ? false : this.field1764.method1769(var1, var2, var3) > 0;// 1019 1116 1438
      }
   }

   // $VF: synthetic method
   public void method1474(Class587 var1) {
      this.field1763.method1768(var1);// 1550
   }// 1656

   // $VF: synthetic method
   public Class520(Class580 var1) {
      this.field1765 = var1;// 1165
      this.field1764 = new Class556(0);// 1435
      this.field1763 = new Class556(0);// 1164
   }

   // $VF: synthetic method
   public boolean method1475(Class338 var1, Class206 var2, Class208 var3) {
      if (var1 == null) {// 1076
         return true;
      } else {
         return this.field1763.method1771() == 0 ? var3.method163() : this.field1763.method1767(var1, var2, var3) > 0;// 1581 1655
      }
   }

   // $VF: synthetic method
   public void method1476(Class587 var1) {
      this.field1764.method1768(var1);// 1053
   }// 1213
}
