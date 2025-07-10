package mapped;

// $VF: Compiled from yb
public final class Class495 {
   // $VF: synthetic field
   public static final int field1643 = 6;
   // $VF: synthetic field
   public Class534[] field1644 = new Class534[6];
   // $VF: synthetic field
   public int field1645;

   // $VF: synthetic method
   public void method1325(Class534 var1) {
      Class495 var4 = this;

      for (Class534 var5 = var3 = var1; var5 != null; var5 = var3 = var3.field1800) {// 186 414 543
         if (!var4.method1326(var3)) {// 175
            var4.method1327(var3);// 276
         }
      }
   }// 319

   // $VF: synthetic method
   public boolean method1326(Class534 var1) {
      Class495 var2 = this;

      for (int var10000 = var3 = 0; var10000 < var2.field1645; var10000 = ++var3) {// 539
         if (var2.field1644[var3].field1801.equals(var1.field1801)) {// 388
            return true;// 120
         }
      }

      return false;// 347
   }

   // $VF: synthetic method
   public void method1327(Class534 var1) {
      if (this.field1645 >= this.field1644.length) {// 529
         Class534[] var3;
         Class534[] var10001 = var3 = new Class534[this.field1644.length + 6];// 106
         System.arraycopy(this.field1644, 0, var3, 0, this.field1645);// 569
         this.field1644 = var10001;// 445
      }

      this.field1644[this.field1645++] = var1;// 327
   }// 527

   // $VF: synthetic method
   public Class534[] method1328() {
      Class534[] var2 = new Class534[this.field1645];// 559
      System.arraycopy(this.field1644, 0, var2, 0, this.field1645);// 452
      return var2;// 187
   }
}
