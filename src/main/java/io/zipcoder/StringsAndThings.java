package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /*
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;
        String temp[] = input.split(" ");
        for (int i = 0; i < temp.length; i++){
            if (temp[i].trim().endsWith("y") || temp[i].trim().endsWith("z"));
                count++;

        }

        return count;
    }
    /*
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        base = base.replaceAll(remove, "");
        return base;
    }

    /*
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int numOfIs = 0;
        int numOfNot = 0;
        boolean equal = true;

        char [] split = input.toCharArray();
        for (int i = 0; i < split.length - 1; i++) {
            if (split[i] == 'i' && split[i + 1] == 's') {
                numOfIs++;
            }
            if (split[i] == 'n' && split[i + 1] == 'o' && split[i + 2] == 't') {
                numOfNot++;
            }
        }
        if (numOfIs == numOfNot) {
            equal = true;
        }
        else {
            equal = false;
            }

        return equal;
    }

    /*
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happy = false;


        char [] split = input.toCharArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] == 'g') {
                if (split[i - 1] == 'g' || split[i + 1] == 'g') {
                    happy = true;


                } else {
                    happy = false;
                }
            }
        }
        return happy;
    }


    /*
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int tripLetter = 0;
        char charTemp ;
        char [] split = input.toCharArray();
        for (int i = 0; i < split.length - 1; i++) {
            charTemp = split[i];

            if (split[i] == charTemp) {
                if (split[i] == charTemp  && split[i + 1] == charTemp && split[i + 2] == charTemp) {
                    tripLetter++;
                }
            }
        }
        return tripLetter;
    }
}
