
public interface F {
private void helper(int n) {
	System.out.println(n);
}
	default void one() {
		helper(1);
	}
		default void two() {
			helper(2);
		}
}
