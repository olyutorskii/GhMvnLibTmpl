/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

public class Entry {

    public static void main(String[] args) {
        Resource.getResource();
        Lib lib = new Lib();
        System.out.println(lib.func(99));
        return;
    }

}
