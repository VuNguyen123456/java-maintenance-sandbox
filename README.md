# java-maintenance-sandbox
Software engineering repository focused on maintainability, automated testing, architectural refinement, and sustainable code evolution using Java and JUnit.

## Exercise 1 — Vector Union Method Analysis

This exercise explores software specification ambiguity, fault identification, and test design through the implementation of a Java `union` method using `Vector`.

### Objectives
- Identify ambiguities and possible faults in the specification
- Design JUnit test cases for edge cases and defect detection
- Analyze behaviors such as duplicates, null values, ordering, and equality
- Rewrite the method specification with clearer and more precise requirements

### Topics Covered
- Software maintenance
- Fault-based testing
- Edge-case analysis
- JUnit testing
- Specification refinement
- Collection behavior in Java

### Learning Outcome
This exercise demonstrates how unclear requirements can lead to implementation defects and highlights the importance of precise specifications and rigorous testing in software engineering.

## Exercise 2 — Software Evolution and UI Refactoring

This exercise focuses on software evolution and maintainability by replacing the original web-based user interface of a unit conversion application with a new standalone interface while preserving the existing backend behavior.

### Objectives
- Separate UI logic from backend functionality
- Refactor legacy software with minimal behavioral changes
- Design and implement a new non-web interface
- Document software modifications and removed dependencies
- Evaluate maintainability and architectural design decisions

### Topics Covered
- Software evolution
- Refactoring
- UI replacement
- Maintainability analysis
- Legacy code adaptation
- Separation of concerns
- Java application structure

### Learning Outcome
This exercise demonstrates how software architecture impacts maintainability and highlights the challenges of modifying legacy systems while preserving existing functionality.

## Exercise 3 — Refactoring and New Functionality

This exercise focuses on software evolution through refactoring duplicated logic and extending functionality in a unit conversion application.

### Objectives
- Refactor duplicated conversion logic
- Add new unit conversions for time
- Implement configurable decimal precision
- Improve maintainability without increasing technical debt
- Evaluate design decisions and UI usability

### Topics Covered
- Refactoring
- Code reuse
- Feature evolution
- Maintainability analysis
- UI modification
- Java software design

### Learning Outcome
This exercise demonstrates how thoughtful refactoring and feature expansion can improve maintainability, reduce duplication, and support long-term software evolution.

## Exercise 4 — JUnit Testing and RIPR Analysis

This exercise focuses on automated testing using JUnit, input analysis, and identifying weaknesses in test design through the RIPR fault model.

### Objectives
- Design and implement JUnit tests for a conversion application
- Define the input domain of software methods
- Analyze observability and controllability in automated tests
- Evaluate flawed test cases using the RIPR model
- Improve test effectiveness and fault detection

### Topics Covered
- JUnit testing
- Input domain analysis
- Observability and controllability
- RIPR fault model
- Automated testing
- Test oracle design

### Learning Outcome
This exercise demonstrates the importance of well-designed automated tests and highlights how weak assertions or incomplete checks can reduce fault detection effectiveness.

## Exercise 5 — Test Driven Development

This exercise applies Test Driven Development (TDD) practices to evolve a unit conversion application by adding new conversion features through iterative testing and refactoring.

### Objectives
- Write user stories and acceptance tests
- Apply the TDD cycle of testing, implementation, and refactoring
- Add new conversion functionalities incrementally
- Make design decisions driven by tests
- Document development and refactoring steps

### Topics Covered
- Test Driven Development
- Acceptance testing
- Refactoring
- Incremental software evolution
- JUnit testing
- Agile development practices

### Learning Outcome
This exercise demonstrates how TDD supports maintainable software design, improves code quality, and encourages a quality-focused development mindset.

## Exercise 6 — Test Criteria and Coverage Analysis

This exercise explores software testing criteria, coverage requirements, and practical testing challenges such as observability and controllability.

### Objectives
- Analyze testing requirements using coverage criteria
- Identify observability and controllability issues
- Evaluate test requirement growth under additional constraints
- Apply formal testing concepts to practical scenarios

### Topics Covered
- Coverage criteria
- Test requirements
- Observability
- Controllability
- Test design analysis
- Software testing theory

### Learning Outcome
This exercise demonstrates how testing criteria influence test design complexity and highlights the practical challenges involved in achieving meaningful software coverage.

## Exercise 7 — Input Space Partitioning

This exercise focuses on modeling the input domain of a web application using Input Space Partitioning (ISP) techniques to design systematic and effective test cases.

### Objectives
- Identify application inputs and characteristics
- Partition characteristics into meaningful blocks
- Model the software input domain for testing
- Design tests satisfying Base Choice Coverage (BCC)
- Improve systematic test case generation

### Topics Covered
- Input Space Partitioning
- Base Choice Coverage
- Input domain modeling
- Test design
- Web application testing
- Boundary and characteristic analysis

### Learning Outcome
This exercise demonstrates how structured input modeling improves test coverage, strengthens test quality, and supports systematic software testing practices.

## Exercise 8 — Graph Testing

This exercise focuses on graph-based testing techniques using path analysis, edge-pair coverage, and prime path coverage.

### Objectives
- Analyze directed graphs used in software testing
- Identify valid test paths
- Generate edge-pair and prime path requirements
- Design test paths satisfying graph coverage criteria

### Topics Covered
- Graph testing
- Edge-pair coverage
- Prime path coverage
- Test path analysis
- Coverage criteria
- Graph theory in testing

### Learning Outcome
This exercise demonstrates how graph-based models can systematically represent software behavior and guide effective structural testing strategies.

## Exercise 9 — Control Flow Graph (CFG) Testing

This exercise applies Control Flow Graph (CFG) testing techniques to analyze program structure and design tests using edge-pair coverage.

### Objectives
- Construct control flow graphs for program methods
- Identify edge-pair coverage requirements
- Design executable test paths
- Define test inputs and expected outputs
- Automate structural tests using JUnit

### Topics Covered
- Control Flow Graphs
- Edge-pair coverage
- Structural testing
- Test path generation
- JUnit automation
- Software analysis

### Learning Outcome
This exercise demonstrates how CFG-based testing techniques improve structural coverage and help identify execution paths that require targeted testing.

## Exercise 10 — Logic-Based Coverage Criteria

This exercise focuses on logic-based testing techniques, predicate analysis, and Correlated Active Clause Coverage (CACC).

### Objectives
- Represent software requirements as logical predicates
- Construct truth tables for predicates
- Analyze clause determination conditions
- Identify test pairs satisfying CACC
- Apply logic coverage techniques to software testing

### Topics Covered
- Predicate logic
- Truth tables
- Clause coverage
- CACC
- Logic-based testing
- Software verification

### Learning Outcome
This exercise demonstrates how formal logic analysis supports systematic software testing and strengthens reasoning about complex conditional behavior.

## Exercise 11 — Logic Coverage from Source Code

This exercise applies logic coverage criteria directly to source code by extending and testing an updated thermostat control system.

### Objectives
- Update existing JUnit tests for modified software behavior
- Design tests satisfying CACC requirements
- Analyze logic predicates directly from source code
- Detect failures introduced during software maintenance
- Extend automated test suites for evolving systems

### Topics Covered
- Logic coverage
- Correlated Active Clause Coverage
- Source-based testing
- JUnit testing
- Software maintenance
- Predicate analysis

### Learning Outcome
This exercise demonstrates how software updates can introduce new testing requirements and highlights the importance of maintaining effective automated test suites during software evolution.
