package mapped;

import java.util.Vector;

// $VF: Compiled from ps
public class Class375 implements Class360 {
   // $VF: synthetic field
   public boolean field1172;
   // $VF: synthetic field
   public boolean field1173;
   // $VF: synthetic field
   public static Vector field1174 = new Vector();
   // $VF: synthetic field
   public int field1175 = 0;
   // $VF: synthetic field
   public Class360 field1176;
   // $VF: synthetic field
   public static Vector field1177 = new Vector();

   // $VF: synthetic method
   @Override
   public void method709() {
      this.field1175 = 0;// 239
      this.field1176.method709();// 310
   }// 498

   // $VF: synthetic method
   @Override
   public String method710() {
      if (this.field1172 && this.field1175 < field1174.size()) {// 34
         return (String)field1174.get(this.field1175++);// 332
      } else {
         return this.field1173 && this.field1175 < field1177.size() ? (String)field1177.get(this.field1175++) : this.field1176.method710();// 30 143 260
      }
   }

   // $VF: synthetic method
   public static void method714(String var0) {
      if (var0.charAt(0) != '<' && !"main".equals(var0)) {// 530
         if (!field1177.contains(var0)) {// 491
            field1177.add(var0);
         }
      }
   }// 147

   // $VF: synthetic method
   public static void method715() {
      field1174 = new Vector();// 273
      field1177 = new Vector();// 161
   }// 141

   // $VF: synthetic method
   public Class375(Class360 var1, boolean var2, boolean var3) {
      this.field1176 = var1;// 52
      this.field1172 = var2;// 10
      this.field1173 = var3;// 7 26
   }// 335

   // $VF: synthetic method
   public static void method712(String var0) {
      if (!field1174.contains(var0)) {// 18
         field1174.add(var0);
      }
   }// 513
}
