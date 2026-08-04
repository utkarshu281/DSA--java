# Insertion Sort

## Idea

Insertion Sort divides the array into two parts:

- Left part → Sorted
- Right part → Unsorted

On every iteration, take the first element from the unsorted part and insert it into its correct position in the sorted part.

Example:

Before:

[4 | 3 1 2]

After first iteration:

[3 4 | 1 2]

After second iteration:

[1 3 4 | 2]

After third iteration:

[1 2 3 4]

---

# Swap-Based Insertion Sort

## Idea

Move the current element left by repeatedly swapping it with larger adjacent elements.

Example:

Current element = 2

4 > 2

Swap

4 3 2
↓

4 2 3
↓

2 4 3

The key itself moves left.

### Complexity

Worst Case : O(n²)

Average Case : O(n²)

Best Case : O(n)

Space : O(1)

Stable : Yes

Adaptive : Yes

---

# Shift-Based Insertion Sort (Standard)

## Idea

Instead of swapping:

1. Store the current element (key).
2. Shift every larger element one position to the right.
3. Insert the key into the vacant position.

Example

Initial

2 3 4 7 5

key = 5

Shift

2 3 4 7 7

Insert key

2 3 4 5 7

Notice:

- The key never moves.
- Larger elements shift right.

This performs fewer writes than the swap-based version.

---

# Difference

Swap Version

4 3 2

↓

swap

3 4 2

↓

swap

3 2 4

↓

swap

2 3 4

Key moves left.

---

Shift Version

Store key = 2

4 3 2

↓

Shift 4

4 4 2

↓

Shift 3

3 4 2

↓

Insert key

2 3 4

Larger elements move right.

---

# Time Complexity

Best Case

Already sorted

O(n)

Reason:

Only one comparison per element.

---

Worst Case

Reverse sorted

O(n²)

Reason:

Every element moves to the beginning.

---

Space Complexity

O(1)

In-place sorting algorithm.

---

# Properties

✔ Stable

✔ Adaptive

✔ In-place

✔ Online algorithm

---

# When to use

- Small arrays
- Nearly sorted arrays
- As a subroutine inside more complex algorithms (e.g., TimSort)

Not suitable for large random datasets.

---

# Common Mistakes

- Forgetting to insert the key after shifting.
- Loop ending when sortedIndex == -1.
- Swapping instead of shifting (works but performs more writes).
- Forgetting to break when correct position is found.