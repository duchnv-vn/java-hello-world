import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Information {
    public int number;

    public Information(int number) {
        this.number = number;
    }
}

public class Section26 {
    public static void main(String[] args) {
        // NORMAL STREAM & PARALLEL STREAM
        var items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var stream = items.stream();
        stream.parallel(); // stream will be converted to parallel itself
        var parallelStream = items.parallelStream(); // the returned results is not in order of items list

        String[] words = { "aaa", "bbb", "ccc" };
        var wordsStream = Arrays.stream(words);
        // wordsStream.map(word -> word.toUpperCase()); // can not chain multiple times
        // wordsStream.forEach(System.out::println); // can not chain multiple times
        var words2 = wordsStream.toList();
        System.out.println("words2: " + words2);

        // EMPTY STREAM
        var emptyStream = Stream.empty();

        // 3 STEPS OF STREAM PROCESS
        // 1. Create a stream: stream() | parallelStream() | Stream.of() |
        // Arrays.stream()
        // 2. Add one or more intermediate operations - for transform initial data
        // source into other
        // 3. Apply terminal operation to produce result

        // FLAT MAP
        String[] fullName = { "Duc", "Huynh" };
        var letters = Stream.of(fullName).map(word -> word.split("")).flatMap(Arrays::stream)
                .map(word -> word.toLowerCase()).toList();
        ;

        // REDUCE
        int[] numbers = { 1, 2, 3, 4, 5 };
        var sum = List.of(1, 2, 3, 4, 5).stream().reduce(0, Integer::sum);

    }
}
