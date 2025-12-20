typedef struct cricket_players
{
    int JerseyNo;
    char Name[10];
    int Runs;
    int Wickets;
    int Matches_played;

} cricket_players;

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void addPlayer(cricket_players *, int,int);
void removePlayer(cricket_players *, int *);
void searchPlayer(cricket_players *, int);
void updatePlayer(cricket_players *, int);
void displayAll(cricket_players *, int);
void displaySorted(cricket_players *, int);
void topPlayers3(cricket_players *, int);

void main()
{
    // cricket_players team[4];
    cricket_players *team = malloc(3 * sizeof(cricket_players));
    int choice;
    int size = 3;
    int count = 0;

    while (1)
    {
        printf("\n***** Player Management System *****\n");
        printf("1. Add Player\n");
        printf("2. Remove Player\n");
        printf("3. Search Player\n");
        printf("4. Update Player\n");
        printf("5. Display All Players\n");
        printf("6. Display Sorted Players\n");
        printf("7. Display Top 3 Players (Runs & Wickets)\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            addPlayer(team, size, count);
            break;
        case 2:
            removePlayer(team, &size);
            break;
        case 3:
            searchPlayer(team, size);
            break;
        case 4:
            updatePlayer(team, size);
            break;
        case 5:
            displayAll(team, size);
            break;
        case 6:
            displaySorted(team, size);
            break;
        case 7:
            topPlayers3(team, size);
            break;
        case 8:
            exit(0);
        default:

            printf("Invalid choice! Try again...\n");
        }
    }
}
// main end here....

void addPlayer(cricket_players *ptr, int size, int count) // Fun Add Player
{

    char ch;
    int newSize;
    if (size == count)
        printf("Team is Full....\n");        
    else
    {
        for (int i = 0; i < size; i++)
        {
            printf("\nEnter Details of Players : %d", i + 1);
            printf("\nJerseyNo :");
            scanf("%d", &ptr[i].JerseyNo);

            printf("Name :");
            scanf("%s", ptr[i].Name);

            printf("Runs :");
            scanf("%d", &ptr[i].Runs);

            printf("Wickets :");
            scanf("%d", &ptr[i].Wickets);

            printf("Matches played ;");
            scanf("%d", &ptr[i].Matches_played);

            count++;
        }
        printf("\nPlayer added successfully!\n");
    }
}

void removePlayer(cricket_players *ptr, int *size) // remove fun
{
    int jersey;
    int found = 0;
    printf("\nEnter the No you want to remove :");
    scanf("%d", &jersey);

    for (int i = 0; i < *size; i++)
    {
        if (ptr[i].JerseyNo == jersey)
        {
            for (int j = i; j < *size - 1; j++)
            {
                ptr[j] = ptr[j + 1];
            }
            (*size)--;
            found = 1;
            printf("\nPlayer Removed successfully.....");
            break;
        }
    }
    if (found != 1)
        printf("\nPlayer Not Found ");
}

void searchPlayer(cricket_players *ptr, int size) // Search Fun
{
    int jerseyNo;
    printf("Enter Jersey Number you want to serch :");
    scanf("%d", &jerseyNo);
    int flag = 0;
    for (int i = 0; i < size; i++)
    {
        if (ptr[i].JerseyNo == jerseyNo)
        {
            printf("\nJersey Number : %d || Name :%s || Runs :%d || Wickets :%d || Match Played :%d ", ptr[i].JerseyNo, ptr[i].Name, ptr[i].Runs, ptr[i].Wickets, ptr[i].Matches_played);
            flag = 1;
            break;
        }
    }
    if (flag == 0)
        printf("\nPlayer Not Found....");
}

void updatePlayer(cricket_players *ptr, int size) // Update Fun
{
    int jersey;
    int flag = 0;
    printf("\nEnter Jersey Number You want to Update :");
    scanf("%d", &jersey);

    for (int i = 0; i < size; i++)
    {
        if (ptr[i].JerseyNo == jersey)
        {
            printf("\nJerseyNo :");
            scanf("%d", &ptr[i].JerseyNo);

            printf("Name :");
            scanf("%s", ptr[i].Name);

            printf("Runs :");
            scanf("%d", &ptr[i].Runs);

            printf("Wickets :");
            scanf("%d", &ptr[i].Wickets);

            printf("Matches played ;");
            scanf("%d", &ptr[i].Matches_played);
            flag = 1;
            break;
        }
    }
    printf("\nPlayer Updated successfully!\n");
    if (flag == 0)
        printf("\nPlayer Not Found.....");
}

void displaySorted(cricket_players *ptr, int size) // Sorted Fun
{
    int choice;
    printf("\nSort by:\n 1. Min Runs\n 2. Max Runs\n 3. Min Wickets\n 4. Max Wickets\n");
    scanf("%d", &choice);

    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i; j < size; j++)
        {
            if (choice == 1 && ptr[i].Runs > ptr[j].Runs)
            {
                cricket_players temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
            else if (choice == 2 && ptr[i].Runs < ptr[j].Runs)
            {
                cricket_players temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
            else if (choice == 3 && ptr[i].Wickets > ptr[j].Wickets)
            {
                cricket_players temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
            else if (choice == 4 && ptr[i].Wickets < ptr[j].Wickets)
            {
                cricket_players temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }
    displayAll(ptr, size); // call display fun
}

void topPlayers3(cricket_players *ptr, int size) // top 3 player
{
    cricket_players newrun[10], newwick[10];
    for (int i = 0; i < size; i++)
    {
        newrun[i] = ptr[i];
        newwick[i] = ptr[i];
    }

    // for Runs
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i; j < size; j++)
        {
            if (newrun[i].Runs < newrun[j].Runs)
            {
                cricket_players temp = newrun[i];
                newrun[i] = newrun[j];
                newrun[j] = temp;
            }
        }
    }

    // For Wickets
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (newwick[i].Wickets < newwick[j].Wickets)
            {
                cricket_players temp = newwick[i];
                newwick[i] = newwick[j];
                newwick[j] = temp;
            }
        }
    }

    printf("Top 3 Players (Runs) :\n");
    for (int i = 0; i < size && i < 3; i++)
    {
        printf("%d || %s || Runs :%d \n", newrun[i].JerseyNo, newrun[i].Name, newrun[i].Runs);
    }
    printf("Top 3 Players (Wickets) :\n");
    for (int i = 0; i < size && i < 3; i++)
    {
        printf("%d || %s || Wickets :%d \n", newwick[i].JerseyNo, newwick[i].Name, newwick[i].Wickets);
    }
}

void displayAll(cricket_players *ptr, int size) // Display All Players
{
    printf("***** List Of All Players *****");
    for (int i = 0; i < size; i++)
    {
        printf("\nJerseyNo=%d \nName=%s \nRuns=%d \nWickets=%d \nMatches Played=%d ", ptr[i].JerseyNo, ptr[i].Name, ptr[i].Runs, ptr[i].Wickets, ptr[i].Matches_played);
        printf("\n");
    }
}
