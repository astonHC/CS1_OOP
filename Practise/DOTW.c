/* COPYRIGHT (C) HARRY CLARK 2023 */

#include <stdio.h>
#include <stdlib.h>

typedef struct DAYS
{
    static DOTW* DAY_OF_THE_WEEK;
};

typedef enum
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
    
} DOTW;

static void WHICH_DAY()
{
    int DAY;
    DAYS.DAY_OF_THE_WEEK DOTW;

    switch(DAY)
    {
        case 1:
            printf("Today is: ", DOTW.MONDAY);
            break;
j
        case 2:
            printf("Today is: ", DOTW.TUESDAY);
            break;

        case 3:
            printf("Today is: ", DOTW.WEDNESDAY);
            break;

        case 4:
            printf("Today is: ", DOTW.THURSDAY);
            break;

        case 5:
            printf("Today is: ", DOTW.FRIDAY);
            break;

        case 6:
            printf("Today is: ", DOTW.SATURDAY);
            break;

        case 7:
            printf("Today is: ", DOTW.SUNDAY);
            break;
    }
}

int main(int argc, char* argv[])
{
    int DAY;
    printf("%d", "Enter a number between 1 and 6");
    scanf("%d", &DAY);

    WHICH_DAY(DAY);

    return 0;
}

