package enums;

public enum FurColor {

    Preto(1, "Preto"),
    Branco(2, "Branco"),
    Laranja(3, "Laranja"),
    Cinza(4, "Cinza"),
    Marrom(5, "Marrom"),
    Rajado(6, "Rajado"),
    Lilas(7, "Lilas");

    private int code;
    private String displayName;

    FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static FurColor fromCode(int code) {

        for (FurColor color : FurColor.values()) {

            if (color.code == code) {
                return color;
            }

        }

        throw new IllegalArgumentException("Codigo invalido: " + code);
    }
}
