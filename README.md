# JUnit Testing with Branch Coverage Analysis

**Student Name:** Nesrine Larbi  
**Student ID:** 40079009

---

## Overview

This project demonstrates comprehensive unit testing using JUnit 5 with complete branch coverage analysis. The implementation includes test cases for all code paths and conditional branches, achieving 100% coverage across all metrics.

## Code Coverage Results

### Coverage Metrics Summary
<img width="532" height="565" alt="Coverage Tool Window Results" src="https://github.com/user-attachments/assets/293dad42-5ed3-4944-a399-b6b18e110175" />

**Achieved Coverage:**
- ✅ **Class Coverage**: 100% (1/1 classes)
- ✅ **Method Coverage**: 100% (3/3 methods)  
- ✅ **Line Coverage**: 100% (12/12 lines)
- ✅ **Branch Coverage**: 100% (4/4 branches)

### Branch Coverage Analysis
<img width="653" height="253" alt="Branch Coverage Details" src="https://github.com/user-attachments/assets/dcf87160-ac88-42d8-b686-682e49838c0b" />

The coverage tool window demonstrates that all conditional logic paths have been thoroughly tested, including:
- Positive value branches (y > 0)
- Negative value branches (y < 0) 
- Boundary condition branches (y >= 6, y <= 6)

### Test Implementation with Visual Coverage
<img width="955" height="906" alt="Test Code with Coverage Highlighting" src="https://github.com/user-attachments/assets/0c898222-2b1a-44d5-a72b-c701c68b59bc" />

The green highlighting in the editor confirms complete execution of all test methods:
- `testFunctionA_Positive()` - Tests positive input scenarios
- `testFunctionA_NonPositive()` - Tests negative and zero input cases
- `testFunctionB_LessThan6()` - Tests values below threshold
- `testFunctionB_GreaterOrEqual6()` - Tests boundary and above-threshold values
- `testConstructorInitialization()` - Verifies object construction

