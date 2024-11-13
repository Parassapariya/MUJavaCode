#include <stdio.h>
#include <stdlib.h>
struct PolyNode {
  int coeff;
  int exp;
  struct PolyNode* next;
};
struct PolyNode* createNode(int coeff, int exp) {
  struct PolyNode* newNode = (struct PolyNode*)malloc(sizeof(struct PolyNode));
  newNode->coeff = coeff;
  newNode->exp = exp;
  newNode->next = NULL;
  return newNode;
}
struct PolyNode* addPolynomials(struct PolyNode* poly1, struct PolyNode* poly2) {
  struct PolyNode* result = NULL;
  struct PolyNode* last = NULL;
  while (poly1 != NULL && poly2 != NULL) {
    struct PolyNode* newNode;
    if (poly1->exp > poly2->exp) {
      newNode = createNode(poly1->coeff, poly1->exp);
      poly1 = poly1->next;
    } else if (poly1->exp < poly2->exp) {
      newNode = createNode(poly2->coeff, poly2->exp);
      poly2 = poly2->next;
    } else {
      newNode = createNode(poly1->coeff + poly2->coeff, poly1->exp);
      poly1 = poly1->next;
      poly2 = poly2->next;
    }
    if (result == NULL) {
      result = newNode;
    } else {
      last->next = newNode;
    }
    last = newNode;
  }
  while (poly1 != NULL) {
    struct PolyNode* newNode = createNode(poly1->coeff, poly1->exp);
    if (result == NULL) {
      result = newNode;
    } else {
      last->next = newNode;
    }
    last = newNode;
    poly1 = poly1->next;
  }
  while (poly2 != NULL) {
    struct PolyNode* newNode = createNode(poly2->coeff, poly2->exp);
    if (result == NULL) {
      result = newNode;
    } else {
      last->next = newNode;
    }
    last = newNode;
    poly2 = poly2->next;
  }
  return result;
}
void printPolynomial(struct PolyNode* poly) {
  while (poly != NULL) {
    printf("%dx^%d", poly->coeff, poly->exp);
    poly = poly->next;
    if (poly != NULL) {
      printf(" + ");
    }
  }
  printf("\n");
}
int main() {
  struct PolyNode* poly1 = createNode(7, 2);
  poly1->next = createNode(4, 1);
  poly1->next->next = createNode(2, 0);
  struct PolyNode* poly2 = createNode(3, 2);
  poly2->next = createNode(2, 1);
  poly2->next->next = createNode(5, 0);
  printf("First Polynomial: ");
  printPolynomial(poly1);
  printf("Second Polynomial: ");
  printPolynomial(poly2);
  struct PolyNode* result = addPolynomials(poly1, poly2);
  printf("Resultant Polynomial: ");
  printPolynomial(result);
  return 0;
}