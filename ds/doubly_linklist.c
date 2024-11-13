#include <malloc.h>
#include <stdio.h>
struct node {
  struct node *next;
  int data;
  struct node *prev;
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
void delete_specific();
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
    printf("\n 9: Delete a specific node");
    printf("\n 10: EXIT");
    printf("\n\n Enter your option : ");
    scanf("%d", &option);
    switch (option) {
      case 1:
        create_ll();
        printf("\n DOUBLY LINKED LIST CREATED");
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
        delete_specific();
        break;
    }
  } while (option != 10);
}
void create_ll() {
  struct node *new_node, *ptr;
  int num;
  printf("\n Enter -1 to end");
  printf("\n Enter the data : ");
  scanf("%d", &num);
  while (num != -1) {
    if (start == NULL) {
      new_node = (struct node *)malloc(sizeof(struct node));
      new_node->prev = NULL;
      new_node->data = num;
      new_node->next = NULL;
      start = new_node;
    } else {
      ptr = start;
      new_node = (struct node *)malloc(sizeof(struct node));
      new_node->data = num;
      while (ptr->next != NULL) ptr = ptr->next;
      ptr->next = new_node;
      new_node->prev = ptr;
      new_node->next = NULL;
    }
    printf("\n Enter the data : ");
    scanf("%d", &num);
  }
}
void display() {
  struct node *ptr;
  if (start == NULL) {
    printf("\n List is empty.");
    return;
  }
  ptr = start;
  while (ptr != NULL) {
    printf("\t %d", ptr->data);
    ptr = ptr->next;
  }
}
void insert_beg() {
  struct node *new_node;
  int num;
  printf("\n Enter the data : ");
  scanf("%d", &num);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  new_node->prev = NULL;
  if (start == NULL) {
    new_node->next = NULL;
    start = new_node;
  } else {
    new_node->next = start;
    start->prev = new_node;
    start = new_node;
  }
}
void insert_end() {
  struct node *new_node, *ptr;
  int num;
  printf("\n Enter the data : ");
  scanf("%d", &num);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  new_node->next = NULL;
  if (start == NULL) {
    new_node->prev = NULL;
    start = new_node;
  } else {
    ptr = start;
    while (ptr->next != NULL) ptr = ptr->next;
    ptr->next = new_node;
    new_node->prev = ptr;
  }
}
void insert_before() {
  struct node *new_node, *ptr;
  int num, val;
  printf("\n Enter the data : ");
  scanf("%d", &num);
  printf("\n Enter the value before which the data has to be inserted : ");
  scanf("%d", &val);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  ptr = start;
  while (ptr != NULL && ptr->data != val) ptr = ptr->next;
  if (ptr == NULL) {
    printf("\n Value not found.");
  } else if (ptr == start) {
    insert_beg();
  } else {
    new_node->next = ptr;
    new_node->prev = ptr->prev;
    ptr->prev->next = new_node;
    ptr->prev = new_node;
  }
}
void insert_after() {
  struct node *new_node, *ptr;
  int num, val;
  printf("\n Enter the data : ");
  scanf("%d", &num);
  printf("\n Enter the value after which the data has to be inserted : ");
  scanf("%d", &val);
  new_node = (struct node *)malloc(sizeof(struct node));
  new_node->data = num;
  ptr = start;
  while (ptr != NULL && ptr->data != val) ptr = ptr->next;
  if (ptr == NULL) {
    printf("\n Value not found.");
  } else {
    new_node->prev = ptr;
    new_node->next = ptr->next;
    if (ptr->next != NULL) ptr->next->prev = new_node;
    ptr->next = new_node;
  }
}
void delete_beg() {
  struct node *ptr;
  if (start == NULL) {
    printf("\n List is empty.");
    return;
  }
  ptr = start;
  start = start->next;
  if (start != NULL) start->prev = NULL;
  free(ptr);
}
void delete_end() {
  struct node *ptr;
  if (start == NULL) {
    printf("\n List is empty.");
    return;
  }
  ptr = start;
  if (ptr->next == NULL) {
    start = NULL;
    free(ptr);
  } else {
    while (ptr->next != NULL) ptr = ptr->next;
    ptr->prev->next = NULL;
    free(ptr);
  }
}
void delete_specific() {
  struct node *ptr;
  int val;
  printf("\n Enter the value of the node to be deleted: ");
  scanf("%d", &val);
  if (start == NULL) {
    printf("\n List is empty.");
    return;
  }
  ptr = start;
  while (ptr != NULL && ptr->data != val) ptr = ptr->next;
  if (ptr == NULL) {
    printf("\n Node not found.");
  } else if (ptr == start) {
    delete_beg();
  } else if (ptr->next == NULL) {
    delete_end();
  } else {
    ptr->prev->next = ptr->next;
    ptr->next->prev = ptr->prev;
    free(ptr);
  }
}