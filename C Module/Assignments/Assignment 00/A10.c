//Write a C program to input marks of five subjects, find the total marks, and calculate the percentage.

#include<stdio.h>
void main(){
    int marathi=80,hindi=85,english=86,math=79,science=80, total,percentage;

    total=marathi+hindi+english+math+science;
    percentage=total/5;

    printf("Total Marks = %d Percentage = %d " ,total,percentage);
}