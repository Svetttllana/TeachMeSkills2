import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class less12 {
    public static void main(String[] args) {
        Stream streamGenerate = Stream.generate(()-> "hello").limit(10);
       // System.out.println(streamGenerate.collect(Collectors.toList()));


        IntStream intStream = IntStream.range(1, 10);
        System.out.println(Arrays.toString(intStream.toArray()));



        Stream streamFilter = Stream.of("apple","banana","kiwi").filter(
                element -> element.contains("a")
        );
        System.out.println(streamFilter.findFirst());




//
//        Stream streamFilter2 = Stream.of("apple","banana","kiwi", "apple");
//                .skip(2);
//        System.out.println(streamFilter2.collect(Collectors.toList()));
//
//
//
//
//
//
//        Stream streamFilter3 = Stream.of("apple","banana","kiwi", "apple");
//                .distinct();
//        System.out.println(streamFilter2.collect(Collectors.toList()));





        Stream<String> streamMap= Stream.of("apple","banana","kiwi", "apple"); // мэп преобразует объекты и добавляет запятую или люблй другой знак; на выходе я получаю не сам стрим, а строку.
        String mappedString = streamMap.map(Object::toString).collect(
                Collectors.joining(",") //
                );

        System.out.println(mappedString);






        Stream<String> streamMap2= Stream.of("apple","banana","kiwi", "apple");
        String mappedString2 = streamMap2.map(element-> element + "mapped").collect( // к каждлму эллементу добавит какую-то строку(ту что прописалиБ соответственно)
                Collectors.joining(" ") //
        );

        System.out.println(mappedString2);





        Stream<String> streamMap3= Stream.of("apple","banana","kiwi", "apple");
        String mappedString3 = streamMap3.map(String::toUpperCase).collect( // к каждлму эллементу добавит какую-то строку(ту что прописалиБ соответственно)
                Collectors.joining("||") //
        );

        System.out.println(mappedString3);
    }
}


