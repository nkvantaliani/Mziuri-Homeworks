public class Recursion {
    int sum(int a, int b, int k) {
        if (a > b) {
            return 0;
        }
        if (a % k == 0) {
            return a + sum(a + 1, b, k);
        } else {
            return sum(a + 1, b, k);
        }
    }
}
