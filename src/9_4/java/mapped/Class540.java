package mapped;

// $VF: Compiled from xb
public abstract class Class540 {
   // $VF: synthetic field
   public Class540 field1837;
   // $VF: synthetic field
   public final int field1838;

   // $VF: synthetic method
   public Class353 method1634(String var1, boolean var2) {
      return this.field1837 != null ? this.field1837.method1634(var1, var2) : null;// 415 555 579
   }

   // $VF: synthetic method
   public Class540(int var1) {
      this(var1, null);// 1
   }// 46

   // $VF: synthetic method
   public Class540 method1635() {
      return this.field1837;// 246
   }

   // $VF: synthetic method
   public void method1636(Class534 var1) {
      if (this.field1837 != null) {// 83
         this.field1837.method1636(var1);// 5
      }
   }// 450

   // $VF: synthetic method
   public Class540(int var1, Class540 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {// 495
         throw new IllegalArgumentException(method1637(var1));// 6
      } else {
         if (var1 == 17432576) {// 461
            Class457.method984(this);// 358
         }

         this.field1838 = var1;
         this.field1837 = var2;// 272 574
      }
   }// 321

   // $VF: synthetic method
   public static String method1637(int var0) {
      return "Unsupported api " + var0;
   }

   // $VF: synthetic method
   public Class353 method1638(int var1, Class573 var2, String var3, boolean var4) {
      if (this.field1838 < 327680) {// 148
         throw new UnsupportedOperationException("This feature requires ASM5");// 236
      } else {
         return this.field1837 != null ? this.field1837.method1638(var1, var2, var3, var4) : null;// 39 160 368
      }
   }

   // $VF: synthetic method
   public void method1639() {
      if (this.field1837 != null) {// 600
         this.field1837.method1639();// 108
      }
   }// 242
}
