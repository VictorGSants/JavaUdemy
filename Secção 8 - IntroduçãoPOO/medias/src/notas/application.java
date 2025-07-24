package notas;

public class application {

        public String name;
        public double n1;
        public double n2;
        public double n3;

        public double nf(){
                return n1 + n2 + n3;
        }

        @Override
        public String toString() {
                double falta = 60 - nf();

               if (nf() >= 60){
                       return "Final Grade = "+ nf()+ " PASS";
                }else
                        return "Final Grade = "+ nf() + " Failled " + "Missing "+ falta ;


        }
}




