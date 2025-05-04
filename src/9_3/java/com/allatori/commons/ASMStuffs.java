package com.allatori.commons;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: C:\Users\zjxpr\AppData\Local\Temp\jadx-8194546805876229837\classes.dex */
public final class ASMStuffs {
    public static final int field_100 = 60;
    public static final int field_102 = 68;
    public static final int field_104 = 40;
    public static final int field_105 = 216;
    public static final int field_110 = 65;
    public static final int field_111 = 78;
    public static final int field_113 = 64;
    public static final int field_116 = 211;
    public static final int field_117 = 62;
    public static final int field_118 = 75;
    public static final int field_120 = 219;
    public static final int field_121 = 215;
    public static final int field_122 = 35;
    public static final int field_123 = 49;
    public static final int field_124 = 69;
    public static final int field_125 = 213;
    public static final int field_126 = 77;
    public static final int field_128 = 71;
    public static final int field_129 = 59;
    public static final int field_130 = 220;
    public static final int field_131 = 202;
    public static final int field_132 = 262144;
    public static final int field_133 = 205;
    public static final int field_134 = 63;
    public static final int field_135 = 32;
    public static final int field_137 = 33;
    public static final int field_138 = 34;
    public static final int field_140 = 72;
    public static final int field_141 = 26;
    public static final int field_143 = 206;
    public static final int field_146 = 73;
    public static final int field_147 = 42;
    public static final int field_148 = 20;
    public static final int field_149 = 41;
    public static final int field_150 = 200;
    public static final int field_151 = 256;
    public static final int field_152 = 207;
    public static final int field_153 = 201;
    public static final int field_156 = 28;
    public static final int field_157 = 27;
    public static final int field_160 = 29;
    public static final int field_161 = 43;
    public static final int field_162 = 30;
    public static final int field_163 = 38;
    public static final int field_164 = 209;
    public static final int field_166 = 208;
    public static final int field_167 = 44;
    public static final int field_168 = 20;
    public static final int field_169 = 214;
    public static final int field_170 = 37;
    public static final int field_171 = 218;
    public static final int field_172 = 70;
    public static final int field_173 = 204;
    public static final int field_175 = 45;
    public static final int field_79 = 196;
    public static final int field_80 = 36;
    public static final int field_81 = 212;
    public static final int field_82 = 19;
    public static final int field_83 = 203;
    public static final int field_84 = 31;
    public static final int field_86 = 76;
    public static final int field_87 = 39;
    public static final int field_89 = 74;
    public static final int field_91 = 67;
    public static final int field_93 = 33;
    public static final int field_95 = 210;
    public static final int field_96 = 66;
    public static final int field_97 = 217;
    public static final int field_98 = 61;
    public static final String field_119 = "ConstantValue";
    public static final String field_78 = "Code";
    public static final String field_155 = "StackMapTable";
    public static final String field_106 = "Exceptions";
    public static final String field_88 = "InnerClasses";
    public static final String field_85 = "EnclosingMethod";
    public static final String field_103 = "Synthetic";
    public static final String field_115 = "Signature";
    public static final String field_114 = "SourceFile";
    public static final String field_176 = "SourceDebugExtension";
    public static final String field_94 = "LineNumberTable";
    public static final String field_136 = "LocalVariableTable";
    public static final String field_107 = "LocalVariableTypeTable";
    public static final String field_108 = "Deprecated";
    public static final String field_101 = "RuntimeVisibleAnnotations";
    public static final String field_159 = "RuntimeInvisibleAnnotations";
    public static final String field_139 = "RuntimeVisibleParameterAnnotations";
    public static final String field_127 = "RuntimeInvisibleParameterAnnotations";
    public static final String field_154 = "RuntimeVisibleTypeAnnotations";
    public static final String field_174 = "RuntimeInvisibleTypeAnnotations";
    public static final String field_145 = "AnnotationDefault";
    public static final String field_99 = "BootstrapMethods";
    public static final String field_165 = "MethodParameters";
    public static final String field_109 = "Module";
    public static final String field_144 = "ModulePackages";
    public static final String field_158 = "ModuleMainClass";
    public static final String field_90 = "NestHost";
    public static final String field_142 = "NestMembers";
    public static final String field_92 = "PermittedSubclasses";
    public static final String field_112 = "Record";

    public static String method_190(String str) {
        return new StringBuilder().insert(0, str).append(".class").toString();
    }

    public static String method_191(String str) {
        return new StringBuilder().insert(0, "org/objectweb/asm/util/Trace").append(str).append("Visitor(\\$.*)?").toString();
    }

    public static String method_193(String str) {
        return new StringBuilder().insert(0, "org/objectweb/asm/util/Check").append(str).append("Adapter(\\$.*)?").toString();
    }

    public static boolean method_192(String str) {
        if (str.startsWith("org/objectweb/asm/")) {
            return str.contains("Test$") || Pattern.matches(method_191("(Annotation|Class|Field|Method|Module|RecordComponent|Signature)"), str) || Pattern.matches(method_193("(Annotation|Class|Field|Method|Module|RecordComponent|Signature)"), str);
        }
        return false;
    }

    public static void method_195(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (readUnsignedShort == 65535) {
                } else {
                    throw new IllegalStateException("ASM10_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }

    public static void method_194(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace('.', '/');
        if (!method_192(replace)) {
            method_195(cls.getClassLoader().getResourceAsStream(method_190(replace)));
        }
    }
}
