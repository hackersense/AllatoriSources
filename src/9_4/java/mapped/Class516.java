package mapped;

import java.io.Reader;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

// $VF: Compiled from gx
public class Class516 {
   // $VF: synthetic method
   public static Class555 method1464(Reader var0) {
      XMLReader var1 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();// 335 507
      Class555 var3;
      Class555 var10000 = var3 = new Class555();// 557
      var1.setContentHandler(new Class444(var3));// 34
      var1.parse(new InputSource(var0));// 332
      return var10000;// 260
   }
}
