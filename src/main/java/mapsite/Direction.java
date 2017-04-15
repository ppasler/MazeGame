package mapsite;

public enum Direction {
	NORTH(0), SOUTH(1), EAST(2), WEST(3);

	private final int value;

	private Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

