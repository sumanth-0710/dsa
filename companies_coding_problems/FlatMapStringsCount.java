package companies_coding_problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapStringsCount {
    public static void main(String[] args) {
        String str[] = {"java ruby struts","spring java","spring python"};
        // find the count of particular string in above string array using flatmap
           LinkedHashMap<String,Long>hm=Arrays.stream(str)
                .flatMap(e -> Arrays.stream(e.split(" ")))
                .collect(Collectors.toMap(
                         e->e,
                        e->1L,
                        (a,b)->a+b,
                        ()->new LinkedHashMap<>()
                        ));
        System.out.println(hm);

    }
}
