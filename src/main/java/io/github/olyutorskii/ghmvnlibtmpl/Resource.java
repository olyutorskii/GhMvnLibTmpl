/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Resource {

    static final String RES_PROP =
            "resources/test.properties";
            //"resources/ZZZZ.properties";

    static final Class<?> THISCLASS = Resource.class;
    static final Resource SINGLETON;

    Properties props;


    static {
        try {
            SINGLETON = new Resource();
        } catch (IOException ex) {
            throw new ExceptionInInitializerError(ex);
        }

        assert SINGLETON.checkProp();
        assert THISCLASS.equals(SINGLETON.getClass());
    }


    /**
     *
     * @throws java.io.IOException
     */
    private Resource() throws IOException {
        super();

        InputStream is;
        is = this.getClass().getResourceAsStream(RES_PROP);
        assert is != null;

        this.props = new Properties();
        props.load(is);

        return;
    }

    private boolean checkProp(){
        String val;

        val = this.props.getProperty("key");
        assert "value".equals(val);
        // assert "XXX".equals(val);

        val = this.props.getProperty("han");
        assert "漢".equals(val);

        return true;
    }

    static Resource getResource(){
        return SINGLETON;
    }

}
