package mapped;

import smardecSB.*;

import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.Locale;

// $VF: Compiled from zm
public abstract class Class10 implements Cloneable, Serializable {
   // $VF: synthetic field
   public static Class494 field2 = Class494.field1642;
   // $VF: synthetic field
   public short field3;
   // $VF: synthetic field
   public short field4 = 1;

   // $VF: synthetic method
   public String method4(boolean var1) {
      return var1// 272
         ? new StringBuilder().insert(0, this.method20()).append("[").append(this.field3).append("](").append(this.field4).append(")").toString()// 321
         : this.method20();// 146
   }

   // $VF: synthetic method
   public int method15(Class221 var1) {
      return Class125.field178[this.field3];// 702
   }

   // $VF: synthetic method
   public static final String method16(short var0) {
      String var6 = Class125.field386[var0].toUpperCase(Locale.ENGLISH);// 805

      try {
         int var2;
         char var4 = var6.charAt((var2 = var6.length()) - 2);// 843 851
         char var3 = var6.charAt(var2 - 1);
         if (var4 == '_' && var3 >= '0' && var3 <= '5') {// 687
            var6 = var6.substring(0, var2 - 2);// 696
         }

         if (var6.equals("ICONST_M1")) {// 924
            var6 = "ICONST";// 730
         }
      } catch (StringIndexOutOfBoundsException var5) {// 625
         System.err.println(var5);// 868
      }

      return "org.apache.bcel.generic." + var6;// 772
   }

   // $VF: synthetic method
   public int method17() {
      return this.field4;// 740
   }

   // $VF: synthetic method
   public void method7(Class437 var1, boolean var2) {
   }// 367

   // $VF: synthetic method
   public Class10 method18() {
      Class10 var1 = this;
      if (Class119.field54[this.method22()] != null) {// 588
         return this;// 329 412
      } else {
         try {
            return (Class10)var1.clone();// 148 257
         } catch (CloneNotSupportedException var3) {// 269
            System.err.println(var3);// 455
            return this;// 142
         }
      }
   }

   // $VF: synthetic method
   public void method19() {
   }// 793

   // $VF: synthetic method
   public String method20() {
      return Class125.field386[this.field3];// 488
   }

   // $VF: synthetic method
   public void method3(DataOutputStream var1) {
      var1.writeByte(this.field3);// 58
   }// 190

   // $VF: synthetic method
   public void method21(short var1) {
      this.field3 = var1;// 907
   }// 909

   // $VF: synthetic method
   public Class10() {
      this.field3 = -1;// 273
   }// 161

   // $VF: synthetic method
   public String method5(Class149 var1) {
      return this.method4(false);// 589
   }

   // $VF: synthetic method
   public short method22() {
      return this.field3;// 629
   }

   // $VF: synthetic method
   public Class10(short var1, short var2) {
      this.field3 = -1;// 513
      this.field4 = var2;// 123
      this.field3 = var1;// 78 226
   }// 418

   // $VF: synthetic method
   public int method11(Class221 var1) {
      return Class125.field378[this.field3];// 650
   }

   // $VF: synthetic method
   public static void method23(Class494 var0) {
      field2 = var0;// 878
   }// 943

   // $VF: synthetic method
   public boolean equals(Object var1) {
      return var1 instanceof Class10 ? field2.method1324(this, (Class10)var1) : false;// 971
   }

   // $VF: synthetic method
   public static Class494 method24() {
      return field2;// 779
   }

   // $VF: synthetic method
   public abstract void method10(Class471 var1);

   // $VF: synthetic method
   public static final Class10 method25(Class437 var0) {
      boolean var1 = false;// 286
      short var2 = (short)var0.readUnsignedByte();// 600
      Object var7 = null;// 108
      if (var2 == 196) {// 27
         var1 = true;// 242
         var2 = (short)var0.readUnsignedByte();// 94
      }

      if (Class119.field54[var2] != null) {// 69
         return Class119.field54[var2];// 116
      } else {
         try {
            switch (var2) {// 223
               case 0:
                  var7 = new nop();// 23
                  break;// 440
               case 1:
                  var7 = new aconst_null();// 97
                  break;// 411
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
                  var7 = new iconst_x();// 61
                  break;// 525
               case 9:
               case 10:
                  var7 = new lconst_x();// 336
                  break;// 540
               case 11:
               case 12:
               case 13:
                  var7 = new fconst_x();// 216
                  break;// 299
               case 14:
               case 15:
                  var7 = new dconst_x();// 50
                  break;// 253
               case 16:
                  var7 = new bipush();// 474
                  break;// 443
               case 17:
                  var7 = new sipush();// 434
                  break;// 292
               case 18:
                  var7 = new ldc();// 72
                  break;// 268
               case 19:
                  var7 = new ldc_w();// 66
                  break;// 536
               case 20:
                  var7 = new ldc2_w();// 218
                  break;// 109
               case 21:
                  var7 = new iload_x();// 15
                  break;// 385
               case 22:
                  var7 = new lload_x();// 270
                  break;// 582
               case 23:
                  var7 = new fload_x();// 266
                  break;// 235
               case 24:
                  var7 = new dload_x();// 370
                  break;// 516
               case 25:
                  var7 = new aload_x();// 227
                  break;// 55
               case 26:
               case 27:
               case 28:
               case 29:
                  var7 = new iload_x();// 107
                  break;// 437
               case 30:
               case 31:
               case 32:
               case 33:
                  var7 = new lload_x();// 193
                  break;// 251
               case 34:
               case 35:
               case 36:
               case 37:
                  var7 = new fload_x();// 296
                  break;// 404
               case 38:
               case 39:
               case 40:
               case 41:
                  var7 = new dload_x();// 556
                  break;// 316
               case 42:
               case 43:
               case 44:
               case 45:
                  var7 = new aload_x();// 496
                  break;// 369
               case 46:
                  var7 = new iaload();// 511
                  break;// 382
               case 47:
                  var7 = new laload();// 576
                  break;// 103
               case 48:
                  var7 = new faload();// 545
                  break;// 570
               case 49:
                  var7 = new daload();// 162
                  break;// 282
               case 50:
                  var7 = new aaload();// 339
                  break;// 308
               case 51:
                  var7 = new baload();// 549
                  break;// 499
               case 52:
                  var7 = new caload();// 145
                  break;// 390
               case 53:
                  var7 = new saload();// 520
                  break;// 502
               case 54:
                  var7 = new istore_x();// 172
                  break;// 564
               case 55:
                  var7 = new lstore_x();// 281
                  break;// 438
               case 56:
                  var7 = new fstore_x();// 483
                  break;// 181
               case 57:
                  var7 = new dstore_x();// 125
                  break;// 413
               case 58:
                  var7 = new astore_x();// 478
                  break;// 212
               case 59:
               case 60:
               case 61:
               case 62:
                  var7 = new istore_x();// 532
                  break;// 297
               case 63:
               case 64:
               case 65:
               case 66:
                  var7 = new lstore_x();// 41
                  break;// 551
               case 67:
               case 68:
               case 69:
               case 70:
                  var7 = new fstore_x();// 274
                  break;// 558
               case 71:
               case 72:
               case 73:
               case 74:
                  var7 = new dstore_x();// 237
                  break;// 133
               case 75:
               case 76:
               case 77:
               case 78:
                  var7 = new astore_x();// 544
                  break;// 114
               case 79:
                  var7 = new iastore();// 102
                  break;// 105
               case 80:
                  var7 = new lastore();// 205
                  break;// 64
               case 81:
                  var7 = new fastore();// 249
                  break;// 349
               case 82:
                  var7 = new dastore();// 164
                  break;// 554
               case 83:
                  var7 = new aastore();// 89
                  break;// 506
               case 84:
                  var7 = new bastore();// 318
                  break;// 88
               case 85:
                  var7 = new castore();// 8
                  break;// 331
               case 86:
                  var7 = new sastore();// 130
                  break;// 301
               case 87:
                  var7 = new pop();// 363
                  break;// 509
               case 88:
                  var7 = new pop2();// 233
                  break;// 271
               case 89:
                  var7 = new dup();// 357
                  break;// 47
               case 90:
                  var7 = new dup_x1();// 4
                  break;// 122
               case 91:
                  var7 = new dup_x2();// 346
                  break;// 228
               case 92:
                  var7 = new dup2();// 219
                  break;// 13
               case 93:
                  var7 = new dip2_x1();// 284
                  break;// 255
               case 94:
                  var7 = new dip2_x2();// 508
                  break;// 517
               case 95:
                  var7 = new swap();// 524
                  break;// 371
               case 96:
                  var7 = new iadd();// 431
                  break;// 563
               case 97:
                  var7 = new ladd();// 514
                  break;// 374
               case 0x62:
                  var7 = new fadd();// 453
                  break;// 354
               case 0x63:
                  var7 = new dadd();// 494
                  break;// 560
               case 0x64:
                  var7 = new isub();// 71
                  break;// 375
               case 0x65:
                  var7 = new lsub();// 441
                  break;// 575
               case 0x66:
                  var7 = new fsub();// 303
                  break;// 326
               case 0x67:
                  var7 = new dsub();// 328
                  break;// 521
               case 0x68:
                  var7 = new imul();// 546
                  break;// 341
               case 105:
                  var7 = new lmul();// 598
                  break;// 325
               case 106:
                  var7 = new fmul();// 571
                  break;// 44
               case 107:
                  var7 = new dmul();// 476
                  break;// 542
               case 108:
                  var7 = new idiv();// 420
                  break;// 454
               case 109:
                  var7 = new ldiv();// 62
                  break;// 126
               case 110:
                  var7 = new fdiv();// 519
                  break;// 376
               case 111:
                  var7 = new ddiv();// 482
                  break;// 432
               case 112:
                  var7 = new irem();// 155
                  break;// 2
               case 113:
                  var7 = new lrem();// 421
                  break;// 583
               case 114:
                  var7 = new frem();// 86
                  break;// 473
               case 115:
                  var7 = new drem();// 528
                  break;// 289
               case 116:
                  var7 = new ineg();// 323
                  break;// 458
               case 117:
                  var7 = new lneg();// 572
                  break;// 60
               case 118:
                  var7 = new fneg();// 150
                  break;// 56
               case 119:
                  var7 = new dneg();// 211
                  break;// 427
               case 120:
                  var7 = new ishl();// 262
                  break;// 475
               case 121:
                  var7 = new lshl();// 202
                  break;// 250
               case 122:
                  var7 = new Class55();// 290
                  break;// 199
               case 123:
                  var7 = new Class66();// 538
                  break;// 92
               case 124:
                  var7 = new Class68();// 171
                  break;// 124
               case 125:
                  var7 = new Class77();// 152
                  break;// 311
               case 126:
                  var7 = new Class75();// 407
                  break;// 405
               case 127:
                  var7 = new Class62();// 16
                  break;// 121
               case 128:
                  var7 = new Class57();// 518
                  break;// 472
               case 129:
                  var7 = new Class76();// 387
                  break;// 380
               case 130:
                  var7 = new Class84();// 180
                  break;// 206
               case 131:
                  var7 = new Class79();// 156
                  break;// 3
               case 132:
                  var7 = new Class286();// 186
                  break;// 175
               case 133:
                  var7 = new Class304();// 167
                  break;// 414
               case 134:
                  var7 = new Class303();// 319
                  break;// 139
               case 135:
                  var7 = new Class311();// 559
                  break;// 452
               case 136:
                  var7 = new Class301();// 595
                  break;// 254
               case 137:
                  var7 = new Class312();// 539
                  break;// 388
               case 138:
                  var7 = new Class309();// 487
                  break;// 479
               case 139:
                  var7 = new Class314();// 298
                  break;// 42
               case 140:
                  var7 = new Class306();// 529
                  break;// 106
               case 141:
                  var7 = new f2d();// 445
                  break;// 425
               case 142:
                  var7 = new Class310();// 527
                  break;// 383
               case 143:
                  var7 = new Class307();// 140
                  break;// 451
               case 144:
                  var7 = new Class313();// 565
                  break;// 173
               case 145:
                  var7 = new i2b();// 101
                  break;// 489
               case 146:
                  var7 = new Class305();// 244
                  break;// 247
               case 147:
                  var7 = new Class308();// 194
                  break;// 397
               case 148:
                  var7 = new Class297();// 9
                  break;// 243
               case 149:
                  var7 = new Class24();// 531
                  break;// 229
               case 150:
                  var7 = new Class296();// 590
                  break;// 309
               case 151:
                  var7 = new Class316();// 442
                  break;// 344
               case 152:
                  var7 = new Class299();// 449
                  break;// 37
               case 153:
                  var7 = new Class103();// 378
                  break;// 195
               case 154:
                  var7 = new Class104();// 577
                  break;// 481
               case 155:
                  var7 = new Class101();// 75
                  break;// 372
               case 156:
                  var7 = new Class107();// 587
                  break;// 304
               case 157:
                  var7 = new ifgt();// 477
                  break;// 53
               case 158:
                  var7 = new ifle();// 200
                  break;// 84
               case 159:
                  var7 = new Class106();// 393
                  break;// 419
               case 160:
                  var7 = new if_icmpne();// 402
                  break;// 515
               case 161:
                  var7 = new Class105();// 395
                  break;// 43
               case 162:
                  var7 = new Class93();// 293
                  break;// 54
               case 163:
                  var7 = new Class102();// 74
                  break;// 317
               case 164:
                  var7 = new if_icmple();// 526
                  break;// 136
               case 165:
                  var7 = new Class100();// 90
                  break;// 294
               case 166:
                  var7 = new if_acmpne();// 435
                  break;// 96
               case 167:
                  var7 = new Class112();// 359
                  break;// 408
               case 168:
                  var7 = new Class110();// 277
                  break;// 113
               case 169:
                  var7 = new Class279();// 302
                  break;// 203
               case 170:
                  var7 = new Class115();// 597
                  break;// 118
               case 171:
                  var7 = new Class114();// 353
                  break;// 189
               case 172:
                  var7 = new Class320();// 447
                  break;// 79
               case 173:
                  var7 = new Class319();// 396
                  break;// 364
               case 174:
                  var7 = new Class13();// 861
                  break;// 752
               case 175:
                  var7 = new dreturn();// 958
                  break;// 605
               case 176:
                  var7 = new Class321();// 985
                  break;// 921
               case 177:
                  var7 = new voidReturn();// 698
                  break;// 689
               case 178:
                  var7 = new Class6();// 764
                  break;// 821
               case 179:
                  var7 = new Class267();// 609
                  break;// 633
               case 180:
                  var7 = new getfield();// 892
                  break;// 632
               case 181:
                  var7 = new Class287();// 966
                  break;// 949
               case 182:
                  var7 = new Class292();// 936
                  break;// 670
               case 183:
                  var7 = new Class289();// 899
                  break;// 823
               case 184:
                  var7 = new Class291();// 897
                  break;// 927
               case 185:
                  var7 = new Class290();// 902
                  break;// 608
               case 186:
                  var7 = new Class262();// 960
                  break;// 930
               case 187:
                  var7 = new Class28();// 735
                  break;// 846
               case 188:
                  var7 = new Class294();// 975
                  break;// 883
               case 189:
                  var7 = new Class26();// 738
                  break;// 801
               case 190:
                  var7 = new Class266();// 694
                  break;// 923
               case 191:
                  var7 = new Class87();// 838
                  break;// 854
               case 192:
                  var7 = new Class2();// 852
                  break;// 829
               case 193:
                  var7 = new _instanceof();// 675
                  break;// 665
               case 194:
                  var7 = new Class32();// 835
                  break;// 619
               case 195:
                  var7 = new Class261();// 816
                  break;// 974
               case 196:
               default:
                  throw new Class241("Illegal opcode detected");// 864
               case 197:
                  var7 = new Class295();// 777
                  break;// 649
               case 198:
                  var7 = new ifnull();// 697
                  break;// 982
               case 199:
                  var7 = new Class92();// 613
                  break;// 867
               case 200:
                  var7 = new Class260();// 933
                  break;// 688
               case 201:
                  var7 = new jsr_w();// 655
            }
         } catch (Class241 var5) {// 950
            throw var5;// 671
         } catch (Exception var6) {// 727
            throw new Class241(var6.toString());// 750
         }

         if (var1 && !(var7 instanceof Class277) && !(var7 instanceof Class286) && !(var7 instanceof Class279)) {// 787
            throw new Class241("Illegal opcode after wide: " + var2);// 796
         } else {
            ((Class10)var7).method21(var2);
            ((Class10)var7).method7(var0, var1);// 929
            return (Class10)var7;// 836 870
         }
      }
   }
}
