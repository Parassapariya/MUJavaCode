#include <stdio.h>
#include <stdlib.h>
struct node {
  int data;
  struct node *next;
};
struct node *start = NULL;
void create_ll();
void display();
void insert_beg();
void insert_end();
void insert_before();
void insert_after();
void delete_beg();
void delete_end();
void delete_node();
void search();
void count();
void sort();
void update();
void main() {
  int option;
  do {
    printf("\n\n *****MAIN MENU *****");
    printf("\n 1: Create a list");
    printf("\n 2: Display the list");
    printf("\n 3: Add a node at the beginning");
    printf("\n 4: Add a node at the end");
    printf("\n 5: Add a node before a given node");
    printf("\n 6: Add a node after a given node");
    printf("\n 7: Delete a node from the beginning");
    printf("\n 8: Delete a node from the end");
    printf("\n 9: Delete a given node");
    printf("\n 10: Search");
    printf("\n 11: Count");
    printf("\n 12: Sort");
    printf("\n 13: Update");
    printf("\n 14: EXIT");
    printf("\n\n Enter your option: ");
    scanf("%d", &option);
    switch (option) {
      case 1:
        create_ll();
        printf("\n LINKED LIST CREATED");
        break;
      case 2:
        display();
        break;
      case 3:
        insert_beg();
        break;
      case 4:
        insert_end();
        break;
      case 5:
        insert_before();
        break;
      case 6:
        insert_after();
        break;
      case 7:
        delete_beg();
        break;
      case 8:
        delete_end();
        break;
      case 9:
        delete_node();
        break;
      case 10:
        search();
        break;
      case 11:
        count();
        break;
      case 12:
        sort();
        break;
      case 13:
        update();
        break;
    }
  } while (option != 14);
}
void create_ll() {
  struct node *new_node, *ptr;
  int num;
  printf("\n Enter -1 to end");
  printf("\n Enter the data: ");
  scanf("%d", &num);
  while (num != -1) {
    new_node = (struct node *)malloc(sizeof(struct node));
    new_node->data = num;
    if (start == NULL) {
      new_node->next = NULL;
      start = new_node;
    } else {
      ptr = start;
      while (ptr->next != NULL) {
        ptr = ptr->next;
      }
      ptr->next = new_node;
      new_node->next = NULL;
    }
    printf("\n Enter the data: ");
    scanf("%d", &num);
  }
}
void display() {
  struct node *ptr;
  ptr = start;
  while (ptr != NULL) {
    printf("\t %d", ptr->data);
    ptr = ptr->next;
  }
}
void insert_beg() {
  struct node *new_node;
  int num;
  printf("\n Enter the data: ");
  scanf("%d", &num);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  new_node->next = start;
  start = new_node;
}
void insert_end() {
  struct node *ptr, *new_node;
  int num;
  printf("\n Enter the data: ");
  scanf("%d", &num);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  new_node->next = NULL;
  ptr = start;
  while (ptr->next != NULL) ptr = ptr->next;
  ptr->next = new_node;
}
void insert_before() {
  struct node *new_node, *ptr, *preptr;
  int num, val, found = 0;
  printf("\n Enter the data: ");
  scanf("%d", &num);
  printf("\n Enter the value before which the data has to be inserted: ");
  scanf("%d", &val);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  ptr = start;
  if (ptr->data == val) {
    insert_beg();
    found = 1;
  } else {
    while (ptr != NULL && ptr->data != val) {
      preptr = ptr;
      ptr = ptr->next;
    }
    if (ptr != NULL) {
      preptr->next = new_node;
      new_node->next = ptr;
      found = 1;
    }
  }
  if (!found) {
    printf("\n Value %d not found in the list.", val);
  }
}
void insert_after() {
  struct node *new_node, *ptr;
  int num, val, found = 0;
  printf("\n Enter the data: ");
  scanf("%d", &num);
  printf("\n Enter the value after which the data has to be inserted: ");
  scanf("%d", &val);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  ptr = start;
  while (ptr != NULL && ptr->data != val) {
    ptr = ptr->next;
  }
  if (ptr != NULL) {
    new_node->next = ptr->next;
    ptr->next = new_node;
    found = 1;
  }
  if (!found) {
    printf("\n Value %d not found in the list.", val);
  }
}
void delete_beg() {
  struct node *ptr;
  ptr = start;
  start = start->next;
  free(ptr);
}
void delete_end() {
  struct node *ptr, *preptr;
  ptr = start;
  while (ptr->next != NULL) {
    preptr = ptr;
    ptr = ptr->next;
  }
  preptr->next = NULL;
  free(ptr);
}
void delete_node() {
  struct node *ptr, *preptr;
  int val, found = 0;
  printf("\n Enter the value of the node to be deleted: ");
  scanf("%d", &val);
  ptr = start;
  if (ptr->data == val) {
    delete_beg();
    found = 1;
  } else {
    while (ptr != NULL && ptr->data != val) {
      preptr = ptr;
      ptr = ptr->next;
    }
    if (ptr != NULL) {
      preptr->next = ptr->next;
      free(ptr);
      found = 1;
    }
  }
  if (!found) {
    printf("\n Value %d not found in the list.", val);
  }
}
void search() {
  int val, f = 0;
  struct node *ptr;
  printf("\n Enter Value: ");
  scanf("%d", &val);
  ptr = start;
  while (ptr != NULL) {
    if (ptr->data == val) {
      printf("\n Value Found: %d", ptr->data);
      f = 1;
      break;
    }
    ptr = ptr->next;
  }
  if (!f) {
    printf("\n Value is not found");
  }
}
void count() {
  struct node *ptr;
  int count = 0;
  ptr = start;
  while (ptr != NULL) {
    printf("\t %d", ptr->data);
    ptr = ptr->next;
    count++;
  }
  printf("\n Total Nodes: %d", count);
}
void sort() {
  struct node *ptr1, *ptr2;
  int temp;
  ptr1 = start;
  while (ptr1->next != NULL) {
    ptr2 = ptr1->next;
    while (ptr2 != NULL) {
      if (ptr1->data > ptr2->data) {
        temp = ptr1->data;
        ptr1->data = ptr2->data;
        ptr2->data = temp;
      }
      ptr2 = ptr2->next;
    }
    ptr1 = ptr1->next;
  }
}
void update() {
  int idx, num, count = 1, found = 0;
  struct node *ptr;
  printf("\n Enter Index to be updated: ");
  scanf("%d", &idx);
  printf("\n Enter Updated Value: ");
  scanf("%d", &num);
  ptr = start;
  while (ptr != NULL) {
    if (count == idx) {
      ptr->data = num;
      found = 1;
      break;
    }
    ptr = ptr->next;
    count++;
  }
  if (!found) {
    printf("\n Index is not available");
  }
}