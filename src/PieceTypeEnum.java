public enum PieceTypeEnum {
	ROOK ("ROOK"),
	KNIGHT ("KNIGHT"),
	BISHOP ("BISHOP"),
	PAWN ("PAWN"),
	KING ("KING"),
	QUEEN ("QUEEN");
	
	private String name;
	
	private PieceTypeEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    public static PieceTypeEnum get(final String value) {
        if (null == value) {
            throw new IllegalArgumentException("PieceType value is null");
        }
        try {
        	return PieceTypeEnum.valueOf(value.trim());
        }catch(Exception e) {
        	return null;
        }
    }
}
