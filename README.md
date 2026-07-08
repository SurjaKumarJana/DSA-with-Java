# dsa-with-java

This repository contains Data Structures and Algorithms (DSA) implementations in Java, along with practical examples and utilities using the Java Collections Framework.

![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)

### Platforms Used

![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=flat-square&logo=leetcode&logoColor=black)
![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-2F8D46?style=flat-square&logo=geeksforgeeks&logoColor=white)
![HackerRank](https://img.shields.io/badge/HackerRank-2EC866?style=flat-square&logo=hackerrank&logoColor=white)
![CodeChef](https://img.shields.io/badge/CodeChef-5B4638?style=flat-square&logo=codechef&logoColor=white)

---

## About

This repository documents my journey solving Data Structures and Algorithms problems in Java. Solutions are organized by topic and sub-topic to mirror the actual project structure, each entry tracked with the date it was solved and linked to its original source (LeetCode) where applicable.

---

## Table of Contents

- [Folder Structure](#folder-structure)
- [Tech Stack](#tech-stack)
- [Contributing](#contributing)

---

## Folder Structure

> Detailed, expandable view of every folder. Click to open a topic and see the problems, dates, and commit messages inside it.

<details>
<summary><b>src</b></summary>
<br>

<table>
<tr><td>

<details>
<summary><b>array</b> <img src="https://img.shields.io/badge/1-blue?style=flat-square"></summary>

<details>
<summary>&nbsp;&nbsp;questions</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Two Sum](https://leetcode.com/problems/two-sum/) | 2026-01-05 | `feat: add two sum using hashmap` |

</details>

Files: `ArrayBasic.java`

</details>

<details>
<summary><b>binarySearch</b> <img src="https://img.shields.io/badge/1-blue?style=flat-square"></summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Binary Search](https://leetcode.com/problems/binary-search/) | 2026-01-08 | `feat: add binary search implementation` |

</details>

<details>
<summary><b>binaryTree</b> <img src="https://img.shields.io/badge/8-blue?style=flat-square"></summary>

<details>
<summary>&nbsp;&nbsp;basics</summary>

| Problem | Date Solved | Platform |
|---|---|---|
| [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | 2026-01-12 | `Leetcode` |

</details>

<details>
<summary>&nbsp;&nbsp;medium</summary>

| Problem                                                                                   | Date Solved | Platform              |
|-------------------------------------------------------------------------------------------|-------------|-----------------------|
| [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | 2026-01-15  | `Leetcode`            |
| [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | 2026-07-05  | `Leetcode`            |
| [Left View of Binary Tree](https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1)  | 2026-07-05  | `GeeksForGeeks`       |
| [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)  | 2026-07-06  | `Leetcode` |
| [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)  | 2026-07-07  | `Leetcode` |
| [Path Sum II](https://leetcode.com/problems/path-sum-ii/)  | 2026-07-08  | `Leetcode` |

</details>

<details>
<summary>&nbsp;&nbsp;hard</summary>

| Problem | Date Solved | Platform |
|---|---|---|
| [Min distance between two nodes of a Binary Tree](https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1)  | 2026-07-06  | `GeeksForGeeks` |

</details>

Files: `Node.java`, `TreeNode.java` 

</details>

<details>
<summary><b>helperCode</b></summary>

Files: `CustomCode.java` — shared utility/helper classes used across solutions.

</details>

<details>
<summary><b>linkedList</b> <img src="https://img.shields.io/badge/2-blue?style=flat-square"></summary>

<details>
<summary>&nbsp;&nbsp;circularLinkedList</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Insert into a Sorted Circular Linked List](https://leetcode.com/problems/insert-into-a-sorted-circular-linked-list/) | 2026-01-18 | `feat: add circular linked list insert` |

</details>

<details>
<summary>&nbsp;&nbsp;singlyLinkedList</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | 2026-01-20 | `feat: add iterative reverse linked list` |

</details>

</details>

<details>
<summary><b>queue</b> <img src="https://img.shields.io/badge/1-blue?style=flat-square"></summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | 2026-01-22 | `feat: add queue using two stacks` |

</details>

<details>
<summary><b>recursion</b> <img src="https://img.shields.io/badge/1-blue?style=flat-square"></summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | 2026-01-25 | `feat: add climbing stairs recursive` |

</details>

<details>
<summary><b>sortingAlgo</b> <img src="https://img.shields.io/badge/4-blue?style=flat-square"></summary>

<details>
<summary>&nbsp;&nbsp;bubbleSort</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| Bubble Sort Implementation | 2026-01-27 | `feat: add bubble sort` |

</details>

<details>
<summary>&nbsp;&nbsp;cyclicSort</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Missing Number](https://leetcode.com/problems/missing-number/) | 2026-01-28 | `feat: add cyclic sort missing number` |

</details>

<details>
<summary>&nbsp;&nbsp;insertionSort</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| Insertion Sort Implementation | 2026-01-29 | `feat: add insertion sort` |

</details>

<details>
<summary>&nbsp;&nbsp;mergeSort</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| Merge Sort Implementation | 2026-01-30 | `feat: add merge sort` |

</details>

<details>
<summary>&nbsp;&nbsp;selectionSort</summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| Selection Sort Implementation | 2026-01-31 | `feat: add selection sort` |

</details>

Files: `CheckIfSorted.java`

</details>

<details>
<summary><b>stack</b> <img src="https://img.shields.io/badge/1-blue?style=flat-square"></summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | 2026-02-02 | `feat: add valid parentheses using stack` |

</details>

<details>
<summary><b>string</b> <img src="https://img.shields.io/badge/2-blue?style=flat-square"></summary>

| Problem | Date Solved | Commit Message |
|---|---|---|
| [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | 2026-02-04 | `feat: add valid anagram solution` |

</details>

</td></tr>
</table>

</details>

---

## Tech Stack

- Language: Java 21
- Core Concepts: Java Collections Framework (List, Map, Set, Queue, Deque)
- IDE: IntelliJ IDEA

---

## Contributing

This is a personal learning repository, but suggestions and improvements are welcome via issues or pull requests.