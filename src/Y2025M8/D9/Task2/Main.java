package Y2025M8.D9.Task2;

public class Main {
    public static void main(String[] args) {

        // Task 1: List vs Vector
        // ---------------------------
        // List (مثل ArrayList)
        // - Not thread-safe
        // - Faster (no synchronization)
        // - Use Collections.synchronizedList() if needed
        //
        // Vector
        // - Thread-safe (all methods synchronized)
        // - Slower due to synchronization
        // - Legacy class, rarely used now


        // ---------------------------
        // Task 2: HashSet vs LinkedHashSet
        // ---------------------------
        // HashSet
        // - Unordered
        // - Faster and less memory
        // - Use when order is not important
        //
        // LinkedHashSet
        // - Maintains insertion order
        // - Slightly slower, more memory
        // - Use when order matters


        // ---------------------------
        // Task 3: String vs StringBuilder vs StringBuffer
        // ---------------------------
        // String
        // - Immutable, safe but slow on many changes
        // - Good when value won't change
        //
        // StringBuilder
        // - Mutable, faster, not thread-safe
        // - Use in single-threaded environment
        //
        // StringBuffer
        // - Mutable, thread-safe (synchronized), slower
        // - Use in multi-threaded environment

    }
}