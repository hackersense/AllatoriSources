package mapped;

// $VF: Compiled from ua
public class Class585 {
   // $VF: synthetic field
   public final String field2355;

   // $VF: synthetic method
   public Class585(String var1) {
      this.field2355 = var1;// 78 123
   }// 418

   // $VF: synthetic method
   public static int method1947(String var0, int var1, Class560 var2) {
      String var10 = var0;
      char var3;
      int var15 = var3 = var0.charAt(var1);// 69 116
      var1++;
      switch (var15) {// 25
         case 66:
         case 67:
         case 68:
         case 70:
         case 73:
         case 74:
         case 83:
         case 86:
         case 90:
            while (false) {
            }

            var2.method1785(var3);// 468
            byte var23;
            return var23;// 138
         case 69:
         case 71:
         case 72:
         case 75:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 85:
         case 87:
         case 88:
         case 89:
         default:
            throw new IllegalArgumentException();// 369
         case 76:
            int var22;
            int var13 = var22;// 299
            boolean var5 = false;// 314
            boolean var6 = false;// 137

            while (true) {
               String var17 = var10;// 135

               while (true) {
                  char var18 = var3 = var17.charAt(var22);
                  var22++;
                  if (var18 != '.' && var3 != ';') {// 474
                     if (var3 == '<') {// 266
                        String var14 = var10.substring(var13, var22 - 1);// 516
                        if (var6) {// 95
                           var2.method1791(var14);// 227
                        } else {
                           var2.method1786(var14);// 77
                        }

                        var5 = true;// 129
                        String var20 = var10;// 107

                        while ((var3 = var20.charAt(var22)) != '>') {
                           switch (var3) {// 437
                              case '*':
                                 var22++;// 444

                                 while (false) {
                                 }

                                 var20 = var10;
                                 var2.method1792();// 601
                                 break;// 193
                              case '+':
                              case '-':
                                 var20 = var10;// 300
                                 var22 = method1947(var10, var22 + 1, var2.method1795(var3));// 245 296
                                 break;// 404
                              case ',':
                              default:
                                 var20 = var10;// 401
                                 var22 = method1947(var10, var22, var2.method1795('='));
                           }
                        }
                     }
                     break;
                  }

                  label53: {
                     if (!var5) {// 292
                        String var7 = var10.substring(var13, var22 - 1);// 373
                        if (var6) {// 72
                           var2.method1791(var7);// 268
                           var18 = var3;
                           break label53;
                        }

                        var2.method1786(var7);// 66
                     }

                     var18 = var3;// 213
                  }

                  if (var18 == ';') {
                     var2.method1788();// 15
                     return var22;// 385
                  }

                  var13 = var22;// 270
                  var5 = false;// 582
                  var6 = true;// 177
                  var17 = var10;
               }
            }
         case 84:
            int var4;
            byte var21;
            var15 = var4 = var0.indexOf(59, var21);// 220
            var2.method1787(var0.substring(var21, var4));// 593
            return var15 + 1;// 336
         case 91:
            byte var8;
            return method1947(var0, var8, var2.method1793());// 238
      }
   }

   // $VF: synthetic method
   public void method1948(Class560 var1) {
      String var4;
      String var10000 = var4 = this.field2355;// 184
      int var5 = this.field2355.length();// 534
      int var8;
      if (var10000.charAt(0) == '<') {// 604
         var8 = 2;// 144

         label61:
         while (true) {
            int var6 = var4.indexOf(58, var8);
            var1.method1799(var4.substring(var8 - 1, var6));// 272 574
            char var3;
            if ((var3 = var4.charAt(var8 = var6 + 1)) == 'L' || var3 == '[' || var3 == 'T') {// 33 192 400 567
               var8 = method1947(var4, var8, var1.method1789());// 0
            }

            var10000 = var4;// 278

            while (true) {
               char var14 = var3 = var10000.charAt(var8);
               var8++;
               if (var14 != ':') {
                  if (var3 == '>') {// 589
                     var10000 = var4;
                     break label61;
                  }
                  break;
               }

               var10000 = var4;// 466
               var8 = method1947(var4, var8, var1.method1790());
            }
         }
      } else {
         var8 = 0;// 555
         var10000 = var4;// 586
      }

      if (var10000.charAt(var8) == '(') {
         var10000 = var4;// 232
         var8++;// 399

         while (var10000.charAt(var8) != ')') {
            var10000 = var4;// 463
            var8 = method1947(var4, var8, var1.method1796());
         }

         int var10;
         int var17 = var10 = method1947(var4, var8 + 1, var1.method1783());// 28

         while (var17 < var5) {// 588
            var17 = var10 = method1947(var4, var10 + 1, var1.method1784());// 412
         }
      } else {
         int var11;
         int var18 = var11 = method1947(var4, var8, var1.method1798());// 148

         while (var18 < var5) {// 236
            var18 = var11 = method1947(var4, var11, var1.method1797());// 142
         }
      }
   }// 99

   // $VF: synthetic method
   public void method1949(Class560 var1) {
      method1947(this.field2355, 0, var1);// 450
   }// 386
}
