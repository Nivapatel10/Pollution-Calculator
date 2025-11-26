# Pollution Calculator

A small command-line Java program for estimating pollution from multiple sources. You can calculate air pollution, water pollution, or both, and get a simple index (AQI/WQI) and control suggestions based on the totals.

## What it does

- Calculates total emissions from multiple sources (in tons).
- Maps totals to a simple Air Quality Index (AQI) or Water Quality Index (WQI).
- Provides basic pollution-control advice for each index level.
- Supports running air-only, water-only, or both calculations in one session.

## How it works (high level)

1. The program asks whether you want to calculate Air, Water, or Both.
2. For each chosen type it asks how many source types you want to enter.
3. For each source type you provide:
   - A name
   - A quantity (how many identical sources)
   - An emission rate (tons per hour)
4. The program totals emissions for each type, computes an index label (AQI or WQI), and prints simple control advice.

The main flow depends on a few small classes:
- `PollutionSource` — holds name, emission rate, and quantity for air sources.
- `WaterPollutionSource` — holds name, emission rate, and quantity for water sources.
- `PollutionCalculator` — totals air emissions, determines AQI label, and returns advice.
- `WaterPollutionCalculator` — totals water emissions, determines WQI label, and returns advice.

## Prerequisites

- Java JDK 8 or later
- A terminal or command prompt

## Compile and run

If your source files are in `src/` and the main class is `Main.java`:

1. Compile:
   javac -d out src/*.java

2. Run:
   java -cp out Main

Adjust the commands if you use packages or a different directory layout.

## Example session

User input is shown after the prompts.

--- Pollution Calculation Program ---
Choose the type of pollution to calculate:
1. Air Pollution
2. Water Pollution
3. Both Air and Water Pollution
> 1

--- Air Pollution Calculation ---
Enter the number of air pollution sources:
> 2

Enter the name of source 1:
> Factory
Enter the number of Factory sources:
> 3
Enter the emission rate (in tons per hour) for Factory:
> 0.8

Enter the name of source 2:
> Vehicles
Enter the number of Vehicles sources:
> 100
Enter the emission rate (in tons per hour) for Vehicles:
> 0.01

--- Air Pollution Results ---
Total Air Pollution: 3.8 tons
Air Quality Index (AQI): Moderate
Pollution Control Advice: Reduce vehicle usage; install filters at factories.

(Exact AQI/WQI labels and advice depend on how `PollutionCalculator` and `WaterPollutionCalculator` are implemented.)

## Suggested project layout

- src/
  - Main.java
  - PollutionSource.java
  - WaterPollutionSource.java
  - PollutionCalculator.java
  - WaterPollutionCalculator.java

Each calculator class should expose methods like:
- calculateTotalPollution(PollutionSource[] sources)
- calculateAQI(double total) / calculateWQI(double total)
- getPollutionControlAdvice(String indexLabel)
