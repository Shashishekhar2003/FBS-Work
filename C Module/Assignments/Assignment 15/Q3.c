/* 3. Write a program to create an array for 10 players. For each player store name, no. of
matches played, runs, wickets takes.
a. Create function to Accept the information of each player.
b. Create function to display the information of all the players
c. Display the information of player who made maximum runs and the one who took
maximum number of wickets.A */

typedef struct Player
{
    char name[10];
    int matches_played;
    int runs;
    int wickets;
} Player;

#include <stdio.h>
void addPlayer(Player *, int);
void displayPlayers(Player *, int);
void displaymaxRun(Player *, int);
void main()
{
    Player P[3];
    int choice;

    while (1) // infinite loop until Exit
    {
        printf("\n==== Player Menu ====\n");
        printf("1. Add Player\n");
        printf("2. Display Players\n");
        printf("3. display max Run\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1)
        {
            addPlayer(P, 3);
        }
        else if (choice == 2)
        {
            displayPlayers(P, 3);
        }
        else if (choice == 3)
        {
            displaymaxRun(P, 3);
        }
        else if (choice == 4)
        {
            printf("Exiting program...\n");
            break; // stop the loop
        }
        else
        {
            printf("Invalid choice! Please try again.\n");
        }
    }
}

void addPlayer(Player *ptr, int size)
{
    printf("Add Players Details :\n");
    for (int i = 0; i < size; i++)
    {
        printf("\nPlayer %d:", i + 1);
        printf("Name :");
        scanf("%s", ptr[i].name);

        printf("Matches Played :");
        scanf("%d", &ptr[i].matches_played);

        printf("Runs :");
        scanf("%d", &ptr[i].runs);

        printf("Wickets :");
        scanf("%d", &ptr[i].wickets);
    }
}

void displayPlayers(Player *ptr, int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("\nName : %s \nMatches Played : %d \nRuns : %d \nWickets : %d ", ptr[i].name, ptr[i].matches_played, ptr[i].runs, ptr[i].wickets);
    }
}

void displaymaxRun(Player *ptr, int size)
{
    int limit = 300;
    int found = 0;

    printf("\nPlayers with Runs greater than %d:\n", limit);

    for (int i = 0; i < size; i++)
    {
        if (ptr[i].runs > limit)
        {
            printf("Name: %s | Runs: %d\n", ptr[i].name, ptr[i].runs);
            found = 1;
        }
    }

    if (!found)
    {
        printf("No player has runs greater than %d.\n", limit);
    }
}
