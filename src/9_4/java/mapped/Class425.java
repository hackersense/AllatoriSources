package mapped;

// $VF: Compiled from kz
public class Class425 implements Class418 {
   // $VF: synthetic field
   public Class338 field1246;

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 534

   // $VF: synthetic method
   public Class251 method847(Class221 var1, Class120 var2) {
      Class251 var5 = new Class251();// 541
      var5.method451(var2.method58("java.util.Date"));
      var5.method451(Class119.field113);// 456
      var5.method484(new Class116(var1, Class580.method1926().method1643().getTime()));// 367
      var5.method451(var2.method47("java.util.Date", "<init>", Class138.field586, new Class138[]{Class138.field578}, (short)183));// 82 510
      var5.method451(var2.method58("java.util.Date"));// 83
      var5.method451(Class119.field113);// 5
      var5.method451(var2.method47("java.util.Date", "<init>", Class138.field586, Class138.field582, (short)183));// 279
      var5.method451(Class119.field98);// 450
      var5.method451(Class119.field136);// 386
      var5.method451(Class119.field107);// 470
      var5.method451(var2.method47("java.util.Date", "getTime", Class138.field578, Class138.field582, (short)182));// 149
      var5.method451(Class119.field121);// 157
      var5.method451(Class119.field107);// 24
      var5.method451(var2.method47("java.util.Date", "getTime", Class138.field578, Class138.field582, (short)182));// 286
      var5.method451(Class119.field41);// 600
      var5.method451(Class119.field125);// 108
      Class90 var4 = Class120.method73((short)156, null);// 27
      var5.method439(var4);// 242
      var5.method451(var2.method58("java.lang.Throwable"));// 94
      var5.method451(Class119.field113);// 209
      var5.method484(new Class116(var1, Class580.method1926().method1645()));// 69
      var5.method451(var2.method47("java.lang.Throwable", "<init>", Class138.field586, new Class138[]{Class138.field593}, (short)183));// 116
      var5.method451(Class119.field77);// 422
      Class246 var6 = var5.method451(Class119.field39);// 464
      var4.method29(var6);// 25
      return var5;// 314
   }

   // $VF: synthetic method
   public Class251 method848(Class221 var1, Class120 var2) {
      Class251 var5 = new Class251();// 6
      var5.method451(var2.method58("java.util.Date"));
      var5.method451(Class119.field113);// 358
      var5.method484(new Class116(var1, Class580.method1926().method1643().getTime()));// 192
      var5.method451(var2.method47("java.util.Date", "<init>", Class138.field586, new Class138[]{Class138.field578}, (short)183));// 461 574
      var5.method451(var2.method58("java.util.Date"));// 321
      var5.method451(Class119.field113);// 179
      var5.method451(var2.method47("java.util.Date", "<init>", Class138.field586, Class138.field582, (short)183));// 146
      var5.method451(Class119.field109);// 400
      var5.method451(var2.method47("java.util.Date", "after", Class138.field584, new Class138[]{new Class144("java.util.Date")}, (short)182));// 33
      Class90 var4 = Class120.method73((short)153, null);// 0
      var5.method439(var4);// 240
      var5.method451(var2.method58("java.lang.Throwable"));// 246
      var5.method451(Class119.field113);// 552
      var5.method484(new Class116(var1, Class580.method1926().method1645()));// 603
      var5.method451(var2.method47("java.lang.Throwable", "<init>", Class138.field586, new Class138[]{Class138.field593}, (short)183));// 278
      var5.method451(Class119.field77);// 466
      Class246 var6 = var5.method451(Class119.field39);// 467
      var4.method29(var6);// 485
      return var5;// 455
   }

   // $VF: synthetic method
   public Class425(Class338 var1) {
      this.field1246 = var1;// 7 335
   }// 507

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var13 = var1;
      Class425 var14 = this;
      if (Class580.method1926().method1643() != null) {// 260 332
         if (Class580.method1926().method1648(this.field1246, var1)) {// 30
            try {
               Class208[] var6 = var13.method341();// 252

               for (int var8 = 0; var8 < var6.length; var8++) {// 20
                  Class208 var4;
                  if ((var4 = var6[var8]).method369() != null) {// 204 239
                     Class203 var5 = Class376.method716(var4, var13.method93(), var13.method46(), var13.method46().method402());// 310
                     if (Class580.method1926().method1646(var14.field1246, var13, var5)) {// 498
                        Class120 var2 = new Class120(var13);// 484
                        Class251 var7 = var5.method42();// 409
                        Class251 var3;
                        if (Class580.method1932().method1858()) {// 513
                           var3 = var14.method847(var13.method46(), var2);// 93
                        } else {
                           var3 = var14.method848(var13.method46(), var2);// 530
                        }

                        if ("<init>".equals(var4.method190())) {// 147
                           Class246 var15;
                           Class246 var9 = var7.method450(var15 = var7.method37(), var3);// 273 295

                           Class200[] var10;
                           int var11;
                           for (int var16 = var11 = (var10 = var15.method431()).length - 1; var16 >= 0; var16 = var11) {// 141 580
                              Class200 var17 = var10[var11];// 226
                              var11--;
                              var17.method28(var15, var9);// 123
                           }
                        } else {
                           var7.method473(var3);// 533
                        }

                        var5.method309();// 406
                        var5.method276();// 1
                        var13.method360(var4, var5.method315());// 46
                        var3.method107();// 170
                     }
                  }
               }
            } catch (Exception var12) {// 58
               var12.printStackTrace();// 190
            }
         }
      }
   }// 465
}
