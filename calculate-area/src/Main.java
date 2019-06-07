public class Main {


    public static void main(String[] args) {

        Triangle trg = new Triangle();
        int trgOut = trg.calculateArea(2,5,4);
        trg.setName("NidhiTriangle");
        System.out.println("Triangle Area=" + trgOut);

        Square sqr = new Square();
        sqr.setName("NidhiSquare");
        int sqrOut= sqr.getArea(5);
        System.out.println("Square Area=" + sqrOut);

        Rectangle rect = new Rectangle();
        rect.setName("NidhiRectangle");
        int rectOut = rect.calculateArea(4,6);
        System.out.println("Rectangle Area=" + rectOut);

        Circle crc = new Circle();
        crc.setName("NidhiCircle");
        double circOut = crc.calculateArea(2);
        System.out.println("Circle Area=" + circOut);




        //-----------------------------------------
        Shape shp = new Shape();
        String shapeArray[]= new String[4];
        //String shapeArray1[]= {"Triangle","Square","Rectangle","Circle"};
            shp.setName("Triangle");
            shapeArray[0] = shp.getName();

            shp.setName("Square");
            shapeArray[1] = shp.getName();

            shp.setName("Rectangle");
            shapeArray[2] = shp.getName();

            shp.setName("Circle");
            shapeArray[3] = shp.getName();


        for (int i=0;i<4;i++){
            System.out.println(shapeArray[i]);

        }

        System.out.println("Shape Name = "+shp.getName());
        //-----------------------------------------
        Shape [] shapeArrayNew = new Shape[4];
        shapeArrayNew[0] = trg;
        shapeArrayNew[1] = sqr;
        shapeArrayNew[2] = rect;
        shapeArrayNew[3] = crc;

        System.out.println("Shape Array = " +shapeArrayNew.length);

        for (int i=0;i<shapeArrayNew.length;i++){

            //System.out.println("Object Shape = "+shapeArrayNew[i]);
            Shape shapeRef = shapeArrayNew[i];
            System.out.println(shapeRef.getName());

        }
        }

    }

