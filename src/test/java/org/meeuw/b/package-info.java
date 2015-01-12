@javax.xml.bind.annotation.XmlSchema(namespace = Xmlns.B,
    xmlns =
        {
            @XmlNs(prefix = "", namespaceURI = Xmlns.B),
            @XmlNs(prefix = "a", namespaceURI = Xmlns.A)
        },
    elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
    attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED
)
package org.meeuw.b;

import javax.xml.bind.annotation.XmlNs;

import org.meeuw.Xmlns;
