
public class Piece {
	private ColorEnum color;
	private Validator validator;
	public Piece(ColorEnum color, Validator validator) {
		super();
		this.color = color;
		this.validator = validator;
	}
	
	public ColorEnum getColor() {
		return color;
	}

	public void setColor(ColorEnum color) {
		this.color = color;
	}

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@Override
	public String toString() {
		return "(" + color.getName() + ", " + validator.getPieceType().getName() + ")";
	}
}
