package Task1;

import java.util.LinkedList;
 

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int[] listMas = {3,10,4,3,7,4,11, 1};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

    }
}
