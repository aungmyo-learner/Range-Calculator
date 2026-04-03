# Range Calculator

> A console-based Java application designed to manage in specific range.

---

## Overview

**Range Calculator** is a Java consloe application.
* It performs calculations and analysis within a defined number range.
* It calculates the total sum and classifies numbers as even, odd, prime, and composite.

---

## Features

* Input validation within a defined range.
* Calculate total sum of numbers in range.
* Count even and odd numbers.
* Identify and count prime numbers.
* Identify and count compostie numbers.

---

## Archiecture & Design

This project follows a **Layered Archiecutre** to separate concerns:

```
Presentation (UI)
	↓
Controller (Flow Control)
	↓
Service (Logic)
	↓
Domain (NumberAnalyze)
	↓
Data (NumberRepository)
```

### Key Design Principles

* Separation of Concerns
* Encapsulation read-only collections
* Immutable data exposure

---

### Tech Stack

* Java

---

## How to Run

```bash
# Clone repository
git clone https://github.com/aungmyo-learner/Range-Calculator.git

# Open in IDE (Eclipse / IntelliJ)

# Run main class
RangeCalculatore.java
```
---

## Example Output

```
Enter start and end number between -1,000,000 and 1,000,000
2
40

result:

Total Sum in Range: 819
Count of Even: 20
Count of Odd: 19
Count of Prime: 21
Count of Composite: 18
```

---

## Core Logic Hightlights

* Sum all numbers within the given range.
* if even → countEven ++
* if odd → countOdd ++
* if prime → countPrime ++
* if composite → countComposite ++

---

## Future Improvements

* Support dynamic range input (start & end validation)
* Add average calculation
* Add GUI version (JavaFX / Swing)
* Export results (CSV / TXT)

---

## Screenshots (Optional)

*Add screenshots here if available*

---

Author
**Aung Myo**

---

## What I Learned

* Designing layered architecture
* Writing clean and maintainable Java code
* Applying basic mathematical logic in programming

---
