/*
 * This Java source file was generated by the Gradle 'init' task.
 *
 * Author: Jonathan Sussan
 * Date: 11/24/2022
 * Version: 1.0
 */
package BlockChainApp;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        
        // Demonstrate a hash function
        String statement1 = "This is my blockchain application";
        int hashvalue = statement1.hashCode();
        
        System.out.println("Statement = " + statement1 + " whose hash value is " + hashvalue);
        
        // Let's hash an array
        String [] list1 = {"Gambit", "Rogue", "Wolverine", "Cyclops"};
        String [] list2 = {"Beast", "Nightcrawler", "Jean Grey", "Iceman"};
        
        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);
        
        System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);
        
        // Demonstrate a series of blocks in a chain
        ArrayList<Blockchain> blockChain = new ArrayList<Blockchain>();
        
        // Block one, blockHash = -1455408895
        String[] initialValues = {"Gambit has $69", "Rogue has $13"};
        Blockchain firstBlock = new Blockchain(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The bockchain is " + blockChain.toString());
        
        // Block two, blockHash = -1601728343
        String[] blockTwo = {"Gambit gives Wolverine $10", "Gambit has $59", "Rogue gives Cyclops $2", 
            "Rogue has $11", "Wolverine has $10", "Cyclops has $2"};
        Blockchain secondBlock = new Blockchain(blockTwo, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The bockchain is " + blockChain.toString());
        
        // Block three, blockHash = -1728819012
        String[] blockThree = {"Gambit has $59", "Rogue has $11", "Wolverine gives Cyclops $5", 
            "Wolverine has $5", "Cyclops has $7"};
        Blockchain thirdBlock = new Blockchain(blockThree, secondBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The bockchain is " + blockChain.toString());
    }
}
