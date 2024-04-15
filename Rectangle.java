import java.util.Scanner;
 class Rectangle{
     int l,b;
     Scanner sc = new Scanner(System.in);

     void area(){ 
         System.out.print("Area :- "+(l*b));
     }
     
     void perimeter(){    
         System.out.print("Perimeter :- "+(2*(l+b)));.
     }

     void accept(){
        System.out.println("\nEnter length and breadth");
         l=sc.nextInt();
         b=sc.nextInt();
     }

        public static void main(String[] args){
            Rectangle r = new Rectangle();
            r.accept();
            r.area();
            r.accept();
            r.perimeter();
        }
 }
