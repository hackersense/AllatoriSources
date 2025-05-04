package com.allatori.ant;

import java.io.Reader;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_584 {
    public static class_220 method_2029(Reader reader) {
        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        class_220 class_220Var = new class_220();
        xMLReader.setContentHandler(new class_3(class_220Var));
        xMLReader.parse(new InputSource(reader));
        return class_220Var;
    }
}
