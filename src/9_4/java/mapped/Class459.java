package mapped;

// $VF: Compiled from tc
public class Class459 extends Class460 implements Class463 {
   // $VF: synthetic field
   public final Class130 field1495;
   // $VF: synthetic field
   public final Class149 field1496;

   // $VF: synthetic method
   @Override
   public void method998(Class188 var1) {
      if (var1.method142() != 10) {// 1585
         throw new Class235("ConstantMethodref '" + Class130.method118(var1) + "' has wrong tag!");// 1104
      } else {
         int var4 = var1.method2();// 1654
         Class186 var10 = (Class186)this.field1496.method174(var4);// 1590
         String var3;
         if (!Class130.method126(var3 = ((Class191)this.field1496.method174(var10.method17())).method20())) {// 1067 1225
            throw new Class235("Invalid (non-interface) method name '" + var3 + "' referenced by '" + Class130.method118(var1) + "'.");// 1005
         } else {
            int var6 = var1.method17();// 1634
            Class182 var7 = (Class182)this.field1496.method174(var6);// 1518
            String var8;
            if (!Class130.method113(var8 = ((Class191)this.field1496.method174(var7.method2())).method20())) {// 1286 1546
               throw new Class235("Illegal class name '" + var8 + "' used by '" + Class130.method118(var1) + "'.");// 1002
            } else {
               String var11 = ((Class191)this.field1496.method174(var10.method2())).method20();// 1488

               try {
                  Class138 var9 = Class138.method150(var11);// 1663
                  if (var3.equals("<init>") && var9 != Class138.field586) {// 1235
                     throw new Class235("Instance initialization method must have VOID return type.");// 1291
                  }
               } catch (Class239 var5) {// 1177
                  throw new Class235("Illegal descriptor (==signature) '" + var11 + "' used by '" + Class130.method118(var1) + "'.");// 1247
               }
            }
         }
      }
   }// 1598

   // $VF: synthetic method
   @Override
   public void method999(Class189 var1) {
      Class459 var2 = this;
      if (var1.method142() != 11) {// 1680
         throw new Class235("ConstantInterfaceMethodref '" + Class130.method118(var1) + "' has wrong tag!");// 1405
      } else {
         int var4 = var1.method2();// 1109
         Class186 var10 = (Class186)this.field1496.method174(var4);// 1021
         String var3;
         if (!Class130.method123(var3 = ((Class191)this.field1496.method174(var10.method17())).method20())) {// 1120 1307
            throw new Class235("Invalid (interface) method name '" + var3 + "' referenced by '" + Class130.method118(var1) + "'.");// 1334
         } else {
            int var6 = var1.method17();// 1555
            Class182 var7 = (Class182)this.field1496.method174(var6);// 1020
            String var8;
            if (!Class130.method113(var8 = ((Class191)this.field1496.method174(var7.method2())).method20())) {// 1207 1421
               throw new Class235("Illegal class name '" + var8 + "' used by '" + Class130.method118(var1) + "'.");// 1478
            } else {
               String var11 = ((Class191)this.field1496.method174(var10.method2())).method20();// 1390

               try {
                  Class138 var9 = Class138.method150(var11);// 1257
                  if (var3.equals("<clinit>") && var9 != Class138.field586) {// 1295
                     var2.field1495// 1364
                        .method131(
                           "Class or interface initialization method '<clinit>' usually has VOID return type instead of '"
                              + var9
                              + "'. Note this is really not a requirement of The Java Virtual Machine Specification, Second Edition."
                        );
                  }
               } catch (Class239 var5) {// 1629
                  throw new Class235("Illegal descriptor (==signature) '" + var11 + "' used by '" + Class130.method118(var1) + "'.");// 1226
               }
            }
         }
      }
   }// 1046 1425

   // $VF: synthetic method
   public Class459(Class130 var1, Class205 var2) {
      this.field1495 = var1;
      this.field1496 = var2.method94();// 1171 1201
   }// 1575

   // $VF: synthetic method
   @Override
   public void method1000(Class190 var1) {
      if (var1.method142() != 9) {// 1316
         throw new Class235("ConstantFieldref '" + Class130.method118(var1) + "' has wrong tag!");// 1273
      } else {
         int var2 = var1.method2();// 1016
         Class186 var9 = (Class186)this.field1496.method174(var2);// 1258
         String var5;
         if (!Class130.method112(var5 = ((Class191)this.field1496.method174(var9.method17())).method20())) {// 1333 1415
            throw new Class235("Invalid field name '" + var5 + "' referenced by '" + Class130.method118(var1) + "'.");// 1294
         } else {
            int var6 = var1.method17();// 1241
            Class182 var7 = (Class182)this.field1496.method174(var6);// 1522
            String var8;
            if (!Class130.method113(var8 = ((Class191)this.field1496.method174(var7.method2())).method20())) {// 1262 1391
               throw new Class235("Illegal class name '" + var8 + "' used by '" + Class130.method118(var1) + "'.");// 1586
            } else {
               String var10 = ((Class191)this.field1496.method174(var9.method2())).method20();// 1551

               try {
                  Class138.method151(var10);// 1230
               } catch (Class239 var4) {
                  throw new Class235("Illegal descriptor (==signature) '" + var10 + "' used by '" + Class130.method118(var1) + "'.");// 1639
               }
            }
         }
      }
   }// 1512

   // $VF: synthetic method
   public Class459(Class130 var1, Class205 var2, Class527 var3) {
      this(var1, var2);// 1493
   }
}
