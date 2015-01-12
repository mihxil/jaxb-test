package org.meeuw;

import java.util.Arrays;

import javax.xml.bind.JAXB;

import org.junit.Ignore;
import org.junit.Test;
import org.meeuw.a.A;
import org.meeuw.b.B;
import org.meeuw.b.BList;
import org.meeuw.b.C;

/**
 * @author Michiel Meeuwissen
 * @since ...
 */
public class JAXBTest {

    @Test
    @Ignore
    public void simple () {
        A a = new A();
        JAXB.marshal(a, System.out);
    }

    @Test
    public void list() {
        B<A> b = new B<>();
        b.list = new BList<>(Arrays.asList(new A()));
        JAXB.marshal(b, System.out);
    }

    @Test
    public void list2() {
        B<C> b = new B<>();
        b.list = new BList<C>(Arrays.asList(new C()));
        JAXB.marshal(b, System.out);
    }
}
