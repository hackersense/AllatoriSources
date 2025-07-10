package mapped;

// $VF: Compiled from uv
public abstract class Class343 {
   // $VF: synthetic field
   public final int field1000;
   // $VF: synthetic field
   public Class343 field1001;

   // $VF: synthetic method
   public Class343(int var1) {
      this(var1, null);// 553
   }// 58

   // $VF: synthetic method
   public void method616(String var1, String var2, String var3) {
      if (this.field1001 != null) {// 72
         this.field1001.method616(var1, var2, var3);// 268
      }
   }// 66

   // $VF: synthetic method
   public Class353 method624(int var1, Class573 var2, String var3, boolean var4) {
      if (this.field1000 < 327680) {// 300
         throw new UnsupportedOperationException("TypeAnnotation requires ASM5");// 245
      } else {
         return this.field1001 != null ? this.field1001.method624(var1, var2, var3, var4) : null;// 401 404 417
      }
   }

   // $VF: synthetic method
   public Class455 method643(String var1, String var2, String var3) {
      if (this.field1000 < 524288) {// 183
         throw new UnsupportedOperationException("Record requires ASM8");// 205
      } else {
         return this.field1001 != null ? this.field1001.method643(var1, var2, var3) : null;// 196 249 469
      }
   }

   // $VF: synthetic method
   public static String method648(int var0) {
      return "Unsupported api " + var0;
   }

   // $VF: synthetic method
   public void method646() {
      if (this.field1001 != null) {// 457
         this.field1001.method646();// 546
      }
   }// 51

   // $VF: synthetic method
   public void method617(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      if (this.field1000 < 524288 && (var2 & 65536) != 0) {// 257
         throw new UnsupportedOperationException("Records requires ASM8");// 269
      } else {
         if (this.field1001 != null) {// 148
            this.field1001.method617(var1, var2, var3, var4, var5, var6);// 236
         }
      }
   }// 39

   // $VF: synthetic method
   public Class450 method641(String var1, int var2, String var3) {
      if (this.field1000 < 393216) {// 209
         throw new UnsupportedOperationException("Module requires ASM6");// 69
      } else {
         return this.field1001 != null ? this.field1001.method641(var1, var2, var3) : null;// 31 422 464
      }
   }

   // $VF: synthetic method
   public Class343(int var1, Class343 var2) {
      if (var1 != 589824 && var1 != 524288 && var1 != 458752 && var1 != 393216 && var1 != 327680 && var1 != 262144 && var1 != 17432576) {// 561
         throw new IllegalArgumentException(method648(var1));// 358
      } else {
         if (var1 == 17432576) {// 574
            Class457.method984(this);// 272
         }

         this.field1000 = var1;
         this.field1001 = var2;// 146 179
      }
   }// 567

   // $VF: synthetic method
   public void method631(String var1) {
      if (this.field1000 < 458752) {// 308
         throw new UnsupportedOperationException("NestMember requires ASM7");// 596
      } else {
         if (this.field1001 != null) {// 499
            this.field1001.method631(var1);// 76
         }
      }
   }// 390

   // $VF: synthetic method
   public void method627(Class534 var1) {
      if (this.field1001 != null) {// 369
         this.field1001.method627(var1);// 215
      }
   }// 382

   // $VF: synthetic method
   public Class513 method628(int var1, String var2, String var3, String var4, String[] var5) {
      return this.field1001 != null ? this.field1001.method628(var1, var2, var3, var4, var5) : null;// 71 375 441
   }

   // $VF: synthetic method
   public void method619(String var1, String var2, String var3, int var4) {
      if (this.field1001 != null) {// 274
         this.field1001.method619(var1, var2, var3, var4);// 558
      }
   }// 337

   // $VF: synthetic method
   public void method640(String var1) {
      if (this.field1000 < 458752) {// 238
         throw new UnsupportedOperationException("NestHost requires ASM7");// 423
      } else {
         if (this.field1001 != null) {// 525
            this.field1001.method640(var1);// 220
         }
      }
   }// 336

   // $VF: synthetic method
   public void method623(String var1) {
      if (this.field1000 < 589824) {// 592
         throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");// 483
      } else {
         if (this.field1001 != null) {// 433
            this.field1001.method623(var1);// 125
         }
      }
   }// 320

   // $VF: synthetic method
   public Class540 method644(int var1, String var2, String var3, String var4, Object var5) {
      return this.field1001 != null ? this.field1001.method644(var1, var2, var3, var4, var5) : null;// 305 334 346
   }

   // $VF: synthetic method
   public Class353 method635(String var1, boolean var2) {
      return this.field1001 != null ? this.field1001.method635(var1, var2) : null;// 177 266 280
   }

   // $VF: synthetic method
   public void method638(String var1, String var2) {
      if (this.field1001 != null) {// 82
         this.field1001.method638(var1, var2);// 83
      }
   }// 279

   // $VF: synthetic method
   public Class343 method649() {
      return this.field1001;// 278
   }
}
