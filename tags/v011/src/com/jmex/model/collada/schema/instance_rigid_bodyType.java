/**
 * instance_rigid_bodyType.java This file was generated by XMLSpy 2006sp2
 * Enterprise Edition. YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION. Refer to the XMLSpy
 * Documentation for further details. http://www.altova.com/xmlspy
 */

package com.jmex.model.collada.schema;

import com.jmex.model.collada.types.SchemaNCName;
import com.jmex.model.collada.types.SchemaString;

public class instance_rigid_bodyType extends com.jmex.model.collada.xml.Node {

    private static final long serialVersionUID = 1L;

    public instance_rigid_bodyType(instance_rigid_bodyType node) {
        super(node);
    }

    public instance_rigid_bodyType(org.w3c.dom.Node node) {
        super(node);
    }

    public instance_rigid_bodyType(org.w3c.dom.Document doc) {
        super(doc);
    }

    public instance_rigid_bodyType(com.jmex.model.collada.xml.Document doc,
            String namespaceURI, String prefix, String name) {
        super(doc, namespaceURI, prefix, name);
    }

    public void adjustPrefix() {
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null,
                "body"); tmpNode != null; tmpNode = getDomNextChild(Attribute,
                null, "body", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null, "sid"); tmpNode != null; tmpNode = getDomNextChild(
                Attribute, null, "sid", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Attribute, null,
                "target"); tmpNode != null; tmpNode = getDomNextChild(
                Attribute, null, "target", tmpNode)) {
            internalAdjustPrefix(tmpNode, false);
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new technique_commonType3(tmpNode).adjustPrefix();
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "technique", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new techniqueType5(tmpNode).adjustPrefix();
        }
        for (org.w3c.dom.Node tmpNode = getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra"); tmpNode != null; tmpNode = getDomNextChild(
                Element, "http://www.collada.org/2005/11/COLLADASchema",
                "extra", tmpNode)) {
            internalAdjustPrefix(tmpNode, true);
            new extraType(tmpNode).adjustPrefix();
        }
    }

    public static int getbodyMinCount() {
        return 1;
    }

    public static int getbodyMaxCount() {
        return 1;
    }

    public int getbodyCount() {
        return getDomChildCount(Attribute, null, "body");
    }

    public boolean hasbody() {
        return hasDomChild(Attribute, null, "body");
    }

    public SchemaNCName newbody() {
        return new SchemaNCName();
    }

    public SchemaNCName getbodyAt(int index) throws Exception {
        return new SchemaNCName(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "body", index))));
    }

    public org.w3c.dom.Node getStartingbodyCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "body");
    }

    public org.w3c.dom.Node getAdvancedbodyCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Attribute, null, "body", curNode);
    }

    public SchemaNCName getbodyValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaNCName(getDomNodeValue(dereference(curNode)));
    }

    public SchemaNCName getbody() throws Exception {
        return getbodyAt(0);
    }

    public void removebodyAt(int index) {
        removeDomChildAt(Attribute, null, "body", index);
    }

    public void removebody() {
        while (hasbody())
            removebodyAt(0);
    }

    public void addbody(SchemaNCName value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "body", value.toString());
        }
    }

    public void addbody(String value) throws Exception {
        addbody(new SchemaNCName(value));
    }

    public void insertbodyAt(SchemaNCName value, int index) {
        insertDomChildAt(Attribute, null, "body", index, value.toString());
    }

    public void insertbodyAt(String value, int index) throws Exception {
        insertbodyAt(new SchemaNCName(value), index);
    }

    public void replacebodyAt(SchemaNCName value, int index) {
        replaceDomChildAt(Attribute, null, "body", index, value.toString());
    }

    public void replacebodyAt(String value, int index) throws Exception {
        replacebodyAt(new SchemaNCName(value), index);
    }

    public static int getsidMinCount() {
        return 0;
    }

    public static int getsidMaxCount() {
        return 1;
    }

    public int getsidCount() {
        return getDomChildCount(Attribute, null, "sid");
    }

    public boolean hassid() {
        return hasDomChild(Attribute, null, "sid");
    }

    public SchemaNCName newsid() {
        return new SchemaNCName();
    }

    public SchemaNCName getsidAt(int index) throws Exception {
        return new SchemaNCName(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "sid", index))));
    }

    public org.w3c.dom.Node getStartingsidCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "sid");
    }

    public org.w3c.dom.Node getAdvancedsidCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Attribute, null, "sid", curNode);
    }

    public SchemaNCName getsidValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaNCName(getDomNodeValue(dereference(curNode)));
    }

    public SchemaNCName getsid() throws Exception {
        return getsidAt(0);
    }

    public void removesidAt(int index) {
        removeDomChildAt(Attribute, null, "sid", index);
    }

    public void removesid() {
        while (hassid())
            removesidAt(0);
    }

    public void addsid(SchemaNCName value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "sid", value.toString());
        }
    }

    public void addsid(String value) throws Exception {
        addsid(new SchemaNCName(value));
    }

    public void insertsidAt(SchemaNCName value, int index) {
        insertDomChildAt(Attribute, null, "sid", index, value.toString());
    }

    public void insertsidAt(String value, int index) throws Exception {
        insertsidAt(new SchemaNCName(value), index);
    }

    public void replacesidAt(SchemaNCName value, int index) {
        replaceDomChildAt(Attribute, null, "sid", index, value.toString());
    }

    public void replacesidAt(String value, int index) throws Exception {
        replacesidAt(new SchemaNCName(value), index);
    }

    public static int gettargetMinCount() {
        return 1;
    }

    public static int gettargetMaxCount() {
        return 1;
    }

    public int gettargetCount() {
        return getDomChildCount(Attribute, null, "target");
    }

    public boolean hastarget() {
        return hasDomChild(Attribute, null, "target");
    }

    public SchemaString newtarget() {
        return new SchemaString();
    }

    public SchemaString gettargetAt(int index) throws Exception {
        return new SchemaString(getDomNodeValue(dereference(getDomChildAt(
                Attribute, null, "target", index))));
    }

    public org.w3c.dom.Node getStartingtargetCursor() throws Exception {
        return getDomFirstChild(Attribute, null, "target");
    }

    public org.w3c.dom.Node getAdvancedtargetCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Attribute, null, "target", curNode);
    }

    public SchemaString gettargetValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new SchemaString(getDomNodeValue(dereference(curNode)));
    }

    public SchemaString gettarget() throws Exception {
        return gettargetAt(0);
    }

    public void removetargetAt(int index) {
        removeDomChildAt(Attribute, null, "target", index);
    }

    public void removetarget() {
        while (hastarget())
            removetargetAt(0);
    }

    public void addtarget(SchemaString value) {
        if (value.isNull() == false) {
            appendDomChild(Attribute, null, "target", value.toString());
        }
    }

    public void addtarget(String value) throws Exception {
        addtarget(new SchemaString(value));
    }

    public void inserttargetAt(SchemaString value, int index) {
        insertDomChildAt(Attribute, null, "target", index, value.toString());
    }

    public void inserttargetAt(String value, int index) throws Exception {
        inserttargetAt(new SchemaString(value), index);
    }

    public void replacetargetAt(SchemaString value, int index) {
        replaceDomChildAt(Attribute, null, "target", index, value.toString());
    }

    public void replacetargetAt(String value, int index) throws Exception {
        replacetargetAt(new SchemaString(value), index);
    }

    public static int gettechnique_commonMinCount() {
        return 1;
    }

    public static int gettechnique_commonMaxCount() {
        return 1;
    }

    public int gettechnique_commonCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common");
    }

    public boolean hastechnique_common() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common");
    }

    public technique_commonType3 newtechnique_common() {
        return new technique_commonType3(domNode.getOwnerDocument()
                .createElementNS(
                        "http://www.collada.org/2005/11/COLLADASchema",
                        "technique_common"));
    }

    public technique_commonType3 gettechnique_commonAt(int index)
            throws Exception {
        return new technique_commonType3(dereference(getDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", index)));
    }

    public org.w3c.dom.Node getStartingtechnique_commonCursor()
            throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common");
    }

    public org.w3c.dom.Node getAdvancedtechnique_commonCursor(
            org.w3c.dom.Node curNode) throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", curNode);
    }

    public technique_commonType3 gettechnique_commonValueAtCursor(
            org.w3c.dom.Node curNode) throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new technique_commonType3(dereference(curNode));
    }

    public technique_commonType3 gettechnique_common() throws Exception {
        return gettechnique_commonAt(0);
    }

    public void removetechnique_commonAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", index);
    }

    public void removetechnique_common() {
        while (hastechnique_common())
            removetechnique_commonAt(0);
    }

    public void addtechnique_common(technique_commonType3 value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", value);
    }

    public void inserttechnique_commonAt(technique_commonType3 value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", index, value);
    }

    public void replacetechnique_commonAt(technique_commonType3 value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique_common", index, value);
    }

    public static int gettechniqueMinCount() {
        return 0;
    }

    public static int gettechniqueMaxCount() {
        return Integer.MAX_VALUE;
    }

    public int gettechniqueCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public boolean hastechnique() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public techniqueType5 newtechnique() {
        return new techniqueType5(domNode.getOwnerDocument().createElementNS(
                "http://www.collada.org/2005/11/COLLADASchema", "technique"));
    }

    public techniqueType5 gettechniqueAt(int index) throws Exception {
        return new techniqueType5(dereference(getDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                index)));
    }

    public org.w3c.dom.Node getStartingtechniqueCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique");
    }

    public org.w3c.dom.Node getAdvancedtechniqueCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                curNode);
    }

    public techniqueType5 gettechniqueValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new techniqueType5(dereference(curNode));
    }

    public techniqueType5 gettechnique() throws Exception {
        return gettechniqueAt(0);
    }

    public void removetechniqueAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "technique",
                index);
    }

    public void removetechnique() {
        while (hastechnique())
            removetechniqueAt(0);
    }

    public void addtechnique(techniqueType5 value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "technique", value);
    }

    public void inserttechniqueAt(techniqueType5 value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique", index, value);
    }

    public void replacetechniqueAt(techniqueType5 value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "technique", index, value);
    }

    public static int getextraMinCount() {
        return 0;
    }

    public static int getextraMaxCount() {
        return Integer.MAX_VALUE;
    }

    public int getextraCount() {
        return getDomChildCount(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra");
    }

    public boolean hasextra() {
        return hasDomChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra");
    }

    public extraType newextra() {
        return new extraType(domNode.getOwnerDocument().createElementNS(
                "http://www.collada.org/2005/11/COLLADASchema", "extra"));
    }

    public extraType getextraAt(int index) throws Exception {
        return new extraType(
                dereference(getDomChildAt(Element,
                        "http://www.collada.org/2005/11/COLLADASchema",
                        "extra", index)));
    }

    public org.w3c.dom.Node getStartingextraCursor() throws Exception {
        return getDomFirstChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra");
    }

    public org.w3c.dom.Node getAdvancedextraCursor(org.w3c.dom.Node curNode)
            throws Exception {
        return getDomNextChild(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra",
                curNode);
    }

    public extraType getextraValueAtCursor(org.w3c.dom.Node curNode)
            throws Exception {
        if (curNode == null)
            throw new com.jmex.model.collada.xml.XmlException("Out of range");
        else
            return new extraType(dereference(curNode));
    }

    public extraType getextra() throws Exception {
        return getextraAt(0);
    }

    public void removeextraAt(int index) {
        removeDomChildAt(Element,
                "http://www.collada.org/2005/11/COLLADASchema", "extra", index);
    }

    public void removeextra() {
        while (hasextra())
            removeextraAt(0);
    }

    public void addextra(extraType value) {
        appendDomElement("http://www.collada.org/2005/11/COLLADASchema",
                "extra", value);
    }

    public void insertextraAt(extraType value, int index) {
        insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "extra", index, value);
    }

    public void replaceextraAt(extraType value, int index) {
        replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema",
                "extra", index, value);
    }

    private org.w3c.dom.Node dereference(org.w3c.dom.Node node) {
        return node;
    }
}