package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = post.length <= word.length;
        for (int i = 0; i < post.length && i < word.length; i++) {
            if (!result || word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;

            }
        }
        return  result;

    }
}
