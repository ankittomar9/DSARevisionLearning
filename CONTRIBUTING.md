# Contributing to DSARevisionLearning

Thanks for your interest in contributing! This document describes how to add problems, write explanations, and keep the repository consistent.

## What to contribute
- New problem solutions (Java), preferably with clear problem statement and source link.
- Explanations/notes for approaches and complexity analysis.
- Unit tests or sample input/output.
- Fixes to formatting, README, or study plan improvements.

## Repository layout & naming
- Place solutions in a clear folder per topic, e.g.:
  - problems/arrays/
  - problems/strings/
  - problems/linkedlist/
  - problems/trees/
  - problems/graphs/
  - problems/dp/
- File naming: Use descriptive names and camel case or hyphenation, e.g. `TwoSum.java` or `two_sum_TwoPointers.java`.
- If using packages, ensure package declarations match the folder structure and include compilation instructions in the file header.

## Coding style
- Java 8+ compatible
- Use meaningful class and method names
- Keep methods focused and avoid excessive nesting
- Add comments explaining the approach and complexity (time & space)
- Include example input/output as comments or a README in the problem folder

## Adding a problem
1. Fork the repository.
2. Create a feature branch: `git checkout -b add/<topic>/problem-name`
3. Add your Java file and any tests or notes.
4. Update README or notes if appropriate.
5. Commit with a descriptive message.
6. Open a pull request describing:
   - Problem name and source (link)
   - Approach summary
   - Time & space complexity
   - How to run/tests included

## Tests
- If adding tests, include instructions to run them.
- Prefer simple runnable examples (main method or JUnit tests).
- Keep test inputs small and deterministic.

## Review & CI
- PRs will be reviewed for correctness, clarity, and style.
- Maintain backward compatibility and avoid breaking existing code.

## License and attribution
- Include the original problem source where possible (LeetCode problem URL, HackerRank, etc.)
- If including third-party content, ensure licensing allows reuse.

## Contact
- For questions or larger changes, open an issue describing the proposal before implementing.

Thanks for contributing — your improvements make this resource better for everyone!