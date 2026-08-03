# Bubble Sort

## Definition

Bubble Sort is an in-place, comparison-based, stable sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

After every pass, the largest unsorted element "bubbles" to its correct position at the end of the array.

---

# Intuition

Imagine air bubbles rising to the surface of water.

Similarly, in Bubble Sort:

- Larger elements gradually move toward the end.
- Smaller elements move toward the beginning.

The sorted portion grows from **right to left**.

---

# Algorithm

1. Start from the first element.
2. Compare adjacent elements.
3. If the left element is greater than the right element, swap them.
4. Continue until the end of the unsorted portion.
5. After one pass, the largest element reaches its correct position.
6. Ignore the sorted suffix and repeat.

---

# Example

Initial Array

[5, 1, 4, 2, 8]

---

Pass 1

Compare

5 1 → Swap

1 5 4 2 8

5 4 → Swap

1 4 5 2 8

5 2 → Swap

1 4 2 5 8

5 8 → No Swap

Result

[1,4,2,5,8]

Largest element (8) is fixed.

---

Pass 2

Compare

1 4

4 2 → Swap

2 5

Result

[1,2,4,5,8]

5 is fixed.

---

Pass 3

Compare

1 2

2 4

Result

[1,2,4,5,8]

4 is fixed.

---

Pass 4

Array already sorted.

---

# Visualization

Initially

| Unsorted |

After Pass 1

| Unsorted | Sorted |

After Pass 2

| Unsorted | Sorted | Sorted |

After Pass 3

| Unsorted | Sorted | Sorted | Sorted |

The sorted part grows from **right to left**.

---

# Pseudocode

for i = 0 to n-2

    for j = 0 to n-i-2

        if arr[j] > arr[j+1]

            swap(arr[j], arr[j+1])

---

# Why do we compare adjacent elements?

Bubble Sort only knows whether two neighboring elements are in the wrong order.

Example

10 4

↓

4 10

By repeatedly swapping neighbors, large elements slowly move toward the end.

---

# Why is the inner loop

j < n - i - 1 ?

Reason 1

We compare

arr[j]

with

arr[j+1]

Therefore j cannot reach the last index.

Hence

j < n - 1

---

Reason 2

After every pass,

one largest element reaches its final position.

After

i

passes,

the last

i

elements are already sorted.

There is no need to compare them again.

Hence

j < n - i - 1

---

Example

n = 5

Pass 1

j < 4

Pass 2

j < 3

Pass 3

j < 2

Pass 4

j < 1

Notice that the inner loop becomes shorter after every pass.

---

# Optimization (Adaptive Bubble Sort)

Observation

If during an entire pass no swap occurs,

the array is already sorted.

Example

[1,2,3,4,5]

No swaps happen.

The algorithm can stop immediately.

Implementation

boolean swapped = false;

for (...) {

    swapped = false;

    ...

    if (swap happened)

        swapped = true;

    if (!swapped)

        break;
}

This changes

Best Case

from

O(n²)

to

O(n)

---

# Time Complexity

Without Optimization

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

With Optimization

| Case | Complexity |
|------|------------|
| Best | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

---

# Space Complexity

Auxiliary Space

O(1)

No additional array is required.

---

# Stable?

✅ Yes

Example

(A,4)

(B,4)

(C,2)

Bubble Sort never swaps equal elements.

After sorting

(C,2)

(A,4)

(B,4)

A remains before B.

Therefore Bubble Sort is stable.

---

# In-place?

✅ Yes

Sorting happens inside the original array.

---

# Comparison Based?

✅ Yes

Uses only comparisons between adjacent elements.

---

# Adaptive?

✅ Yes (only if the swapped optimization is added)

Otherwise,

No.

---

# Advantages

- Very easy to understand.
- Very easy to implement.
- Stable sorting algorithm.
- In-place (O(1) auxiliary space).
- Can detect an already sorted array (optimized version).
- Good for learning sorting concepts.

---

# Disadvantages

- O(n²) average and worst-case time.
- Performs many swaps.
- Very inefficient for large datasets.
- Much slower than Merge Sort, Heap Sort, Quick Sort, and TimSort.

---

# When should you use Bubble Sort?

Use it

- For learning sorting algorithms.
- For very small datasets.
- When simplicity is more important than speed.
- When a stable sort is needed and performance is not critical.

Avoid it

- Large arrays.
- Production systems.
- Performance-critical applications.

---

# Bubble Sort vs Selection Sort

| Bubble Sort | Selection Sort |
|--------------|----------------|
| Swaps adjacent elements | Finds minimum then swaps once |
| Largest moves to end | Smallest moves to beginning |
| Stable | Not Stable |
| Many swaps | Few swaps |
| Adaptive (optimized) | Not Adaptive |
| Sorted suffix grows from right | Sorted prefix grows from left |

---

# Key Properties

| Property | Value |
|----------|-------|
| Sorting Type | Comparison Based |
| In-place | ✅ Yes |
| Stable | ✅ Yes |
| Adaptive | ✅ (optimized version) |
| Auxiliary Space | O(1) |
| Best Time | O(n) (optimized) |
| Average Time | O(n²) |
| Worst Time | O(n²) |

---

# Interview Tips

Remember these four facts

1. Compares adjacent elements.
2. Largest element reaches the end after every pass.
3. Inner loop becomes shorter after each pass.
4. If no swap occurs, the array is already sorted.

---

# Common Mistakes

- Using

arr[i+1]

instead of

arr[j+1]

- Running the inner loop until

j < n

(which causes ArrayIndexOutOfBoundsException)

- Forgetting to reduce the inner loop length

(n-i-1)

- Forgetting the swapped optimization.

---

# Mental Model

Think:

"Keep swapping neighbors until the largest element bubbles to the end."

Every pass creates one more permanently sorted element at the end of the array.

Bubble Sort does **not** fully sort the array in one pass.

It sorts **one element completely per pass**.