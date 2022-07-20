package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().reduce(0,(result,number)->number%2!=0?number:result);
    }

    public String getLongest(List<String> words) {
        return words.stream().reduce("",(result,word)->word.length()>result.length()?word:result);
    }

    public int getTotalLength(List<String> words) {
        return words.stream().map(word->word.length()).reduce(0,(result,len)->result+len);
    }
}
