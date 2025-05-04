package com.allatori.ant;

import java.io.FileReader;
import javax.xml.parsers.SAXParserFactory;

import com.allatori.exception.ExceptionProxy;
import com.allatori.exception.class_284;
import com.allatori.interfaces.unmapped.class_338;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_304 implements class_338 {
    public String field_1089;

    public class_304(String str) {
        this.field_1089 = str;
    }

    @Override // p000.class_338
    public void method_1346() {
        try {
            FileReader fileReader = new FileReader(this.field_1089);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            xMLReader.setContentHandler(new class_89(this, null));
            xMLReader.parse(new InputSource(fileReader));
        } catch (class_284 e) {
            throw new ExceptionProxy(e.getMessage());
        } catch (Exception e2) {
            throw new ExceptionProxy(e2);
        }
    }

    public static String method_1345(class_304 class_304Var) {
        return class_304Var.field_1089;
    }
}
