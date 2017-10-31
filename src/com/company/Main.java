package com.company;

public class Main {

    public static void main(String[] args) {
	    int k=0;
        for(int i=0;i<10;i++) {
            i++;
	        if(i!=k) {
	            for(int j=1;j<10;j++){
	                if (j!=i||i!=k||j!=k){
	                    for(k=0;k<10;k++){
	                        if(k!=j && k!=i) {
	                            System.out.println(" "+i+j+k+" ");
                                i++;
	                            break;
                            }
                        }
                    }
                }
            }
        }
    }
}
