package mapped;

import java.util.Iterator;
import java.util.NoSuchElementException;

// $VF: Compiled from tk
public class Class597 implements Iterator {
   // $VF: synthetic field
   public Class246 field2387;
   // $VF: synthetic field
   public final Class251 field2388;

   // $VF: synthetic method
   public Object next() {
      if (this.field2387 == null) {// 1483
         throw new NoSuchElementException();// 1170
      } else {
         Class246 var2 = this.field2387;// 1558
         this.field2387 = this.field2387.field838;// 1217
         return var2;// 1196
      }
   }

   // $VF: synthetic method
   public void remove() {
      throw new UnsupportedOperationException();// 1191
   }

   // $VF: synthetic method
   public Class597(Class251 var1) {
      this.field2388 = var1;// 1560
      this.field2387 = Class251.method466(this.field2388);// 1135
   }

   // $VF: synthetic method
   public boolean hasNext() {
      return this.field2387 != null;// 1062
   }
}
