#include <stdio.h>

int main()
{
    char ch;
    printf("Enter any alphabet: ");
    scanf("%c", &ch);
    switch(ch)
    {
        case 'a': 
            printf("You entered a Vowel");
            break;
        case 'e': 
            printf("You entered a Vowel");
            break;
        case 'i': 
            printf("You entered a Vowel");
            break;
        case 'o': 
            printf("You entered a Vowel");
            break;
        case 'u': 
            printf("You entered a Vowel");
            break;
        case 'A': 
            printf("You entered a Vowel");
            break;
        case 'E': 
            printf("You entered a Vowel");
            break;
        case 'I': 
            printf("You entered a Vowel");
            break;
        case 'O': 
            printf("You entered a Vowel");
            break;
        case 'U': 
            printf("You entered a Vowel");
            break;
        default: 
            printf("You entered a Consonant");
    }

    return 0;
}