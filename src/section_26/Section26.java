import java.util.Arrays;
import java.util.stream.Stream;

public class Section26 {
    public static void main(String[] args) {
        // NORMAL STREAM & PARALLEL STREAM
        var items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var stream = items.stream();
        stream.parallel(); // stream will be converted to parallel itself
        var parallelStream = items.parallelStream(); // the returned results is not in order of items list

        String[] words = { "aaa", "bbb", "ccc" };
        var wordsStream = Arrays.stream(words);

        // EMPTY STREAM
        var emptyStream = Stream.empty();

        // 3 STEPS OF STREAM PROCESS
        // 1. Create a stream: stream() | parallelStream() | Stream.of() | Arrays.stream()
        // 2. Add one or more intermediate operations - for transform initial data source into other
        // 3. Apply terminal operation to produce result
    }
}
