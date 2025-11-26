import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Provide user choice for pollution calculation
        System.out.println("--- Pollution Calculation Program ---");
        System.out.println("Choose the type of pollution to calculate:");
        System.out.println("1. Air Pollution");
        System.out.println("2. Water Pollution");
        System.out.println("3. Both Air and Water Pollution");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline

        if (choice == 1) {
            // Air Pollution Calculation
            System.out.println("--- Air Pollution Calculation ---");
            System.out.println("Enter the number of air pollution sources: ");
            int airSourceCount = sc.nextInt();
            sc.nextLine();  // Consume newline

            PollutionSource[] airSources = new PollutionSource[airSourceCount];
            for (int i = 0; i < airSourceCount; i++) {
                System.out.println("Enter the name of source " + (i + 1) + ":");
                String sourceName = sc.nextLine();
                System.out.println("Enter the number of " + sourceName + " sources:");
                int quantity = sc.nextInt();
                sc.nextLine();  // Consume newline

                System.out.println("Enter the emission rate (in tons per hour) for " + sourceName + ":");
                double emissionRate = sc.nextDouble();
                sc.nextLine();  // Consume newline

                airSources[i] = new PollutionSource(sourceName, emissionRate, quantity);//array of object 
            }

            // Air Pollution Calculation
            PollutionCalculator airCalculator = new PollutionCalculator();
            double totalAirPollution = airCalculator.calculateTotalPollution(airSources);
            String airAqiLevel = airCalculator.calculateAQI(totalAirPollution);
            String airControlAdvice = airCalculator.getPollutionControlAdvice(airAqiLevel);

            // Display the results for air pollution
            System.out.println("\n--- Air Pollution Results ---");
            System.out.println("Total Air Pollution: " + totalAirPollution + " tons");
            System.out.println("Air Quality Index (AQI): " + airAqiLevel);
            System.out.println("Pollution Control Advice: " + airControlAdvice);

        } else if (choice == 2) {
            // Water Pollution Calculation
            System.out.println("--- Water Pollution Calculation ---");
            System.out.println("Enter the number of water pollution sources: ");
            int waterSourceCount = sc.nextInt();
            sc.nextLine();  // Consume newline

            WaterPollutionSource[] waterSources = new WaterPollutionSource[waterSourceCount];
            for (int i = 0; i < waterSourceCount; i++) {
                System.out.println("Enter the name of source " + (i + 1) + ":");
                String sourceName = sc.nextLine();

                System.out.println("Enter the number of " + sourceName + " sources:");
                int quantity = sc.nextInt();
                sc.nextLine();  // Consume newline

                System.out.println("Enter the emission rate (in tons per hour) for " + sourceName + ":");
                double emissionRate = sc.nextDouble();
                sc.nextLine();  // Consume newline

                waterSources[i] = new WaterPollutionSource(sourceName, emissionRate, quantity);
            }

            // Water Pollution Calculation
            WaterPollutionCalculator waterCalculator = new WaterPollutionCalculator();
            double totalWaterPollution = waterCalculator.calculateTotalWaterPollution(waterSources);
            String waterWqiLevel = waterCalculator.calculateWQI(totalWaterPollution);
            String waterControlAdvice = waterCalculator.getWaterPollutionControlAdvice(waterWqiLevel);

            // Display the results for water pollution
            System.out.println("\n--- Water Pollution Results ---");
            System.out.println("Total Water Pollution: " + totalWaterPollution + " tons");
            System.out.println("Water Quality Index (WQI): " + waterWqiLevel);
            System.out.println("Pollution Control Advice: " + waterControlAdvice);

        } else if (choice == 3) {
            // Air Pollution Calculation
            System.out.println("--- Air Pollution Calculation ---");
            System.out.println("Enter the number of air pollution sources: ");
            int airSourceCount = sc.nextInt();
            sc.nextLine();  // Consume newline

            PollutionSource[] airSources = new PollutionSource[airSourceCount];
            for (int i = 0; i < airSourceCount; i++) {
                System.out.println("Enter the name of source " + (i + 1) + ":");
                String sourceName = sc.nextLine();

                System.out.println("Enter the number of " + sourceName + " sources:");
                int quantity = sc.nextInt();
                sc.nextLine();  // Consume newline

                System.out.println("Enter the emission rate (in tons per hour) for " + sourceName + ":");
                double emissionRate = sc.nextDouble();
                sc.nextLine();  // Consume newline

                airSources[i] = new PollutionSource(sourceName, emissionRate, quantity);
            }

            // Air Pollution Calculation
            PollutionCalculator airCalculator = new PollutionCalculator();
            double totalAirPollution = airCalculator.calculateTotalPollution(airSources);
            String airAqiLevel = airCalculator.calculateAQI(totalAirPollution);
            String airControlAdvice = airCalculator.getPollutionControlAdvice(airAqiLevel);

            // Display the results for air pollution
            System.out.println("\n--- Air Pollution Results ---");
            System.out.println("Total Air Pollution: " + totalAirPollution + " tons");
            System.out.println("Air Quality Index (AQI): " + airAqiLevel);
            System.out.println("Pollution Control Advice: " + airControlAdvice);

            // Water Pollution Calculation
            System.out.println("--- Water Pollution Calculation ---");
            System.out.println("Enter the number of water pollution sources: ");
            int waterSourceCount = sc.nextInt();
            sc.nextLine();  // Consume newline

            WaterPollutionSource[] waterSources = new WaterPollutionSource[waterSourceCount];
            for (int i = 0; i < waterSourceCount; i++) {
                System.out.println("Enter the name of source " + (i + 1) + ":");
                String sourceName = sc.nextLine();

                System.out.println("Enter the number of " + sourceName + " sources:");
                int quantity = sc.nextInt();
                sc.nextLine();  // Consume newline

                System.out.println("Enter the emission rate (in tons per hour) for " + sourceName + ":");
                double emissionRate = sc.nextDouble();
                sc.nextLine();  // Consume newline

                waterSources[i] = new WaterPollutionSource(sourceName, emissionRate, quantity);
            }

            // Water Pollution Calculation
            WaterPollutionCalculator waterCalculator = new WaterPollutionCalculator();
            double totalWaterPollution = waterCalculator.calculateTotalWaterPollution(waterSources);
            String waterWqiLevel = waterCalculator.calculateWQI(totalWaterPollution);
            String waterControlAdvice = waterCalculator.getWaterPollutionControlAdvice(waterWqiLevel);

            // Display the results for water pollution
            System.out.println("\n--- Water Pollution Results ---");
            System.out.println("Total Water Pollution: " + totalWaterPollution + " tons");
            System.out.println("Water Quality Index (WQI): " + waterWqiLevel);
            System.out.println("Pollution Control Advice: " + waterControlAdvice);

        } else {
            System.out.println("Invalid choice. Please choose either 1 (Air Pollution), 2 (Water Pollution), or 3 (Both Air and Water Pollution).");
        }
    }
}

// Class to represent a pollution source (air pollution)
class PollutionSource {
    String sourceName;
    double emissionRate;  // in tons per hour
    int quantity;         // number of sources

    PollutionSource(String sourceName, double emissionRate, int quantity) {
        this.sourceName = sourceName;
        this.emissionRate = emissionRate;
        this.quantity = quantity;
    }

    double calculatePollution() {
        return emissionRate * quantity;
    }
}

// Class to calculate air pollution
class PollutionCalculator {

    // Calculates total air pollution from air pollution sources
    double calculateTotalPollution(PollutionSource[] sources) {
        double totalPollution = 0;
        for (PollutionSource source : sources) {
            totalPollution += source.calculatePollution();
        }
        return totalPollution;
    }

    // Calculates AQI for air pollution
    String calculateAQI(double totalPollution) {
        if (totalPollution <= 50) {
            return "Good";
        } else if (totalPollution <= 100) {
            return "Moderate";
        } else if (totalPollution <= 150) {
            return "Unhealthy for Sensitive Groups";
        } else if (totalPollution <= 200) {
            return "Unhealthy";
        } else if (totalPollution <= 300) {
            return "Very Unhealthy";
        } else {
            return "Hazardous";
        }
    }

    // Pollution control advice for air pollution based on AQI
    String getPollutionControlAdvice(String aqiLevel) {
        switch (aqiLevel) {
            case "Good":
                return "Air quality is good! Keep maintaining clean habits.";
            case "Moderate":
                return "Air quality is acceptable. Consider using air purifiers and limit outdoor activities for sensitive groups.";
            case "Unhealthy for Sensitive Groups":
                return "Sensitive groups should limit prolonged outdoor activity. Consider using air purifiers.";
            case "Unhealthy":
                return "Everyone should avoid outdoor activity. Use masks if necessary, and consider reducing energy consumption.";
            case "Very Unhealthy":
                return "Avoid all outdoor activity. Reduce emissions from vehicles, industries, and energy production.";
            case "Hazardous":
                return "Avoid going outdoors. Strict measures are required to reduce emissions. Implement stricter industrial regulations.";
            default:
                return "Unknown AQI level.";
        }
    }
}

// Class to represent a water pollution source
class WaterPollutionSource {
    String sourceName;
    double emissionRate;  // in tons per hour
    int quantity;         // number of sources

    WaterPollutionSource(String sourceName, double emissionRate, int quantity) {
        this.sourceName = sourceName;
        this.emissionRate = emissionRate;
        this.quantity = quantity;
    }

     double calculatePollution() {
        return emissionRate * quantity;
    }
}

// Class to calculate water pollution
class WaterPollutionCalculator {

    // Calculates total water pollution from water pollution sources
    double calculateTotalWaterPollution(WaterPollutionSource[] sources) {
        double totalWaterPollution = 0;
        for (WaterPollutionSource source : sources) {
            totalWaterPollution += source.calculatePollution();
        }
        return totalWaterPollution;
    }

    // Calculates WQI for water pollution
    String calculateWQI(double totalWaterPollution) {
        if (totalWaterPollution <= 50) {
            return "Excellent";
        } else if (totalWaterPollution <= 100) {
            return "Good";
        } else if (totalWaterPollution <= 150) {
            return "Moderate";
        } else if (totalWaterPollution <= 200) {
            return "Poor";
        } else if (totalWaterPollution <= 300) {
            return "Very Poor";
        } else {
            return "Critical";
        }
    }

    // Pollution control advice for water pollution based on WQI
    String getWaterPollutionControlAdvice(String wqiLevel) {
        switch (wqiLevel) {
            case "Excellent":
                return "Water quality is excellent! Keep maintaining good water management practices.";
            case "Good":
                return "Water quality is good. Ensure proper waste disposal and reduce agricultural runoff.";
            case "Moderate":
                return "Water quality is moderate. Improve wastewater treatment systems and reduce industrial waste discharge.";
            case "Poor":
                return "Water quality is poor. Implement stricter regulations for industrial waste and promote wastewater treatment plants.";
            case "Very Poor":
                return "Water quality is very poor. Urgent measures needed to stop contamination, and improve sewage treatment.";
            case "Critical":
                return "Water quality is critical. Immediate action required to reduce pollution from industrial discharge and improve sanitation.";
            default:
                return "Unknown water quality level.";
        }
    }
}