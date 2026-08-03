# Selection Sort

## Definition

Selection Sort is an in-place comparison-based sorting algorithm that repeatedly finds the smallest (or largest) element from the unsorted portion of the array and places it in its correct position.

---

## Intuition

Imagine arranging playing cards.

1. Find the smallest card.
2. Put it in the first position.
3. Find the next smallest card.
4. Put it in the second position.
5. Repeat until the array is sorted.

---

## Algorithm

For ascending order:

1. Divide the array into:
    - Sorted part
    - Unsorted part

2. Initially:
    - Sorted part = empty
    - Unsorted part = entire array

3. For every position `i`
    - Assume `arr[i]` is the minimum.
    - Scan the remaining unsorted elements.
    - Find the actual minimum.
    - Swap it with `arr[i]`.

4. Repeat until only one element remains.

---

## Example

Initial:

[29, 10, 14, 37, 13]

Pass 1

Find minimum = 10

Swap

[10, 29, 14, 37, 13]

Pass 2

Find minimum = 13

Swap

[10, 13, 14, 37, 29]

Pass 3

Minimum already at correct position

[10, 13, 14, 37, 29]

Pass 4

Swap 29 and 37

[10, 13, 14, 29, 37]

Sorted.

---

## Pseudocode

for i = 0 to n-2

    minIndex = i

    for j = i+1 to n-1

        if arr[j] < arr[minIndex]

            minIndex = j

    swap(arr[i], arr[minIndex])

---

## Why does `j` start from `i + 1`?

Because we already assume

minIndex = i

Meaning:

"The current minimum is the first element of the unsorted part."

So comparing `arr[i]` with itself is unnecessary.

If instead you initialize

smallest = Integer.MAX_VALUE

then you must start from

j = i

because no element has been considered yet.

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(n²) |
| Average | O(n²) |
| Worst | O(n²) |

Reason:

The algorithm always scans the remaining unsorted elements, even if the array is already sorted.

Comparisons:

(n-1)+(n-2)+...+1

= n(n-1)/2

= O(n²)

---

## Space Complexity

In-place implementation:

Auxiliary Space = O(1)

If a copy of the array is created:

Auxiliary Space = O(n)

---

## Number of Swaps

Maximum swaps = n - 1

Unlike Bubble Sort, Selection Sort performs very few swaps.

This is one of its biggest advantages.

---

## Stable?

❌ No

Example:

[(4,A), (4,B), (2,C)]

After swapping the smallest element:

[(2,C), (4,B), (4,A)]

Originally:

A before B

Now:

B before A

The relative order of equal elements changes.

Therefore Selection Sort is unstable.

---

## In-place?

✅ Yes

It sorts inside the original array without requiring another array.

---

## Comparison Based?

✅ Yes

It determines the order of elements only by comparing them.

Examples of comparison-based sorting:

- Selection Sort
- Bubble Sort
- Insertion Sort
- Merge Sort
- Heap Sort
- Quick Sort

---

## Advantages

- Very easy to understand and implement.
- Uses constant auxiliary memory (O(1)).
- Performs at most n−1 swaps.
- Useful when swapping elements is expensive.
- Deterministic (always follows the same steps).

---

## Disadvantages

- O(n²) in every case.
- Doesn't take advantage of an already sorted array.
- Unstable.
- Inefficient for large datasets.
- Generally slower than Merge Sort, Heap Sort, and Quick Sort.

---

## When should you use Selection Sort?

Use it when:

- Learning sorting algorithms.
- Arrays are very small.
- Memory is extremely limited.
- Swapping is expensive but comparisons are cheap.

Avoid it when:

- Data is large.
- Performance matters.
- A stable sort is required.

---

## Real-world usage

Rarely used directly in production because much faster algorithms exist.

Modern libraries typically use:

- TimSort
- Merge Sort
- Quick Sort
- Heap Sort

depending on the language and data type.

---

## Key Properties

| Property | Value |
|-----------|-------|
| Sorting Type | Comparison Based |
| In-place | ✅ Yes |
| Stable | ❌ No |
| Adaptive | ❌ No |
| Auxiliary Space | O(1) |
| Best Time | O(n²) |
| Average Time | O(n²) |
| Worst Time | O(n²) |
| Swaps | O(n) |
| Comparisons | O(n²) |

---

## Interview Tips

Remember these three facts:

1. Finds the minimum element in the unsorted part.
2. Swaps only once per pass.
3. Performs O(n²) comparisons regardless of input order.

---

## Common Mistakes

- Starting the outer loop until `n` instead of `n - 1`.
- Forgetting to update `minIndex`.
- Starting `j` from `i` after already setting `minIndex = i` (causes one unnecessary comparison).
- Confusing Selection Sort with Bubble Sort (Bubble swaps adjacent elements repeatedly; Selection Sort performs one swap per pass after finding the minimum).

---

## Mental Model

Selection Sort grows a sorted prefix one element at a time.

| Sorted | Unsorted |

After every pass:

- One more element becomes permanently sorted.
- The sorted portion grows from left to right.

Think:

"Find the smallest. Put it where it belongs. Repeat."