public class Shape {
    int a;
    int b;
    int c;
    int r;

    public int calculateArea(int i, int j){

        int area = i*j;
        return area;
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                ", name='" + name + '\'' +
                '}';
    }
}
