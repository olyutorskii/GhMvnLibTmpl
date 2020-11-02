/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

public class Lib {

    public int func(int iVal) {
        return -iVal;
    }

    int funcSecret(int iVal) {
        assert false;
        // Unit test unreachable.
        return ~0;
    }

}
