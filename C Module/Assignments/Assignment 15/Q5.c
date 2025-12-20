/* Q5.Movie Database: Create a program that uses structures to manage a movie
database with details like title, director, release year, and genre. Allow users
to add, search for, and update movie records. */

typedef struct movieDatabase
{
    char title[10], director[10];
    int releaseYear;
    char genre[10];
} movieDatabase;

#include <stdio.h>
#include <string.h>
void addMovie(movieDatabase* , int );
void main()
{
    movieDatabase movie[4];
    int size=4;

    int choice;

    while (1)
    {
        printf("\n====== MENU ======\n");
        printf("1. Add Movie\n");
        printf("2. Search Movie\n");
        printf("3. Update Movie\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("You selected Case 1\n");
            addMovie(movie,size);
            break;

        case 2:
            printf("You selected Case 2\n");
            //searchMovie();
            break;

        case 3:
            printf("You selected Case 3\n");
            //updateMovie();
            break;

        case 4:
            printf("Exiting program...\n");
            exit(0); // terminate program

        default:
            printf("Invalid choice! Please try again.\n");
        }
    }
}//Main End 

void addMovie(movieDatabase* ptr , int size)
{
    for(int i=0;i<size;i++)
    {
        printf("Movie %d",i+1);
        printf("\nTitle:");
        scanf("%s",ptr[i].title);

        printf("Director:");
        scanf("%s",ptr[i].director);

        printf("Release Year:");
        scanf("%d",&ptr[i].releaseYear);

        printf("Genre:");
        scanf("%s",ptr[i].genre);
        printf("\n");
    }
}