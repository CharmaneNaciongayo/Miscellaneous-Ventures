#!/usr/bin/env python3

# Warning: Please refrain from using global variables! Your solution will be checked
# by importing your function, not from the raw input/output.

from wordlist import Wordlist

# mapping of digit to possible letters
# e.g., keypad[2] returns all letters mapped to 2
keypad = {
    '2': 'abc',
    '3': 'def',
    '4': 'ghi',
    '5': 'jkl',
    '6': 'mno',
    '7': 'pqrs',
    '8': 'tuv',
    '9': 'wxyz'
}

words = Wordlist('EnglishWords.txt')

### DON'T TOUCH the code above

def predict(digits: str) -> set[str]:
    # TO-DO
    def backtrack(current_word, remaining_digits):
        if not remaining_digits:
            if words.contains(current_word):
                valid_words.add(current_word)
            return
        digit = remaining_digits[0]
        letters = keypad.get(digit, '')
        for letter in letters:
            new_word = current_word + letter
            if words.contains_prefix(new_word):
                backtrack(new_word, remaining_digits[1:])
    valid_words = set()
    backtrack('', digits)
    return valid_words

### DON'T TOUCH the code below

if __name__ == '__main__':
    digits = input()
    words = predict(digits)
    if len(words) == 0:
        print('NONE')
    else:
        for word in words:
            print(word)
