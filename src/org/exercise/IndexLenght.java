package org.exercise;



public class IndexLenght {
    public static void main(String[] args) {
        String string = "abcdefa";
        char letter= 'a';
        int chain = 0;
        int maxChain = 0;
        int indexof= 0;

        for (int i = 0; i < string.length() ; i++) {

            if (string.charAt(i) ==letter) {
                chain= chain + 1;
                if (chain >= maxChain){
                    maxChain = chain;
                    indexof = i+1 - maxChain;
                }

            }else {
                chain= 0;
            }

        }
        System.out.println(maxChain);
        System.out.println(indexof);


    }
}
