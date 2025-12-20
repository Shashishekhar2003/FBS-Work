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
        printf("\n%d",count);