public class ReturnValues {
    public static void main(String[] args) {
         double area1 = calculateArea(2.3 , 4.5);
          //double area2 =calculateArea(1.2 , -2.1);
         // double area3 =calculateArea(-5.1, 3.4);
         printArea(2.3, 4.5, area1);
        
          String explanation1 = explainArea("English");
          //  String explanation2 = explainArea("French");
            //String explanation3 = explainArea("Spanish");
            //String explanation4 = explainArea("German"); // this will return the default message as German is not available
    }
    public static double calculateArea(double length, double width) {
        if ( length < 0 || width < 0){
            System.out.println("inavlid dimention");
            System.exit(0);// terminate the run time
        
        }
        double area = length * width;
        return area;
        
    }
    public static String explainArea( String language) {
        switch (language) {
            case "English": return "Area equals length * width"; // not need to write break as we use whihc automatically executes the statement and falls out of function
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            
            default: return "language not avvailable ";
                
        }
        
    }
    public static void printArea(double length, double width, double area){
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is: " + area);
    }
}

//English "Area equals length * width"

//French "La surface est egale a la longueur * la largeur"

//Spanish "area es igual a largo * ancho"