package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from ei
public class Class479 extends Class475 {
   // $VF: synthetic field
   public int field1561;

   // $VF: synthetic method
   public Class479(int var1, int var2, Class221 var3) {
      super(var1, var3);
      this.field1561 = var2;// 204 239
   }// 310

   // $VF: synthetic method
   public void method1263(int var1) {
      this.field1561 = var1;// 440
   }// 248

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, String var3) {
      super(var1, var2);
      this.field1561 = var2.method106(var3);// 33 400
   }// 0

   // $VF: synthetic method
   public Class479(Class333 var1, Class221 var2, boolean var3) {
      super(var1.method532(), var2);// 59
      if (!var3) {// 391
         this.field1561 = var1.method528();// 555
      } else {
         switch (var1.method532()) {// 428
            case 66:
               while (false) {
               }

               this.field1561 = var2.method143(var1.method535());// 588
               return;// 329
            case 67:
               this.field1561 = var2.method143(var1.method536());// 38
               return;// 257
            case 68:
               this.field1561 = var2.method415(var1.method543());// 99
               return;// 160
            case 70:
               this.field1561 = var2.method411(var1.method540());// 142
               return;// 39
            case 73:
               this.field1561 = var2.method143(var1.method538());// 198
               return;// 424
            case 74:
               this.field1561 = var2.method407(var1.method541());// 455
               return;// 148
            case 83:
               this.field1561 = var2.method143(var1.method534());// 450
               return;// 386
            case 90:
               if (var1.method539()) {// 63
                  this.field1561 = var2.method143(1);// 550
                  return;// 510
               }

               this.field1561 = var2.method143(0);// 82
               return;// 5
            case 115:
               this.field1561 = var2.method106(var1.method542());// 399
               return;// 232
            default:
               throw new RuntimeException("SimpleElementValueGen class does not know how to copy this type " + this.field1555);// 149
         }
      }
   }// 73

   // $VF: synthetic method
   @Override
   public String method1255() {
      switch (this.field1555) {// 50
         case 66:
            while (false) {
            }

            return Integer.toString(((Class181)this.field1561.method174(this.field1561)).method2());// 15 385
         case 67:
            return Integer.toString(((Class181)this.field1561.method174(this.field1561)).method2());// 270 582
         case 68:
            return Double.toString(((Class179)this.field1561.method174(this.field1561)).method226());// 72 268
         case 70:
            return Float.toString(((Class184)this.field1561.method174(this.field1561)).method230());// 66 536
         case 73:
            return Integer.toString(((Class181)this.field1561.method174(this.field1561)).method2());// 443 474
         case 74:
            return Long.toString(((Class183)this.field1561.method174(this.field1561)).method228());// 292 434
         case 83:
            return Integer.toString(((Class181)this.field1561.method174(this.field1561)).method2());// 109 218
         case 90:
            Class181 var2;
            if ((var2 = (Class181)this.field1561.method174(this.field1561)).method2() == 0) {// 235 266
               return "false";// 280
            } else if (var2.method2() != 0) {// 370
               return "true";// 516
            }
         case 115:
            return ((Class191)this.field1561.method174(this.field1561)).method20();// 55 227
         default:
            throw new RuntimeException("SimpleElementValueGen class does not know how to stringify type " + this.field1555);// 288
      }
   }

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, int var3) {
      super(var1, var2);
      this.field1561 = var2.method143(var3);// 18 389
   }// 513

   // $VF: synthetic method
   @Override
   public void method1254(DataOutputStream var1) {
      var1.writeByte(this.field1555);// 601
      switch (this.field1555) {// 193
         case 66:
         case 67:
         case 68:
         case 70:
         case 73:
         case 74:
         case 83:
         case 90:
         case 115:
            while (false) {
            }

            var1.writeShort(this.field1561);// 394
            return;// 556
         default:
            throw new RuntimeException("SimpleElementValueGen doesnt know how to write out type " + this.field1555);// 207
      }
   }

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, byte var3) {
      super(var1, var2);
      this.field1561 = var2.method143(var3);// 184 534
   }// 488

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, short var3) {
      super(var1, var2);
      this.field1561 = var2.method143(var3);// 58 553
   }// 190

   // $VF: synthetic method
   public int method1265() {
      return this.field1561;// 115
   }

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, float var3) {
      super(var1, var2);
      this.field1561 = var2.method411(var3);// 185 533
   }// 406

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, double var3) {
      super(var1, var2);
      this.field1561 = var2.method415(var3);// 141 580
   }// 226

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, boolean var3) {
      super(var1, var2);// 461
      if (var3) {// 358
         this.field1561 = var2.method143(1);// 192
      } else {
         this.field1561 = var2.method143(0);// 272
      }
   }// 321

   // $VF: synthetic method
   @Override
   public Class332 method1253() {
      return new Class333(this.field1555, this.field1561, this.field1561.method402());// 422
   }

   // $VF: synthetic method
   public String method1264() {
      if (this.field1555 != 115) {// 138
         throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");// 285
      } else {
         return ((Class191)this.field1561.method174(this.field1561)).method20();// 32 238
      }
   }

   // $VF: synthetic method
   public int method1266() {
      if (this.field1555 != 73) {// 593
         throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");// 336
      } else {
         return ((Class181)this.field1561.method174(this.field1561)).method2();// 57 291
      }
   }

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, char var3) {
      super(var1, var2);
      this.field1561 = var2.method143(var3);// 377 561
   }// 604

   // $VF: synthetic method
   public Class479(int var1, Class221 var2, long var3) {
      super(var1, var2);
      this.field1561 = var2.method407(var3);// 147 491
   }// 295
}
