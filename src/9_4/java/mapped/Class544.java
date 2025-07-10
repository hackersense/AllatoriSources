package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from ae
public class Class544 {
   // $VF: synthetic field
   public Class149 field1871;
   // $VF: synthetic field
   public int field1872;
   // $VF: synthetic field
   public Class332 field1873;

   // $VF: synthetic method
   public String method1681() {
      return ((Class191)this.field1871.method171(this.field1872, (byte)1)).method20();// 78 226
   }

   // $VF: synthetic method
   public String method1682() {
      StringBuffer var10000 = new StringBuffer();
      var10000.append(this.method1681()).append("=").append(this.method1684().method531());// 488
      return var10000.toString();// 159
   }

   // $VF: synthetic method
   public Class544(int var1, Class332 var2, Class149 var3) {
      this.field1873 = var2;// 147
      this.field1872 = var1;// 295
      this.field1871 = var3;// 338 491
   }// 273

   // $VF: synthetic method
   public int method1683() {
      return this.field1872;// 190
   }

   // $VF: synthetic method
   public final Class332 method1684() {
      return this.field1873;// 1
   }

   // $VF: synthetic method
   public void method1685(DataOutputStream var1) {
      var1.writeShort(this.field1872);// 604
      this.field1873.method527(var1);// 22
   }// 6
}
