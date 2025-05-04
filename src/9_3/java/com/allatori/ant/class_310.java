package com.allatori.ant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;

import com.allatori.Obfuscate;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public class class_310 extends IncrementalProjectBuilder {
    public static final String field_1091 = "com.allatori.eclipse";

    public IProject[] method_1359(int i, Map map, IProgressMonitor iProgressMonitor) {
        getProject();
        switch (i) {
            case 6:
                method_1360(iProgressMonitor);
                break;
        }
        return null;
    }

    public void method_1360(IProgressMonitor iProgressMonitor) {
        try {
            String iPath = getProject().getLocation().toString();
            File file = new File(String.valueOf(iPath) + "/allatori.xml");
            if (file.exists()) {
                StringBuffer stringBuffer = new StringBuffer((int) file.length());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                BufferedReader bufferedReader2 = bufferedReader;
                while (true) {
                    int read = bufferedReader2.read();
                    if (read == -1) {
                        break;
                    }
                    stringBuffer.append((char) read);
                    bufferedReader2 = bufferedReader;
                }
                bufferedReader.close();
                String stringBuffer2 = stringBuffer.toString();
                if (stringBuffer2.contains("${eclipse-")) {
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    IJavaProject create = JavaCore.create(getProject());
                    IClasspathEntry[] resolvedClasspath = create.getResolvedClasspath(true);
                    int length = resolvedClasspath.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        IClasspathEntry iClasspathEntry = resolvedClasspath[i2];
                        if (iClasspathEntry.getEntryKind() != 3) {
                            if (iClasspathEntry.getEntryKind() == 1) {
                                sb2.append("        <jar name=\"" + iClasspathEntry.getPath().toString() + "\"/>\n");
                            }
                        } else if (iClasspathEntry.getOutputLocation() != null) {
                            String iPath2 = iClasspathEntry.getOutputLocation().removeFirstSegments(1).toString();
                            sb.append("        <dir in=\"" + iPath2 + "\" out=\"" + iPath2 + "\"/>\n");
                        }
                        int i3 = i2 + 1;
                        i = i3;
                        i2 = i3;
                    }
                    if (create.getOutputLocation() != null) {
                        String iPath3 = create.getOutputLocation().removeFirstSegments(1).toString();
                        sb.append("        <dir in=\"" + iPath3 + "\" out=\"" + iPath3 + "\"/>\n");
                    }
                    String replace = stringBuffer2.replace("${eclipse-input}", sb).replace("${eclipse-classpath}", sb2);
                    file = new File(String.valueOf(iPath) + "/allatori-resolved.xml");
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
                    bufferedWriter.write(replace);
                    bufferedWriter.close();
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                StringBuilder sb4 = new StringBuilder();
                IJavaProject create2 = JavaCore.create(getProject());
                IClasspathEntry[] resolvedClasspath2 = create2.getResolvedClasspath(true);
                int length2 = resolvedClasspath2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    IClasspathEntry iClasspathEntry2 = resolvedClasspath2[i5];
                    if (iClasspathEntry2.getEntryKind() == 3) {
                        if (iClasspathEntry2.getOutputLocation() != null) {
                            String iPath4 = iClasspathEntry2.getOutputLocation().removeFirstSegments(1).toString();
                            sb3.append("        <dir in=\"" + iPath4 + "\" out=\"" + iPath4 + "\"/>\n");
                        }
                    } else if (iClasspathEntry2.getEntryKind() == 1) {
                        sb4.append("        <jar name=\"" + iClasspathEntry2.getPath().toString() + "\"/>\n");
                    }
                    int i6 = i5 + 1;
                    i4 = i6;
                    i5 = i6;
                }
                if (create2.getOutputLocation() != null) {
                    String iPath5 = create2.getOutputLocation().removeFirstSegments(1).toString();
                    sb3.append("        <dir in=\"" + iPath5 + "\" out=\"" + iPath5 + "\"/>\n");
                }
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
                bufferedWriter2.write("<config>\n    <input>\n" + ((Object) sb3) + "    </input>\n\n    <classpath>\n" + ((Object) sb4) + "    </classpath>\n\n    <keep-names>\n        <class access=\"protected+\">\n            <field access=\"protected+\"/>\n            <method access=\"protected+\"/>\n        </class>\n    </keep-names>\n\n    <property name=\"log-file\" value=\"allatori-log.xml\"/>\n</config>\n");
                bufferedWriter2.close();
            }
            Obfuscate.method_1349(file);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CoreException(new Status(4, "com.allatori.eclipse", 0, e.getMessage(), e));
        }
    }
}
