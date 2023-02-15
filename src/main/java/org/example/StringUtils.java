package org.example;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static String toSnakeCase(String name) {
        List<String> result = Arrays.stream(
                removeAccents(name).split("[\\s_'-]")).filter(s->!"".equals(s)).collect(Collectors.toList()
        );
        return String.join("_", result);
    }
    public static String removeAccents(String name){
        return Normalizer.normalize(name, Normalizer.Form.NFKD).replaceAll("\\p{M}", "");
    }
}
