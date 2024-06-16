package prototypePattern;

public class Button {
    private String color;
    private float size;

    private Button(String color, float size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public float getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public static class ButtonBuilder {
        private String color;
        private float size;

        public ButtonBuilder color(String color) {
            this.color = color;
            return this;
        }

        public ButtonBuilder size(float size) {
            this.size = size;
            return this;
        }

        public Button build() {
            return new Button(color, size);
        }
    }
}
