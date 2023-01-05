# Linked List

Let us take a block of memory of size 50 bytes and we only have 30 bytes of free memory.
1 integer takes 4 bytes of memory, so we can create 7 variable or int type.

**Memory Block**

| filled | 20 bytes free | filled | 10 bytes free | filled |
|--------|--------|--------|--------|--------|

But we can't create an array of 7 integers in this case.
As we need a continious block of memory to create an array.

In such case we can use linked list.

### Linked List - List of connected Nodes.
List of items linked together.
Has node which have data and address of next node in the list.
Provides all the functionality we get in array and doesn't need continious memory allocation.

## Node 

Simplest unit of data structure.

| Node |
|------|
| data |
| next |

Example : Linked List

|Index   | 0 | 1 | 2 | 3 | 4 | 5 | 6 |
|--------|--------|--------|--------|--------|--------|--------|--------|
|Address |  4k    | 5K     | 6K     | 7K     | 8K     | 12K    | 13K    |
|  data  | 10     | 20     | 30     | 40     | 50     | 60     | 70     |
|  next  | 5K     | 6K     | 7K     | 8K     | 12K    | 13K    | null   |

Each colomn in the table represent a node wih data and address.
Note - Index and Address are not the part of the node but shown for understanding 

Types : 

Singly Linked List.
Doubly Linked List.

## **Things to keep in mind**
1. null point exception.
1. Edge test cases (size - even, odd etc.)
1. Always prefer paper before code.
