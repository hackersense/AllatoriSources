package mapped;

import java.io.FileReader;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

// $VF: Compiled from br
public class Class525 implements Class526 {
   // $VF: synthetic field
   public String field1784;

   // $VF: synthetic method
   public static String method1554(Class525 var0) {
      return var0.field1784;// 87
   }

   // $VF: synthetic method
   public Class525(String var1) {
      this.field1784 = var1;// 232 463
   }// 198

   // $VF: synthetic method
   @Override
   public void method1555() {
      Class525 var1 = this;

      try {
         FileReader var5 = new FileReader(var1.field1784);// 329
         XMLReader var2 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();// 38 412
         var2.setContentHandler(new Class445(var1, null));// 257
         var2.parse(new InputSource(var5));// 269
      } catch (Class244 var3) {// 455
         throw new Class225(var3.getMessage());// 148
      } catch (Exception var4) {// 236
         throw new Class225(var4);// 142
      }
   }// 39
}
