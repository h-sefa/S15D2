package org.example.entity;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringSet {

    public static Set<String> findUniqueWords(){
        String text = "Carroll began writing the manuscript of the story the next day, although that earliest version is lost. " +
                "The girls and Carroll took another boat trip a month later, when he elaborated the plot to the story of Alice, " +
                "and in November he began working on the manuscript in earnest. To add the finishing touches he researched " +
                "natural history in connection with the animals presented in the book and then had the book examined " +
                "by other children—particularly those of George MacDonald. Though Carroll did add his own illustrations " +
                "to the original copy, on publication he was advised to find a professional illustrator so the pictures " +
                "were more appealing to its audiences. He subsequently approached John Tenniel to reinterpret " +
                "Carroll's visions through his own artistic eye, telling him that the story had been well liked by the children.";
        String text2 = text.replaceAll("[.,!?\"]", "").toLowerCase();
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(text2.split("\\s+")));
        return uniqueWords;
        //System.out.println(str);
        //String[] languages = str.replaceAll("\\p{Punct}|\\n","").split(" ");
        //for (String language : languages) {

        //}

  // Bütün noktalama işsaretlerini temisl eden regex ifadesi

    }

}
