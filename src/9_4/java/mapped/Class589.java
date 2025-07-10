package mapped;

import java.util.Hashtable;

// $VF: Compiled from vc
public class Class589 {
   // $VF: synthetic field
   public Hashtable field2360;
   // $VF: synthetic field
   public Hashtable field2361 = new Hashtable();

   // $VF: synthetic method
   public String method1954(int var1) {
      return (String)this.field2360.get(Integer.toString(var1));// 144
   }

   // $VF: synthetic method
   public Class589() {
      this.field2360 = new Hashtable();// 151 513
   }

   // $VF: synthetic method
   public Class138 method1955(int var1) {
      return (Class138)this.field2361.get(Integer.toString(var1));// 184
   }

   // $VF: synthetic method
   public void method1956(String var1, int var2, int var3, Class138 var4) {
      Class589 var5 = this;

      for (int var10000 = var6 = var2; var10000 <= var2 + var3; var10000 = var6) {// 146
         var5.method1957(var6++, var1, var4);// 567
      }
   }// 33

   // $VF: synthetic method
   public void method1957(int var1, String var2, Class138 var3) {
      if (this.method1954(var1) != null && !this.method1954(var1).equals(var2)) {// 467 485
         throw new Class236("At bytecode offset '" + var1 + "' a local variable has two different names: '" + this.method1954(var1) + "' and '" + var2 + "'.");// 68
      } else if (this.method1955(var1) != null && !this.method1955(var1).equals(var3)) {// 330 589
         throw new Class236("At bytecode offset '" + var1 + "' a local variable has two different types: '" + this.method1955(var1) + "' and '" + var3 + "'.");// 579
      } else {
         this.method1958(var1, var2);// 415
         this.method1959(var1, var3);// 398
      }
   }// 428

   // $VF: synthetic method
   public void method1958(int var1, String var2) {
      this.field2360.put(Integer.toString(var1), var2);// 161
   }// 141

   // $VF: synthetic method
   public void method1959(int var1, Class138 var2) {
      this.field2361.put(Integer.toString(var1), var2);// 533
   }// 185
}
