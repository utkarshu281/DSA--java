
void main(){
    //for lower and uppercase case characters
    char[] varr = {'a','b','c','d','e'};
    int[] hashArray = new int[25]; //for undefined characters(we don't know how many and what characters are there)
    //use 256 instead of25 and the array index will be varr[i] only
     for(int i=0; i<varr.length;i++){
        hashArray[varr[i]-'a']++;
    }
    for(int i=0;i<hashArray.length;i++){
        System.out.println(hashArray[i]);
    }
}
