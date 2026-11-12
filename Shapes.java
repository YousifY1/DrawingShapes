public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle Veda = new Turtle();
        for (int i = 1; i <= 5; i++) {
               Veda.penColor("green");
               Veda.forward(100);
               Veda.left(72);
               
        }
        // Task 2: Draw a regular shape many times
        for (int j = 1; j <= 10; j++) {
        
            for (int i = 1; i <= 5; i++){
               
               Veda.penColor("black");
               Veda.forward(120);
               Veda.left(72);
            }
            Veda.forward(10); 
         }
        // Task 3: How many times does Turtle turn!
        int count = 0;
        Veda.up();
        Veda.right(90);
        Veda.forward(400);
        for (int j = 1; j <= 10; j++) {
        
            for (int i = 1; i <= 5; i++) {
               
               Veda.penColor("black");
               Veda.forward(120);
               Veda.left(72);
               count++;
            }
            Veda.forward(10); 
            
         }
         System.out.print("Veda has turned "+ count +" times!");
        // Extension 1: Triply Nested Loop
        Veda.up();
        Veda.right(90);
        Veda.forward(400);
        for (int j = 1; j <= 10; j++) {
        
            for (int i = 1; i <= 5; i++) {
               
               for (int x = 1; x <= 5; x++) {
                 
                  Veda.penColor("blue");
                  Veda.forward(100);
                  Veda.left(72);   
            }
            Veda.forward(10); 
            
         }
      }
        // Extension 2:
   }
}