/*
 * License : The MIT License
 * Copyright(c) 2020 Olyutorskii
 */

package io.github.olyutorskii.ghmvnlibtmpl;

import java.util.Objects;

public class Entry {

    public static void main(String[] args) {
        for(String arg : args){
            ln(arg);
        }

        Resource.getResource();
        Lib lib = new Lib();

        ln(lib.func(99));

        return;
    }

    private static void ln(Object txt){
        Objects.requireNonNull(txt);
        System.out.println(txt.toString());
    }

}
