
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> list  = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(str1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));


        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2).limit(20);

        System.out.println(Arrays.toString(str3.limit(10).toArray()));


        Stream<Long> st4 = Stream.iterate(new Long [] {0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
