public class DocComments {
    public static void main(String[] args) {
        

    }

    /**
     * Function name : greet
     * 
     * inside the function ;
     *   1. prints:hii
     */
    public static void greet(){
        System.out.println("hii");
    }
    /**
     * Function name : printText
     * @param name (String)
     * @param age (String)
     * 
     * inside the function;
     *  1. prints: the name and age as part of text
     */
    public static void printText(String name, String age){
        System.out.println("hi i am "+ name+"am i am "+age+"years old");
    }

    /**
     * Function name : calculateArea
     * 
     * inside the function;
     *  1. calculates the area and returns the area
     * @param length
     * @param width
     * @return
     */
    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
    
}
