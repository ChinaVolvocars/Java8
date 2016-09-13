package com.meahu.simples.stream;

import java.util.Optional;

/**
 * @author Benjamin Winterberg
 */
public class Optional1 {

    public static void main(String[] args) {
//        optional();
        Optional<String> optional = Optional.of("max");
        boolean present = optional.isPresent();
        String s = optional.get();
        String famax = optional.orElse("famax");

    }

    private static void optional() {
        Optional<String> optional = Optional.of("bam");
        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

    }

}