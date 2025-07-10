package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// $VF: Compiled from kb
public final class Class453 {
   // $VF: synthetic field
   public List field1374;
   // $VF: synthetic field
   public List field1375 = new Vector();

   // $VF: synthetic method
   public Class571 method954(int var1) {
      return (Class571)this.field1375.get(var1);// 466
   }

   // $VF: synthetic method
   public int method955() {
      return this.field1375.size();// 330
   }

   // $VF: synthetic method
   public void method956() {
      this.method960(0);// 33
   }// 0

   // $VF: synthetic method
   public ArrayList method957(int var1) {
      return (ArrayList)this.field1374.get(var1);// 68
   }

   // $VF: synthetic method
   public Class453() {
      this.field1374 = new Vector();// 358 461
   }

   // $VF: synthetic method
   public boolean method958() {
      return this.field1375.isEmpty();// 146
   }

   // $VF: synthetic method
   public Class453(Class349 var1) {
      this();// 144
   }

   // $VF: synthetic method
   public void method959(Class571 var1, ArrayList var2) {
      this.field1375.add(var1);// 574
      this.field1374.add(var2);// 272
   }// 321

   // $VF: synthetic method
   public void method960(int var1) {
      this.field1375.remove(var1);// 246
      this.field1374.remove(var1);// 552
   }// 603
}
