package org.meeuw.b;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.meeuw.Xmlns;

/**
 * @author Michiel Meeuwissen
 * @since ...
 */
@XmlRootElement
public class B<T> {

    @XmlElement(namespace = Xmlns.B)
    public BList<T> list;

}
