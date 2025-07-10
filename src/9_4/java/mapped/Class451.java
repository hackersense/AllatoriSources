package mapped;

// $VF: Compiled from qa
public final class Class451 extends Class450 {
   // $VF: synthetic field
   public final Class529 field1355;
   // $VF: synthetic field
   public final Class529 field1356;
   // $VF: synthetic field
   public int field1357;
   // $VF: synthetic field
   public final Class590 field1358;
   // $VF: synthetic field
   public int field1359;
   // $VF: synthetic field
   public final Class529 field1360;
   // $VF: synthetic field
   public final Class529 field1361;
   // $VF: synthetic field
   public final int field1362;
   // $VF: synthetic field
   public int field1363;
   // $VF: synthetic field
   public final Class529 field1364;
   // $VF: synthetic field
   public int field1365;
   // $VF: synthetic field
   public int field1366;
   // $VF: synthetic field
   public int field1367;
   // $VF: synthetic field
   public final int field1368;
   // $VF: synthetic field
   public int field1369;
   // $VF: synthetic field
   public final Class529 field1370;
   // $VF: synthetic field
   public final int field1371;

   // $VF: synthetic method
   public int method950() {
      return 1 + (this.field1359 > 0 ? 1 : 0) + (this.field1369 > 0 ? 1 : 0);// 314
   }

   // $VF: synthetic method
   @Override
   public void method949(String var1, String... var2) {
      Class451 var8 = this;
      this.field1361.method1566(this.field1358.method1988(var1).field1923);// 97
      this.field1361.method1566(var2.length);// 411
      String[] var7 = var2;// 468
      int var6 = var2.length;

      int var3;
      for (int var9 = var3 = 0; var9 < var6; var9 = var3) {
         String var4 = var7[var3];
         var3++;
         var8.field1361.method1566(var8.field1358.method1988(var4).field1923);// 138
      }

      var8.field1365++;// 119
   }// 32

   // $VF: synthetic method
   @Override
   public void method947(String var1, int var2, String... var3) {
      Class451 var9 = this;
      this.field1360.method1566(this.field1358.method1972(var1).field1923).method1566(var2);// 550
      Class451 var10;
      if (var3 == null) {// 510
         var10 = this;// 456
         this.field1360.method1566(0);
      } else {
         this.field1360.method1566(var3.length);// 82
         String[] var7 = var3;// 83
         var2 = var3.length;

         for (int var11 = var6 = 0; var11 < var2; var11 = var6) {
            String var4 = var7[var6];
            var6++;
            var9.field1360.method1566(var9.field1358.method1993(var4).field1923);// 5
         }

         var10 = var9;// 386
      }

      var10.field1366++;
   }// 470

   // $VF: synthetic method
   @Override
   public void method942(String var1) {
      this.field1369 = this.field1358.method1988(var1).field1923;// 198
   }// 424

   // $VF: synthetic method
   @Override
   public void method945(String var1) {
      this.field1370.method1566(this.field1358.method1972(var1).field1923);// 412
      this.field1359++;// 38
   }// 257

   // $VF: synthetic method
   public int method951() {
      this.field1358.method1991("Module");// 373
      int var2 = 22 + this.field1356.field1786 + this.field1360.field1786 + this.field1364.field1786 + this.field1355.field1786 + this.field1361.field1786;// 268
      if (this.field1359 > 0) {// 66
         this.field1358.method1991("ModulePackages");// 536
         var2 += 8 + this.field1370.field1786;// 218
      }

      if (this.field1369 > 0) {// 213
         var2 += 8;
         this.field1358.method1991("ModuleMainClass");// 15
      }

      return var2;// 582
   }

   // $VF: synthetic method
   @Override
   public void method941(String var1) {
      this.field1355.method1566(this.field1358.method1988(var1).field1923);// 115
      this.field1367++;// 223
   }// 45

   // $VF: synthetic method
   @Override
   public void method948(String var1, int var2, String var3) {
      this.field1356.method1566(this.field1358.method1993(var1).field1923).method1566(var2).method1566(var3 == null ? 0 : this.field1358.method1991(var3));// 39 142 236 368
      this.field1357++;// 99
   }// 160

   // $VF: synthetic method
   public Class451(Class590 var1, int var2, int var3, int var4) {
      super(589824);
      this.field1358 = var1;// 391
      this.field1368 = var2;// 330
      this.field1362 = var3;// 589
      this.field1371 = var4;// 579
      this.field1356 = new Class529();// 59
      this.field1360 = new Class529();// 73 555
      this.field1364 = new Class529();// 415
      this.field1355 = new Class529();// 398
      this.field1361 = new Class529();// 428
      this.field1370 = new Class529();// 87
   }// 586

   // $VF: synthetic method
   @Override
   public void method944() {
   }// 220

   // $VF: synthetic method
   @Override
   public void method940(String var1, int var2, String... var3) {
      Class451 var9 = this;
      this.field1364.method1566(this.field1358.method1972(var1).field1923).method1566(var2);// 286
      Class451 var10;
      if (var3 == null) {// 600
         var10 = this;// 108
         this.field1364.method1566(0);
      } else {
         this.field1364.method1566(var3.length);// 242
         String[] var7 = var3;// 94
         var2 = var3.length;

         for (int var11 = var6 = 0; var11 < var2; var11 = var6) {
            String var4 = var7[var6];
            var6++;
            var9.field1364.method1566(var9.field1358.method1993(var4).field1923);// 209
         }

         var10 = var9;// 422
      }

      var10.field1363++;
   }// 464

   // $VF: synthetic method
   public void method952(Class529 var1) {
      int var2 = 16 + this.field1356.field1786 + this.field1360.field1786 + this.field1364.field1786 + this.field1355.field1786 + this.field1361.field1786;// 288
      var1.method1566(this.field1358.method1991("Module"))// 107 258
         .method1570(var2)// 437
         .method1566(this.field1368)// 110
         .method1566(this.field1362)// 221
         .method1566(this.field1371)// 444
         .method1566(this.field1357)// 601
         .method1573(this.field1356.field1787, 0, this.field1356.field1786)// 193
         .method1566(this.field1366)// 251
         .method1573(this.field1360.field1787, 0, this.field1360.field1786)// 486
         .method1566(this.field1363)// 117
         .method1573(this.field1364.field1787, 0, this.field1364.field1786)// 300
         .method1566(this.field1367)// 245
         .method1573(this.field1355.field1787, 0, this.field1355.field1786)// 296
         .method1566(this.field1365)// 404
         .method1573(this.field1361.field1787, 0, this.field1361.field1786);// 417
      if (this.field1359 > 0) {// 81
         var1.method1566(this.field1358.method1991("ModulePackages"))// 394 401
            .method1570(2 + this.field1370.field1786)// 556
            .method1566(this.field1359)// 316
            .method1573(this.field1370.field1787, 0, this.field1370.field1786);// 207
      }

      if (this.field1369 > 0) {// 127
         var1.method1566(this.field1358.method1991("ModuleMainClass")).method1570(2).method1566(this.field1369);// 215 355 369 496
      }
   }// 382
}
