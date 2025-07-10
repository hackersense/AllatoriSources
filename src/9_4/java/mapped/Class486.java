package mapped;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

// $VF: Compiled from se
public class Class486 implements Class487, ListModel {
   // $VF: synthetic field
   public TreeSet field1625;
   // $VF: synthetic field
   public ArrayList field1626 = new ArrayList();

   // $VF: synthetic method
   public synchronized void removeListDataListener(ListDataListener var1) {
      this.field1626.remove(var1);// 132
   }// 184

   // $VF: synthetic method
   public Class486() {
      this.field1625 = new TreeSet();// 484
      Class545.method1690(this);// 513
      this.method1310(null);// 18 93
   }// 151

   // $VF: synthetic method
   public synchronized int getSize() {
      return this.field1625.size();// 159
   }

   // $VF: synthetic method
   public synchronized void addListDataListener(ListDataListener var1) {
      this.field1626.add(var1);// 553
   }// 58

   // $VF: synthetic method
   public synchronized Object getElementAt(int var1) {
      return this.field1625.toArray()[var1];// 22
   }

   // $VF: synthetic method
   @Override
   public synchronized void method1310(String var1) {
      Class486 var2 = this;
      int var7 = this.field1626.size();// 295
      Class576[] var4;
      int var3 = (var4 = Class545.method1688()).length;// 273 338
      int var10000 = 0;
      this.field1625.clear();// 161

      for (int var5 = 0; var10000 < var3; var10000 = var5) {// 141
         var2.field1625.add(var4[var5++].method1913());// 580
      }

      for (int var9 = var6 = 0; var9 < var7; var9 = var6) {// 123
         ListDataEvent var8 = new ListDataEvent(var2, 0, 0, var3 - 1);// 78
         ListDataListener var10 = (ListDataListener)var2.field1626.get(var6);// 533
         var6++;
         var10.contentsChanged(var8);
      }
   }// 406
}
