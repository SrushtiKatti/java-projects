public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // so we can use switch statement here
        switch (weather) {
            case "sunny": System.out.println("Wear sunglasses and a hat."); break;
            case "cloudy": System.out.println("Wear a light jacket."); break;
            case "rainy": System.out.println("Take an umbrella and wear waterproof shoes."); break;
            case "snowy": System.out.println("Wear a heavy coat and boots."); break;
            default: System.out.println("Check the weather forecast for appropriate attire.");
                
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // we can use switch statement here
        switch (role) {
            case 1:System.out.println("Access level: Admin - Full access to the system."); break;
            case 2:System.out.println("Access level: Editor - Can edit content but not manage users."); break;
            case 3:System.out.println("Access level: User - Can view content but not edit or manage.");
            default:System.out.println("Access level: Guest - Limited access to the system.");
                
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // here we cannot use switch statement as we have variety of conditions and values of temp and humdity so we use if else if statement 

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // here we cannot use switch statement as we have variety of conditions and values of age and income so we use if else if statement

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // here we can use switch statements 
        switch (lightColor) {
            case "green":System.out.println("Go, the light is green."); break;
            case "yellow":System.out.println("Caution, the light is yellow."); break;
            case "red":System.out.println("Stop, the light is red.");
            default: System.out.println("Invalid traffic light color.");
                
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // so we cannot use swtich statement here as we have variety of conditions and values of grade so we use if else if statement

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch

        // here we can use switch statement
        switch (browser) {
            case "Chrome":System.out.println("Browser is Chrome."); break;
            case "Firefox":System.out.println("Browser is Firefox."); break;
            case "Safari":System.out.println("Browser is Safari."); break;
            case "Edge":System.out.println("Browser is Edge."); break;
            case "Opera":System.out.println("Browser is Opera.");break;    
            default: System.out.println("Unknown browser type.");
        }    
        
        

    }
}
