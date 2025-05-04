package com.allatori.ant;

import java.io.File;

import com.allatori.Obfuscate;
import com.allatori.commons.AllatoriLogger;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class ObfuscatorTask extends Task {
    public String field_1090;

    public void method_1357() {
        if (this.field_1090 == null) {
            throw new BuildException("Missing 'config' attribute.");
        }
        try {
            AllatoriLogger.method_683("*");
            AllatoriLogger.method_683("*");
            AllatoriLogger.method_683("* DEMO VERSION OF ALLATORI JAVA OBFUSCATOR!");
            AllatoriLogger.method_683("* NOT FOR COMMERCIAL USE!");
            AllatoriLogger.method_683("* Demo version adds System.out's and gives 'ALLATORI_DEMO' name to some fields and methods.");
            AllatoriLogger.method_683("*");
            AllatoriLogger.method_683("*");
            File file = new File(this.field_1090);
            if (!file.canRead()) {
                throw new BuildException("Cannot find configuration file: '" + this.field_1090 + "'");
            }
            File file2 = new File(this.field_1090 + ".resolved");
            file2.deleteOnExit();
            class_344.method_1404(file2, "UTF-8", getProject().replaceProperties(class_344.method_1406(file, "UTF-8")));
            class_544.method_1921(file2.getPath());
            Obfuscate.method_1347();
            class_544.clearF2053();
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }

    public void method_1358(String str) {
        this.field_1090 = str;
    }
}
