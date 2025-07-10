package mapped;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

// $VF: Compiled from v
public final class Class457 {
   // $VF: synthetic field
   public static final int field1390 = 31;
   // $VF: synthetic field
   public static final String field1391 = "ModulePackages";
   // $VF: synthetic field
   public static final int field1392 = 211;
   // $VF: synthetic field
   public static final int field1393 = 41;
   // $VF: synthetic field
   public static final String field1394 = "EnclosingMethod";
   // $VF: synthetic field
   public static final String field1395 = "Record";
   // $VF: synthetic field
   public static final String field1396 = "InnerClasses";
   // $VF: synthetic field
   public static final int field1397 = 34;
   // $VF: synthetic field
   public static final String field1398 = "Deprecated";
   // $VF: synthetic field
   public static final int field1399 = 218;
   // $VF: synthetic field
   public static final int field1400 = 64;
   // $VF: synthetic field
   public static final String field1401 = "LineNumberTable";
   // $VF: synthetic field
   public static final int field1402 = 67;
   // $VF: synthetic field
   public static final int field1403 = 73;
   // $VF: synthetic field
   public static final String field1404 = "NestMembers";
   // $VF: synthetic field
   public static final int field1405 = 76;
   // $VF: synthetic field
   public static final String field1406 = "LocalVariableTypeTable";
   // $VF: synthetic field
   public static final int field1407 = 27;
   // $VF: synthetic field
   public static final int field1408 = 59;
   // $VF: synthetic field
   public static final int field1409 = 214;
   // $VF: synthetic field
   public static final int field1410 = 220;
   // $VF: synthetic field
   public static final int field1411 = 69;
   // $VF: synthetic field
   public static final int field1412 = 72;
   // $VF: synthetic field
   public static final int field1413 = 77;
   // $VF: synthetic field
   public static final int field1414 = 200;
   // $VF: synthetic field
   public static final int field1415 = 30;
   // $VF: synthetic field
   public static final int field1416 = 19;
   // $VF: synthetic field
   public static final int field1417 = 37;
   // $VF: synthetic field
   public static final int field1418 = 210;
   // $VF: synthetic field
   public static final int field1419 = 29;
   // $VF: synthetic field
   public static final int field1420 = 78;
   // $VF: synthetic field
   public static final int field1421 = 35;
   // $VF: synthetic field
   public static final int field1422 = 68;
   // $VF: synthetic field
   public static final int field1423 = 66;
   // $VF: synthetic field
   public static final int field1424 = 206;
   // $VF: synthetic field
   public static final int field1425 = 49;
   // $VF: synthetic field
   public static final int field1426 = 217;
   // $VF: synthetic field
   public static final int field1427 = 40;
   // $VF: synthetic field
   public static final int field1428 = 205;
   // $VF: synthetic field
   public static final int field1429 = 256;
   // $VF: synthetic field
   public static final String field1430 = "MethodParameters";
   // $VF: synthetic field
   public static final int field1431 = 45;
   // $VF: synthetic field
   public static final int field1432 = 204;
   // $VF: synthetic field
   public static final int field1433 = 75;
   // $VF: synthetic field
   public static final String field1434 = "AnnotationDefault";
   // $VF: synthetic field
   public static final String field1435 = "Signature";
   // $VF: synthetic field
   public static final int field1436 = 74;
   // $VF: synthetic field
   public static final int field1437 = 215;
   // $VF: synthetic field
   public static final int field1438 = 39;
   // $VF: synthetic field
   public static final int field1439 = 70;
   // $VF: synthetic field
   public static final int field1440 = 26;
   // $VF: synthetic field
   public static final int field1441 = 71;
   // $VF: synthetic field
   public static final String field1442 = "NestHost";
   // $VF: synthetic field
   public static final String field1443 = "ModuleMainClass";
   // $VF: synthetic field
   public static final int field1444 = 202;
   // $VF: synthetic field
   public static final String field1445 = "ConstantValue";
   // $VF: synthetic field
   public static final int field1446 = 62;
   // $VF: synthetic field
   public static final int field1447 = 213;
   // $VF: synthetic field
   public static final int field1448 = 20;
   // $VF: synthetic field
   public static final int field1449 = 203;
   // $VF: synthetic field
   public static final int field1450 = 63;
   // $VF: synthetic field
   public static final String field1451 = "SourceDebugExtension";
   // $VF: synthetic field
   public static final String field1452 = "RuntimeVisibleTypeAnnotations";
   // $VF: synthetic field
   public static final int field1453 = 209;
   // $VF: synthetic field
   public static final int field1454 = 44;
   // $VF: synthetic field
   public static final int field1455 = 33;
   // $VF: synthetic field
   public static final String field1456 = "PermittedSubclasses";
   // $VF: synthetic field
   public static final String field1457 = "Exceptions";
   // $VF: synthetic field
   public static final int field1458 = 207;
   // $VF: synthetic field
   public static final int field1459 = 219;
   // $VF: synthetic field
   public static final int field1460 = 38;
   // $VF: synthetic field
   public static final String field1461 = "Code";
   // $VF: synthetic field
   public static final String field1462 = "RuntimeVisibleParameterAnnotations";
   // $VF: synthetic field
   public static final String field1463 = "SourceFile";
   // $VF: synthetic field
   public static final int field1464 = 201;
   // $VF: synthetic field
   public static final int field1465 = 36;
   // $VF: synthetic field
   public static final int field1466 = 61;
   // $VF: synthetic field
   public static final int field1467 = 32;
   // $VF: synthetic field
   public static final int field1468 = 20;
   // $VF: synthetic field
   public static final String field1469 = "RuntimeInvisibleTypeAnnotations";
   // $VF: synthetic field
   public static final String field1470 = "LocalVariableTable";
   // $VF: synthetic field
   public static final String field1471 = "BootstrapMethods";
   // $VF: synthetic field
   public static final int field1472 = 208;
   // $VF: synthetic field
   public static final int field1473 = 212;
   // $VF: synthetic field
   public static final int field1474 = 60;
   // $VF: synthetic field
   public static final String field1475 = "Module";
   // $VF: synthetic field
   public static final int field1476 = 43;
   // $VF: synthetic field
   public static final int field1477 = 28;
   // $VF: synthetic field
   public static final int field1478 = 33;
   // $VF: synthetic field
   public static final int field1479 = 196;
   // $VF: synthetic field
   public static final String field1480 = "Synthetic";
   // $VF: synthetic field
   public static final int field1481 = 262144;
   // $VF: synthetic field
   public static final int field1482 = 65;
   // $VF: synthetic field
   public static final String field1483 = "StackMapTable";
   // $VF: synthetic field
   public static final String field1484 = "RuntimeVisibleAnnotations";
   // $VF: synthetic field
   public static final int field1485 = 216;
   // $VF: synthetic field
   public static final int field1486 = 42;
   // $VF: synthetic field
   public static final String field1487 = "RuntimeInvisibleAnnotations";
   // $VF: synthetic field
   public static final String field1488 = "RuntimeInvisibleParameterAnnotations";

   // $VF: synthetic method
   public static String method979(String var0) {
      return var0 + ".class";
   }

   // $VF: synthetic method
   public static String method980(String var0) {
      return "org/objectweb/asm/util/Check" + var0 + "Adapter(\\$.*)?";
   }

   // $VF: synthetic method
   public static boolean method981(String var0) {
      if (!var0.startsWith("org/objectweb/asm/")) {// 434
         return false;// 292
      } else {
         String var2 = "(Annotation|Class|Field|Method|Module|RecordComponent|Signature)";// 72
         return var0.contains("Test$") || Pattern.matches(method982(var2), var0) || Pattern.matches(method980(var2), var0);// 268 497 536
      }
   }

   // $VF: synthetic method
   public static String method982(String var0) {
      return "org/objectweb/asm/util/Trace" + var0 + "Visitor(\\$.*)?";
   }

   // $VF: synthetic method
   public static void method983(InputStream var0) {
      InputStream var2 = var0;
      if (var0 == null) {// 15
         throw new IllegalStateException("Bytecode not available, can't check class version");// 385
      } else {
         int var1;
         try {
            DataInputStream var8 = new DataInputStream(var2);// 582

            try {
               var8.readInt();// 177
               var1 = var8.readUnsignedShort();// 266
            } catch (Throwable var6) {
               try {
                  var8.close();
               } catch (Throwable var5) {
                  throw var6;
               }

               throw var6;
            }

            var8.close();
         } catch (IOException var7) {// 235
            throw new IllegalStateException("I/O error, can't check class version", var7);// 280
         }

         if (var1 != 65535) {// 516
            throw new IllegalStateException("ASM10_EXPERIMENTAL can only be used by classes compiled with --enable-preview");// 95
         }
      }
   }// 77

   // $VF: synthetic method
   public static void method984(Object var0) {
      Class var1;
      if (!method981(var0 = (var1 = var0.getClass()).getName().replace('.', '/'))) {// 50 137 314
         method983(var1.getClassLoader().getResourceAsStream(method979(var0)));// 253
      }
   }// 474
}
