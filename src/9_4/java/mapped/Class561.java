package mapped;

// $VF: Compiled from ia
public class Class561 extends Class560 {
   // $VF: synthetic field
   public boolean field1970;
   // $VF: synthetic field
   public final StringBuilder field1971;
   // $VF: synthetic field
   public int field1972 = 1;
   // $VF: synthetic field
   public boolean field1973;

   // $VF: synthetic method
   @Override
   public Class560 method1784() {
      this.field1971.append('^');// 450
      return this;// 386
   }

   // $VF: synthetic method
   @Override
   public void method1788() {
      this.method1801();// 177
      this.field1971.append(';');// 266
   }// 235

   // $VF: synthetic method
   @Override
   public Class560 method1796() {
      this.method1800();// 269
      if (!this.field1970) {// 455
         this.field1970 = true;// 148
         this.field1971.append('(');// 236
      }

      return this;// 39
   }

   // $VF: synthetic method
   public Class561() {
      this(new StringBuilder());// 6
   }// 144

   // $VF: synthetic method
   public void method1800() {
      if (this.field1973) {// 251
         this.field1973 = false;// 486
         this.field1971.append('>');// 117
      }
   }// 245

   // $VF: synthetic method
   @Override
   public Class560 method1797() {
      return this;// 588
   }

   // $VF: synthetic method
   @Override
   public Class560 method1789() {
      return this;// 391
   }

   // $VF: synthetic method
   @Override
   public void method1785(char var1) {
      this.field1971.append(var1);// 286
   }// 600

   // $VF: synthetic method
   @Override
   public void method1799(String var1) {
      if (!this.field1973) {// 240
         this.field1973 = true;// 246
         this.field1971.append('<');// 552
      }

      this.field1971.append(var1);// 278
      this.field1971.append(':');// 466
   }// 467

   // $VF: synthetic method
   @Override
   public void method1791(String var1) {
      this.method1801();// 238
      this.field1971.append('.');// 423
      this.field1971.append(var1);// 61
      this.field1972 <<= 1;// 593
   }// 336

   // $VF: synthetic method
   @Override
   public Class560 method1795(char var1) {
      if ((this.field1972 & 1) == 0) {// 268
         this.field1972 |= 1;// 497
         this.field1971.append('<');// 66
      }

      if (var1 != '=') {// 307
         this.field1971.append(var1);// 218
      }

      return (this.field1972 & -2147483648) == 0 ? this : new Class561(this.field1971);// 15
   }

   // $VF: synthetic method
   @Override
   public void method1792() {
      if ((this.field1972 & 1) == 0) {// 314
         this.field1972 |= 1;// 137
         this.field1971.append('<');// 50
      }

      this.field1971.append('*');// 135
   }// 474

   // $VF: synthetic method
   @Override
   public Class560 method1790() {
      this.field1971.append(':');// 73
      return this;// 415
   }

   // $VF: synthetic method
   public void method1801() {
      if ((this.field1972 & 1) == 1) {// 556
         this.field1971.append('>');// 316
      }

      this.field1972 >>>= 1;// 275
   }// 127

   // $VF: synthetic method
   @Override
   public void method1786(String var1) {
      this.field1971.append('L');// 440
      this.field1971.append(var1);// 248
      this.field1972 <<= 1;// 468
   }// 138

   // $VF: synthetic method
   @Override
   public Class560 method1793() {
      this.field1971.append('[');// 31
      return this;// 21
   }

   // $VF: synthetic method
   @Override
   public Class560 method1783() {
      this.method1800();// 63
      if (!this.field1970) {// 541
         this.field1971.append('(');// 550
      }

      this.field1971.append(')');// 456
      return this;// 367
   }

   // $VF: synthetic method
   @Override
   public void method1787(String var1) {
      this.field1971.append('T');// 94
      this.field1971.append(var1);// 209
      this.field1971.append(';');// 69
   }// 116

   // $VF: synthetic method
   @Override
   public Class560 method1798() {
      this.method1800();// 399
      return this;// 232
   }

   // $VF: synthetic method
   public Class561(StringBuilder var1) {
      super(589824);
      this.field1971 = var1;// 192 574
   }// 272
}
