/**
 * gles_texenv_mode_enums.java This file was generated by XMLSpy 2006sp2
 * Enterprise Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION. Refer to the XMLSpy
 * Documentation for further details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

import com.jmex.model.collada.types.SchemaToken;

public class gles_texenv_mode_enums extends SchemaToken {

    private static final long serialVersionUID = 1L;
    public static final int EREPLACE = 0; /* REPLACE */
    public static final int EMODULATE = 1; /* MODULATE */
    public static final int EDECAL = 2; /* DECAL */
    public static final int EBLEND = 3; /* BLEND */
    public static final int EADD = 4; /* ADD */

    public static String[] sEnumValues = { "REPLACE", "MODULATE", "DECAL",
            "BLEND", "ADD", };

    public gles_texenv_mode_enums() {
        super();
    }

    public gles_texenv_mode_enums(String newValue) {
        super(newValue);
        validate();
    }

    public gles_texenv_mode_enums(SchemaToken newValue) {
        super(newValue);
        validate();
    }

    public static int getEnumerationCount() {
        return sEnumValues.length;
    }

    public static String getEnumerationValue(int index) {
        return sEnumValues[index];
    }

    public static boolean isValidEnumerationValue(String val) {
        for (int i = 0; i < sEnumValues.length; i++) {
            if (val.equals(sEnumValues[i]))
                return true;
        }
        return false;
    }

    public void validate() {

        if (!isValidEnumerationValue(toString()))
            throw new com.jmex.model.collada.xml.XmlException(
                    "Value of gles_texenv_mode_enums is invalid.");
    }
}