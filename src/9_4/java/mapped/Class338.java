package mapped;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

// $VF: Compiled from ew
public class Class338 {
   // $VF: synthetic field
   public Hashtable field943 = new Hashtable();
   // $VF: synthetic field
   public Hashtable field944;
   // $VF: synthetic field
   public Hashtable field945 = new Hashtable();
   // $VF: synthetic field
   public HashSet field946 = new HashSet();
   // $VF: synthetic field
   public ClassLoader field947;
   // $VF: synthetic field
   public Vector field948 = new Vector();
   // $VF: synthetic field
   public Hashtable field949;

   // $VF: synthetic method
   public void method552(Class206 var1, String var2) {
      if (!"java.lang.Object".equals(var1.method93())) {// 239
         if (this.field943.containsKey(var1.method93())) {// 310
            this.field946.add(var1);// 498
         } else {
            this.field943.put(var1.method93(), var1);// 409
            this.field945.put(var1.method93(), var2);// 389
         }
      }
   }// 484 513

   // $VF: synthetic method
   public Iterator method553() {
      return this.field943.values().iterator();// 132
   }

   // $VF: synthetic method
   public int method554() {
      return this.field943.size();// 272
   }

   // $VF: synthetic method
   public String method555(String var1) {
      return (String)this.field944.get(var1);// 567
   }

   // $VF: synthetic method
   public String method556(String var1) {
      return (String)this.field949.get(var1);// 240
   }

   // $VF: synthetic method
   public Class206 method557(String var1) {
      return (Class206)this.field943.get(var1);// 418
   }

   // $VF: synthetic method
   public boolean method558(Class206 var1) {
      return this.field946.contains(var1);// 58
   }

   // $VF: synthetic method
   public ClassLoader method559() {
      return this.field947;// 461
   }

   // $VF: synthetic method
   public void method560(Class206 var1) {
      this.field943.put(var1.method93(), var1);// 495
      this.field948.add(var1);// 159
   }// 493

   // $VF: synthetic method
   public String method561(Class206 var1) {
      return (String)this.field945.get(var1.method93());// 1
   }

   // $VF: synthetic method
   public void method562(Class206 var1, String var2, String var3) {
      this.method552(var1, var2);// 530
      this.field944.put(var2 + '#' + var3, var1.method93());// 491
      String var4 = new StringBuilder().insert(0, var1.method93().replace('.', '/')).append(".class").toString();// 147
      if (var3.endsWith(var4)) {// 295
         String var6 = var3.substring(0, var3.length() - var4.length());// 338
         this.field949.put(var2 + '#' + var1.method93(), var6);// 273
      }
   }// 226

   // $VF: synthetic method
   public Class338(Class439 var1) {
      this.field944 = new Hashtable();// 7 557
      this.field949 = new Hashtable();// 335
      this.field947 = var1;// 34
      var1.method876(this);// 332
   }// 260

   // $VF: synthetic method
   public Vector method563() {
      return this.field948;// 604
   }
}
