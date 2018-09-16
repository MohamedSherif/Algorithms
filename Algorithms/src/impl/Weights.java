package impl;

import java.util.*;

public class Weights{
	 
    private Sack bagOfWeights = new Sack();
    private Sack knapSack = new Sack();
 
    public static void main(String[] args){
        Weights myWeights = new Weights();
        /* Fill the bag of weights. */
        myWeights.bagOfWeights.add(2);
        myWeights.bagOfWeights.add(3);
        myWeights.bagOfWeights.add(4);
        myWeights.bagOfWeights.add(5);
        myWeights.bagOfWeights.add(6);
        myWeights.bagOfWeights.add(8);
        
        System.out.println("Possible answers: ");
        myWeights.fillKnapSack(25);
    }
    
    public void fillKnapSack(int targetWeight){
        knapSack.empty();
        fillKnapSackRec(targetWeight, 0);
    }
    
    public void fillKnapSackRec(int targetWeight, int i){
 
        /* Time to finish recursion */
        if(i == bagOfWeights.size())
        {
            /* It means we have found good solution */
            if(targetWeight == 0){
                System.out.print("Solution: ");
                for (int j = 0; j < knapSack.size(); j++){
                    System.out.print(knapSack.getWeight(j) + " ");
                }
                System.out.println("");
            }
            return;
        }
        
        /* You can do two moves now, add i-th item or continue packing withou i-th item */
        knapSack.add(bagOfWeights.getWeight(i));
        fillKnapSackRec(targetWeight - bagOfWeights.getWeight(i), i+1);
        knapSack.remove(knapSack.size()-1);
        fillKnapSackRec(targetWeight, i+1);       
    }
    
    
    class Sack extends ArrayList{
        
        public Sack(){
            super();
        }
    
        public void add(int weight){
            add(new Integer(weight));
        }
    
    
        public int getWeight(){
            int sackWeight = 0;
            for (int i = 0; i < size(); i++){
                Integer nextWeight = (Integer)get(i);
                sackWeight = sackWeight + nextWeight.intValue();
            }
            return sackWeight;    
        }
    
        public int getWeight(int n){
            int w = -1;
            if (n < size()){
                Integer weight = (Integer)get(n);
                w = weight.intValue();
            }
            return w;
        }
                
        public boolean isEmpty(){
            return (size() == 0);
        }
        
        public void shuffle(){
            Collections.shuffle((List)this);
        }
        
        public void empty(){
            clear();
        }
        
    }
}
