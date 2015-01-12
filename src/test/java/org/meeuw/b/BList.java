package org.meeuw.b;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.*;

import org.meeuw.a.A;

/**
 * @author Michiel Meeuwissen
 * @since ...
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlSeeAlso({A.class, C.class})
public class BList<T> implements Iterable<T> {

    @XmlTransient
    protected List<T> list;


    public BList(final java.util.List<T> list) {
        this.list = list == null ? Collections.<T>emptyList() : Collections.unmodifiableList(list);
    }

    @XmlElement(name = "item")
    public java.util.List<T> getList() {
        return list;
    }

    @Override
    public Iterator<T> iterator() {
        return list == null ? Collections.<T>emptyList().iterator() : list.iterator();
    }

}
