public class Main {

    private float a;
    private float b;
    private float c;

    public Main(float a,float b, float c) {
        if (this.a > this.b && this.b > this.c) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else if (this.a > this.c || this.c > this.b) {
            this.a = a;
            this.b = c;
            this.c = b;
        } else if (this.b > this.a || this.a > this.c) {
            this.a = b;
            this.b = a;
            this.c = c;
        } else if (this.b > this.c || this.c > this.a) {
            this.a = b;
            this.b = c;
            this.c = a;
        } else if (this.c > this.a || this.a > this.b) {
            this.a = c;
            this.b = a;
            this.c = b;
        } else if (this.c > this.b || this.b > this.a) {
            this.a = c;
            this.b = b;
            this.c = a;
        }
    }

    public float getA2() {
        float a2 = this.a * this.a;\
        return a2;
    }

    public float getB2() {
        float b2 = this.b * this.b;
        return b2;
    }

    public float getC2() {
        float c2 = this.c * this.c;
        return c2;
    }

}