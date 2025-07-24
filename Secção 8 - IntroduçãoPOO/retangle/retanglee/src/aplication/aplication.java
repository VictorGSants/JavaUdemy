package aplication;

public class aplication {

        public double width;
        public double height;

        public double area(){
            return width * height;
        }
        public double perimeter(){
            return (width * 2) + (height * 2);
        }
        public double diagonal(){
            return Math.hypot(height, width);
        }
        public String toString(){
            return "AREA = "+ area()+ " PERIMETER = "+ perimeter()+ " DIAGONAL = "+ diagonal();
        }
    }


