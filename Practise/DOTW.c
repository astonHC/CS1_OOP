/* COPYRIGHT (C) HARRY CLARK 2023 */

#include <stdio.h>
#include <stdlib.h>

typedef enum DOTW
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
    
} DOTW;

static void WHICH_DAY(int DAY)
{
    static DOTW* DAY_OF_THE_WEEK = NULL;
    DAY_OF_THE_WEEK = malloc(sizeof(DOTW));

    switch(*DAY_OF_THE_WEEK)
    {
        case MONDAY:
            printf("Today is Monday\n");
            break;

        case TUESDAY:
            printf("Today is Tuesday\n");
            break;

        case WEDNESDAY:
            printf("Today is Wednesday\n");
            break;

        case THURSDAY:
            printf("Today is Thursday\n");
            break;

        case FRIDAY:
            printf("Today is Friday\n");
            break;

        case SATURDAY:
            printf("Today is Saturday\n");
            break;

        case SUNDAY:
            printf("Today is Sunday\n");
            break;
    }
}

int main(int argc, char* argv[])
{
    int DAY;
    printf("Enter a number between 1 and 6: ");
    scanf("%d", &DAY);

    WHICH_DAY(DAY);

    return 0;
}
