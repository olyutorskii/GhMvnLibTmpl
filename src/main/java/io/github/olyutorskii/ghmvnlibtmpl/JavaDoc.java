/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

/*
0        1         2         3         4         5         6         7         8         9         0         1
12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
*/

/**
 * Class brief.
 *
 * <p>Class detail.
 *
 * @see java.lang.Object
 * @see <a href="https://openjdk.java.net/">OpenJDK</a>
 * @author Mr.author
 */
public class JavaDoc {

    public final String field = "abc";

    /**
     * Constructor.
     */
    public JavaDoc() {
    }

    /**
     * Method brief.
     *
     * <p>Method detail.
     *
     * @param iVal argument detail
     * @return return value detail
     * @throws IllegalArgumentException exception detail
     * @see #field
     * @see #JavaDoc()
     */
    public int method1(int iVal) throws IllegalArgumentException {
        return iVal + 1;
    }

    /**
     * メソッド概略。
     *
     * <p>メソッド詳細。
     */
    public void methodJp() {
        return;
    }

    /**
     * Xxx.
     *
     * @deprecated too old.
     */
    @Deprecated
    public void methodDeprecated() {
        return;
    }

    /**
     * Javadoc with image.
     *
     * <img src="doc-files/bluedia.png" alt="Blue Diamond">
     */
    public void methodImage() {

    }

    /**
     * {@inheritDoc}
     *
     * <p>And more.
     *
     * @return {@inheritDoc}
     * @see java.lang.Object#toString() superstring
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * public javadoc
     * with no description for @param warning.
     * @param publicArg
     */
    public void warnPublic(int publicArg) {
        warnPrivate(publicArg);
        return;
    }

    /**
     * private javadoc
     * with no description for @param warning.
     * @param privateArg
     */
    private void warnPrivate(int privateArg) {
        assert privateArg == privateArg;
        return;
    }

}
