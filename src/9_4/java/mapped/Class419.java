package mapped;

import smardecSB.ProductInformation;

// $VF: Compiled from yt
public class Class419 implements Class418 {
   // $VF: synthetic method
   public StringBuffer method841(StringBuffer var1, char var2, int var3) {
      for (int var10000 = var5 = 0; var10000 < var3; var10000 = var5) {// 142
         var5++;
         var1.append(var2);// 39
      }

      return var1;// 368
   }

   // $VF: synthetic method
   @Override
   public void method839(Class206 var1) {
      Class206 var7 = var1;
      Class419 var8 = this;

      try {
         if (var7.method93().startsWith("com.allatori.")) {// 10
            return;
         }

         Class208 var2;
         if ((var2 = var7.method358("main", "([Ljava/lang/String;)V")) != null) {// 34 557
            Class203 var3 = Class376.method716(var2, var7.method93(), var7.method46(), var7.method46().method402());// 332
            Class120 var4 = new Class120(var7);// 260
            Class251 var5;
            if ((var5 = var3.method42()) != null) {// 30 143
               var5.method473(var4.method69(var8.method842()));// 252
               var3.method309();// 20
               var7.method360(var2, var3.method315());// 204
               return;// 409
            }
         }
      } catch (Exception var6) {// 498
         var6.printStackTrace();// 484
      }
   }// 389

   // $VF: synthetic method
   public String method842() {
      String var9 = " ## #   #    ## ### ### ##  ###";// 491
      String var10 = "# # #   #   # #  #  # # # #  # ";// 147
      String var8 = "### #   #   ###  #  # # ##   # ";// 295
      String var4 = "# # ### ### # #  #  ### # # ###";// 338
      String var5 = "Protecting Java applications since 2006";// 273
      String var6 = ProductInformation.getName() + " " + ProductInformation.getVersionString();// 161
      String var7 = ProductInformation.getWebsiteString();// 141
      int var3 = Math.max(31, Math.max(var6.length(), Math.max(var7.length(), 39)));// 226
      var3 += 4;// 123
      StringBuffer var12 = new StringBuffer("\n");// 78
      this.method841(var12, '#', var3).append("\n#");// 418
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 533
      int var2 = (var3 - 31 - 2) / 2;// 185
      int var11 = var3 - var2 - 31 - 2;// 406
      if (var2 > var11) {// 1
         var11++;// 170
         var2--;// 46
      }

      this.method841(var12, ' ', var2).append(var9);// 58
      this.method841(var12, ' ', var11).append("#\n#");// 190
      this.method841(var12, ' ', var2).append(var10);// 315
      this.method841(var12, ' ', var11).append("#\n#");// 465
      this.method841(var12, ' ', var2).append(var8);// 132
      this.method841(var12, ' ', var11).append("#\n#");// 184
      this.method841(var12, ' ', var2).append(var4);// 534
      this.method841(var12, ' ', var11).append("#\n#");// 488
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 495
      var2 = (var3 - 39 - 2) / 2;// 493
      var11 = var3 - var2 - 39 - 2;// 561
      if (var2 > var11) {// 377
         var11++;// 22
         var2--;// 604
      }

      this.method841(var12, ' ', var2).append(var5);// 144
      this.method841(var12, ' ', var11).append("#\n#");// 461
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 358
      var2 = (var3 - var6.length() - 2) / 2;// 574
      var11 = var3 - var2 - var6.length() - 2;// 272
      if (var2 > var11) {// 321
         var11++;// 146
         var2--;// 179
      }

      this.method841(var12, ' ', var2).append(var6);// 400
      this.method841(var12, ' ', var11).append("#\n#");// 33
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 0
      var6 = "DEMO VERSION!";// 246
      var2 = (var3 - 13 - 2) / 2;// 552
      var11 = var3 - var2 - 13 - 2;// 603
      if (var2 > var11) {// 278
         var11++;// 467
         var2--;// 466
      }

      this.method841(var12, ' ', var2).append(var6);// 68
      this.method841(var12, ' ', var11).append("#\n#");// 59
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 391
      var6 = "NOT FOR COMMERCIAL USE!";// 330
      var2 = (var3 - 23 - 2) / 2;// 589
      var11 = var3 - var2 - 23 - 2;// 579
      if (var2 > var11) {// 555
         var11++;// 415
         var2--;// 73
      }

      this.method841(var12, ' ', var2).append(var6);// 428
      this.method841(var12, ' ', var11).append("#\n#");// 87
      this.method841(var12, ' ', var3 - 2).append("#\n#");// 586
      var2 = (var3 - var7.length() - 2) / 2;// 232
      var11 = var3 - var2 - var7.length() - 2;// 463
      if (var2 > var11) {// 198
         var11++;// 28
         var2--;// 424
      }

      this.method841(var12, ' ', var2).append(var7);// 329
      this.method841(var12, ' ', var11).append("#\n#");// 412
      this.method841(var12, ' ', var3 - 2).append("#\n");// 38
      this.method841(var12, '#', var3).append("\n");// 257
      return var12.toString();// 269
   }

   // $VF: synthetic method
   @Override
   public void method838() {
   }// 93
}
