package enums;

public enum FurColor {

    BLACK(1, "Preto"),
    WHITE(2, "Branco"),
    ORANGE_TABBY(3, "Laranja"),
    GRAY(4, "Cinza"),
    BROWN(5, "Marrom"),
    CALICO(6, "Azul"),
    SPOTTED(7, "Lilas");

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