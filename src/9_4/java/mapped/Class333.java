package mapped;

import java.io.DataOutputStream;

// $VF: Compiled from ym
public class Class333 extends Class332 {
   // $VF: synthetic field
   public int field936;

   // $VF: synthetic method
   public short method534() {
      if (this.field934 != 83) {// 142
         throw new RuntimeException("Dont call getValueShort() on a non SHORT ElementValue");// 39
      } else {
         return (short)((Class181)this.field936.method174(this.method528())).method2();// 99 160
      }
   }

   // $VF: synthetic method
   public byte method535() {
      if (this.field934 != 66) {// 159
         throw new RuntimeException("Dont call getValueByte() on a non BYTE ElementValue");// 493
      } else {
         return (byte)((Class181)this.field936.method171(this.method528(), (byte)3)).method2();// 22 377
      }
   }

   // $VF: synthetic method
   public char method536() {
      if (this.field934 != 67) {// 192
         throw new RuntimeException("Dont call getValueChar() on a non CHAR ElementValue");// 574
      } else {
         return (char)((Class181)this.field936.method171(this.method528(), (byte)3)).method2();// 146 321
      }
   }

   // $VF: synthetic method
   public void method537(int var1) {
      this.field936 = var1;// 338
   }// 273

   // $VF: synthetic method
   public int method538() {
      if (this.field934 != 73) {// 553
         throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");// 58
      } else {
         return ((Class181)this.field936.method171(this.method528(), (byte)3)).method2();// 132 315
      }
   }

   // $VF: synthetic method
   public boolean method539() {
      if (this.field934 != 90) {// 588
         throw new RuntimeException("Dont call getValueBoolean() on a non BOOLEAN ElementValue");// 329
      } else {
         return ((Class181)this.field936.method174(this.method528())).method2() != 0;// 38 257
      }
   }

   // $VF: synthetic method
   public float method540() {
      if (this.field934 != 70) {// 59
         throw new RuntimeException("Dont call getValueFloat() on a non FLOAT ElementValue");// 391
      } else {
         return ((Class184)this.field936.method174(this.method528())).method230();// 579 589
      }
   }

   // $VF: synthetic method
   public int method528() {
      return this.field936;// 151
   }

   // $VF: synthetic method
   public long method541() {
      if (this.field934 != 74) {// 240
         throw new RuntimeException("Dont call getValueLong() on a non LONG ElementValue");// 246
      } else {
         return ((Class183)this.field936.method174(this.method528())).method228();// 278 603
      }
   }

   // $VF: synthetic method
   public Class333(int var1, int var2, Class149 var3) {
      super(var1, var3);
      this.field936 = var2;// 239 310
   }// 498

   // $VF: synthetic method
   @Override
   public void method527(DataOutputStream var1) {
      var1.writeByte(this.field934);// 253
      switch (this.field934) {// 135
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

            var1.writeShort(this.method528());// 536
            return;// 307
         default:
            throw new RuntimeException("SimpleElementValue doesnt know how to write out type " + this.field934);// 109
      }
   }

   // $VF: synthetic method
   public String method542() {
      if (this.field934 != 115) {// 226
         throw new RuntimeException("Dont call getValueString() on a non STRING ElementValue");// 123
      } else {
         return ((Class191)this.field936.method171(this.method528(), (byte)1)).method20();// 185 418
      }
   }

   // $VF: synthetic method
   @Override
   public String method530() {
      switch (this.field934) {// 279
         case 66:
            while (false) {
            }

            return Integer.toString(((Class181)this.field936.method171(this.method528(), (byte)3)).method2());// 45 440
         case 67:
            return String.valueOf((char)((Class181)this.field936.method171(this.method528(), (byte)3)).method2());// 97 468
         case 68:
            return Double.toString(((Class179)this.field936.method171(this.method528(), (byte)6)).method226());// 209 242
         case 70:
            return Float.toString(((Class184)this.field936.method171(this.method528(), (byte)4)).method230());// 116 464
         case 73:
            return Integer.toString(((Class181)this.field936.method171(this.method528(), (byte)3)).method2());// 157 470
         case 74:
            return Long.toString(((Class183)this.field936.method171(this.method528(), (byte)5)).method228());// 108 286
         case 83:
            return Integer.toString(((Class181)this.field936.method171(this.method528(), (byte)3)).method2());// 31 115
         case 90:
            Class181 var2;
            if ((var2 = (Class181)this.field936.method171(this.method528(), (byte)3)).method2() == 0) {// 32 285
               return "false";// 238
            } else if (var2.method2() != 0) {// 423
               return "true";// 61
            }
         case 115:
            return ((Class191)this.field936.method171(this.method528(), (byte)1)).method20();// 220 336
         default:
            throw new RuntimeException("SimpleElementValue class does not know how to stringify type " + this.field934);// 291
      }
   }

   // $VF: synthetic method
   public double method543() {
      if (this.field934 != 68) {// 428
         throw new RuntimeException("Dont call getValueDouble() on a non DOUBLE ElementValue");// 87
      } else {
         return ((Class179)this.field936.method174(this.method528())).method226();// 232 399
      }
   }
}
