/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 * Author: Jonathan Sussan
 * Date: 11/24/2022
 * Version: 1.0
 */
package BlockChainApp;

import java.util.Arrays;

public class Blockchain {
    
    private String [] transactions;
    private int blockHash;
    private int previousBlockHash;
    
    @Override
    public String toString() {
        return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash + 
                ", previousBlockHash=" + previousBlockHash + "]";
    }

    // Constructor
    public Blockchain(String[] transactions, int previousBlockHash) {
        super();
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(transactions) , this.previousBlockHash });
    }
    
    // @return the transactions
    public String[] getTransactions() {
        return transactions;
    }

    // @param transactions the transactions to set
    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    // @return the blockHash
    public int getBlockHash() {
        return blockHash;
    }

    // @param blockHash the blockHash to set
    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    // @return the previousBlockHash
    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    // @param previousBlockHash the previousBlockHash to set
    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
}
