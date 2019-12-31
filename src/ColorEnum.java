
public enum ColorEnum {
	BLACK ("BLACK"),
	WHITE ("WHITE");
	
	private String name;
	
	private ColorEnum(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    public static ColorEnum get(final String value) {
        if (null == value) {
            throw new IllegalArgumentException("Color type value is null");
        }
        try {
        	return ColorEnum.valueOf(value.trim());
        }catch(Exception e) {
        	return null;
        }
    }
}
